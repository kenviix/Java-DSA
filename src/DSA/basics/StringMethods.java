package DSA.basics;

/*

charAt()	Returns the character at the specified index (position)	char
codePointAt()	Returns the Unicode of the character at the specified index	int
codePointBefore()	Returns the Unicode of the character before the specified index	int
codePointCount()	Returns the number of Unicode values found in a string.	int
compareTo()	Compares two strings lexicographically	int
compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
concat()	Appends a string to the end of another string	String
contains()	Checks whether a string contains a sequence of characters	boolean
contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
copyValueOf()	Returns a String that represents the characters of the character array	String
endsWith()	Checks whether a string ends with the specified character(s)	boolean
equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
format()	Returns a formatted string using the specified locale, format string, and arguments	String
getBytes()	Converts a string into an array of bytes	byte[]
getChars()	Copies characters from a string to an array of chars	void
hashCode()	Returns the hash code of a string	int
indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
intern()	Returns the canonical representation for the string object	String
isEmpty()	Checks whether a string is empty or not	boolean
join()	Joins one or more strings with a specified separator	String
lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
length()	Returns the length of a specified string	int
matches()	Searches a string for a match against a regular expression, and returns the matches	boolean
offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
regionMatches()	Tests if two string regions are equal	boolean
replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
split()	Splits a string into an array of substrings	String[]
startsWith()	Checks whether a string starts with specified characters	boolean
subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
substring()	Returns a new string which is the substring of a specified string	String
toCharArray()	Converts this string to a new character array	char[]
toLowerCase()	Converts a string to lower case letters	String
toString()	Returns the value of a String object	String
toUpperCase()	Converts a string to upper case letters	String
trim()	Removes whitespace from both ends of a string	String
valueOf()	Returns the string representation of the specified value	String

 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "hello world";
        String str2 = "wassup";
        String str3 = "";
        String empty = "";
        String str4 = "Hello %s! One kilobyte is %,d bytes.";
        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] charArr = {'h', 'e', 'l', 'l', 'o'};
        String myStr1 = "Hello, World!";
        String myStr2 = "New World";
        String wspace = " hello ";

//        System.out.println(str.charAt(4));
//        System.out.println(str.codePointAt(1));
//        System.out.println(str.codePointBefore(1));
//        System.out.println(str.codePointCount(3, 7));
//        System.out.println(str.compareTo("hello world"));
//        System.out.println(str.compareTo("hello"));
//        System.out.println(str.compareTo("new"));
//        System.out.println(str.compareToIgnoreCase("Hello"));
//        System.out.println(str.concat(" to me"));
//        System.out.println(str.contains("ello"));
//        System.out.println(str.contains("new"));
//        System.out.println(str.contentEquals("hello"));
//        System.out.println(str.contentEquals("hello world"));
//        System.out.println(str3.copyValueOf(charArr, 0, 5));
//        System.out.println(str.endsWith("he"));
//        System.out.println(str.endsWith("rld"));
//        System.out.println(str.equals("Hello world"));
//        System.out.println(str.equals("hello world"));
//        System.out.println(str.equalsIgnoreCase("Hello world"));
//        System.out.println(String.format(str4, "World", 1024));
//        System.out.println(str.getBytes()[3]);
//        str.getChars(2, 7, myArray, 4);
//        System.out.println(myArray);
//        System.out.println(str.hashCode());
//        System.out.println(str.indexOf('o'));
//        System.out.println(str.intern());
//        System.out.println(str.isEmpty());
//        System.out.println(empty.isEmpty());
//        System.out.println(str.length());
//        System.out.println(str.matches(str3));
//        System.out.println(str.matches("hello world"));
//        System.out.println(str.offsetByCodePoints(2,4));
//        System.out.println(myStr1.regionMatches(7,myStr2,4,5));
//        System.out.println(String.join(", ",str, str2));
//        System.out.println(str.lastIndexOf('o'));
//        System.out.println(str.replace('o','a'));
//        System.out.println(str.replaceAll("ll","b"));
//        System.out.println(str.replaceFirst("o","a"));
//        System.out.println(Arrays.toString(str.split(" ")));
//        System.out.println(str.startsWith("h"));
//        System.out.println(str.startsWith("H"));
//        System.out.println(str.subSequence(7,11));

//        char[] temp =  str.toCharArray();
//        System.out.println(Arrays.toString(temp));

//        System.out.println(myStr2.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(wspace.trim());

//        System.out.println(String.valueOf(myArray));
//        System.out.println(String.valueOf('A'));
//        System.out.println(String.valueOf(true));
//        System.out.println(String.valueOf(4.5f));
//        System.out.println(String.valueOf(5.2));
//        System.out.println(String.valueOf(12));
//        System.out.println(String.valueOf(1400L));
    }

}
