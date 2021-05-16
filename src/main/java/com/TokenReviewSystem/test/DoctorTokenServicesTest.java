package com.TokenReviewSystem.test;

import com.TokenReviewSystem.model.DoctorTokenData;
import org.testng.annotations.*;

import static org.junit.jupiter.api.Assertions.*;

public class DoctorTokenServicesTest {

    @Test
    public void testAdd() {
        String str= "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }

    @Test
    public void testValidateEmail(){
        assertTrue(DoctorTokenData.isValidEmail("Abc123@gmail.com"));
    }

    @Test
    public void testValidateWrongEmail(){
        assertFalse(DoctorTokenData.isValidEmail("Abc123gmail.com"));
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