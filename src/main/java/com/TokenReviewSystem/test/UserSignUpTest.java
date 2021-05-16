package com.TokenReviewSystem.test;

import com.TokenReviewSystem.model.DoctorTokenData;
import com.TokenReviewSystem.model.UserData;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.junit.jupiter.api.Assertions.*;

public class UserSignUpTest {

    @Test
    public void testAdd() {
        String str= "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }

    @Test
    public void testValidateEmail(){
        assertTrue(UserData.isValidEmail("Abc123@gmail.com"));
    }

    @Test
    public void testValidateWrongEmail(){
        assertFalse(UserData.isValidEmail("Abc123gmail.com"));
    }

    @Test
    public void testValidatePhone(){
        assertTrue(UserData.isValidPhone("9120329400"));
    }

    @Test
    public void testValidateWrongPhone(){
        assertFalse(UserData.isValidPhone("12412312"));
    }

    @Test
    public void testValidatePin(){
        assertTrue(UserData.isValidPin("123123"));
    }

    @Test
    public void testValidateWrongPin(){
        assertFalse(UserData.isValidPin("12412"));
    }

    @AfterClass
    public void afterClass() {

    }

    @BeforeClass
    public void beforeClass() {

    }

    @AfterMethod
    public void tearDown() {

    }

    @BeforeMethod
    public void setUp() {

    }


    @Test
    void signinuser() {
    }

    @Test
    void getAlluaerdata() {
    }

    @Test
    void login() {
    }

    @Test
    void updateuserdata() {
    }

    @Test
    void forgetpassword() {
    }
}