package cn.howe.ujs.service.impl;

import cn.howe.ujs.dao.TbcontrollerMapper;
import cn.howe.ujs.model.Tbcontroller;
import cn.howe.ujs.service.TbcontrollerService;
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
public class TbcontrollerServiceImpl extends AbstractService<Tbcontroller> implements TbcontrollerService {
    @Resource
    private TbcontrollerMapper tbcontrollerMapper;

    @Override
    public List<Map> getControllerList(String[] arrs) {
        Map<String,Object> map = new HashMap<>();
        map.put("groupIds",arrs);
        return tbcontrollerMapper.findControllerByIds(map);
    }
}
