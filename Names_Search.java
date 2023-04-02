import java.util.Scanner;

public class Names_Search{
    public static void main(String[] args) {
        int i, n, c=0;
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        n = in.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter " + n + " names in the array:");
        for(i=0;i< arr.length;i++)
            arr[i] = in.next();
        System.out.println("Enter the name to be searched:");
        name = in.next();
        for(i = 0;i<arr.length;i++) {
            if (arr[i].equals(name))
                System.out.println("Search successful!: The name is present at the index no. " + i);
            else
                c++;
        } // end of loop
        if(c == (arr.length))
            System.out.println("Search unsuccessful!");
    } // end of main
} // end of class