import java.io.*;

// To find Prime numbers among the array.
public class Prime_no {
    public static void main(String[] args) throws IOException{
        int i,j;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers for the array: ");
        for(i=0;i< arr.length;i++)
            arr[i] = Integer.parseInt(in.readLine());
        System.out.println("Prime numbers :");
        for(i=0;i< arr.length;i++){
            int p = 0;
            for(j=1;j<=arr[i];j++)
                if (arr[i] % j == 0)
                    p++;
            if(p == 2)
                System.out.print(arr[i] + ", ");
        } // end of loop
    } // end of main
} // end of class
