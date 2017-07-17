package com.niit.dao;

import java.util.List;

import com.niit.models.Friend;

public interface FriendDao {
	
	boolean saveFriend(Friend friend);

	List<Friend> getAllFriend();

	Friend getFriendById(String id);
	
	 boolean updateFriend(Friend friend);
	
	 boolean deleteFriend(Friend friend);

}
