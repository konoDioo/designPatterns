package td2ex1;

public class ProgrammFactory {
	
	public ProgrammFactory() {};
	public ProgrammInterface createPrgramm(int ProgNumber)
	{
		switch (ProgNumber) {
        case 1:
            return new Programm1();
        case 2:
            return new Programm2();
        case 3:
            return new Programm3();
        default:
            return null;
    }
	}
}
