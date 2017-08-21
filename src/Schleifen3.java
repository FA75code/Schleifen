import java.util.Scanner;

//1. Menüeingabe mit Mehrfachauswahl
//2. Menüeingabe wiederholen
//(1) Datei kann gespeichert und (2)geöffnet sowie das (0)PRogramm beendet werden
//Alle anderen Eingaben sind ungültig
//Die eingabe wirt solange wiederholt wie das PRogramm nicht beendet wird (Eingabe=0)  
public class Schleifen3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int eingabe = 0;

		do { // Beginn do while loop

			System.out.println("Dies sind Ihre Optionen: ");
			System.out.println("(1) Datei speichern");
			System.out.println("(2) Datei öffnen");
			System.out.println("(0) Programm beenden");
			System.out.println("Bitte geben Sie eine Option ein: ");

			eingabe = scan.nextInt(); // liest Ganzzahl ein
			

			switch (eingabe) {
				case 1: // Eingabe == 1
					System.out.println("Datei wird gespeichert");
					break;
				case 2: // Eingabe == 2
					System.out.println("Datei wird geöffnet");
					break;
				case 0: // Eingabe == 0
					System.out.println("Programm wird beendet");
					break;

				default: // wenn kein case zutrifft
					System.out.println("Falsche Eingabe, bitte wiederholen");
					break;
			}

		} while (eingabe != 0); // loop wird ausgeführt, solange keine 0 eingegeben wurde
		
		scan.close(); // wenn loop beendet, scanner wird geschlossen

	}

}
