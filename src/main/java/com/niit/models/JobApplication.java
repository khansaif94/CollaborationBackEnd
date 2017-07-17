package com.niit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="JOBAPPLN")
public class JobApplication extends BaseDomain {
	
	@Id
	@Column(name="JOB_ID")
	private String jobid;
	
	@Column(name="USER_ID")
	private String userid;
	
	@Column(name="APPLIED_DATA")
	private String applieddata;
	
	@Column(name="STATUS")
	private String status;

	
	public String getJobid() {
		return jobid;
	}

	public void setJobid(String jobid) {
		this.jobid = jobid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getApplieddata() {
		return applieddata;
	}

	public void setApplieddata(String applieddata) {
		this.applieddata = applieddata;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
