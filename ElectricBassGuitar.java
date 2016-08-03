package session6.assignment2;

public class ElectricBassGuitar extends StringedInstrument {

	public static void main(String[] args) {
		
		StringedInstrument si = new ElectricBassGuitar();
		si.name = "Electric Bass Guitar";
		si.numberOfStrings = 12;
		si.play();
		System.out.println(" Playing "+si.name+" which has "+si.numberOfStrings+" strings");

	}

}
