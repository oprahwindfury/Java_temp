import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        int i,j,t;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the numbers:");
        for(i=0;i<10;i++)
            arr[i] = in.nextInt();
        for(i=0;i< 9;i++){
            for(j=0;j<(9-i);j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("The numbers arranged in ascending order are :");
        for(i=0;i<10;i++)
            System.out.println(arr[i]);
    }
}
