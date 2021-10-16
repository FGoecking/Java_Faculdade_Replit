import java.util.Scanner;

class Main {
  public static void main(String[] args) {


    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter number");
    String palavra = myObj.nextLine().toLowerCase();  // Read user input
    
      switch(palavra.substring(0,1)){
      case "a": 
           System.out.println("Vogal");
           break;
      case "e": 
           System.out.println("Vogal");
           break;
      case "i":
           System.out.println("Vogal");
           break;
      case "o":
           System.out.println("Vogal");
           break;
      case "u":
           System.out.println("Vogal");
           break;
      default: 
           System.out.println("Consoante");
           break;
                }
    
  }
}