package com.cp.entities;

import java.io.Serializable;

public class Resourceid implements Serializable{
	protected int resourceno;
	protected int projectno;
	public int getResourceno() {
		return resourceno;
	}
	public void setResourceno(int resourceno) {
		this.resourceno = resourceno;
	}
	public int getProjectno() {
		return projectno;
	}
	public void setProjectno(int projectno) {
		this.projectno = projectno;
	}
	@Override
	public String toString() {
		return "Resourceid [resourceno=" + resourceno + ", projectno=" + projectno + ", getResourceid()="
				+ getResourceno() + ", getProjectno()=" + getProjectno() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
