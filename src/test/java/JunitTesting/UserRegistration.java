package JunitTesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {


	
	 // method to check first name
	
	public boolean firstName(String testString) {
		
		String regex="^[A-Z]{1}[a-z]*";
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(testString);
		boolean result1=match.find();
		return result1;
	

	}

	 // method to check last name
	
	public boolean LastName(String testString) {
		
		String regex="^[A-Z]{1}[a-z]*";
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(testString);
		boolean result2=match.find();
		return result2;
	
}

	 
}
