package com.niit.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.models.JobApplication;

@Repository
public class JobApplicationDaoImpl implements JobApplicationDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveJobApplication(JobApplication jobapplication) {
		
		try
		{
				Session session =sessionFactory.openSession();
				session.save(jobapplication);
				session.flush();
				session.close();
		return true;
		} 
		catch(Exception e)
		{
			e.printStackTrace(); //it will print the error in the console - similar to SOP
			          //package, class, method line number from which place you are calling
			return false;
		}
	}

	@Override
	public List<JobApplication> getAlljobapplication() {
		
		Session  session=sessionFactory.openSession();
		Query query=session.createQuery("from JobApplication");
		List<JobApplication> jobapplicationList=query.list();
		session.close();
		return jobapplicationList;
	}

	@Override
	public JobApplication getJobApplicationById(String id) {
		
		Session session=sessionFactory.openSession();
		JobApplication jobapplication=(JobApplication)session.get(JobApplication.class, id);
        session.close();
        return jobapplication;
	}

	@Override
	public boolean updateJobApplication(JobApplication jobapplication) {
		
		try {
			Session session =sessionFactory.openSession();
			session.update(jobapplication);
			session.flush();
			session.close();
			return true;
		}
	catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteJobApplication(JobApplication jobapplication) {
		
		try {
			Session session =sessionFactory.openSession();
			session.delete(jobapplication);
			session.flush();
			session.close();
			return true;
		}
	catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
}
