package cn.howe.ujs.service;
import cn.howe.ujs.model.Tbproject;
import cn.howe.ujs.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/07.
 */
public interface TbprojectService extends Service<Tbproject> {

    List<Map> getProjectList();

    List<Map> getProject(Integer projectId);
}
