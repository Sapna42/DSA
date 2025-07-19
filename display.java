import java.util.*;
public class display {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("number for display");
        int n =sc.nextInt();
        int r,i;
        while (n>0) { 
            r =n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}
