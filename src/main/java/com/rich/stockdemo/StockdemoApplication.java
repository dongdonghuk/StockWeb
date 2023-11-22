package com.rich.stockdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.rich.stockdemo.Repository"})
@SpringBootApplication
public class StockdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(StockdemoApplication.class, args);
	}

}
