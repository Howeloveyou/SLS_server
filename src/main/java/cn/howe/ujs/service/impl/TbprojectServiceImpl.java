package cn.howe.ujs.service.impl;

import cn.howe.ujs.dao.TbprojectMapper;
import cn.howe.ujs.model.Tbproject;
import cn.howe.ujs.service.TbprojectService;
import cn.howe.ujs.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/07.
 */
@Service
@Transactional
public class TbprojectServiceImpl extends AbstractService<Tbproject> implements TbprojectService {
    @Resource
    private TbprojectMapper tbprojectMapper;

    @Override
    public List<Map> getProjectList() {
        List<Tbproject> params;
        List<Map> resList = new ArrayList<>();
        params =tbprojectMapper.selectAll();
        if (params != null && params.size() > 1) {
            for (Tbproject param : params){
                HashMap<String,Object> map = new HashMap<>();
                map.put("projectId",param.getId());
                map.put("projectName",param.getName());
                resList.add(map);
            }
            return resList;
        }
        return null;
    }

    @Override
    public List<Map> getProject(Integer projectId) {
        Tbproject param;
        List<Map> resList = new ArrayList<>();
        HashMap<String,Object> map = new HashMap<>();
        param = tbprojectMapper.selectByPrimaryKey(projectId);
        if (param != null) {
            map.put("projectId",param.getId());
            map.put("projectName",param.getName());
            resList.add(map);
            return resList;
        }
        return null;
    }

}
