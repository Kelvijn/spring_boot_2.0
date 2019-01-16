
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
@JsonPropertyOrder({ "id", "spent_date", "user", "client", "project", "task", "user_assignment", "task_assignment",
		"hours", "notes", "created_at", "updated_at", "is_locked", "locked_reason", "is_closed", "is_billed",
		"timer_started_at", "started_time", "ended_time", "is_running", "invoice", "external_reference", "billable",
		"budgeted", "billable_rate", "cost_rate" })
public class TimeEntry {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("spent_date")
	private String spentDate;
	@JsonProperty("user")
	private User user;
	@JsonProperty("client")
	private Client client;
	@JsonProperty("project")
	private Project project;
	@JsonProperty("task")
	private Task task;
	@JsonProperty("user_assignment")
	private UserAssignment userAssignment;
	@JsonProperty("task_assignment")
	private TaskAssignment taskAssignment;
	@JsonProperty("hours")
	private Double hours;
	@JsonProperty("notes")
	private String notes;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("is_locked")
	private Boolean isLocked;
	@JsonProperty("locked_reason")
	private String lockedReason;
	@JsonProperty("is_closed")
	private Boolean isClosed;
	@JsonProperty("is_billed")
	private Boolean isBilled;
	@JsonProperty("timer_started_at")
	private Object timerStartedAt;
	@JsonProperty("started_time")
	private String startedTime;
	@JsonProperty("ended_time")
	private String endedTime;
	@JsonProperty("is_running")
	private Boolean isRunning;
	@JsonProperty("invoice")
	private Object invoice;
	@JsonProperty("external_reference")
	private Object externalReference;
	@JsonProperty("billable")
	private Boolean billable;
	@JsonProperty("budgeted")
	private Boolean budgeted;
	@JsonProperty("billable_rate")
	private Double billableRate;
	@JsonProperty("cost_rate")
	private Double costRate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public TimeEntry() {
	}

	/**
	 * 
	 * @param client
	 * @param invoice
	 * @param externalReference
	 * @param userAssignment
	 * @param billable
	 * @param id
	 * @param timerStartedAt
	 * @param spentDate
	 * @param createdAt
	 * @param isClosed
	 * @param taskAssignment
	 * @param endedTime
	 * @param isRunning
	 * @param hours
	 * @param task
	 * @param billableRate
	 * @param costRate
	 * @param isLocked
	 * @param updatedAt
	 * @param project
	 * @param budgeted
	 * @param lockedReason
	 * @param isBilled
	 * @param notes
	 * @param user
	 * @param startedTime
	 */
	public TimeEntry(Integer id, String spentDate, User user, Client client, Project project, Task task,
			UserAssignment userAssignment, TaskAssignment taskAssignment, Double hours, String notes, String createdAt,
			String updatedAt, Boolean isLocked, String lockedReason, Boolean isClosed, Boolean isBilled,
			Object timerStartedAt, String startedTime, String endedTime, Boolean isRunning, Object invoice,
			Object externalReference, Boolean billable, Boolean budgeted, Double billableRate, Double costRate) {
		super();
		this.id = id;
		this.spentDate = spentDate;
		this.user = user;
		this.client = client;
		this.project = project;
		this.task = task;
		this.userAssignment = userAssignment;
		this.taskAssignment = taskAssignment;
		this.hours = hours;
		this.notes = notes;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.isLocked = isLocked;
		this.lockedReason = lockedReason;
		this.isClosed = isClosed;
		this.isBilled = isBilled;
		this.timerStartedAt = timerStartedAt;
		this.startedTime = startedTime;
		this.endedTime = endedTime;
		this.isRunning = isRunning;
		this.invoice = invoice;
		this.externalReference = externalReference;
		this.billable = billable;
		this.budgeted = budgeted;
		this.billableRate = billableRate;
		this.costRate = costRate;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	public TimeEntry withId(Integer id) {
		this.id = id;
		return this;
	}

	@JsonProperty("spent_date")
	public String getSpentDate() {
		return spentDate;
	}

	@JsonProperty("spent_date")
	public void setSpentDate(String spentDate) {
		this.spentDate = spentDate;
	}

	public TimeEntry withSpentDate(String spentDate) {
		this.spentDate = spentDate;
		return this;
	}

	@JsonProperty("user")
	public User getUser() {
		return user;
	}

	@JsonProperty("user")
	public void setUser(User user) {
		this.user = user;
	}

	public TimeEntry withUser(User user) {
		this.user = user;
		return this;
	}

	@JsonProperty("client")
	public Client getClient() {
		return client;
	}

	@JsonProperty("client")
	public void setClient(Client client) {
		this.client = client;
	}

	public TimeEntry withClient(Client client) {
		this.client = client;
		return this;
	}

	@JsonProperty("project")
	public Project getProject() {
		return project;
	}

	@JsonProperty("project")
	public void setProject(Project project) {
		this.project = project;
	}

	public TimeEntry withProject(Project project) {
		this.project = project;
		return this;
	}

	@JsonProperty("task")
	public Task getTask() {
		return task;
	}

	@JsonProperty("task")
	public void setTask(Task task) {
		this.task = task;
	}

	public TimeEntry withTask(Task task) {
		this.task = task;
		return this;
	}

	@JsonProperty("user_assignment")
	public UserAssignment getUserAssignment() {
		return userAssignment;
	}

	@JsonProperty("user_assignment")
	public void setUserAssignment(UserAssignment userAssignment) {
		this.userAssignment = userAssignment;
	}

	public TimeEntry withUserAssignment(UserAssignment userAssignment) {
		this.userAssignment = userAssignment;
		return this;
	}

	@JsonProperty("task_assignment")
	public TaskAssignment getTaskAssignment() {
		return taskAssignment;
	}

	@JsonProperty("task_assignment")
	public void setTaskAssignment(TaskAssignment taskAssignment) {
		this.taskAssignment = taskAssignment;
	}

	public TimeEntry withTaskAssignment(TaskAssignment taskAssignment) {
		this.taskAssignment = taskAssignment;
		return this;
	}

	@JsonProperty("hours")
	public Double getHours() {
		return hours;
	}

	@JsonProperty("hours")
	public void setHours(Double hours) {
		this.hours = hours;
	}

	public TimeEntry withHours(Double hours) {
		this.hours = hours;
		return this;
	}

	@JsonProperty("notes")
	public String getNotes() {
		return notes;
	}

	@JsonProperty("notes")
	public void setNotes(String notes) {
		this.notes = notes;
	}

	public TimeEntry withNotes(String notes) {
		this.notes = notes;
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

	public TimeEntry withCreatedAt(String createdAt) {
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

	public TimeEntry withUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	@JsonProperty("is_locked")
	public Boolean getIsLocked() {
		return isLocked;
	}

	@JsonProperty("is_locked")
	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public TimeEntry withIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
		return this;
	}

	@JsonProperty("locked_reason")
	public String getLockedReason() {
		return lockedReason;
	}

	@JsonProperty("locked_reason")
	public void setLockedReason(String lockedReason) {
		this.lockedReason = lockedReason;
	}

	public TimeEntry withLockedReason(String lockedReason) {
		this.lockedReason = lockedReason;
		return this;
	}

	@JsonProperty("is_closed")
	public Boolean getIsClosed() {
		return isClosed;
	}

	@JsonProperty("is_closed")
	public void setIsClosed(Boolean isClosed) {
		this.isClosed = isClosed;
	}

	public TimeEntry withIsClosed(Boolean isClosed) {
		this.isClosed = isClosed;
		return this;
	}

	@JsonProperty("is_billed")
	public Boolean getIsBilled() {
		return isBilled;
	}

	@JsonProperty("is_billed")
	public void setIsBilled(Boolean isBilled) {
		this.isBilled = isBilled;
	}

	public TimeEntry withIsBilled(Boolean isBilled) {
		this.isBilled = isBilled;
		return this;
	}

	@JsonProperty("timer_started_at")
	public Object getTimerStartedAt() {
		return timerStartedAt;
	}

	@JsonProperty("timer_started_at")
	public void setTimerStartedAt(Object timerStartedAt) {
		this.timerStartedAt = timerStartedAt;
	}

	public TimeEntry withTimerStartedAt(Object timerStartedAt) {
		this.timerStartedAt = timerStartedAt;
		return this;
	}

	@JsonProperty("started_time")
	public String getStartedTime() {
		return startedTime;
	}

	@JsonProperty("started_time")
	public void setStartedTime(String startedTime) {
		this.startedTime = startedTime;
	}

	public TimeEntry withStartedTime(String startedTime) {
		this.startedTime = startedTime;
		return this;
	}

	@JsonProperty("ended_time")
	public String getEndedTime() {
		return endedTime;
	}

	@JsonProperty("ended_time")
	public void setEndedTime(String endedTime) {
		this.endedTime = endedTime;
	}

	public TimeEntry withEndedTime(String endedTime) {
		this.endedTime = endedTime;
		return this;
	}

	@JsonProperty("is_running")
	public Boolean getIsRunning() {
		return isRunning;
	}

	@JsonProperty("is_running")
	public void setIsRunning(Boolean isRunning) {
		this.isRunning = isRunning;
	}

	public TimeEntry withIsRunning(Boolean isRunning) {
		this.isRunning = isRunning;
		return this;
	}

	@JsonProperty("invoice")
	public Object getInvoice() {
		return invoice;
	}

	@JsonProperty("invoice")
	public void setInvoice(Object invoice) {
		this.invoice = invoice;
	}

	public TimeEntry withInvoice(Object invoice) {
		this.invoice = invoice;
		return this;
	}

	@JsonProperty("external_reference")
	public Object getExternalReference() {
		return externalReference;
	}

	@JsonProperty("external_reference")
	public void setExternalReference(Object externalReference) {
		this.externalReference = externalReference;
	}

	public TimeEntry withExternalReference(Object externalReference) {
		this.externalReference = externalReference;
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

	public TimeEntry withBillable(Boolean billable) {
		this.billable = billable;
		return this;
	}

	@JsonProperty("budgeted")
	public Boolean getBudgeted() {
		return budgeted;
	}

	@JsonProperty("budgeted")
	public void setBudgeted(Boolean budgeted) {
		this.budgeted = budgeted;
	}

	public TimeEntry withBudgeted(Boolean budgeted) {
		this.budgeted = budgeted;
		return this;
	}

	@JsonProperty("billable_rate")
	public Double getBillableRate() {
		return billableRate;
	}

	@JsonProperty("billable_rate")
	public void setBillableRate(Double billableRate) {
		this.billableRate = billableRate;
	}

	public TimeEntry withBillableRate(Double billableRate) {
		this.billableRate = billableRate;
		return this;
	}

	@JsonProperty("cost_rate")
	public Double getCostRate() {
		return costRate;
	}

	@JsonProperty("cost_rate")
	public void setCostRate(Double costRate) {
		this.costRate = costRate;
	}

	public TimeEntry withCostRate(Double costRate) {
		this.costRate = costRate;
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

	public TimeEntry withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("spentDate", spentDate).append("user", user)
				.append("client", client).append("project", project).append("task", task)
				.append("userAssignment", userAssignment).append("taskAssignment", taskAssignment)
				.append("hours", hours).append("notes", notes).append("createdAt", createdAt)
				.append("updatedAt", updatedAt).append("isLocked", isLocked).append("lockedReason", lockedReason)
				.append("isClosed", isClosed).append("isBilled", isBilled).append("timerStartedAt", timerStartedAt)
				.append("startedTime", startedTime).append("endedTime", endedTime).append("isRunning", isRunning)
				.append("invoice", invoice).append("externalReference", externalReference).append("billable", billable)
				.append("budgeted", budgeted).append("billableRate", billableRate).append("costRate", costRate)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(client).append(invoice).append(externalReference).append(billable)
				.append(userAssignment).append(timerStartedAt).append(id).append(spentDate).append(createdAt)
				.append(isClosed).append(taskAssignment).append(endedTime).append(isRunning).append(hours).append(task)
				.append(billableRate).append(costRate).append(isLocked).append(updatedAt).append(budgeted)
				.append(project).append(lockedReason).append(additionalProperties).append(isBilled).append(notes)
				.append(user).append(startedTime).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof TimeEntry) == false) {
			return false;
		}
		TimeEntry rhs = ((TimeEntry) other);
		return new EqualsBuilder().append(client, rhs.client).append(invoice, rhs.invoice)
				.append(externalReference, rhs.externalReference).append(billable, rhs.billable)
				.append(userAssignment, rhs.userAssignment).append(timerStartedAt, rhs.timerStartedAt)
				.append(id, rhs.id).append(spentDate, rhs.spentDate).append(createdAt, rhs.createdAt)
				.append(isClosed, rhs.isClosed).append(taskAssignment, rhs.taskAssignment)
				.append(endedTime, rhs.endedTime).append(isRunning, rhs.isRunning).append(hours, rhs.hours)
				.append(task, rhs.task).append(billableRate, rhs.billableRate).append(costRate, rhs.costRate)
				.append(isLocked, rhs.isLocked).append(updatedAt, rhs.updatedAt).append(budgeted, rhs.budgeted)
				.append(project, rhs.project).append(lockedReason, rhs.lockedReason)
				.append(additionalProperties, rhs.additionalProperties).append(isBilled, rhs.isBilled)
				.append(notes, rhs.notes).append(user, rhs.user).append(startedTime, rhs.startedTime).isEquals();
	}

}
