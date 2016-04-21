package org.jnit.stringValidations;

//pattern matching helps to validate whether a string is in desired format
//example we can validate phoneNumbers, ssn's etc.
public class StringMatches {
	
	//\d=any digit([0-9]) \D any non digit equivalent to [^\d]
	//\w=any word \W any non-word equivalent to [^\w]
	//\s=any white-space character \S any non white-space character equivalent to [^\s]
	//[a-z][A-Z][1-9][a-p]
	//{x} specify no of occurences, x we can specify a number
	//{x,y} occurs between x and y times
	//[^abc]=caret character in regex is not, the pattern ^abc is anything other than a,b,c characters
	//. means any character
	//* occurs 0 or more times,0..*
	//+ occurs 1 or more times, 1..*
	//111-111-1111
	//\is the escape character
	public static boolean validatePhoneNumber(String phoneNumber){
		return phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}");
	}
	
	public static boolean validateSSN(String ssn){
		return ssn.matches("\\d{3}-\\d{2}-\\d{4}");
	}

	
	public static boolean validateZipCode(String zip){
		return zip.matches("\\d{5}");
	}
	
	//check if string doesn't start with a number
	public static boolean checkString(String x){
		return x.matches("[^\\d].*");//not of digit,.is any character,* is any number of occurences
	}
	
	//check if string contains a specified word with regex
	public static boolean checkOccurance(String x){
		return x.matches(".*true.*");
	}
	
	//check if string contains exactly three letters
	public static boolean checkStringThree(String s){
		return s.matches("[a-zA-Z]{3}");
	}

	public static void main(String[] args) {
		System.out.println(validatePhoneNumber("121-121-1211"));
		System.out.println(validateSSN("414-41-1234"));
		System.out.println(validateZipCode("08859"));
		System.out.println(checkString("1abc"));
		System.out.println(checkString("abc"));
		System.out.println(checkOccurance("construe"));
		System.out.println(checkOccurance("construction"));
		System.out.println(checkStringThree("abc"));
		System.out.println(checkStringThree("abcd"));
	}

}
