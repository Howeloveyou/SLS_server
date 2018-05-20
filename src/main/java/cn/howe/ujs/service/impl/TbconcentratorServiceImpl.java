package cn.howe.ujs.service.impl;

import cn.howe.ujs.dao.TbconcentratorMapper;
import cn.howe.ujs.model.Tbconcentrator;
import cn.howe.ujs.service.TbconcentratorService;
import cn.howe.ujs.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/09.
 */
@Service
@Transactional
public class TbconcentratorServiceImpl extends AbstractService<Tbconcentrator> implements TbconcentratorService {
    @Resource
    private TbconcentratorMapper tbconcentratorMapper;

    @Override
    public List<Map> getConcentratorList(Integer routeId) {
        Tbconcentrator tbconcentrator = new Tbconcentrator();
        tbconcentrator.setRouteid(routeId);
        List<Map> resList = new ArrayList<>();
        List<Tbconcentrator> parmas = tbconcentratorMapper.select(tbconcentrator);
        for (Tbconcentrator parma : parmas){
            HashMap<String,Object> map = new HashMap<>();
            map.put("concentratorID",parma.getId());
            map.put("concentratorName",parma.getName());
            resList.add(map);
        }
        return resList;
    }
}
