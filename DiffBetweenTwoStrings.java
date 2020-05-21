package com.may20;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class DiffBetweenTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	problem statement
		Create a method to return difference between given and input String.

			     eg. Given String  = ""abcdefghijklmnopqrstuvwxyz"";
			           Input String  = ""Online test with GS client "";
			Write a method that should return difference of characters (missing char from given string) between  given String and Input string.*/
		
		String  given = "abcdefghijklmnopqrstuvwxyz";
        String  input=  "Online test with GS client";
        input=input.replace(" ", "");
        List<String> givenList=Arrays.asList(given.split(""));
        
        List<String> inputList=Arrays.asList(input.split(""));
        
        
        CollectionUtils.subtract(givenList, inputList).forEach(System.out::println);
        
        
	}

}
