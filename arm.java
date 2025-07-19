import java.util.*;
public class arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to checke armstrong");
        int n = sc.nextInt();
        int m =n;
        int sum =0;
        int r;
        while(n>0){
            r =n%10;
            n =n/10;
            sum = sum+ r*r*r;
        }
        if(sum==m){
            System.out.println("this is arm strong numbrt");
        }
        else{
            System.out.println("not a armstrong");
        }
    }
}
