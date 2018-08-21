package com.nic.service;

import java.util.List;

import com.nic.model.User;

public interface Userservice  {


	
	public List<User> getUserList();

	public int sUser(User usr);
	
	public int inserdata(User user);
	/*public void deleteData(int id);

	public User getUser(int id);

	public void updateData(User user);*/
	
}
