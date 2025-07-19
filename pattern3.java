public class pattern3 {
    public static void main(String[] args) {
        int i,j;
        int n=7;
        int count=0;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                count++;
                if(j>=i){
                    System.out.print(count +"" );}
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println("  ");
            }
           
        }
    }

