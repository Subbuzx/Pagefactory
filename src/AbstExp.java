
abstract class Guns{
	abstract void fire();
}
class M416 extends Guns{
	public void fire() {
		System.out.println("Very Powerful Gun");
	}
}

public class AbstExp {
	public static void main(String args[]) {
		M416 g = new M416();
		g.fire();
		
	}

}
