package com.example.mybatisspringboot;

import com.example.mybatisspringboot.domain.model.Produto;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringBootApplication.class, args);
	}

}
