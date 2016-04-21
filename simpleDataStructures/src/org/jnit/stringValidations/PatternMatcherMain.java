package org.jnit.stringValidations;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//for advanced regular expressions we can use pattern and matcher class in java
public class PatternMatcherMain {

	public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";

	//check is a string contains 3 digits
	public static boolean checkString(String s) {
		Pattern pattern = Pattern.compile("\\d{3}");
		Matcher matcher = pattern.matcher(s);
		if (matcher.find()) {
			return true;
		}
		return false;
	}

	// use pattern to specify the regex and create a matcher object from it
	// matches matches the string to the regex
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\w+");// words occur 1 or more times
		Matcher matcher = pattern.matcher(EXAMPLE_TEST);
		// check all occurance
		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
			System.out.println(matcher.group());
		}
		// now create a new pattern and matcher to replace whitespace with tabs
		Pattern replace = Pattern.compile("\\s+");
		Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
		System.out.println(matcher2.replaceAll("\t"));
		System.out.println(checkString("123"));
		System.out.println(checkString("1234"));
	}

}
