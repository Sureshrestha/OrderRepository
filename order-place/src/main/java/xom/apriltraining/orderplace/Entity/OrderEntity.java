package xom.apriltraining.orderplace.Entity;

import java.util.List;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "orders.order")
public class OrderEntity {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	
	@Column(name = "order_ID", unique = true)
	private String orderId;

	@Column(name = "customer_ID")
	private String customerId;
	
	@Column(name = "product_IDs")
	private List<String> productIds;
	
	@Column(name = "Amount")
	private float paidAmount;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "Time_Created")
	private Date timecreated;
}
