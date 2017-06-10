package com.chen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;

@Entity
@Table(name = "new_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = -3258839839160856613L;
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String moblie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoblie() {
		return moblie;
	}

	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}
}