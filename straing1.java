public class straing1 {
   public static void main(String[] args) {
       String str1 ="java program";
       String str2 = new String("java");
       String str3 = new String("    sapana   ");
       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str3);
       System.out.println("lenght is"+str1.length());
       String upper =str1.toUpperCase();
       System.out.println("upper to lower case"+upper);
       String sub = str1.substring(5,10);
       System.out.println("sub string"+sub);
   } 
}
