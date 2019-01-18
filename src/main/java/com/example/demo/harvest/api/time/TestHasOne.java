package com.example.demo.harvest.api.time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "testHasOne")

public class TestHasOne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "testHasOne_id")
	private Integer id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "testOther_harvest_id")
	@JsonBackReference
	private TestOther testOther;

	public TestHasOne() {
	}

	public TestHasOne(Integer id, String name, TestOther testOther) {
		this.id = id;
		this.name = name;
		this.testOther = testOther;
	}
}
