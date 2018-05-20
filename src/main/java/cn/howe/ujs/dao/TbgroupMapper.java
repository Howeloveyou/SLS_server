package cn.howe.ujs.dao;

import cn.howe.ujs.core.Mapper;
import cn.howe.ujs.model.Tbconcentratorcircuitgroup;

import java.util.List;
import java.util.Map;

public interface TbgroupMapper extends Mapper<Tbconcentratorcircuitgroup> {
    List<Map> findGroupByIds(Map<String, Object> idsParam);
}