package com.georgeeduardtp.cronoautotfgback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.georgeeduardtp.cronoautoTfgBack.persistance.jpa.entity")
public class CronoautoTfgBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronoautoTfgBackApplication.class, args);
	}

}
