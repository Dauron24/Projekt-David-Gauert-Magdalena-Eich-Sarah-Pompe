package Spiele;

import java.text.MessageFormat;
import java.util.Scanner;

public class main {

	private static Scanner eingabe = new Scanner(System.in);
	private static Charakter Spielfigur;
	private static Kapitel Spiel = new Kapitel();
	private static int auswahl;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
				
			
			boolean speilen_zeit = true;
			
			//Solange bis eine Gultige Enstscheidung getoffen wurde. Oder Danksakung getroffen wurde oder das Program Beebdet wurede
			do {
				
				//Zeige das Starte Menue an
				auswahl = Spiele_Start();
				
				//Entscheide 
				switch (auswahl) {
				
				//			Erstelle ein Neuen Charakter
				case 1:
					Spielfigur = new Charakter();
					Spiel.Kapitel_1();
					break;
				//			Lade eine Alten Charakter
				case 2:
					Spielfigur = Charakter.Charakter_Laden();
					Spiel.Kapitel_1();
					break;
				//			Zeige die Dankasagung an
				//			Bende das Spiele  break befehele
				}
				
			} while (speilen_zeit);
	}
	
	
	public static int Spiele_Start() {
		
		System.out.println("Welcome to the Flight from the Dark adventure.");
		System.out.println("Neues Spiel : 1.");
		System.out.println("Spiel Laden : 2.");
		System.out.println("Danksagung  : 3.");
		System.out.println("Spiel Benden  : 4.");
		
		int auswahl=0;
		try {
			auswahl=eingabe.nextInt();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return auswahl;
				
	}

}
