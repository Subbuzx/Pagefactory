
class whileLoop{
	public void test() {
		for(int i =1; i<=51; i++){
			System.out.println(i);
			if(i==49) {
				break;
			}
		}

	}
}



public class Loops  {


	public static void main(String[] args) {
		whileLoop sub = new whileLoop();
		sub.test();

		int i = 1;
		while (i<=51) {

			System.out.print(i);
			System.out.print(",");
			i++;
			if(i==50) {
				break;
			}
		}

	}
}
