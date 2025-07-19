import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x");
        System.out.println("enter the y");
        int x= sc.nextInt();
        int y =sc.nextInt();
        //int temp =x;
        //x=y;
       // y=temp;
        //System.out.println("after swapping");
        //System.out.println("x:"+x);
        //System.out.println("y:"+y);
        //without third variable
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swapping");
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}
