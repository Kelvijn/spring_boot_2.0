package com.example.demo.harvest.api.time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testOther")
public class TestOther {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "testOther_id")
	private Integer id;
	private String name;

	public TestOther() {
	}

	public TestOther(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
}
