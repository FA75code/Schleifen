//Alle Teilnehmer zählen
public class Schleifen2 {

	public static void main(String[] args) {

		int tnAnzahl = 12;
		int count = 1;

		do { //wird immer mindestens einmal ausgeführt
			System.out.println("Teilnehmer " + count);
			count++;

		} while (count <= tnAnzahl); // nach der Ausführung wird dann erst geprüft ob die Bedingung erfüllt ist und eine erneute Ausführung notwendig ist

		System.out.println("Zähler " + (count-1));

	}

}
