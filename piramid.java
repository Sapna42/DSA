public class piramid {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        int m=4;
        for(i=1;i<=n;i++){
           for(j=1;j<=n;j++){
            if(i+j>n){
                System.out.print("*");
            }else{
                System.out.print("");
            }
            System.out.println(" ");
           }
        }
    }
}
