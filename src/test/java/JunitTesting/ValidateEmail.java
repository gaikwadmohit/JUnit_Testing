package JunitTesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
	public boolean validateEmail(String testString) {
		
		String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(testString);
		boolean result=match.find();
		return result;
}
}