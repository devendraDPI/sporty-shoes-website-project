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


class CategoryTest {

	@BeforeAll
	static void beforeAll(){
	
	}
	
	@BeforeEach
	void beforeEach(){
	
	}
	
	@DisplayName("Test set and get methods")
	@Test
	void testValues(){
		long id =1;
		String name ="category name";
		
		Category category =new Category();
		category.setID(id);
		category.setName(name);
		
		assertEquals(category.getID(), id);
		assertEquals(category.getName(), name);
	}
	
	@AfterEach
	void afterEach(){
	
	}
	
	@AfterAll
	static void afterAll(){
	
	}

}
