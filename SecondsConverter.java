/*
 * 
 * 
 * 
 */

package week2;

import java.util.Scanner;

public class SecondsConverter{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Read amount of seconds as integer
		int amountofseconds, minutes, seconds;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the amount of seconds as interger and press enter");
		
		amountofseconds = input.nextInt();
		
		// Step 2: Calculate the minutes and seconds
		
		minutes = amountofseconds / 60;
		seconds = amountofseconds % 60;
		
		//Step3: Display the results
		
		System.out.println("If the amount if second is " + amountofseconds + " , then it is " + minutes
				+ " minutes and " + seconds + " seconds");
		
	}

}
