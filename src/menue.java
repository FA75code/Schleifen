
//Übung: Mehrfachauswahl
//1. Neue Klasse "Menü" in Projekt Wiederholung 2 erstellen
//2. Benutzereingabe erstellen: 
//(1) Computer anschalten 
//(2) Betriebssystemauswahl 
//(3) Systemwiederherstellung
//(0) Computer herunterfahren (ENDE)
//3. Benutzereingabe auswerten (switch-case)
//z.B. Bei Eingabe == 2: Ausgabe "Bitte wählen Sie das Betriebssystem aus"
//4. Eingabe soll solange wiederholt werden, bis Benutzer Computer herunterfährt
//ZUSATZ: 5. Erstellen Sie ein Untermenü für die Betiebssystemauswahl
//			 Mit einer Liste von 3 Server- oder Clientbetriebssystemen
//			 Die Eingabe soll wiederholt werden, 
//		     bis eine 0 (Zurück zum Hauptmenü) eingegeben wird

import java.util.Scanner;

public class menue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int eingabe, eingabe2;

        do {

            System.out.println("Dies sind Ihre Optionen: ");
            System.out.println("(1) Computer anschalten");
            System.out.println("(2) Betriebssystemauswahl");
            System.out.println("(3) Systemwiederherstellung");
            System.out.println("(0) Computer herunterfahren");
            System.out.println("Bitte geben Sie eine Option ein: ");

            eingabe = scan.nextInt();

            switch (eingabe) {
            case 1:
                System.out.println("Computer wird eingeschaltet");
                break;
            case 2:               

                do {
                    System.out.println("Bitte wählen Sie das Betriebssystem aus:");
                    System.out.println("(1) Windows 10");
                    System.out.println("(2) Debian 9");
                    System.out.println("(3) Ubuntu Server 16.04");
                    System.out.println("(0) Zurück zum Hauptmenü");

                    eingabe2 = scan.nextInt();

                    switch (eingabe2) {
                        case 1:
                            System.out.println("Windows 10 gewählt");
                            break;
                        case 2:
                            System.out.println("Debian 9 gewählt");
                            break;
                        case 3:
                            System.out.println("Ubuntu Server 16.04 gewählt");
                            break;
                        case 0:
                            System.out.println("Gehe zum Hauptmenü");
                            break;

                        default:
                            System.out.println("Falsche Eingabe, bitte wiederholen");
                            break;
                    }

                } while (eingabe2 != 0);

                break;
            case 3:
                System.out.println("Systemwiederherstellung wird ausgeführt");
                break;
            case 0:
                System.out.println("Computer wird heruntergefahren");
                break;

            default:
                System.out.println("Falsche Eingabe, bitte wiederholen");
                break;
            }

        } while (eingabe != 0);
        scan.close();

    }

}