import java.util.*;
public class rev {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int r;
        String str= "";
        while(n>0){
            r=n%10;
            n=n/10;
            str=str+r;
        }
        System.out.println(str);
        char c;
        for(int i=str.length()-1;i>0;i--);{
            c=str.charAt(i);
            switch(c){
                case 0: System.out.print("zero");
                break;
                case 1: System.out.println("one");
                break;
                case 2: System.out.println("three");
                break;
                case 3: System.out.println("four");
                break;
            }
        }
    }
}
