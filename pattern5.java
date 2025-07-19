public class pattern5 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1;i<=n;i++){
            for(j=0;j<=i-n-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
