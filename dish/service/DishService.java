package service;

import model.Dish;

import java.util.List;
import java.util.Optional;

public interface DishService {

    void addDish(Dish dish);

    void updateDish(Dish dish);

    boolean deleteDish(int id);

    Optional<Dish> findDishById(int id);

    Optional<Dish> findDishByName(String name);

    List<Dish> getAllDishes();
}
