package cn.howe.ujs.service.impl;

import cn.howe.ujs.dao.TbcircuitMapper;
import cn.howe.ujs.dao.TbcontrollerMapper;
import cn.howe.ujs.dao.TborderMapper;
import cn.howe.ujs.model.Tborder;
import cn.howe.ujs.service.TborderService;
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
public class TborderServiceImpl extends AbstractService<Tborder> implements TborderService {
    @Resource
    private TborderMapper tborderMapper;

    @Resource
    private TbcontrollerMapper tbcontrollerMapper;

    @Resource
    private TbcircuitMapper tbcircuitMapper;

    @Override
    public boolean turnOnLamp(String[] relChooseControllerIds, Date relDoneTime, Integer userId) {
        List<Tborder> list = new ArrayList<>();
        for (String str : relChooseControllerIds){
            String concentratorId = tbcontrollerMapper.findConcentratorIdById(str);
            Tborder tborder = new Tborder();
            tborder.setReleasetime(new Date());
            tborder.setDonetime(relDoneTime);
            tborder.setUserid(userId);
            tborder.setOrdertype("0x23");
            tborder.setDevicetypeid(1);
            tborder.setDeviceid(str);
            tborder.setConcentratorid(concentratorId);
            list.add(tborder);
        }
        return tborderMapper.insertList(list)>0;
    }

    @Override
    public boolean turnOffLamp(String[] relChooseControllerIds, Date relDoneTime, Integer userId) {
        List<Tborder> list = new ArrayList<>();
        for (String str : relChooseControllerIds){
            String concentratorId = tbcontrollerMapper.findConcentratorIdById(str);
            Tborder tborder = new Tborder();
            tborder.setReleasetime(new Date());
            tborder.setDonetime(relDoneTime);
            tborder.setUserid(userId);
            tborder.setOrdertype("0x23");
            tborder.setDevicetypeid(1);
            tborder.setDeviceid(str);
            tborder.setConcentratorid(concentratorId);
            list.add(tborder);
        }
        return tborderMapper.insertList(list)>0;
    }

    @Override
    public boolean turnOnCircuit(String[] relChooseCircuitIds, Date relDoneTime, Integer userId) {
        List<Tborder> list = new ArrayList<>();
        for (String str : relChooseCircuitIds){
            String concentratorId = tbcircuitMapper.findConcentratorIdById(Integer.parseInt(str));
            Tborder tborder = new Tborder();
            tborder.setReleasetime(new Date());
            tborder.setDonetime(relDoneTime);
            tborder.setUserid(userId);
            tborder.setOrdertype("0x19");
            tborder.setDevicetypeid(2);
            tborder.setDeviceid(str);
            tborder.setConcentratorid(concentratorId);
            list.add(tborder);
        }
        return tborderMapper.insertList(list)>0;
    }

    @Override
    public boolean turnOffCircuit(String[] relChooseCircuitIds, Date relDoneTime, Integer userId) {
        List<Tborder> list = new ArrayList<>();
        for (String str : relChooseCircuitIds){
            String concentratorId = tbcircuitMapper.findConcentratorIdById(Integer.parseInt(str));
            Tborder tborder = new Tborder();
            tborder.setReleasetime(new Date());
            tborder.setDonetime(relDoneTime);
            tborder.setUserid(userId);
            tborder.setOrdertype("0x19");
            tborder.setDevicetypeid(2);
            tborder.setDeviceid(str);
            tborder.setConcentratorid(concentratorId);
            list.add(tborder);
        }
        return tborderMapper.insertList(list)>0;
    }
}
