//1. Zähle alle Teilnehmer von 1 bis 12
//2. Zähle jeden 2. Teilnehmer
//3. Zähle alle Teilnehmer von 12 bis 1
//4. Addiere die Teilnemernummern
//5. Inkrement als Variable
//6. Endanweisung weglassen
//7. Zähler in Startanweisung deklarieren
//8. Teilnehmer 12 mal zählen (verschachtelte for-Schleife)

public class Schleifen4 {

	public static void main(String[] args) {

		// AUFGABE 6

		int tnAnzahl = 12;
		int count = 1, summe = 0;

		for (; count <= tnAnzahl;) {

			System.out.println("Teilnehmer " + count);
			summe += count;
			count++;

		}

		// AUFGABE 5
		/* 		int tnAnzahl = 12;
				int count = 1, summe = 0, inkrement = 1;
		
				for (count = 1; count <= tnAnzahl; count += inkrement) {
		
					System.out.println("Teilnehmer " + count);
					summe += count;
		
				} */

		System.out.println(summe);

		// AUFGABE 4
		/* 		int tnAnzahl = 12;
				int count = 1, summe = 0;
		
				for (count = 1; count <= tnAnzahl; count += 1) {
		
					System.out.println("Teilnehmer " + count);
					summe += count;
		
				}
		
				System.out.println(summe); */

		// AUFGABE 3
		/* 		for (int count = 12; count >= 1; count--) {
		
					System.out.println("Teilnehmer " + count);
		
				} */

		// AUFGABE 2
		/* 		int tnAnzahl = 12;
				int count = 1;
		
				for (count = 1; count <= tnAnzahl; count += 2) {
		
					System.out.println("Teilnehmer " + count);
		
				} */

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
