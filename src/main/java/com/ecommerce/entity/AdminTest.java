package com.ecommerce.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;



class AdminTest {

	@BeforeAll
	static void beforeAll(){
	
	}
	
	@BeforeEach
	void beforeEach(){
	
	}
	
	@DisplayName("Test set and get methods")
	@Test
	void testValues(){
		int id = 1;
		String adminId = "admin";
		String pwd = "password";
		Admin admin = new Admin();
		admin.setID(id);
		admin.setAdminId(adminId);
		admin.setAdminPwd(pwd);
		
		assertEquals(admin.getID(), id);
		assertEquals(admin.getAdminId(), adminId);
		assertEquals(admin.getAdminPwd(), pwd);
		
	}
	
	@AfterEach
	void afterEach(){
	
	}
	
	@AfterAll
	static void afterAll(){
	
	}

}
