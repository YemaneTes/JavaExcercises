package ExamQuestion1To6;

import java.util.Scanner;


public class CountVowels {

		   public static void main(String args[]){
		      int count = 0;
		      System.out.println("Enter Word :");
		      Scanner sc = new Scanner(System.in);
		      String word = sc.nextLine();

		      for (int i=0 ; i<word.length(); i++){
		         char c = word.charAt(i);
		         if(c == 'a'|| c == 'e'|| c == 'i' ||c == 'o' ||c == 'u'||c == ' '){
		            count ++;
		         }
		      }
		      System.out.println(" The number of vowels in the given sentence is "+count);
		   }
		}