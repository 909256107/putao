package com.putao.service;

import com.putao.domain.Putao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Mr Duan
 * @create 2020-04-23 12:50
 */

public interface PutaoService {
        List<Putao> getAll(Map map);

        void delById(Integer id);

        public void save(Putao putao);
}
