import java.util.*;
public class arm1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter thr number check arm strong");
        int n =sc.nextInt();
        int m=n;
        int r,i;
        int sum;
        for(sum=0;sum<=n;sum++){
            r=n%10;
            sum=sum+r*r*r;
            n =n/10;
        }
        if(sum==n){
            System.out.println("arm strong number");
        }else{
        System.out.println("not arm strong");
        }
        }
    }

