package com.example.test.structure;

import com.softtek.automation.structure.AbstractStructure;

public class RequestSearchResultOutput extends AbstractStructure{
	
	private String no;
	private String type;
	private String description;
	private String status;
	private String assigntedTo;
	private String priority;
	private String createdBy;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAssigntedTo() {
		return assigntedTo;
	}
	public void setAssigntedTo(String assigntedTo) {
		this.assigntedTo = assigntedTo;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}	
}