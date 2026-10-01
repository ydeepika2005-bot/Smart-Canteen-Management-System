package com.Canteen.SmartCanteen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SmartCanteenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartCanteenApplication.class, args);
	}

	@Bean
	CommandLineRunner loadFood(FoodRepository foodRepository) {
		return args -> {

			if (foodRepository.count() == 0) {

				foodRepository.save(new Food("Dosa", 40, true));
				foodRepository.save(new Food("Poori", 35, true));
				foodRepository.save(new Food("Fried Rice", 60, true));
				foodRepository.save(new Food("Veg Meals", 80, true));
				foodRepository.save(new Food("Idli", 30, true));
				foodRepository.save(new Food("Noodles", 50, true));

			}
		};
	}
}
