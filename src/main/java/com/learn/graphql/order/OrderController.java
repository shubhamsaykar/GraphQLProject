package com.learn.graphql.order;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.learn.graphql.user.UserService;

@Controller
public class OrderController {

	private OrderService orderService;

	private UserService userService;

	public OrderController(OrderService orderService, UserService userService) {
		this.orderService = orderService;
		this.userService = userService;
	}

	@MutationMapping(name ="createOrder")
	public Order createOrder(@Argument String orderDetail, @Argument String address, @Argument int price,
			@Argument int userId) {

		Order order = new Order();
		order.setOrderDetails(orderDetail);
		order.setAddress(address);
		order.setPrice(price);
		order.setUser(userService.getUser(userId));
		Order newOrder = orderService.createOrder(order);
		return newOrder;
	}
	
	@QueryMapping(name ="getOrders")
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@QueryMapping(name = "getOrder")
	public Order getOrder(@Argument int orderId) {
		return orderService.getOrder(orderId);
	}
	
	
	@MutationMapping(name = "deleteOrder")
	public boolean deleteOrder(@Argument int orderId) {
		return orderService.deletOder(orderId);
	}

}
