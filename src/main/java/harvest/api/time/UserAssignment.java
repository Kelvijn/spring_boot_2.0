
package harvest.api.time;

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
@JsonPropertyOrder({ "id", "is_project_manager", "is_active", "budget", "created_at", "updated_at", "hourly_rate" })
public class UserAssignment {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("is_project_manager")
	private Boolean isProjectManager;
	@JsonProperty("is_active")
	private Boolean isActive;
	@JsonProperty("budget")
	private Object budget;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("hourly_rate")
	private Double hourlyRate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public UserAssignment() {
	}

	/**
	 * 
	 * @param updatedAt
	 * @param isActive
	 * @param id
	 * @param budget
	 * @param hourlyRate
	 * @param createdAt
	 * @param isProjectManager
	 */
	public UserAssignment(Integer id, Boolean isProjectManager, Boolean isActive, Object budget, String createdAt,
			String updatedAt, Double hourlyRate) {
		super();
		this.id = id;
		this.isProjectManager = isProjectManager;
		this.isActive = isActive;
		this.budget = budget;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.hourlyRate = hourlyRate;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	public UserAssignment withId(Integer id) {
		this.id = id;
		return this;
	}

	@JsonProperty("is_project_manager")
	public Boolean getIsProjectManager() {
		return isProjectManager;
	}

	@JsonProperty("is_project_manager")
	public void setIsProjectManager(Boolean isProjectManager) {
		this.isProjectManager = isProjectManager;
	}

	public UserAssignment withIsProjectManager(Boolean isProjectManager) {
		this.isProjectManager = isProjectManager;
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

	public UserAssignment withIsActive(Boolean isActive) {
		this.isActive = isActive;
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

	public UserAssignment withBudget(Object budget) {
		this.budget = budget;
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

	public UserAssignment withCreatedAt(String createdAt) {
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

	public UserAssignment withUpdatedAt(String updatedAt) {
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

	public UserAssignment withHourlyRate(Double hourlyRate) {
		this.hourlyRate = hourlyRate;
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

	public UserAssignment withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("isProjectManager", isProjectManager)
				.append("isActive", isActive).append("budget", budget).append("createdAt", createdAt)
				.append("updatedAt", updatedAt).append("hourlyRate", hourlyRate)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(updatedAt).append(isActive).append(id).append(budget).append(hourlyRate)
				.append(additionalProperties).append(createdAt).append(isProjectManager).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof UserAssignment) == false) {
			return false;
		}
		UserAssignment rhs = ((UserAssignment) other);
		return new EqualsBuilder().append(updatedAt, rhs.updatedAt).append(isActive, rhs.isActive).append(id, rhs.id)
				.append(budget, rhs.budget).append(hourlyRate, rhs.hourlyRate)
				.append(additionalProperties, rhs.additionalProperties).append(createdAt, rhs.createdAt)
				.append(isProjectManager, rhs.isProjectManager).isEquals();
	}

}
