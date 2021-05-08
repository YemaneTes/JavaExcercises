
/*Write a program to print following (Use for loop)
**********
**********
**********
**********
*/
package Excercise3;

public class Question2 {

	public static void main(String[] args) {
		
		int rows, columns, i, j;
		rows=4;
		columns=10;
		
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <= columns; j++)
			{
				System.out.print("*"); 
			}
			System.out.print("\n"); 
		}

	}

}
