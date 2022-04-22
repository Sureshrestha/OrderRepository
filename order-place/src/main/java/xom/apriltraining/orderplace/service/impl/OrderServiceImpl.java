package xom.apriltraining.orderplace.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import xom.apriltraining.orderplace.Entity.OrderEntity;
import xom.apriltraining.orderplace.dao.OrderPlacerepository;
import xom.apriltraining.orderplace.models.CreateOrderRequest;
import xom.apriltraining.orderplace.models.Order;
import xom.apriltraining.orderplace.service.OrderService;

public class OrderServiceImpl implements OrderService{

	
	private OrderPlacerepository orderPlacerepository;
	
	public OrderServiceImpl(@Autowired OrderPlacerepository orderPlacerepository) {
		this.orderPlacerepository = orderPlacerepository;
	}
	
	@Override
	public Order placeOrder(CreateOrderRequest createOrderRequest) {
		OrderEntity entity = OrderEntity.builder().
				customerId(createOrderRequest.getCustomerId())
				.orderId(UUID.randomUUID().toString())
				.productIds(createOrderRequest.getProductIds())
				.paidAmount(createOrderRequest.getPaidAmount())
				.status("PENDING")
				.timecreated(new Date())
				.build();
		
		
		return Order.builder()
				.orderId(entity.getOrderId())
				.customerId(entity.getCustomerId())
				.productIds(entity.getProductIds())
				.paidAmount(entity.getPaidAmount())
				.status(entity.getStatus())
				.timecreated(entity.getTimecreated())
				.build();		
	}

	@Override
	public Order getOrder(String orderId) {
	
		OrderEntity entity =  orderPlacerepository.findbyOrderId(orderId);
		
		return Order.builder()
				.orderId(entity.getOrderId())
				.customerId(entity.getCustomerId())
				.productIds(entity.getProductIds())
				.paidAmount(entity.getPaidAmount())
				.status(entity.getStatus())
				.timecreated(entity.getTimecreated())
				.build();		
	}

}
