package com.may19;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Remove the duplicate words from the given Sentence.*/
     String s="Good day day bye bye";
    String splitStringArray[]= s.split(" ");
    Arrays.asList(splitStringArray).stream().distinct().forEach(System.out::print);
    
	}

}
