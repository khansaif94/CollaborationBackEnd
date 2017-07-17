package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.models.Friend;

@Repository("friendDao")
public class FriendDaoImpl implements FriendDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean deleteFriend(Friend friend) {
		
		try {
			Session session =sessionFactory.openSession();
			session.delete(friend);
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
	public boolean saveFriend(Friend friend) {
		try
		{
				Session session =sessionFactory.openSession();
				session.save(friend);
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
	public List<Friend> getAllFriend() {
		Session  session=sessionFactory.openSession();
		Query query=session.createQuery("from Friend");
		List<Friend> friendList=query.list();
		session.close();
		return friendList;
	}

	@Override
	public Friend getFriendById(String id) {
		
		Session session=sessionFactory.openSession();
		Friend friend=(Friend)session.get(Friend.class, id);
        session.close();
        return friend;

	}

	@Override
	public boolean updateFriend(Friend friend) {
		
		try {
			Session session =sessionFactory.openSession();
			session.update(friend);
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
