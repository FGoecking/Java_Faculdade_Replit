import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter number");
    int a = myObj.nextInt();  // Read user input
    System.out.println("Enter number");
    int b = myObj.nextInt();  // Read user input
    System.out.println("Enter number");
    int c = myObj.nextInt();  // Read user input

    

    if (a > b & a > c) {
      System.out.println(a);
    } else if(b > a & b > c) {
      System.out.println(b);
    } else { 
      System.out.println(c);
    }
    
  }
}