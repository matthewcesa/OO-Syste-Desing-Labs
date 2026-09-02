package com.example.OOSDS_lab1;

import com.example.OOSDS_lab1.entity.Car;
import com.example.OOSDS_lab1.entity.CarJPARepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OosdsLab1Application {

	public static void main(String[] args) {
		SpringApplication.run(OosdsLab1Application.class, args);
	}


		@Bean
		public CommandLineRunner demo(CarJPARepository carRepository) {
			return (args) -> {
				Car car = new Car("11AA22", "Ferrari", 1000);
				carRepository.save(car);
				car = new Car("22BB44", "Porsche", 2000);
				carRepository.save(car);
			};

	}
}
