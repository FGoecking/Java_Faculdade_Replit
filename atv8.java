import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter number");
    int a = myObj.nextInt();  // Read user input


    

    if (a < 100) {
      System.out.println("Nãão tem 3 casas decimais");
    } else {
      int b = a / 10;
      System.out.println(b);
      

      if((b%2) > 0){
        System.out.println("Impar");
      } else {
        System.out.println("par");
      }
    }
    
  }
}