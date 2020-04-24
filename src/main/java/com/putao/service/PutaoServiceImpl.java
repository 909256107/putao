package com.putao.service;

import com.putao.dao.PutaoDao;
import com.putao.domain.Putao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Mr Duan
 * @create 2020-04-23 12:52
 */
@Service
public class PutaoServiceImpl implements  PutaoService {
    @Autowired
    PutaoDao putaoDao;

    @Override
    public List<Putao> getAll(Map map) {

        return putaoDao.getAll(map);
    }

    @Override
    public void delById(Integer id) {
        putaoDao.delById(id);
    }

    @Override
    public void save(Putao putao) {
        putaoDao.save(putao);
    }
}
