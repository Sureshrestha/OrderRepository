package xom.apriltraining.orderplace.service;

import xom.apriltraining.orderplace.models.*;

public interface OrderService {
	
	Order placeOrder(CreateOrderRequest createOrderRequest);
	
	Order getOrder(String orderId);

}
