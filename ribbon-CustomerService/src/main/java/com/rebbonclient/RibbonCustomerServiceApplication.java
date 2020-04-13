package com.rebbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.rebbonclient.configuration.RibbonConfiguration;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name="orderclient",configuration = RibbonConfiguration.class)
public class RibbonCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonCustomerServiceApplication.class, args);
	}

}
