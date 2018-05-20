package cn.howe.ujs.service;
import cn.howe.ujs.model.Tborder;
import cn.howe.ujs.core.Service;

import java.util.Date;


/**
 * Created by CodeGenerator on 2018/05/11.
 */
public interface TborderService extends Service<Tborder> {
    boolean turnOnLamp(String[] relChooseControllerIds, Date relDoneTime, Integer userId);

    boolean turnOffLamp(String[] relChooseControllerIds, Date relDoneTime, Integer userId);

    boolean turnOnCircuit(String[] relChooseCircuitIds, Date relDoneTime, Integer userId);

    boolean turnOffCircuit(String[] relChooseCircuitIds, Date relDoneTime, Integer userId);
}
