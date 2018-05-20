package cn.howe.ujs.service;
import cn.howe.ujs.model.Tbpolicegroup;
import cn.howe.ujs.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/15.
 */
public interface TbpolicegroupService extends Service<Tbpolicegroup> {

    List<Map> getStrategyGroupList();

    void changeGroupName(Integer groupId, String groupName);
}
