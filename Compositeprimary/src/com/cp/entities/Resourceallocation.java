package com.cp.entities;

import java.io.Serializable;
import java.util.Date;

public class Resourceallocation implements Serializable {
	protected Resourceid id;
	protected Date resourcestartdate;
	protected Date resourceenddate;
	protected String role;
	protected int projectpercentage;
	public Resourceid getId() {
		return id;
	}
	public void setId(Resourceid id) {
		this.id = id;
	}
	public Date getResourcestartdate() {
		return resourcestartdate;
	}
	public void setResourcestartdate(Date resourcestartdate) {
		this.resourcestartdate = resourcestartdate;
	}
	public Date getResourceenddate() {
		return resourceenddate;
	}
	public void setResourceenddate(Date resourceenddate) {
		this.resourceenddate = resourceenddate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getProjectpercentage() {
		return projectpercentage;
	}
	public void setProjectpercentage(int projectpercentage) {
		this.projectpercentage = projectpercentage;
	}
	@Override
	public String toString() {
		return "Resourceallocation [id=" + id + ", resourcestartdate=" + resourcestartdate + ", resourceenddate="
				+ resourceenddate + ", role=" + role + ", projectpercentage=" + projectpercentage + ", getId()="
				+ getId() + ", getResourcestartdate()=" + getResourcestartdate() + ", getResourceenddate()="
				+ getResourceenddate() + ", getRole()=" + getRole() + ", getProjectpercentage()="
				+ getProjectpercentage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

		
	}



