package com.nic.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nic.dao.Homedao;
import com.nic.model.Address;
import com.nic.model.Other;
import com.nic.model.User;
import com.nic.service.Userservice;



@Controller
public class HomecontrollerNew {
	






@RequestMapping(value= "/registerform",method=RequestMethod.GET)
public String showform(Model model)
{
User usr=new User();
	model.addAttribute("regform", usr);

	return "registerform";
}


/*******************************************/

@RequestMapping("/register")
public String form(Model model){
	
	
	User usr=new User();
	model.addAttribute("Userreg" ,usr);
	
	System.out.print("ssssssssssssssssssss");
	
	return "register";
	
}


	/************************/


@RequestMapping(value= "/regsuccess",method=RequestMethod.POST)
public String registration(Model model, @ModelAttribute("Userreg") User user){

	User usr=new User();

	
	usrsev.sUser(usr);
	
	return "regsuccess";
	
}

    /******************/

@RequestMapping("/dbvalue")  
public String getUserLIst(Model model) {  
 List<User> userList = usrsev.getUserList();  
 System.out.print("Size of the list "+userList.size());
 model.addAttribute("userList",userList);
 return "dbvaluesuc";  
}  

	/**********************/

	@RequestMapping("/new")
	public String first(Model model)
	{
		model.addAttribute("nameoftheatt","hello");	
		return ("scond");
	}
	
	
	@RequestMapping("/first")
	public String second(Model model){
		
	model.addAttribute("FirstMVC","JaiHo");	
		return ("second");
	}
	
	
	
	// new code start  List Concept//
	
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<String>  ModelAndView (Model model) {

		List<String> list = getList();

		model.addAttribute("list", list);

		return list;

	}

	private List<String> getList() {

		List<String> list = new ArrayList<String>();
		list.add("List A");
		list.add("List B");
		list.add("List C");
		list.add("List D");
		list.add("List 1");
		list.add("List 2");
		list.add("List 3");

		return list;

	}
	

	// new code end  //

	
	@RequestMapping("/showuser")
	public String third(Model model){
		
		ArrayList<User> userarrlist = new ArrayList<User>();
		
		Address addr=new Address();
		User user=new User();
		addr.setHousenu("housenu");
		addr.setStateName("stateName");
		user.setAddrs(addr);
		user.setFirstname("firstname");
		user.setFirstname("lastname");
		userarrlist.add(user);
		
		Address addr1=new Address();
		User user1=new User();
		addr1.setHousenu("housenu");
		addr1.setStateName("stateName");
		user1.setAddrs(addr);
		user1.setFirstname("firstName");
		user1.setFirstname("lastName");
		
		userarrlist.add(user1);
		
		Address addr2=new Address();
		User user2=new User();
		addr2.setHousenu("housenu");
		addr2.setStateName("stateName");
		user2.setAddrs(addr);
		user2.setFirstname("firstName");
		user2.setFirstname("lastName");
		userarrlist.add(user2);
		
		
		Address addr3=new Address();
		User user3=new User();
		addr3.setHousenu("housenu");
		addr3.setStateName("stateName");
		user3.setAddrs(addr);
		user3.setFirstname("firstName");
		user3.setFirstname("lastName");
		userarrlist.add(user3);
		
		
		Address addr4=new Address();
		User user4=new User();
		addr4.setHousenu("housenu");
		addr4.setStateName("stateName");
		user4.setAddrs(addr);
		user4.setFirstname("firstName");
		user4.setFirstname("lastName");
		userarrlist.add(user4);
		
		Other other1 = new Other();
		Address addr5=new Address();
		User user5=new User();
		other1.setDesignation("designation");
		addr5.setHousenu("housenu");
		addr5.setStateName("stateName");
		user5.setAddrs(addr);
		user5.setFirstname("firstName");
		user5.setFirstname("lastName");
		userarrlist.add(user5);
		
		
		model.addAttribute("userlist",userarrlist);
		
		return ("showuser");
		
		
		
	}
	
	
	 	

}
