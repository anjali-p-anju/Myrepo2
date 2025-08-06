package stringpack;

public class Stringpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello world";
System.out.println(s);
String s1=new String("Hi");
System.out.println(s1);
//charat-to return character in the string based on index position
System.out.println(s.charAt(6));
//length-to return	length of the string
System.out.println(s.length());
//concat-to add two string
System.out.println(s.concat(s1));
//contain-to check weather a character or word is presenting in the string
System.out.println(s.contains("w"));
System.out.println(s.contains("o"));
//touppercase-to convert lower case to upper case
System.out.println(s.toUpperCase());
//to lower case-change to lower case
System.out.println(s.toLowerCase());
//equals-check two strings are equal
System.out.println(s.equals(s1));
String r="java";
String r1="java";
String r2="Java";
System.out.println(r.equals(r2));
//equals ignore case-to ignore the case
System.out.println(r.equalsIgnoreCase(r1));
String t=new String("java");
System.out.println(r.equals(t));//content checked so the output is true
System.out.println(r==t);//memory location checked so the output is false
//Is empty-to check weather the string is empty or not
System.out.println(r.isBlank());
String u="";
System.out.println(u.isBlank());
//valueof-convert data type to string .used for type conversion
int v=20;
System.out.println(String.valueOf(v));
	}

}
