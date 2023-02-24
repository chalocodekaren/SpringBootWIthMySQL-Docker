package com.playwithjava.demo;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class PlayWithJavaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayWithJavaDemoApplication.class, args);
		log.info("############### PlayWithJavaDemoApplication is started successfully...");

	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
