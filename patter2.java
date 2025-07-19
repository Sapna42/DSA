public class patter2 {
    public static void main(String[] args){
        int i,j;
        int count=0;
        int n =5;
        for(i=1;i<=n;i++){
            for(j=0;j<=n-i-1;j++){
                count++;
                System.out.print(count+"");
            }
            System.out.println("");
        }
    }
}
