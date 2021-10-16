import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter number");
    int a = myObj.nextInt();  // Read user input


    

    if ((a % 5)> 0) {
      
      System.out.println("Nãão éé divisor de 5");
    } else {
      System.out.println("ÉÉ  multiplo de 5");
    }
    
  }
}