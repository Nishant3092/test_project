package com.nic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nic.dao.Homedao;
import com.nic.model.User;
@Service
public class UserserviceImpl implements Userservice{
	
@Autowired	
Homedao homedao;
Userservice userservice;



@Override
public List<User> getUserList() {
 return homedao.getUserList();
	
}



@Override
public int sUser(User usr) {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public int inserdata(User user) {
return homedao.insertData(user);

}





}