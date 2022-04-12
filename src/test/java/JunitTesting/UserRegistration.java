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


	 // method to check EmailId	
	public boolean EmailId(String testString) {
		
		String regex="^[a-z]*[0-9]*[a-z]*[@][a-z]*\\.[a-z]*$";
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(testString);
		boolean result3=match.find();
		return result3;
	
}
	 // method to check MobileNumber	
		public boolean MobileNumber(String testString) {
			
			String regex="^[0-9]{2}\\s[0-9]*$";
			Pattern pattern=Pattern.compile(regex);
			Matcher match=pattern.matcher(testString);
			boolean result4=match.find();
			return result4;
		
	}
		 // method to check passward with 8 character	
		public boolean Passward(String testString) {
			
			String regex="^[a-z]*[A-Z]*[0-9]*$";
			Pattern pattern=Pattern.compile(regex);
			Matcher match=pattern.matcher(testString);
			boolean result5=match.find();
			return result5;
		
	}
		 // method to check passward with 1 Uppercase character	
		public boolean Passward1UC(String testString) {
			
			String regex="^[A-Z]{1}[a-z]*$";
			Pattern pattern=Pattern.compile(regex);
			Matcher match=pattern.matcher(testString);
			boolean result6=match.find();
			return result6;
		
			
		
	}
}
