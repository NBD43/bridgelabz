package com.bridgelabz.regex;




import java.util.regex.*;

public class PatternExample {

	public static void main(String[] args) {

		String str = "bbb";
		System.out.println("Using String matches method: "+str.matches(".bb"));
		System.out.println("Using Pattern matches method: "+Pattern.matches(".bb", str));

	}

}
