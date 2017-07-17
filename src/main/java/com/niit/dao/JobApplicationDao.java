package com.niit.dao;

import java.util.List;

import com.niit.models.JobApplication;

public interface JobApplicationDao {

	boolean saveJobApplication(JobApplication jobapplication);

	List<JobApplication> getAlljobapplication();

	JobApplication getJobApplicationById(String id);
	
	 boolean updateJobApplication(JobApplication jobapplication);
	
	 boolean deleteJobApplication(JobApplication jobapplication);
}
