package com.may15;

public class RoboticProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*A robot moves on a grid. The grid has a X axis and Y axis. The robot can take the following commands:
			L -  The robot moves  one position left on  X axis.
			R - The robot moves  one position right on  X axis.
			U - The robot moves  one position up on  Y axis.
			D - The robot moves  one position down on Y axis.

			Considering the robot is at position 0,0 When given a String like RRULDDDLR, what is the final location of the robot on the grid?*/
		
		String givenString="RRULDDDLR";
		int x=0,y=0;
		char chararray[]=givenString.toCharArray();
		
		for(char c:chararray) {
			
			switch (c) {
			case 'L':
				x++;
				break;
			case 'R':
				x--;
				break;
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;	

			default:
				break;
			}
		}
		
		System.out.println("position of robot is " + x +" "+ y);

	}

}
