package com.yl.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0",timeout=4000999)
public class SendServiceImpl implements ISendService {

	@Autowired
	private KafkaSender kafkaSender;
	
	
	@Override
    public String sayHello(String name) {
		kafkaSender.send();
        return "Hello, " + name + ", " + new Date();
    }

}