import java.util.*;
public class fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int a=0,b=1,c;
        System.out.println(a+"'"+b);
        for (int i = 0; i < n; i++) {
            c=a+b;
            System.out.println(c+",");
            a=b;
            b=c;
            
        }


    }
}
