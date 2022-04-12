package JunitTesting;

import static org.junit.Assert.assertEquals;

import  org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;

public class UserRegistrationTest {

    UserRegistration r = new UserRegistration();
    	
    @Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
    	
    	boolean result=r.firstName("Mohit");
        Assert.assertEquals(result, true);

    }

    }




