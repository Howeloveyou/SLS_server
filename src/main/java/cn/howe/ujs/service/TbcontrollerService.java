package cn.howe.ujs.service;
import cn.howe.ujs.model.Tbcontroller;
import cn.howe.ujs.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/09.
 */
public interface TbcontrollerService extends Service<Tbcontroller> {

    List<Map> getControllerList(String[] arrs);
}
