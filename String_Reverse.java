import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        int i, l;
        char ch;
        String str;
        StringBuilder str1 = new StringBuilder();
        Scanner in = new Scanner(System.in);
        str = in.next();
        l = str.length();
        for(i = l-1; i>=0; i++){
            ch = str.charAt(i);
            str1.append(ch);
        }
        System.out.println("Reversed String: ");
        System.out.println(str1);
    }
}
