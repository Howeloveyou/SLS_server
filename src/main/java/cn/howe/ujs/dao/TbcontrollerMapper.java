package cn.howe.ujs.dao;

import cn.howe.ujs.core.Mapper;
import cn.howe.ujs.model.Tbcontroller;

import java.util.List;
import java.util.Map;

public interface TbcontrollerMapper extends Mapper<Tbcontroller> {
    List<Map> findControllerByIds(Map<String, Object> idsParam);

    String findConcentratorIdById(String id);
}