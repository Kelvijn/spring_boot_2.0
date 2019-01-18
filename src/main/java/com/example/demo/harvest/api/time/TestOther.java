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

	@Column(name = "testOther_harvest_id")
	private Integer harvestId;

	public TestOther() {
	}

	public TestOther(Integer harvestId, String name) {
		this.harvestId = harvestId;
		this.name = name;
	}
}
