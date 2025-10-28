package com.georgeeduardtp.cronoautoTfgBack;

import org.springframework.boot.SpringApplication;

public class TestCronoautoTfgBackApplication {

	public static void main(String[] args) {
		SpringApplication.from(CronoautoTfgBackApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
