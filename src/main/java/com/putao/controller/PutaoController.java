package com.putao.controller;

import com.putao.domain.Putao;
import com.putao.service.PutaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mr Duan
 * @create 2020-04-23 12:48
 * RestController = ResponseBody + Controller
 */
@Controller
@RequestMapping("/putao")
public class PutaoController {
    @Autowired
    PutaoService putaoService;

    private Map<String,Object> map = new HashMap<>();
    //查询所有
    @RequestMapping("/getAll")
    @ResponseBody
    public List<Putao> getAll(Map map){
        return putaoService.getAll(map);
    }
    //删除选中
    @RequestMapping("/delById")
    public String  delById(Integer id){
        putaoService.delById(id);
        return "redirect:/index.html";
    }
    //添加数据
    @RequestMapping("/save")
    @ResponseBody
    public Map<String,Object> save(@RequestBody Putao putao){
        map.clear();
        try {
            putaoService.save(putao);
            map.put("msg",1);
        } catch (Exception e) {
           map.put("msg",e.getMessage());
        }
        return map;
    }

}
