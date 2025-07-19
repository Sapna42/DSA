import java.util.*;
public class prim {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        int i,m=0;
        int flag=0;
        System.out.println("enter the number to check prime");
        int n = sc.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+"not a prime");
        }
        else{
            for(i=2;i<=n;i++){
                if(n%i==0){
                    System.out.println("not prime");
                    flag =1;
                    break;
                }
            }
        if(flag==0){
                System.out.println("prim number");
            }
        }
    }
}
