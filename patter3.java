public class patter3 {
    public static void main(String[] args) {
        int i,j;
        int n=6;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
             if(i+j>n){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
             }
             System.out.println("  ");
            }
            for(i=2;i<=n;i++){
                for(j=2;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }

