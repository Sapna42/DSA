public class nested {
  public static void main(String[] args) {
      System.out.println("enter the number");
      int count=0;
      for (int i = 0; i < 5; i++) {
        count++;
        for (int j = 0; j < 5; j++) {
           System.out.print(count+""); 
        }
          System.out.print("");
      }
  }  
}
