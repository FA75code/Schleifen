//1. Z�hle alle Teilnehmer von 1 bis 12
//2. Z�hle jeden 2. Teilnehmer
//3. Z�hle alle Teilnehmer von 12 bis 1
//4. Addiere die Teilnemernummern
//5. Inkrement als Variable
//6. Endanweisung weglassen
//7. Z�hler in Startanweisung deklarieren
//8. Teilnehmer 12 mal z�hlen (verschachtelte for-Schleife)

public class Schleifen4 {

	public static void main(String[] args) {

		int tnAnzahl = 12;
		int count = 1;

		for (count = 1; count <= tnAnzahl; count += 2) {

			System.out.println("Teilnehmer " + count);

		}

		// AUFGABE 1
		/* 		int tnAnzahl = 12;
				int count = 1;
				// for(startanweisung; abbruchbedingung; ednanweisung)
				// for(index; bedingung; index erhöhen)
				for (count = 1; count <= tnAnzahl; count++) {
		
					System.out.println("Teilnehmer " + count);
					
				} */

	}

}
