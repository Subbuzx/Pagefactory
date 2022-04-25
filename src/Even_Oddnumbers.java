import java.util.Scanner;

public class Even_Oddnumbers {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in); // Scanner class allows us to give data in the console
		System.out.println("Enter a number:   ");
		
		int number = reader.nextInt(); //this method	 allows to read int data from the user
		
		if(number%2 ==0) // condition is if the result is 0  then it is Even if not 0 then it will be Odd	
			{  
			System.out.println(number + "  is even"); // if value become 0 Even 
		}else
		{
			System.out.println(number + "  is odd"); // if value is not zero-Odd
		}
	}

}
