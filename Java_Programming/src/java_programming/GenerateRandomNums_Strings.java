package java_programming;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNums_Strings {

	public static void main(String[] args) {
		
		// Using - Random class
		Random rd=new Random();
		int rdm=rd.nextInt(10);
		System.out.println(rdm);
		
		double dbl=rd.nextDouble();
		System.out.println(dbl);
		
		
		// Using Math
		System.out.println(Math.random());
		
		
		// Using Apache commons-lang API
//		https://commons.apache.org/proper/commons-lang/download_lang.cgi
		String random_num=RandomStringUtils.randomNumeric(5);
		System.out.println(random_num);
		
		String random_alphabets=RandomStringUtils.randomAlphabetic(5);
		System.out.println(random_alphabets);

	}

}
