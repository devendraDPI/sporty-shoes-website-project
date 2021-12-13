package com.ecommerce.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;


class UserTest {

	@BeforeAll
	static void beforeAll(){
	
	}
	
	@BeforeEach
	void beforeEach(){
	
	}
	
	@DisplayName("Test set and get methods")
	@Test
	void testValues(){
		long ID =1;
		String fname ="fname";
		String lname ="lname";
		String address ="some address";
		int age =20;
		Date dateAdded =Calendar.getInstance().getTime();
		String emailId ="email@email.com";
		String pwd ="password";
		
		User user =new User();
		user.setID(ID);
		user.setFname(fname);
		user.setLname(lname);
		user.setAddress(address);
		user.setAge(age);
		user.setDateAdded(dateAdded);
		user.setEmail(emailId);
		user.setPwd(pwd);
		
		assertEquals(user.getID(), ID);
		assertEquals(user.getFname(), fname);
		assertEquals(user.getLname(), lname);
		assertEquals(user.getAddress(), address);
		assertEquals(user.getAge(), age);
		assertEquals(user.getDateAdded(), dateAdded);
		assertEquals(user.getEmail(), emailId);
		assertEquals(user.getPwd(), pwd);
	
	}
	
	@AfterEach
	void afterEach(){
	
	}
	
	@AfterAll
	static void afterAll(){
	
	}

}
