//Write a program that takes integer input ( 1 to 7)  from the a user ,1 representing Monday to 7 representing Sunday. 
//The program should decide whether the day input is a weekend or a weekday.(Use switch statement)

package Excercise3;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		
        Scanner num = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = num.nextInt();

        System.out.println(getDayName(day));
    }

    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "You entered 1 for Monday"; break;
            case 2: dayName = "You entered 2 for Tuesday"; break;
            case 3: dayName = "You entered 3 for Wednesday"; break;
            case 4: dayName = "You entered 4 for Thursday"; break;
            case 5: dayName = "You entered 5 for Friday"; break;
            case 6: dayName = "You entered 6 for Saturday"; break;
            case 7: dayName = "You entered 7 for Sunday"; break;
            
        
        }

        return dayName;

	}
    
    
   
}
