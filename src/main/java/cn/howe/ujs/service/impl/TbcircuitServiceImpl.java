package cn.howe.ujs.service.impl;

import cn.howe.ujs.dao.TbcircuitMapper;
import cn.howe.ujs.model.Tbconcentratorcircuit;
import cn.howe.ujs.service.TbcircuitService;
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
public class TbcircuitServiceImpl extends AbstractService<Tbconcentratorcircuit> implements TbcircuitService {
    @Resource
    private TbcircuitMapper tbcircuitMapper;

    @Override
    public List<Map> getCircuitList(String[] arrs) {
        Map<String,Object> map = new HashMap<>();
        map.put("concentratorIds",arrs);
        return tbcircuitMapper.findCircuitByIds(map);
    }
}
