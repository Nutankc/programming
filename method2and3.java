import java.util.Scanner;

public class method2and3 { 
    // Without userInput (Method exercise 2)
    public static void multiply(int a)
    {
        int output=a*1000;
        System.out.println(a);
        System.out.println(output);
        return ;
    }
     // With userInput  (Method exercise 3)
    public static int multiplyIntByThousand(int b){
        return b*1000;
    }
public static void main(String[] args) {
    
    // Printing the value with given parameter (Method exercise 2)
   multiply(2);   
   // Input From the user (Method exercise 3)
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the value : ");
    int b=sc.nextInt(); 
    // Method calling and printing the value (Method exercise 3)
    System.out.println(multiplyIntByThousand(b));
    
}
}
