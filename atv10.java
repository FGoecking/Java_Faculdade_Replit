import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter number");
    String a = myObj.nextLine();  // Read user input
    int b = a.length();
    if(b < 1){
      System.out.println("Sigla muito pequena");
    } else if( b > 2) {
      System.out.println("Sigla muito grande");
    } else {
      switch(a){
      case "mg": 
           System.out.println("Mineiro");
           break;
      case "es": 
           System.out.println("Capixaba");
           break;
      case "sp": 
           System.out.println("Paulista");
           break;
      default: 
           System.out.println("Outro estado");
           break;
    }
    }
    
    


    
  }
}