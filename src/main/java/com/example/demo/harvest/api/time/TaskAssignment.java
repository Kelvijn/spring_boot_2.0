
package com.example.demo.harvest.api.time;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "billable", "is_active", "created_at", "updated_at", "hourly_rate", "budget" })
public class TaskAssignment {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("billable")
	private Boolean billable;
	@JsonProperty("is_active")
	private Boolean isActive;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("hourly_rate")
	private Double hourlyRate;
	@JsonProperty("budget")
	private Object budget;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public TaskAssignment() {
	}

	/**
	 * 
	 * @param updatedAt
	 * @param isActive
	 * @param id
	 * @param budget
	 * @param hourlyRate
	 * @param createdAt
	 * @param billable
	 */
	public TaskAssignment(Integer id, Boolean billable, Boolean isActive, String createdAt, String updatedAt,
			Double hourlyRate, Object budget) {
		super();
		this.id = id;
		this.billable = billable;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.hourlyRate = hourlyRate;
		this.budget = budget;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	public TaskAssignment withId(Integer id) {
		this.id = id;
		return this;
	}

	@JsonProperty("billable")
	public Boolean getBillable() {
		return billable;
	}

	@JsonProperty("billable")
	public void setBillable(Boolean billable) {
		this.billable = billable;
	}

	public TaskAssignment withBillable(Boolean billable) {
		this.billable = billable;
		return this;
	}

	@JsonProperty("is_active")
	public Boolean getIsActive() {
		return isActive;
	}

	@JsonProperty("is_active")
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public TaskAssignment withIsActive(Boolean isActive) {
		this.isActive = isActive;
		return this;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public TaskAssignment withCreatedAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public TaskAssignment withUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	@JsonProperty("hourly_rate")
	public Double getHourlyRate() {
		return hourlyRate;
	}

	@JsonProperty("hourly_rate")
	public void setHourlyRate(Double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public TaskAssignment withHourlyRate(Double hourlyRate) {
		this.hourlyRate = hourlyRate;
		return this;
	}

	@JsonProperty("budget")
	public Object getBudget() {
		return budget;
	}

	@JsonProperty("budget")
	public void setBudget(Object budget) {
		this.budget = budget;
	}

	public TaskAssignment withBudget(Object budget) {
		this.budget = budget;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public TaskAssignment withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("billable", billable).append("isActive", isActive)
				.append("createdAt", createdAt).append("updatedAt", updatedAt).append("hourlyRate", hourlyRate)
				.append("budget", budget).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(updatedAt).append(isActive).append(id).append(budget).append(hourlyRate)
				.append(additionalProperties).append(createdAt).append(billable).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof TaskAssignment) == false) {
			return false;
		}
		TaskAssignment rhs = ((TaskAssignment) other);
		return new EqualsBuilder().append(updatedAt, rhs.updatedAt).append(isActive, rhs.isActive).append(id, rhs.id)
				.append(budget, rhs.budget).append(hourlyRate, rhs.hourlyRate)
				.append(additionalProperties, rhs.additionalProperties).append(createdAt, rhs.createdAt)
				.append(billable, rhs.billable).isEquals();
	}

}
