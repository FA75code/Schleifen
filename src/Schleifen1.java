//Zähle alle Teilnehmer
//"Teilnehmer 1" ... "Teilnehmer 12"
public class Schleifen1 {

	public static void main(String[] args) {
		
		int tnAnzahl = 12; 	// Limit
		int count = 1;		// Zähler
		
		// LOGIK UND AUSGABE
		// Solange der Zähler kleiner als tnAnzahl ist, soll "Teilnehmer " und Zähler ausgegeben werden
		while(count <= tnAnzahl)
		 {
			System.out.println("Teilnehmer " + count);
			count++; // count = count + 1;			
		}		
		
		System.out.println("Zähler " + (count-1));
		
	}

}
