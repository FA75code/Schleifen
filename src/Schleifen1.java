//Z�hle alle Teilnehmer
//"Teilnehmer 1" ... "Teilnehmer 12"
public class Schleifen1 {

	public static void main(String[] args) {
		
		int tnAnzahl = 12; 	// Limit
		int count = 1;		// Z�hler
		
		// LOGIK UND AUSGABE
		// Solange der Z�hler kleiner als tnAnzahl ist, soll "Teilnehmer " und Z�hler ausgegeben werden
		while(count <= tnAnzahl)
		 {
			System.out.println("Teilnehmer " + count);
			count++; // count = count + 1;
		}
		
		
	}

}
