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


class ProductTest {

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
		String name ="product name";
		BigDecimal price =new BigDecimal(10.00);
		Date dateAdded =Calendar.getInstance().getTime();
		long categoryId =1;
		
		Product product =new Product();
		product.setID(ID);
		product.setName(name);
		product.setPrice(price);
		product.setDateAdded(dateAdded);
		product.setCategoryId(categoryId);
		
		assertEquals(product.getID(), ID);
		assertEquals(product.getName(), name);
		assertEquals(product.getPrice(), price);
		assertEquals(product.getDateAdded(), dateAdded);
		assertEquals(product.getCategoryId(), categoryId);
	
	
	}
	
	@AfterEach
	void afterEach(){
	
	}
	
	@AfterAll
	static void afterAll(){

	}

}
