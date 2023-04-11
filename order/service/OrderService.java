package service;

import model.Dish;
import model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    Order createOrder(List<Dish> dishes);

    Optional<Order> findOrderById(int id);

    void markOrderAsCompleted(int id);

    List<Order> getAllOrders();
}
