package com.company.project.core.service.dubbo.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.result.Result;
import com.result.ResultGenerator;
import org.springframework.stereotype.Component;

@Component
public class UserDubboConsumerService {
    @Reference(version = "1.0.0")
    UserDubboService userDubboService;

    public Result details(Integer id){
        User user = userDubboService.details(id);
        return ResultGenerator.genSuccessResult(user);
    }
}
