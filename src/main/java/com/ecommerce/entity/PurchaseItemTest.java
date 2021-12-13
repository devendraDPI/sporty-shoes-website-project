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


class PurchaseItemTest {

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
		long purchaseId =1;
		long productId =1;
		BigDecimal rate =new BigDecimal(10.00);
		int qty =2;
		BigDecimal price =new BigDecimal(20.00);
		
		PurchaseItem pi =new PurchaseItem();
		pi.setID(ID);
		pi.setUserId(userId);
		pi.setPurchaseId(purchaseId);
		pi.setProductId(productId);
		pi.setPrice(price);
		pi.setRate(rate);
		pi.setQty(qty);
		
		assertEquals(pi.getID(), ID);
		assertEquals(pi.getUserId(), userId);
		assertEquals(pi.getPurchaseId(), purchaseId);
		assertEquals(pi.getProductId(), productId);
		assertEquals(pi.getRate(), rate);
		assertEquals(pi.getQty(), qty);
		assertEquals(pi.getPrice(), price);
	
	
	}
	
	@AfterEach
	void afterEach(){
	
	}
	
	@AfterAll
	static void afterAll(){
	
	}

}
