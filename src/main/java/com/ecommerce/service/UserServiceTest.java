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

import com.ecommerce.entity.User;

import org.junit.jupiter.api.Test;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:configuration.xml"})
class UserServiceTest {

@Autowired
private UserService userService;

@DisplayName("Login Authentication")
@Test
void authenticateTest(){
String emailId ="email@email.com";
String pwd ="password";

User user = userService.authenticate(emailId, pwd);
assertTrue(user !=null);
assertEquals(user.getEmail(), emailId);

}

@DisplayName("Get User By Id")
@Test
void getUserByIdTest(){
String emailId ="email@email.com";
String pwd ="password";

User user = userService.authenticate(emailId, pwd);
assertTrue(user !=null);
long id = user.getID();

user = userService.getUserById(id);
assertTrue(user !=null);
assertEquals(user.getID(), id);

}

@DisplayName("Get User By EmailId")
@Test
void getUserByEmailIdTest(){
String emailId ="email@email.com";
User user = userService.getUserByEmailId(emailId);
assertTrue(user !=null);
assertEquals(user.getEmail(), emailId);

}

@DisplayName("Update User")
@Test
void updateUserTest(){
String fname ="fname";
String lname ="lname";
String address ="some address";
int age =20;
Date dateAdded =Calendar.getInstance().getTime();
String emailId ="email@email.com";
String pwd ="password";

User user =new User();
user.setFname(fname);
user.setLname(lname);
user.setAddress(address);
user.setAge(age);
user.setDateAdded(dateAdded);
user.setEmail(emailId);
user.setPwd(pwd);

userService.updateUser(user);
user = userService.getUserByEmailId(emailId);
assertTrue(user !=null);
assertEquals(user.getEmail(), emailId);

}


@DisplayName("Get All Usersd")
@Test
void getAllUsersTest(){
List<User> list = userService.getAllUsers();
assertTrue(list.size()>0);

}


}
