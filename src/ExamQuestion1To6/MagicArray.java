


package ExamQuestion1To6;


public class MagicArray {
	public static boolean DivisibleByThree(int arr[], int n)
    {
        // Find remainder of sum when divided by 3
        int remainder = 0;
        for (int i = 0; i < n; i++)
            remainder = (remainder + arr[i]) % 3;
  
        // Return true if remainder is 0.
        return (remainder == 0);
    }
  
    public static void main(String[] args)
    {
        int arr[] = { 40, 50, 70 };
        int n = 3;
        if (DivisibleByThree(arr, n))
            System.out.print("MagicArray\n");
        else
            System.out.print("NonMagicArray\n");
    }
}