import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter number");
    int a = myObj.nextInt();  // Read user input
    System.out.println("Enter number");
    int b = myObj.nextInt();  // Read user input

    

    if (a+b > 10) {
      System.out.println(a+b);
    } else {
      System.out.println("Não é possíível fazer adição");
    }
    
  }
}