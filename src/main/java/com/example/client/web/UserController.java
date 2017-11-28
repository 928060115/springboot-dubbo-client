package com.example.client.web;

import com.company.project.core.service.dubbo.user.UserDubboConsumerService;
import com.result.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 用户dubbo客户端接口
     */
    @Resource
    UserDubboConsumerService userDubboConsumerService;

    @RequestMapping(value = "/detail",method ={RequestMethod.POST},produces ="application/json;charset=UTF-8")
    @ResponseBody
    public Result details(Integer id){
        return userDubboConsumerService.details(id);
    }
}
