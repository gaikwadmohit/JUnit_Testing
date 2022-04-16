package JunitTesting;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;


import junit.framework.Assert;

public class UserRegistrationTest {

    UserRegistration r = new UserRegistration();
    	
    @Test
    public void MatchFirstName() {
       	boolean result1=r.firstName("Mohit");
       	assertEquals(result1,true);
    }
        
    	
        @Test
        public void MatchLastName() {
           	boolean result2=r.LastName("Gaikwad");
           assertEquals(result2, true);

    }
   
    	
        @Test
        public void MatchEmailId() {
           	boolean result3=r.EmailId("mohit16gaikwad@gmail.com");
           assertEquals(result3, true);

    }


        @Test
        public void MatchMobileNumber() {
           	boolean result4=r.MobileNumber("91 858529645");
           assertEquals(result4, true);

    }

        @Test
        public void MatchPassward_8_Character() {
           	boolean result5=r.Passward("abcdefpp123");
           assertEquals(result5, true);

    }
        @Test
        public void MatchPassward_1Uppercase() {
           	boolean result6=r.Passward1UC("Abcdefoo");
           assertEquals(result6, true);

    }
        @Test
        public void MatchPassward_1Numeric() {
           	boolean result7=r.Passward1Numeric("Abcdefoo123");
           assertEquals(result7, true);

    }
        @Test
        public void MatchPassward_1SpecialChar() {
           	boolean result8=r.Passward1Numeric("Abcdefoo22123");
           assertEquals(result8, true);

    }
        
}  
        

       