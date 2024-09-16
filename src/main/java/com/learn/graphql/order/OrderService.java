package com.learn.graphql.order;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.graphql.helper.ExceptionHelper;

@Service
public class OrderService {

	private OrderRepo orderRepo;

	public OrderService(OrderRepo orderRepo) {
		this.orderRepo = orderRepo;
	}

	public Order createOrder(Order order) {
		return orderRepo.save(order);
	}

	public List<Order> getAllOrders() {
		return orderRepo.findAll();
	}

	public Order getOrder(int orderId) {
		return orderRepo.findById(orderId).orElseThrow(ExceptionHelper::throwResourceNotFoundException);
	}

	public boolean deletOder(int orderId) {
		Order order = orderRepo.findById(orderId).orElseThrow(ExceptionHelper::throwResourceNotFoundException);
		orderRepo.delete(order);
		return true;
	}
}
