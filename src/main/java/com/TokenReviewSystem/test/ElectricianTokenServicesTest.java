package com.TokenReviewSystem.test;

import com.TokenReviewSystem.model.DoctorTokenData;
import com.TokenReviewSystem.model.ElectricianTokenData;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.junit.jupiter.api.Assertions.*;

public class ElectricianTokenServicesTest {

    DoctorTokenData obj;

    @Test
    public void testAdd() {
        String str= "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }

    @Test
    public void testValidateEmail(){
        assertTrue(ElectricianTokenData.isValidEmail("Abc123@gmail.com"));
    }

    @Test
    public void testValidateWrongEmail(){
        assertFalse(ElectricianTokenData.isValidEmail("Abc123gmail.com"));
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
    void addtoken() {
    }

    @Test
    void getalltoken() {
    }

    @Test
    void findpatientdata() {
    }
}