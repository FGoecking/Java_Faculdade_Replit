import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter number");
    double altura = scanner.nextDouble();  // Read user input
    System.out.println("Enter number");
    char sexo = scanner.nextInt(); 
    System.out.println("Enter number"); 

    if(sexo == "F"){
      System.out.println("O peso ideial é:" + (62.1* altura)- 44.7)
    } else {
      System.out.println("O peso ideial é:" + (72.7 * altura) – 58)
    }
  }
}