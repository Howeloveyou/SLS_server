package cn.howe.ujs.service.impl;

import cn.howe.ujs.dao.TbpoliceMapper;
import cn.howe.ujs.model.Tbpolice;
import cn.howe.ujs.model.WrapPolice;
import cn.howe.ujs.service.TbpoliceService;
import cn.howe.ujs.core.AbstractService;
import cn.howe.ujs.util.DateUtil;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.*;


/**
 * Created by CodeGenerator on 2018/05/15.
 */
@Service
@Transactional
public class TbpoliceServiceImpl extends AbstractService<Tbpolice> implements TbpoliceService {
    @Resource
    private TbpoliceMapper tbpoliceMapper;

    @Override
    public List<Map> getDetailById(Integer groupId) {
        return getDetailById(groupId,null);
    }

    @Override
    public List<Map> getDetailById(Integer groupId,Integer cycle) {
        Tbpolice tbpolice = new Tbpolice();
        List<Map> resList = new ArrayList<>();
        tbpolice.setGroupid(groupId);
        tbpolice.setCycle(cycle);
        List<Tbpolice> params = tbpoliceMapper.select(tbpolice);
        for (Tbpolice police : params){
            Map<String,Object> map = new HashMap<>();
            map.put("strategyId",police.getId());
            map.put("groupId",police.getGroupid());
            map.put("calendar",getCalendarName(police.getCalendar()));
            map.put("cycle",getCycleName(police.getCycle()));
            map.put("onVehicle",formateParams(police.getOnvehicle()));
            map.put("onLuma",formateParams(police.getOnluma()));
            map.put("onDate",checkOnDate(police));
            map.put("offDate",checkOffDate(police));
            map.put("onTime",checkOnTime(police));
            map.put("offTime",checkOffTime(police));
            map.put("lumaLevel",police.getLumalevel());
            resList.add(map);
        }
        return resList;
    }

    @Override
    public boolean checkMonthRange(WrapPolice params) {
        int start = params.getStartmonth();
        int end = params.getEndmonth();
        Tbpolice police = new Tbpolice();
        police.setGroupid(params.getGroupid());
        police.setCycle(params.getCycle());
        List<Tbpolice> list = tbpoliceMapper.select(police);
        for (Tbpolice p : list){
            if (start > p.getEndmonth() || end < p.getStartmonth()){
                continue;
            }
            return true;
        }
        return false;
    }

    @Override
    public void saveDefaultStrategy(WrapPolice params) throws ParseException {
        params.setOntime(DateUtils.parseDate(params.getOnTimeStr(),"HH:mm"));
        params.setOfftime(DateUtils.parseDate(params.getOffTimeStr(),"HH:mm"));
        params.setCalendar(1);
        params.setOnmonth(0);
        params.setOnday(0);
        tbpoliceMapper.insert(params);
    }

    @Override
    public void saveWeekendStrategy(WrapPolice params) throws ParseException {
        params.setOntime(DateUtils.parseDate(params.getOnTimeStr(),"HH:mm"));
        params.setOfftime(DateUtils.parseDate(params.getOffTimeStr(),"HH:mm"));
        params.setCalendar(1);
        params.setOnmonth(0);
        String [] weekendArr = params.getWeekend().split(",");
        for (String weekend : weekendArr){
            params.setId(null);
            Tbpolice police = new Tbpolice();
            police.setGroupid(params.getGroupid());
            police.setCycle(params.getCycle());
            police.setOnday(Integer.parseInt(weekend));
            List<Tbpolice> list = tbpoliceMapper.select(police);
            if (list != null && list.size() > 0){
                tbpoliceMapper.deleteByPrimaryKey(list.get(0).getId());
            }
            params.setOnday(Integer.parseInt(weekend));
            tbpoliceMapper.insert(params);
        }
    }


    private Object checkOffTime(Tbpolice police) {
        String str = "-";
        switch (police.getOffabsolutetime()){
            case 1:
                str = getTime(police.getOfftime());
                break;
            case 0:
                str = getOffAbsoluteTime(police.getOffabsolute(),police.getOfftime());
                break;
            default:
                break;
        }
        return str;
    }

    private String getOffAbsoluteTime(Integer absolute, Date time) {
        String str = "-";
        switch (absolute){
            case -1:
                str = "日出前"+ DateUtils.getFragmentInMinutes(time,Calendar.DAY_OF_MONTH) + "分钟";
                break;
            case 1:
                str = "日出后"+ DateUtils.getFragmentInMinutes(time,Calendar.DAY_OF_MONTH) + "分钟";
                break;
            default:
                break;
        }
        return str;
    }

    private Object checkOnTime(Tbpolice police) {
        String str = "-";
        switch (police.getOnabsolutetime()){
            case 1:
                str = getTime(police.getOntime());
                break;
            case 0:
                str = getOnAbsoluteTime(police.getOnabsolute(),police.getOntime());
                break;
            default:
                break;
        }
        return str;
    }

    private String getOnAbsoluteTime(Integer absolute, Date time) {
        String str = "-";
        switch (absolute){
            case -1:
                str = "日落前"+ DateUtils.getFragmentInMinutes(time,Calendar.DAY_OF_MONTH) + "分钟";
                break;
            case 1:
                str = "日落后"+ DateUtils.getFragmentInMinutes(time,Calendar.DAY_OF_MONTH) + "分钟";
                break;
            default:
                break;
        }
        return str;
    }

    private String getTime(Date time) {
        return DateUtil.timeToStr(time);
    }

    private String checkOnDate(Tbpolice police){
        String str = "-";
        switch (police.getCycle()){
            case 1:            //默认
                str = moth(police.getStartmonth());
                break;
            case 2:            //周末
                str = weekendOnDate(police.getOnday());
                break;
            case 3:            //节日
                str = monthAndDay(police.getOnmonth(),police.getOnday());
                break;
            case 4:            //其他
                break;
            case 5:            //当日
                str = monthAndDay(police.getOnmonth(),police.getOnday());
                break;
        }
        return str;
    }

    private Object checkOffDate(Tbpolice police) {
        String str = "-";
        switch (police.getCycle()){
            case 1:            //默认
                str = moth(police.getEndmonth());
                break;
            case 3:            //节日
                str = monthAndDay(police.getOffmonth(),police.getOffday());
                break;
            default:            //当日
                break;
        }
        return str;
    }

    private String monthAndDay(Integer month, Integer day) {
        return month + "月" + day + "日";
    }

    private String moth(Integer month) {
        return month + "月";
    }

    private String getCalendarName(int calendar){
        return tbpoliceMapper.getCalendarNameById(calendar);
    }

    private String getCycleName(int cycle){
        return tbpoliceMapper.getCycleNameById(cycle);
   }

   private Object formateParams(Object param){
        return param == null ? "-" : param;
   }

    private String weekendOnDate(int onDay) {
        switch (onDay){
            case 5:
                return "周五";
            case 6:
                return "周六";
            case 7:
                return "周日";
            default:
                return "-";

        }
    }

}
