package calling.a.method;

import java.util.Scanner;




public class CallingAMethod {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Mlu= new Scanner(System.in);
        
        System.out.println("Welcome");
        
        System.out.println("Enter your name");
        var x= Mlu.next();
        
        System.out.println("Enter your age");
        int y = Mlu.nextInt();
        
        System.out.println("Welcome" +  x  + " please confirm if your age is "+ y);
        var e = Mlu.next();
        
        String enjoy= enjoy();
       
       System.out.println(enjoy);
        
        
   }
  public static String enjoy() {
    
      String enjoy=("enjoy your time");
      
      return enjoy;
}
}
    