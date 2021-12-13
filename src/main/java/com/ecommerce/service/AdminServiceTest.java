package com.ecommerce.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ecommerce.entity.Admin;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:configuration.xml"})
class AdminServiceTest {

@Autowired
private AdminService adminService;

@DisplayName("Login Authentication")
@Test
void authenticateTest(){
String adminId ="admin";
String pwd ="aaaaaa";
Admin admin = adminService.authenticate(adminId, pwd);
assertNotNull(admin);
assertTrue(admin.getID()>0);
}

@DisplayName("Get Admin by Id")
@Test
void getAdminByIdTest(){
String adminId ="admin";
String pwd ="aaaaaa";
Admin admin = adminService.authenticate(adminId, pwd);
assertNotNull(admin);
assertTrue(admin.getID()>0);
long  ID = admin.getID();
Admin newAdmin = adminService.getAdminById(ID);
assertNotNull(newAdmin);
assertEquals(admin.getID(), ID);

}

@DisplayName("Update Password")
@Test
void updatePwdTest(){
String adminId ="admin";
String pwd ="aaaaaa";
Admin admin = adminService.authenticate(adminId, pwd);
assertNotNull(admin);
long ID = admin.getID();
admin.setAdminPwd(pwd);
adminService.updatePwd(admin);
Admin newAdmin = adminService.getAdminById(ID);
assertNotNull(newAdmin);
assertEquals(admin.getAdminPwd(), pwd);

}

}
