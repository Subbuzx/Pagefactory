
public class ReverseString {

	public static void main(String[] args) {
		
		String str = "SUBBUZX" ; // We are creating a string 
		String rev = "";  //Reverse String _ Currently We dont have any value so it is empty		
		int len = str.length(); // finding the length of the string
		
		for(int i =len-1; i>=0;i--) // (we are storing string length in "i"; we want to print i value until it becomes Zero; Which is getting printed in reverse)
		{
			rev =rev + str.charAt(i); // here we are extracting string value and adding the alphabet 1/1 to reverse string
		}

	System.out.println("Reverse of the string    ="   + rev);
	}

}
