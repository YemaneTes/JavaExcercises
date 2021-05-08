
//Write a Java program to find the index of an array element. [4, 6, 7, 9] x=7

package Excercise4;

public class Question3 {

    public static int  findIndex (int[] theArray, int a) {
        if (theArray == null) return -1;
        int num = theArray.length;
        int i = 0;
        while (i < num) {
            if (theArray[i] == a) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] myArray = {4, 6, 7, 9};
      System.out.println("The index of 7 is: " + findIndex(myArray, 7));

	}

}
