package com.websupercar.supercar.entities;

import java.util.Date;
import java.util.Objects;

import com.websupercar.supercar.entities.enums.OrderStatus;

public class Order {
	private Long id;
	private Date moment;
	private OrderStatus orderStatus;
	
	public Order() {}

	public Order(Long id, Date moment, OrderStatus orderStatus) {
		this.id = id;
		this.moment = moment;
		this.orderStatus = orderStatus;
	}

	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + 
				", orderStatus=" + orderStatus + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}
}
