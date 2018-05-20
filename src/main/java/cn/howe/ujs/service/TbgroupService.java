package cn.howe.ujs.service;
import cn.howe.ujs.model.Tbconcentratorcircuitgroup;
import cn.howe.ujs.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/09.
 */
public interface TbgroupService extends Service<Tbconcentratorcircuitgroup> {

    List<Map> getGroupList(String[] arrs);
}
