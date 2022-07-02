package Spiele;
import java.util.Scanner;

public class spiele {

	//private static Scanner eingabe = new Scanner(System.in);
	private static Charakter Spielfigur;
	private static Kapitel Kapitel_Spiel;
	
	
	public static void main(String[] args) {				
			
			boolean speilen_zeit = true;
			
			do {				
				//Solange bis eine Gultige Enstscheidung getoffen wurde. Oder Danksakung getroffen wurde oder das Program Beebdet wurede
				//Zeige das Starte Menue an	
				
				int auswahl = Spiele_Start();
				//Entscheide 
				switch (auswahl) {
				
				//			Erstelle ein Neuen Charakter
				case 1:
					ClearConsole();
					Kapitel_Spiel = new Kapitel();
					Spielfigur = new Charakter();					
					Kapitel_Spiel.Get_Spielfiguer(Spielfigur);
					Kapitel_Spiel.KapitelAuswahl(1);
					speilen_zeit = true;
					ClearConsole();
					break;
				//			Zeige die Dankasagung an
				case 2:
					ClearConsole();
					Danksagung();
					speilen_zeit = true;
					System.out.println("");
					
					break;
				//			Bende das Spiele  break befehele
				case 3:
					speilen_zeit = false;
					break;
				}
				
				
			} while (speilen_zeit);
	}
	

	public static int Spiele_Start() {
		
		System.out.println("");
		System.out.println("Welcome to the Flight from the Dark adventure.");
		System.out.println("Neues Spiel : 1.");
		System.out.println("Danksagung  : 2.");
		System.out.println("Spiel Benden  : 3.");
		return EingabeIntMinMAx(1,4);
				
	}
	
	public static void Danksagung() {
		System.out.println(""
				+ "Credits\r\n"
				+ "\r\n"
				+ "Transcription\r\n"
				+ "    Ryan Landek\r\n"
				+ "Illustration Transcription\r\n"
				+ "    Jonathan Blake\r\n"
				+ "    Paul Haskell\r\n"
				+ "    Simon Osborne\r\n"
				+ "    Daniel Strong\r\n"
				+ "XML\r\n"
				+ "    Jonathan Blake\r\n"
				+ "    Jeff Dougan\r\n"
				+ "Alternate Illustrations\r\n"
				+ "    JC Alvarez (Text Illustrations and Action Charts)\r\n"
				+ "    Jonathan Blake (Extramatter Charts and Tables)\r\n"
				+ "    Michael Hahn (Map)\r\n"
				+ "Proofreading\r\n"
				+ "    Mark Laird (Sections 36–70 and 281–315)\r\n"
				+ "    Christian Leonhard (Sections 106–140 and 211–245)\r\n"
				+ "    Brad Phelps (Sections 176–210)\r\n"
				+ "    Michael Richey (Sections 1–35 and 316–350)\r\n"
				+ "    Tyson Torres (Sections 71–105, 141–175, and 246–280)\r\n"
				+ "Editing\r\n"
				+ "    Mike Feldman\r\n"
				+ "    Ingo Klöcker\r\n"
				+ "    Mark Laird\r\n"
				+ "    Simon Osborne\r\n"
				+ "    Thomas Wolmer\r\n"
				+ "    Timothy Pederick\r\n"
				+ "PDF Layout\r\n"
				+ "    Ingo Klöcker\r\n"
				+ "Coordination\r\n"
				+ "    Jonathan Blake\r\n"
				+ "Special Thanks\r\n"
				+ "    Pedro Almeida, Jan Charvát, Christian Cognigni, Tony Lenzo, Dewi Morgan, Laurence O’Toole, Timothy Pederick ");
		
				
				//auch was machen
				
	}

	public static void ClearConsole()
	{
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system
              
            if(operatingSystem.contains("Windows")){        
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            } 
        }catch(Exception e){
            System.out.println(e);
        }
    }
	public static void warte_auf_eingabe() {
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Presse a Key and Enter to continue.");
		eingabe.nextLine();
	}
	
	public static int EingabeInt() 
	{
		do {	
			int i=0;
			Scanner eingabe = new Scanner(System.in);
			String inpute = eingabe.nextLine();
			if (isInteger(inpute)) {
				i = Integer.parseInt(inpute);
				return i;
			}	
			
			else
				System.out.println("You have inpute a Intiger");
			} while (true);
	}
	
	public static int EingabeInt(int ... num) 
	{
		
		do {	
			int i=0;
			Scanner eingabe = new Scanner(System.in);
			String inpute = eingabe.nextLine();
			if (isInteger(inpute)) {
				i = Integer.parseInt(inpute);	
				
				for (int j : num) {
					if (j==i)
						return i;						
				}
				System.out.println("You have use one of the Optione");
			}		
			
			else
				System.out.println("You have inpute a Intiger");
			} while (true);
	}
	
	public static String EingabeString(String ... Text) 
	{
		Scanner eingabe = new Scanner(System.in);
		do {	
			String inpute = eingabe.nextLine();
			
			for (String j : Text) {
					if (j.equals(inpute))
						return inpute;						
				}
				System.out.println("You have use one of the Optione");
			
			} 
		while (true);
	}
	
	public static int EingabeIntMinMAx(int min, int max) 
	{		
		do {	
		int i=0;
		Scanner eingabe = new Scanner(System.in);
		String inpute = eingabe.nextLine();
		if (isInteger(inpute)) {
			i = Integer.parseInt(inpute);
			if (i>=min&&i<=max)
				return i;
			else
				System.out.println("You have use one of the Optione");				}		
		
		else
			System.out.println("You have inpute a Intiger");
		} while (true);
	}
	
	public static String EingabeString() 
	{
		Scanner eingabe = new Scanner(System.in);
		do {	
			String s="";
			String inpute = eingabe.nextLine();
			if (isInteger(inpute)) {
				System.out.println("You have do inpute a String");				
			}			
			else
				return s;
			} while (true);
		
	}
	
	public static boolean best�digen_Entscheidung() 
	{
		String auswahl ="";
		Scanner eingabe = new Scanner(System.in);
		do {			
		
		System.out.println("Sind sie sich sicher j/n");
		try {
			auswahl=eingabe.nextLine();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if (auswahl.equals("j")) {
			return true;
			
		} 
		else if(auswahl.equals("n")) {
			return false;	
		}
		else {
			System.out.println("Sie m�ssen j oder n eingeben. Klein Bustaben");
		}
		} while (true);
	}
	
	private static boolean isInteger(String input)
	{
	    try
	    {
	       @SuppressWarnings("unused")
		int i = Integer.parseInt(input);
	    }
	    catch (NumberFormatException e)
	    {
	        return false;
	    }
	    return true;
	}
	
	public static int optionauswahl(Charakter Spielefigure, String text, Option ...options ) 
	{
		
		if (Spielefigure.getKaiDisciplines().haveKaiDisciplines("Healing")) {
			Spielefigure.incresENDURANCE(2);
		}	
		String[] speicher = new String[options.length];
		
		for (int i = 0; i < options.length; i++) {
			speicher[i]=options[i].getAuswahl();
		}
		
		do {
		System.out.println(text);	
		for (Option option : options) {
			if (option.getM�glich()) {
				System.out.println(option.getOptionText());
			}			
		}
		
		String auswahl = EingabeString(speicher);
		
		if (auswahl.equals("character")) {
			System.out.println("Default charakter Ausgabe");
			warte_auf_eingabe();
			continue;
		}
		
		if (isInteger(auswahl)) {
			return Integer.parseInt(auswahl);
		}
			
		} while (true);
	}

	
	
	
	
}
