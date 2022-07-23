package com.sofka.spacialStationSofka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpacialStationSofkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpacialStationSofkaApplication.class, args);
	}

}
