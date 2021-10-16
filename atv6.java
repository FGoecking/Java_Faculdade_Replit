import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter number");
    int a = myObj.nextInt();  // Read user input


    

    if ((a % 3)> 0 & (a % 7)> 0) {
      System.out.println("Nãão éé divisor de 3 e 7");
    } else {
      System.out.println("ÉÉ  divisor de 3 e 7");
    }
    
  }
}