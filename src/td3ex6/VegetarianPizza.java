package td3ex6;

public class VegetarianPizza implements Pizza{

	@Override
	public void prepare() {
		System.out.println("prepare Vegie Pizza");
		
	}

	@Override
	public void cook() {
		System.out.println("cook Vegie Pizza");
		
	}

	@Override
	public void cut() {
		System.out.println("cut Vegie Pizza");
		
	}

	@Override
	public void packagee() {
		System.out.println("packagee Vegie Pizza");
		
	}


}
