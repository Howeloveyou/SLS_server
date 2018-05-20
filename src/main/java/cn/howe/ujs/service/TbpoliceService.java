package cn.howe.ujs.service;
import cn.howe.ujs.model.Tbpolice;
import cn.howe.ujs.core.Service;
import cn.howe.ujs.model.WrapPolice;

import java.text.ParseException;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/15.
 */
public interface TbpoliceService extends Service<Tbpolice> {

    List<Map> getDetailById(Integer groupId);

    List<Map> getDetailById(Integer groupId, Integer cycle);

    boolean checkMonthRange(WrapPolice params);

    void saveDefaultStrategy(WrapPolice params) throws ParseException;

    void saveWeekendStrategy(WrapPolice params) throws ParseException;
}