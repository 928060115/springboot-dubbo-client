package com.example.client.web;

import com.company.project.core.service.dubbo.city.CityDubboConsumerServiceImpl;
import com.result.Result;
import com.result.ResultGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/city")
public class CityController {

    @Resource
    CityDubboConsumerServiceImpl cityDubboConsumerServiceImpl;

    @RequestMapping("")
    public Result queryCity(@RequestParam String cityName){
        return ResultGenerator.genSuccessResult(cityDubboConsumerServiceImpl.findCityByName(cityName));
    }
}
