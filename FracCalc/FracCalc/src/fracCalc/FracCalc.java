package fracCalc;
import java.util.Scanner;
public class FracCalc {

    public static void main(String[] args) {
    	Scanner input = new Scanner (System.in);
        System.out.println("Enter equation");
    	String inputString = input.nextLine();
    	    	
   while (!inputString.equals("quit")){		//runs until user enters "quit"
    	if (inputString.indexOf("/0") >0){										
    	System.out.println("Can't divide by zero!");
    	
    	}else if (inputString.indexOf("++") >0 || inputString.indexOf("--") >0 ||inputString.indexOf("**") >0 || inputString.indexOf("//") >0){
    	System.out.println("Cannot have that input!");
    	}else{
    	System.out.println(produceAnswer(inputString));
    	       		}  
    	System.out.println("Enter equation");
    	inputString = input.nextLine();        	
    	        }
    	    }	    
    public static String produceAnswer(String input){ 
        // TODO: Implement this function to produce the solution to the input
    	//This method takes in any length of fraction input and calculates the answer two operands 
		//at a time from left to right takes away spaces and places the input string into an array return "";
    	String [] array = input.split(" ");
    	String operand = "";
    	String operator = "";
    	String operand2 = "";
    	int i = 0;
    	String finalAnswer = array[0];
    	
    	//the loop separates the string to calculate two numbers at a time, and replaces the first operand each time with the previous answer
    	while (i <= array.length-3){
        	operand = finalAnswer;
        	operator = array[i+1];
        	operand2 = array[i+2];
        	finalAnswer = calculateBothOperands(operand2, operand, operator);
        	i += 2;
    	}
    	return finalAnswer;
    	  }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
