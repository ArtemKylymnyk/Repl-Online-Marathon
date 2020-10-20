import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Let's have a short quiz.\n"+
    "================================");
       
    Scanner scan=new Scanner(System.in);
    
    System.out.println("What's your name?");
    String userName1 = scan.nextLine();
    System.out.println("What's your name?");
    String userName2 = scan.nextLine();
    System.out.println("What's your name?");
    String userName3 = scan.nextLine();
    
    System.out.println("Hello "+userName1+"!");
    System.out.println("Hello "+userName2+"!");
    System.out.println("Hello "+userName3+"!");
    scan.close();
    
    
  }
}