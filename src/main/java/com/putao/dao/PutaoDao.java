package com.putao.dao;

import com.putao.domain.Putao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Mr Duan
 * @create 2020-04-23 12:53
 */
@Mapper
public interface PutaoDao {

    List<Putao> getAll(@Param("content") Map map);

    void delById(Integer id);

    void save(Putao putao);
}
