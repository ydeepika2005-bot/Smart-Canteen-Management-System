package com.Canteen.SmartCanteen;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> findByAvailableTrue();

    List<Food> findByNameContainingIgnoreCase(String name);
}