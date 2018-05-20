package cn.howe.ujs.service;
import cn.howe.ujs.model.Tbroute;
import cn.howe.ujs.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/08.
 */
public interface TbrouteService extends Service<Tbroute> {

    List<Map> getRouteList(Integer projectId);
}
