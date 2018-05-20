package cn.howe.ujs.service.impl;

import cn.howe.ujs.dao.TbrouteMapper;
import cn.howe.ujs.model.Tbroute;
import cn.howe.ujs.service.TbrouteService;
import cn.howe.ujs.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/05/08.
 */
@Service
@Transactional
public class TbrouteServiceImpl extends AbstractService<Tbroute> implements TbrouteService {
    @Resource
    private TbrouteMapper tbrouteMapper;

    @Override
    public List<Map> getRouteList(Integer projectId) {
        Tbroute tbroute = new Tbroute();
        List<Map> resList = new ArrayList<>();
        tbroute.setProjectid(projectId);
        List<Tbroute> params = tbrouteMapper.select(tbroute);
        for (Tbroute param : params) {
            HashMap<String,Object> map = new HashMap<>();
            map.put("routeId",param.getId());
            map.put("routeName",param.getName());
            resList.add(map);
        }

        return resList;
    }
}
