package cn.howe.ujs.dao;

import cn.howe.ujs.core.Mapper;
import cn.howe.ujs.model.Tbpolice;

public interface TbpoliceMapper extends Mapper<Tbpolice> {
    String getCycleNameById(int id);

    String getCalendarNameById(int id);
}