package com.ecommerce.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ecommerce.entity.Purchase;
import com.ecommerce.entity.Product;
import com.ecommerce.entity.PurchaseItem;

import org.junit.jupiter.api.Test;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:configuration.xml"})
class PurchaseServiceTest {


@Autowired
private PurchaseItemService purchaseItemService;

@Autowired
private PurchaseService purchaseService;

@DisplayName("Get Purchase By Id")
@Test
void getPurchaseByIdTest(){
long userId =10;
BigDecimal grossTotal =new BigDecimal(10.00);
Date date =Calendar.getInstance().getTime();

Purchase purchase  =new Purchase();
purchase.setUserId(userId);
purchase.setTotal(grossTotal);
purchase.setDate(date);

purchaseService.updatePurchase(purchase);

List<Purchase> list = purchaseService.getAllItemsByUserId(userId);
long newId =0;
for(Purchase p: list){
if(p.getUserId()== userId && p.getTotal().compareTo(grossTotal)==0){
newId = p.getID();
break;
}
}
assertTrue(newId >0);
purchase = purchaseService.getPurchaseById(newId);
assertTrue(purchase !=null);
assertEquals(purchase.getID(), newId);
}



@DisplayName("Get All Purchases")
@Test
void getAllItemsTest(){

List<Purchase> list = purchaseService.getAllItems();
assertTrue(list.size()>0);
}

@DisplayName("Get All Purchases By User Id")
@Test
void getAllItemsByUserIdTest(){
long userId =10;
BigDecimal grossTotal =new BigDecimal(10.00);
Date date =Calendar.getInstance().getTime();

Purchase purchase  =new Purchase();
purchase.setUserId(userId);
purchase.setTotal(grossTotal);
purchase.setDate(date);

purchaseService.updatePurchase(purchase);

List<Purchase> list = purchaseService.getAllItemsByUserId(userId);
assertTrue(list.size()>0);


}

@DisplayName("Update Purchase")
@Test
void updatePurchaseTest(){
long userId =10;
BigDecimal grossTotal =new BigDecimal(10.00);
Date date =Calendar.getInstance().getTime();

Purchase purchase  =new Purchase();
purchase.setUserId(userId);
purchase.setTotal(grossTotal);
purchase.setDate(date);

purchaseService.updatePurchase(purchase);

List<Purchase> list = purchaseService.getAllItemsByUserId(userId);
long newId =0;
for(Purchase p: list){
if(p.getUserId()== userId &&  p.getTotal().compareTo(grossTotal)==0){
newId = p.getID();
break;
}
}
assertTrue(newId >0);
purchase = purchaseService.getPurchaseById(newId);
assertTrue(purchase !=null);
assertEquals(purchase.getID(), newId);
}



}
