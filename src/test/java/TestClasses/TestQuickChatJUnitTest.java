/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClasses;

import com.mycompany.quickchat.login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class TestQuickChatJUnitTest {
    
    // test username (valid)
    @Test
    public void testCheckUserName_Valid() {
        login user = new login("eg.Simphiwe", "eg.Munalilo", "M@_12", "password", "+27680722754");
        assertTrue(user.checkUserName());
    }
    
     // test username (valid)
    @Test
    public void testCheckUserName_Invalid() {
        login user = new login("eg.Simphiwe", "eg.Munalilo", "M@_12", "password", "+27680722754");
        assertFalse(user.checkUserName());
    }
    
    // test password (invalid)
    @Test
    public void testCheckPasswordComplexity_Valid() {
        login user = new login("eg.Simphiwe", "eg.Munalilo", "M@_12", "password", "+27680722754");
        assertTrue(user.checkPasswordComplexity());
    }

    // test password (invalid)
    @Test
    public void testCheckPasswordComplexity_Invalid() {
        login user = new login("eg.Simphiwe", "eg.Munalilo", "M@_12", "password", "+27680722754");
        assertFalse(user.checkPasswordComplexity());
    }

    // test cellphone (valid)
    @Test
    public void testCheckCellphoneNumber_Valid() {
        login user = new login("eg.Simphiwe", "eg.Munalilo", "M@_12", "password", "+27680722754");
        assertTrue(user.checkCellphoneNumber());
    }

    // test cellphone (invalid)
    @Test
    public void testCheckCellphoneNumber_Invalid() {
        login user = new login("eg.Simphiwe", "eg.Munalilo", "M@_12", "password", "+27680722754");
        assertFalse(user.checkCellphoneNumber());
    }

    // test registration
    @Test
    public void testRegisterUser() {
        login user = new login("eg.Simphiwe", "eg.Munalilo", "M@_12", "password", "+27680722754");
        assertEquals("User is registered successfully.", user.registerUser());
    }

    // test login Success
    @Test
    public void testLoginUser_Success() {
        login user = new login("eg.Simphiwe", "eg.Munalilo", "M@_12", "password", "+27680722754");
        assertTrue(user.loginUser("ab_cd", "Password1!"));
    }

    // test login failure
    @Test
    public void testLoginUser_Failure() {
        login user = new login("eg.Simphiwe", "eg.Munalilo", "M@_12", "password", "+27680722754");
        assertFalse(user.loginUser("wrong", "123"));
    

    }
    
}
