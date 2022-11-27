package com.br.una.weatherstation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class WeatherStationApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherStationApplication.class, args);
	}

}
