package cn.howe.ujs.service.impl;

import cn.howe.ujs.dao.TbgroupMapper;
import cn.howe.ujs.model.Tbconcentratorcircuitgroup;
import cn.howe.ujs.service.TbgroupService;
import cn.howe.ujs.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/09.
 */
@Service
@Transactional
public class TbgroupServiceImpl extends AbstractService<Tbconcentratorcircuitgroup> implements TbgroupService {
    @Resource
    private TbgroupMapper tbgroupMapper;

    @Override
    public List<Map> getGroupList(String[] arrs) {
        Map<String,Object> map = new HashMap<>();
        map.put("circuitIds",arrs);
        return tbgroupMapper.findGroupByIds(map);
    }
}
