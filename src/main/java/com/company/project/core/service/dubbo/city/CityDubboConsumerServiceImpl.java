package com.company.project.core.service.dubbo.city;

import com.alibaba.dubbo.config.annotation.Reference;
import com.result.ResultGenerator;
import org.springframework.stereotype.Component;

@Component
public class CityDubboConsumerServiceImpl implements CityDubboService{

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;


    @Override
    public City findCityByName(String cityName) {
        City city = cityDubboService.findCityByName(cityName);
        return city;
    }
}
