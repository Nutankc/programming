import java.util.*;
public class userinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Insert first number");
        int a = sc.nextInt();
        System.out.println("Insert second number");
        int b = sc.nextInt();
        
        int sum= a+b;
        System.out.println("The sum is "+sum);

        // To check the which value is greater

        if (sum>10) 
        {
        System.out.println("The value is greater than 10. It is "+sum);    
        }
        
        // Ask user whether to add or subtract

        System.out.println(" Would you like to calculate the sum or subtraction. Please write plus or minus");
        String calculate = sc.next();

        switch (calculate) {
            case "plus":
            int add=a+b;
            System.out.println("The sum is "+add);
                break;

            case "minus":
            int sub= a-b;
            System.out.println("The subtraction is "+sub);
            break;
        
            default:
            System.out.println(" The command is invalid");
                break;
       
    }
}}
