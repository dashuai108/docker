package com.dashuai.pg.mavenpg.controller;

import com.dashuai.pg.mavenpg.service.MavenService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/maven")
@Slf4j
public class MavenPgController {

    @Autowired
    private MavenService service;

    @ApiOperation(value = "查询所有员工", notes = "查询所有员工列表", tags = {"员工模块接口"})
    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Object hello(){
        service.getUser();
        Map<String,Object> map = new HashMap<>();
        map.put("uses",service.getUser());
        return map;
    }
}
