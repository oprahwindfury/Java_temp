import java.util.Scanner;

// To find the number in array using Linear Search
public class Linear_Search {
    public static void main(String[] args) {
        int i, n;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter numbers:");
        for(i=0;i<arr.length;i++)
            arr[i] = in.nextInt();
        System.out.println("Enter the number to be searched: ");
        n = in.nextInt();
        for(i=0;i< arr.length;i++)
            if(arr[i] == n)
                System.out.println("Search successful!");
    } // end of main
} // end of class
