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


class CartItemTest {

	@BeforeAll
	static void beforeAll(){
	
	}
	
	@BeforeEach
	void beforeEach(){
	
	}
	
	@DisplayName("Test set and get methods")
	@Test
	void testValues(){
		long productId =1;
		String name ="product name";
		BigDecimal rate=new BigDecimal(10.00);
		BigDecimal price =new BigDecimal(20.00);
		int qty =2;
		
		CartItem cartItem =new CartItem();
		cartItem.setProductId(productId);
		cartItem.setName(name);
		cartItem.setRate(rate);
		cartItem.setPrice(price);
		cartItem.setQty(qty);
		
		assertEquals(cartItem.getProductId(), productId);
		assertEquals(cartItem.getName(), name);
		assertEquals(cartItem.getRate(), rate);
		assertEquals(cartItem.getPrice(), price);
		assertEquals(cartItem.getQty(), qty);
	}
	
	@AfterEach
	void afterEach(){
	
	}
	
	@AfterAll
	static void afterAll(){
	
	}

}
