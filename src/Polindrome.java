import java.util.Scanner;

public class Polindrome {
	
	public static void main(String args[]) {
		//String original ="123456";
		String original , rev = "";
	Scanner in =new Scanner(System.in);
	System.out.println("Enter a number/value:  ");
	
	 original = in.nextLine();
	 
	 int len = original.length();
//	 for(int i =len-1; i>=0 ; i-- )
//	 {
	 int i= len-1;
		 rev = rev+original.charAt(i);
		 if(original.equals(rev))
		 {
			 System.out.println("Value is palindrome:  ");
		 }else
		 {
			 System.out.println("Value is not palindrome:   ");
		 }
		 System.out.println(rev);
	 }
	 
	

}

