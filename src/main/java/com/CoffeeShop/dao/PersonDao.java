package com.CoffeeShop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.CoffeeShop.model.Items;
import com.CoffeeShop.model.Person;



@Repository
public class PersonDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Person> findAll(){
		String sql = "SELECT * FROM USERS";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Person.class));
		
		
	}
	public List<Items> itemfind(){
		String sql = "SELECT * FROM TABLE_ITEMS";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Items.class));
		
		
	}
public void addPersonDao(Person person) {
	
	String  sql = "INSERT INTO USERS( FIRSTNAME, LASTNAME, EMAIL, PHONENO, PASSWORD) VALUES (?,?,?,?,?)";
	jdbcTemplate.update(sql,person.getfName(), person.getlName(), person.geteName(), person.getpNumber(), person.getpassN());
}
	

}
