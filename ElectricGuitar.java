package session6.assignment2;

public class ElectricGuitar extends StringedInstrument {

	public static void main(String[] args) {
		
		StringedInstrument si = new ElectricGuitar();
		si.name = "Electric Guitar";
		si.numberOfStrings = 13;
		si.play();
		System.out.println(" Playing "+si.name+" which has "+si.numberOfStrings+" strings");
		

	}

}
