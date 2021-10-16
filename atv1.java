import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter number");

    int a = myObj.nextInt();  // Read user input
    if (a > 20) {
      System.out.println("maior que 20");
    }
    System.out.println(a);
  }
}