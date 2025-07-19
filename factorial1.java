import java .util.*;
public class factorial1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("factorial is");
        int fact =1;
        int n = sc.nextInt();
        int i=1;  
        //for(i=1;i<=n;i++){
          //  fact=fact*i;
        //} 
        //System.out.println("factorial"+fact);  
        // } 
         while(i<=n){
            fact=fact*i;
            i++;
         }
         System.out.println("factorial is"+fact);
        }
    }
    

