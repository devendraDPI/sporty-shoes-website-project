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
class PurchaseItemServiceTest {


@Autowired
private PurchaseItemService purchaseItemService;

@DisplayName("Get Purchase Item By Id")
@Test
void getItembyIdTest(){
long userId =10;
long purchaseId =1;
long productId =1;
BigDecimal rate =new BigDecimal(10.00);
int qty =2;
BigDecimal price =new BigDecimal(20.00);

PurchaseItem pi =new PurchaseItem();
pi.setUserId(userId);
pi.setPurchaseId(purchaseId);
pi.setProductId(productId);
pi.setPrice(price);
pi.setRate(rate);
pi.setQty(qty);

purchaseItemService.updateItem(pi);

List<PurchaseItem> list = purchaseItemService.getAllItemsByPurchaseId(1);
long newId =0;
for(PurchaseItem p: list){
if(p.getUserId()== userId && p.getQty()==2){
newId = p.getID();
break;
}
}
assertTrue(newId >0);
pi = purchaseItemService.getItemById(newId);
assertTrue(pi !=null);
assertEquals(pi.getID(), newId);

purchaseItemService.deleteItem(newId);
}

@DisplayName("Get All Items By Purchase Id")
@Test
void getAllItemsByPurchaseItemTest(){
long userId =10;
long purchaseId =1;
long productId =1;
BigDecimal rate =new BigDecimal(10.00);
int qty =2;
BigDecimal price =new BigDecimal(20.00);

PurchaseItem pi =new PurchaseItem();
pi.setUserId(userId);
pi.setPurchaseId(purchaseId);
pi.setProductId(productId);
pi.setPrice(price);
pi.setRate(rate);
pi.setQty(qty);

purchaseItemService.updateItem(pi);

List<PurchaseItem> list = purchaseItemService.getAllItemsByPurchaseId(1);
assertTrue(list.size()>0);
long newId =0;
for(PurchaseItem p: list){
if(p.getUserId()== userId && p.getQty()==2){
newId = p.getID();
break;
}
}
purchaseItemService.deleteItem(newId);
}


@DisplayName("Update Purchase Item")
@Test
void updateItemTest(){
long userId =10;
long purchaseId =111;
long productId =1;
BigDecimal rate =new BigDecimal(10.00);
int qty =2;
BigDecimal price =new BigDecimal(20.00);

PurchaseItem pi =new PurchaseItem();
pi.setUserId(userId);
pi.setPurchaseId(purchaseId);
pi.setProductId(productId);
pi.setPrice(price);
pi.setRate(rate);
pi.setQty(qty);

purchaseItemService.updateItem(pi);

List<PurchaseItem> list = purchaseItemService.getAllItemsByPurchaseId(purchaseId);
long newId =0;
int newQty =100;
for(PurchaseItem p: list){
if(p.getUserId()== userId && p.getQty()==2){
newId = p.getID();
break;
}
}
assertTrue(newId >0);
purchaseItemService.deleteItem(newId);
}


@DisplayName("Delete Purchase Item")
@Test
void deleteItemTest(){
long userId =10;
long purchaseId =1;
long productId =1;
BigDecimal rate =new BigDecimal(10.00);
int qty =2;
BigDecimal price =new BigDecimal(20.00);

PurchaseItem pi =new PurchaseItem();
pi.setUserId(userId);
pi.setPurchaseId(purchaseId);
pi.setProductId(productId);
pi.setPrice(price);
pi.setRate(rate);
pi.setQty(qty);

purchaseItemService.updateItem(pi);

List<PurchaseItem> list = purchaseItemService.getAllItemsByPurchaseId(purchaseId);
long newId =0;
int newQty =100;
for(PurchaseItem p: list){
if(p.getUserId()== userId && p.getQty()==2){
newId = p.getID();
break;
}
}
assertTrue(newId >0);
purchaseItemService.deleteItem(newId);

list = purchaseItemService.getAllItemsByPurchaseId(purchaseId);
boolean wasFound =false;
for(PurchaseItem p: list){
if(p.getID()== newId){
wasFound =true;
break;
}
}
assertFalse(wasFound);
}



@DisplayName("Delete All Purchase Items for a Purchase Id")
@Test
void deleteAllsItemForPurchaseIdTest(){
long userId =10;
long purchaseId =1;
long productId =1;
BigDecimal rate =new BigDecimal(10.00);
int qty =2;
BigDecimal price =new BigDecimal(20.00);

PurchaseItem pi =new PurchaseItem();
pi.setUserId(userId);
pi.setPurchaseId(purchaseId);
pi.setProductId(productId);
pi.setPrice(price);
pi.setRate(rate);
pi.setQty(qty);

purchaseItemService.updateItem(pi);

List<PurchaseItem> list = purchaseItemService.getAllItemsByPurchaseId(1);
long newId =0;
int newQty =100;
for(PurchaseItem p: list){
if(p.getUserId()== userId && p.getQty()==2){
newId = p.getID();
break;
}
}
assertTrue(newId >0);
purchaseItemService.deleteAllItemsForPurchaseId(purchaseId);

list = purchaseItemService.getAllItemsByPurchaseId(1);
assertTrue(list.size()==0);
}

}
