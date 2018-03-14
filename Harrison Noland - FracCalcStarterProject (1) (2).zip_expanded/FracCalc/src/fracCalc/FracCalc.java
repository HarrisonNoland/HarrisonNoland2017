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
    	System.out.println("Enter equation: ");
    	inputString = input.nextLine();        	
    	  input.close();      
   }
    	    }	    
    public static String produceAnswer(String input){ 
        // TODO: Implement this function to produce the solution to the input
    	//This method takes in any length of fraction input and calculates the answer two operands 
		//at a time from left to right takes away spaces and places the input string into an array return "";
    	String [] array = input.split(" ");
    	String operand1 = array[0];
    	String operator = array[1];
    	String operand2 = array[2];
   
    	String finalAnswer = operand2;
    	
    	//the loop separates the string to calculate two numbers at a time, and replaces the first operand each time with the previous answer
    	 int[] firstTerm = parseInt(operand1);
	        int[] secondTerm = parseInt(operator);
	        boolean multiOperator = false;
	        if (array.length > 3)
	        	multiOperator = true;
	    //Extra Credit: Makes sure that the fraction is not dividing by zero.
	        if (firstTerm[2] == 0 ||secondTerm[2] == 0)
	        return "You cannot divide by zero.";
	    //Where the calculations are made
	    //Array set for calculated integers to be stored.    
	     return finalAnswer;
    }
  //Converts String to Integer
    public static int[] parseInt(String operand2){
    	int whole = 0;
        int numerator = 0;
        int denominator = 1;
        if (operand2.indexOf('_') >= 0){
        	
        	whole = Integer.parseInt(operand2.substring(0, operand2.indexOf('_')));
        	numerator = Integer.parseInt(operand2.substring(operand2.indexOf('_') + 1, operand2.indexOf('/')));
        	denominator = Integer.parseInt(operand2.substring(operand2.indexOf('/') + 1));
        }else if (operand2.indexOf('/') >= 0){
        	numerator = Integer.parseInt(operand2.substring(0, operand2.indexOf('/')));
        	denominator = Integer.parseInt(operand2.substring(operand2.indexOf('/') + 1));
        } else
        	whole = Integer.parseInt(operand2);
        int[] finalArr = {whole, numerator, denominator};
        return finalArr;
    	}
 }
