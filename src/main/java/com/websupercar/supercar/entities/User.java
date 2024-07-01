package com.websupercar.supercar.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String passw;
	private String phone;
	@OneToMany(mappedBy = "client") @JsonIgnore	//JsonIgnore padrão na classe "Um para muitos"
	private List<Order> orders = new ArrayList<>();

	public User() {}
	
	public User(Long id, String name, String email, String passw, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.passw = passw;
		this.phone = phone;
	}
	
	public User(Long id, String name, String email, String passw) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.passw = passw;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + 
				", email=" + email + ", passw=" + passw + 
				", phone=" + phone + "]";
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
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
}
