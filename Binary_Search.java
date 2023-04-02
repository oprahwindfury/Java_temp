import java.util.Scanner;

// To find the given number in array using Binary Search
public class Binary_Search {
    public static void main(String[] args) {
        int i,k=0,n,p,lb=0,ub=9;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the numbers: ");
        for(i=0;i<arr.length;i++)
            arr[i] = in.nextInt();
        System.out.println("Enter the number to be searched:");
        n = in.nextInt();
        while (lb<=ub){
            p = (lb+ub)/2;
            if(arr[p]<n)
                lb = p+1;
            if(arr[p]>n)
                ub = p-1;
            if(arr[p] == n){
                k=1;
                break;
            } // end of condition
        } // end of loop
        if(k == 1)
            System.out.println("Search successful!");
        else
            System.out.println("Search unsuccessful!");
    } // end of main
} // end of class
