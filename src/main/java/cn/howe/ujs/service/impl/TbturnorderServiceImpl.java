package cn.howe.ujs.service.impl;

import cn.howe.ujs.dao.TbcircuitMapper;
import cn.howe.ujs.dao.TbcontrollerMapper;
import cn.howe.ujs.dao.TbturnorderMapper;
import cn.howe.ujs.model.Tbturnorder;
import cn.howe.ujs.service.TbturnorderService;
import cn.howe.ujs.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/05/11.
 */
@Service
@Transactional
public class TbturnorderServiceImpl extends AbstractService<Tbturnorder> implements TbturnorderService {
    @Resource
    private TbturnorderMapper tbturnorderMapper;

    @Resource
    private TbcontrollerMapper tbcontrollerMapper;

    @Resource
    private TbcircuitMapper tbcircuitMapper;

    @Override
    public boolean turnOnLamp(String[] relChooseControllerIds, Date relDoneTime, Integer userId, Byte lumaLevel) {

        List<Tbturnorder> list = new ArrayList<>();
        for (String str : relChooseControllerIds) {
            String concentratorId = tbcontrollerMapper.findConcentratorIdById(str);
            Tbturnorder tbturnorder = new Tbturnorder();
            tbturnorder.setOrdertype("0x23");
            tbturnorder.setOnorofftype(1);
            tbturnorder.setOrdertime(relDoneTime);
            tbturnorder.setLumalevel(lumaLevel);
            tbturnorder.setDevicetypeid(1);
            tbturnorder.setDeviceid(str);
            tbturnorder.setUserid(userId);
            tbturnorder.setConcentratorid(concentratorId);
            list.add(tbturnorder);
        }
        return tbturnorderMapper.insertList(list) >0;
    }

    @Override
    public boolean turnOffLamp(String[] relChooseControllerIds, Date relDoneTime, Integer userId) {
        List<Tbturnorder> list = new ArrayList<>();
        for (String str : relChooseControllerIds) {
            String concentratorId = tbcontrollerMapper.findConcentratorIdById(str);
            Tbturnorder tbturnorder = new Tbturnorder();
            tbturnorder.setOrdertype("0x23");
            tbturnorder.setOnorofftype(0);
            tbturnorder.setOrdertime(relDoneTime);
            tbturnorder.setLumalevel(new Byte("100"));
            tbturnorder.setDevicetypeid(1);
            tbturnorder.setDeviceid(str);
            tbturnorder.setUserid(userId);
            tbturnorder.setConcentratorid(concentratorId);
            list.add(tbturnorder);
        }
        return tbturnorderMapper.insertList(list) >0;
    }

    @Override
    public boolean turnOnCircuit(String[] relChooseCircuitIds, Date relDoneTime, Integer userId) {
        List<Tbturnorder> list = new ArrayList<>();
        for (String str : relChooseCircuitIds) {
            String concentratorId =tbcircuitMapper.findConcentratorIdById(Integer.parseInt(str));
            Tbturnorder tbturnorder = new Tbturnorder();
            tbturnorder.setOrdertype("0x19");
            tbturnorder.setOnorofftype(1);
            tbturnorder.setOrdertime(relDoneTime);
            tbturnorder.setLumalevel(new Byte("100"));
            tbturnorder.setDevicetypeid(2);
            tbturnorder.setDeviceid(str);
            tbturnorder.setUserid(userId);
            tbturnorder.setConcentratorid(concentratorId);
            list.add(tbturnorder);
        }
        return tbturnorderMapper.insertList(list) >0;
    }

    @Override
    public boolean turnOffCircuit(String[] relChooseCircuitIds, Date relDoneTime, Integer userId) {
        List<Tbturnorder> list = new ArrayList<>();
        for (String str : relChooseCircuitIds) {
            String concentratorId =tbcircuitMapper.findConcentratorIdById(Integer.parseInt(str));
            Tbturnorder tbturnorder = new Tbturnorder();
            tbturnorder.setOrdertype("0x19");
            tbturnorder.setOnorofftype(0);
            tbturnorder.setOrdertime(relDoneTime);
            tbturnorder.setLumalevel(new Byte("100"));
            tbturnorder.setDevicetypeid(2);
            tbturnorder.setDeviceid(str);
            tbturnorder.setUserid(userId);
            tbturnorder.setConcentratorid(concentratorId);
            list.add(tbturnorder);
        }
        return tbturnorderMapper.insertList(list) >0;
    }
}
