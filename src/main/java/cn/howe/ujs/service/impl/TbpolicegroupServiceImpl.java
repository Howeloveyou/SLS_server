package cn.howe.ujs.service.impl;

import cn.howe.ujs.dao.TbpolicegroupMapper;
import cn.howe.ujs.model.Tbpolicegroup;
import cn.howe.ujs.service.TbpolicegroupService;
import cn.howe.ujs.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/15.
 */
@Service
@Transactional
public class TbpolicegroupServiceImpl extends AbstractService<Tbpolicegroup> implements TbpolicegroupService {
    @Resource
    private TbpolicegroupMapper tbpolicegroupMapper;

    @Override
    public List<Map> getStrategyGroupList() {
        return tbpolicegroupMapper.findAll();
    }

    @Override
    public void changeGroupName(Integer groupId, String groupName) {
        Tbpolicegroup tbpolicegroup = new Tbpolicegroup();
        tbpolicegroup.setId(groupId);
        tbpolicegroup.setGroupname(groupName);
        tbpolicegroupMapper.updateByPrimaryKey(tbpolicegroup);
    }
}
