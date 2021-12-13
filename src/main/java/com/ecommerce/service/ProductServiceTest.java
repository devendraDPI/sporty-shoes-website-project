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

import com.ecommerce.entity.Category;
import com.ecommerce.entity.Product;

import org.junit.jupiter.api.Test;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:configuration.xml"})
class ProductServiceTest {

@Autowired
private ProductService productService;

@DisplayName("Get Product By Id")
@Test
void getProductByIdTest(){
long id =2;
Product product = productService.getProductById(id);
assertNotNull(product);
assertEquals(product.getID(), id);
}


@DisplayName("Update Product")
@Test
void updateProductTest(){
String name ="product name";
BigDecimal price =new BigDecimal(10.00);
Date dateAdded =Calendar.getInstance().getTime();
long categoryId =1;

Product product =new Product();
product.setName(name);
product.setPrice(price);
product.setDateAdded(dateAdded);
product.setCategoryId(categoryId);
productService.updateProduct(product);

List<Product> list = productService.getAllProducts();
long newId =0;
for(Product p: list ){
if(p.getName().equals(name)){
newId = p.getID();
break;
}
}
assertTrue(newId >0);
productService.deleteProduct(newId);
}

@DisplayName("Delete Product")
@Test
void deleteProductTest(){
String name ="product name";
BigDecimal price =new BigDecimal(10.00);
Date dateAdded =Calendar.getInstance().getTime();
long categoryId =1;

Product product =new Product();
product.setName(name);
product.setPrice(price);
product.setDateAdded(dateAdded);
product.setCategoryId(categoryId);
productService.updateProduct(product);

List<Product> list = productService.getAllProducts();
long newId =0;
for(Product p: list ){
if(p.getName().equals(name)){
newId = p.getID();
break;
}
}
assertTrue(newId >0);
productService.deleteProduct(newId);

list = productService.getAllProducts();
boolean wasFound =false;
for(Product p: list ){
if(p.getID()== newId){
wasFound =true;
break;
}
}
assertFalse(wasFound);
}


@DisplayName("Get all Products")
@Test
void getAllProductsTest(){
List<Product> list = productService.getAllProducts();
assertTrue(list.size()>0);
}


}
