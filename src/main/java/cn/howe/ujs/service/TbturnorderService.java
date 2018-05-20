package cn.howe.ujs.service;
import cn.howe.ujs.model.Tbturnorder;
import cn.howe.ujs.core.Service;

import java.util.Date;


/**
 * Created by CodeGenerator on 2018/05/11.
 */
public interface TbturnorderService extends Service<Tbturnorder> {

    boolean turnOnLamp(String[] relChooseControllerIds, Date relDoneTime, Integer userId, Byte lumaLevel);

    boolean turnOffLamp(String[] relChooseControllerIds, Date relDoneTime, Integer userId);

    boolean turnOnCircuit(String[] relChooseCircuitIds, Date relDoneTime, Integer userId);

    boolean turnOffCircuit(String[] relChooseCircuitIds, Date relDoneTime, Integer userId);
}
