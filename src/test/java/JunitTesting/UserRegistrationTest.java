package JunitTesting;

import static org.junit.Assert.*;
import org.junit.Test;
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

    }

    



