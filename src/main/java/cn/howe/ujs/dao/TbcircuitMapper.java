package cn.howe.ujs.dao;

import cn.howe.ujs.core.Mapper;
import cn.howe.ujs.model.Tbconcentratorcircuit;

import java.util.List;
import java.util.Map;

public interface TbcircuitMapper extends Mapper<Tbconcentratorcircuit> {
    List<Map> findCircuitByIds (Map<String, Object> idsParam);

    String findConcentratorIdById(Integer id);
}