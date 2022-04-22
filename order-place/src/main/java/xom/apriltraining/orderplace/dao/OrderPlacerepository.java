package xom.apriltraining.orderplace.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import xom.apriltraining.orderplace.Entity.OrderEntity;

public interface OrderPlacerepository extends JpaRepository<OrderEntity, Long>{

	OrderEntity findbyOrderId(String orderId);
	
	
	
}
