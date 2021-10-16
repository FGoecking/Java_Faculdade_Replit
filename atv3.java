import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter number");
    double a = myObj.nextInt();  // Read user input


    

    if (a > 0) {
      double b = Math.sqrt(a);
      System.out.println(b);
    } else {
      System.out.println(a*2);
    }
    
  }
}