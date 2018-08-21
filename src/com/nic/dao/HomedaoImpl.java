package com.nic.dao;

import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nic.model.User;

@Repository
public class HomedaoImpl implements Homedao{
	
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;    //implementing datasource and jdbctemplate
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	
	@Autowired
	public void setDataSource(DataSource postgresDS) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	
	@Override
	public List<User> getUserList() {
		
		List<User> userlist;
		String sql = "Select * from User1";
	
		try
		{
			userlist= jdbcTemplate.query(sql,new UserMapper());
		
			return userlist;
		}
		
		catch(EmptyResultDataAccessException e)
		{
			return null;
		}
	
		
	}
	
	
	
public static final class UserMapper implements RowMapper<User>{
		
		@Override
		public User mapRow( ResultSet rs , int rownum) throws SQLException {
			User gtusr= new User();
			gtusr.setFirstname(rs.getString("firstname"));
			gtusr.setLastname(rs.getString("lastname"));
			gtusr.setDesignation(rs.getString("designation"));
			gtusr.setMobile(rs.getString("mobile"));
			gtusr.setEmail(rs.getString("email"));
			
			return gtusr;
			
			
		}
		
		
	}

                                 /**********************/



@Override
public int insertData(User user) {
	int result;
	try{
	 String sql = "INSERT INTO user1 "  
		        + "(userid ,firstname, lastname, designation , mobile , email) VALUES ((select max(COALESCE(userid,0))+1 from user1),?,?,?,?,?)";  
	 result =	 jdbcTemplate.update(sql, new Object[] {user.getFirstname(),user.getLastname(),user.getDesignation(),
			 user.getMobile(),user.getEmail()} );
	 System.out.print("result........ +"+result);
	return result;
	}
	catch(Exception e ){
		e.printStackTrace();
		return 0;
	}
	
}
		
		
		
}
	
	

	
	