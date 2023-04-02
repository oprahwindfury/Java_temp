import java.util.Scanner;
public class Boolean_search {
    public boolean search(int[] m, int ns){
        int i;
        boolean p = false;
        for(i=0;i<10;i++){
            if(m[i]==ns)
                p=true;
        }
        return (p);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,ns;
        int []m = new int[10];
        boolean y;
        Boolean_search ob = new Boolean_search();
        for (i=0;i<10;i++){
            System.out.println("Enter your marks.");
            m[i] = in.nextInt();
        }
        System.out.println("Enter your marks to be searched.");
        ns = in.nextInt();
        y=ob.search(m,ns);
        if(y)
            System.out.println("The search is successful.");
        else
            System.out.println("The search is unsuccessful");
    }
}
