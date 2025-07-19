import java.util.*;
public class palindrom {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int rev=0,r;
        int m=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==m){
            System.out.println("its a palindrom");
        }else{
            System.out.println("its not palindrom");
        }
    }
}
