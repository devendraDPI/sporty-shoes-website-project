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


class PurchaseTest {

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
		long userId =10;
		BigDecimal grossTotal =new BigDecimal(10.00);
		Date date =Calendar.getInstance().getTime();
		
		Purchase purchase  =new Purchase();
		purchase.setID(ID);
		purchase.setUserId(userId);
		purchase.setTotal(grossTotal);
		purchase.setDate(date);
		
		assertEquals(purchase.getID(), ID);
		assertEquals(purchase.getUserId(), userId);
		assertEquals(purchase.getTotal(), grossTotal);
		assertEquals(purchase.getDate(), date);
	
	}
	
	@AfterEach
	void afterEach(){
	
	}
	
	@AfterAll
	static void afterAll(){
	
	}

}
