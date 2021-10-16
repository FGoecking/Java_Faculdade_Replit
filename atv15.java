import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter number");
    int nota1 = scanner.nextInt();  // Read user input
    System.out.println("Enter number");
    int nota2 = scanner.nextInt(); 
    System.out.println("Enter number");
    int nota3 = scanner.nextInt(); 
    System.out.println("Enter number");
    int nota4 = scanner.nextInt(); 

    int media = (nota1 + nota2 + nota3 + nota4)/4;

    System.out.println("A media da nota é:" + media);
    if(media >= 7){
      System.out.println("Aprovado");
    } else {
      System.out.println("Reprovado");
    }
  }
}