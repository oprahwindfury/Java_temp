
public class Print {
    void print(){
        int i, j;
        for(i=1;i<=5;i++){
            for(j=1;j<=4;j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
    void print(int x){
        String str;
        str = Integer.toString(x);
        int i, n, sum1 = 0, sum2 = 0;
        char ch;
        for(i=0;i<str.length();i++){
            ch = str.charAt(i);
            n = (int)ch;
            if(n%2 == 1)
                sum1 = sum1 + n;
            else sum2 = sum2 + n;
        }
        if(sum1 == sum2)
            System.out.println("It is a lead number");
        else{
            System.out.println("Not a lead number");
        }
    }

    public static void main(String[] args) {
        Print ob = new Print();
        ob.print();
        ob.print(3630);
    }
}
