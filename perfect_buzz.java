import java.util.Scanner;
public class perfect_buzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[20];
        int n, s, i, j;
        System.out.println("Enter 20 integer numbers.");
        for (i = 0; i < 20; i++)
            a[i] = in.nextInt();
        System.out.println("Menu items");
        System.out.println("1.To display all perfect numbers.");
        System.out.println("2.To display all the buzz numbers.");
        System.out.println("Enter your choice.");
        n = in.nextInt();
        switch (n) {
            case 1 -> {
                for (i = 0; i < 20; i++) {
                    s = 0;
                    for (j = 1; j < a[i]; j++)
                        if (a[i] % j == 0)
                            s = s + j;
                    if (s == a[i])
                        System.out.println(a[i]);
                }
            }
            case 2 -> {
                for (i = 0; i < 20; i++)
                    if (a[i] % 7 == 0 || a[i] % 10 == 7)
                        System.out.println(a[i]);
            }
            default -> System.out.println("Invalid choice!");
        }
    }
}