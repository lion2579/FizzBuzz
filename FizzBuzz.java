import java.util.Scanner;
public class FizzBuzz{
  public static void main(String [] args){
    Scanner scnr = new Scanner(System.in);
    Scanner scnr1 = new Scanner(System.in);
    int startNum;
    int endNum;
    String catcher = "";
    int i = 0;
    String breaker = "--------------------------------------------------------------------------------------";

    // Take input and check for errors
    do{
      if (i == 1 && !catcher.equals("y"))
        System.out.println("Please type in the correct numbers.\n" + breaker);
      else if (i == 1 && catcher.equals("y"))
        System.out.println("The second number you chose was less than the first. Please follow the rules.\n" + breaker);
      else
        System.out.println(breaker);
      System.out.println("What is the number you want to start with: ");
      startNum = scnr.nextInt();
      System.out.println(breaker + "\nWhat is the number you want to end with(higher than the first one): ");
      endNum = scnr.nextInt();
      System.out.println(breaker + "\nThe starting number is " + startNum + "\nThe last number is " + endNum);
      System.out.println("Is this correct? (y to confirm): ");
      catcher = scnr1.nextLine();
      i = 1;
    }while(endNum <= startNum || !catcher.equals("y"));
    System.out.println(breaker);

    // Actual fizzbuzz
    for(i=startNum;i<=endNum;i++){
      if((i % 3 == 0 || i % 5 == 0) && (i != 0)){
        if(i % 3 == 0)
          System.out.print("fizz");
        if(i % 5 == 0)
          System.out.print("buzz");
        System.out.print("\n");
      }
      else
        System.out.println(i);
    }
    System.out.println("Done! :D");
  }
}
