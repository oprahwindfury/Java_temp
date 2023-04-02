import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        int i,j,t,min;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the numbers: ");
        for(i=0;i<arr.length;i++)
            arr[i] = in.nextInt();
        for(i=0;i<arr.length;i++){
            min = i;
            for(j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            t=arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
        System.out.println("The numbers arranged in ascending order:");
        for(i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
