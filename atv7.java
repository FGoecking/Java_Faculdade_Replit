import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter number");
    int a = myObj.nextInt();  // Read user input


    

    if ((a % 2)> 0) {
      System.out.println("Nãão é  par");
    } else {
      System.out.println("ÉÉ  par");
    }
    
  }
}