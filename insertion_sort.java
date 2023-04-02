import java.util.Scanner;
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("Enter "+ n +" numbers in the array in unsorted form:-");
        int[] a = new int[n];
        for(int i =0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.println("Original array:");
        System.out.print("A = (");
      for(int i =0;i<n;i++)
          System.out.print(a[i]+", ");
        System.out.println(")");
      int key;
      int b;
      int temp = 0;
     for (b = 1; b < n;b++){
            key = a[b];
            int c = b - 1;
            while (c >= 0 && a[c] > key) {
                a[c + 1] = temp;
                c = c - 1;
            }
        }
        System.out.println("Sorted array:-");
        System.out.print("A = (");
     for(int i =0;i<n;i++)
         System.out.print(a[i]+", ");
    }
}
