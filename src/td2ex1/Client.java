package td2ex1;

public class Client {
	public static void main(String[] args) {
		ProgrammFactory factory = new ProgrammFactory();
		ProgrammInterface programm = factory.createPrgramm(2);
		programm.go();
	}
}
