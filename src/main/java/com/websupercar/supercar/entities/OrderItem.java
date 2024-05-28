package com.websupercar.supercar.entities;

import java.util.Objects;

public class OrderItem {
	private Long id;
	private Integer quantity;
	private Double price;
	
	public OrderItem() {}

	public OrderItem(Long id, Integer quantity, Double price) {
		this.id = id;
		this.quantity = quantity;
		this.price = price;
	}

	public Double subtotal() {
		return quantity * price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", quantity=" + quantity + 
				", price=" + price + "]";
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
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
}
