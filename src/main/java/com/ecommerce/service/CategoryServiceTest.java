package com.ecommerce.service;


import static org.junit.jupiter.api.Assertions.*;

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

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:configuration.xml"})
class CategoryServiceTest {

@Autowired
private CategoryService categoryService;

@DisplayName("Get Category By Id")
@Test
void getCategoryByIdTest(){
long id =1;
Category cat = categoryService.getCategoryById(id);
assertNotNull(cat);
assertEquals(cat.getID(), id);
}

@DisplayName("Update Category")
@Test
void updateCategoryTest(){
String name =String.valueOf(System.currentTimeMillis());
Category cat =new Category();
cat.setName(name);
categoryService.updateCategory(cat);

List<Category> list = categoryService.getAllCategories();
long newId =0;
for(Category c: list ){
if(c.getName().equals(name)){
newId = c.getID();
break;
}
}
assertTrue(newId >0);
categoryService.deleteCategory(newId);
}

@DisplayName("Delete Category")
@Test
void deleteCategoryTest(){
String name =String.valueOf(System.currentTimeMillis());
Category cat =new Category();
cat.setName(name);
categoryService.updateCategory(cat);

List<Category> list = categoryService.getAllCategories();
long newId =0;
for(Category c: list ){
if(c.getName().equals(name)){
newId = c.getID();
break;
}
}
assertTrue(newId >0);
categoryService.deleteCategory(newId);

list = categoryService.getAllCategories();
boolean wasFound =false;
for(Category c: list ){
if(c.getID()== newId){
wasFound =true;
break;
}
}
assertFalse(wasFound);
}

@DisplayName("Get all Categories")
@Test
void getAllCategoriesTest(){
List<Category> list = categoryService.getAllCategories();
assertTrue(list.size()>0);
}

@DisplayName("Get Categories Dropdown")
@Test
void getCategoriesDropDownTest(){
String dropdown = categoryService.getCategoriesDropDown(0);
assertTrue(dropdown.indexOf("<option value=")>-1);
}


}
