import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter number");
    String a = myObj.nextLine();  // Read user input


    

    if (a > 20 & a < 90) {
      System.out.println("Sim");
    } else {

      System.out.println("Nãão");

    }
    
  }
}