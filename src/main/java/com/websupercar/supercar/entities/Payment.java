package com.websupercar.supercar.entities;

import java.util.Date;
import java.util.Objects;

public class Payment {
	private Long id;
	private Date moment;
	
	public Payment() {}

	public Payment(Long id, Date moment) {
		this.id = id;
		this.moment = moment;
	}

	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", moment=" + moment + "]";
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
		Payment other = (Payment) obj;
		return Objects.equals(id, other.id);
	}
}
