package Calculator;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        int option;
        double num1,num2;
        
        Scanner UserInput = new Scanner(System.in);  
        Calculator calc = new Calculator();
        
		do {
			
			System.out.println("Please select from following:");
			System.out.println("0. Exit");
			System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        
	        
	        System.out.print("Enter the operations do you want to perform:");
	        option = UserInput.nextInt();
	        System.out.println("Choice of operation is: " + option);

	        switch(option) {
	        
	        case 0:
	        	System.out.println("Good Bye");
	        	break;
	        	
	        case 1:
	        	    System.out.println("Enter two numbers:");
	        	    num1 = UserInput.nextDouble();
	        	    num2 = UserInput.nextDouble();
	                System.out.println("Addition is " + calc.add(num1, num2));
	                break;
	                
	        case 2:
        	    System.out.println("Enter two numbers:");
        	    num1 = UserInput.nextDouble();
        	    num2 = UserInput.nextDouble();
                System.out.println("Subtraction is " + calc.sub(num1, num2));
                break;
	      
	        case 3:
        	    System.out.println("Enter two numbers:");
        	    num1 = UserInput.nextDouble();
        	    num2 = UserInput.nextDouble();
                System.out.println("Multiplication is " + calc.mul(num1, num2));
                break;
                
	        case 4:
        	    System.out.println("Enter two numbers:");
        	    num1 = UserInput.nextDouble();
        	    num2 = UserInput.nextDouble();
                System.out.println("Division is " + calc.div(num1, num2));
                break;
               
	        }
	        
		}while(option != 0);
			
			
   
        
    }
}
