package cn.howe.ujs.dao;

import cn.howe.ujs.core.Mapper;
import cn.howe.ujs.model.Tbpolicegroup;

import java.util.List;
import java.util.Map;

public interface TbpolicegroupMapper extends Mapper<Tbpolicegroup> {
    List<Map> findAll();
}