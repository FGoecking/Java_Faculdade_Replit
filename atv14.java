import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter number");
    int lado1 = scanner.nextInt();  // Read user input
    System.out.println("Enter number");
    int lado2 = scanner.nextInt();  // Read user input
    System.out.println("Enter number");
    int lado3 = scanner.nextInt();  // Read user input
    
    switch(lado1, lado2, lado3){
      case (lado1 == lado2 && lado1 == lado2): 
           System.out.println("Equilatero");
           break;
      case (lado1 == lado2 || lado1 == lado2): 
           System.out.println("Isosceles");
           break;
      default: 
           boolean modulo1 = ((-lado1 - lado2) *-1) < lado2 + lado3;
           boolean modulo2 = ((-lado2 - lado3) *-1) < lado3 + lado1; 
           boolean modulo3 = ((-lado3 - lado1) *-1) < lado2 + lado1;
           if(modulo1 && modulo2 && modulo3 == true){
             System.out.println("Escaleno");
           } else {
             System.out.println("Não é triangulo");
           }
    
  }
}
}