//*Harrison Noland
 // September 6, 2017
 //This is the runner for the caluclate library it is used to test the methods
public class DoMath {

	public static void main(String[] args) {
		Calculate.square(5);
		System.out.println(Calculate.square(5));
		Calculate.cube(4);
		System.out.println(Calculate.cube(4));
		Calculate.average(4.0,6.0);
		System.out.println(Calculate.average(4.0,6.0));
		Calculate.average1(5.0,9.0,120.0);
		System.out.println(Calculate.average1(5.0,9.0,120.0));
	}

}
