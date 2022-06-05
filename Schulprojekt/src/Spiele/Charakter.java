package Spiele;

import java.util.*;

public class Charakter {


		//Name des Helden und welche Position er im Spiel hatt.
		private String name;
		/**
		 * @return the name
		 */
		
		private Scanner eingabe = new Scanner(System.in);
		private Random zufallzahl = new Random();
		private int capitel;
		private int COMBAT_SKILL;
		private int ENDURANCE;
		private ArrayList<KaiDisciplines> kaiDisciplines;
	    private ArrayList<Equipment> weapons;
	    private Equipment belt_Pouch;
	    private Equipment Meals;
	    private ArrayList<Equipment> backpackItems;
	    private ArrayList<Equipment> specialItems;

		
	    public Charakter() {
			// TODO Auto-generated constructor stub
	    	System.out.println("During your training as a Kai Lord you have developed fighting prowess—COMBAT "
	    			+ "SKILL and physical stamina—ENDURANCE. Before you set off on your adventure you need to measure "
	    			+ "how effective your training has been. To do this take a pencil and, with your eyes closed, point "
	    			+ "with the blunt end of it onto the Random Number Table. If you pick 0 it counts as zero.\r\n"
	    			+ "\r\n"
	    			+ "The first number that you pick from the Random Number Table in this way represents "
	    			+ "your COMBAT SKILL.  When you fight, your COMBAT SKILL will be pitted "
	    			+ "against that of your enemy. A high score in this section is therefore very desirable.\r\n"
	    			+ "\r\n");
	    	this.COMBAT_SKILL = zufallzahl.nextInt(9) +10;
	    	System.out.println("Deine COMBAT SKILL are :" + this.COMBAT_SKILL);
	    	spiele.warte_auf_eingabe();
	    	
	    			System.out.println("The second number that you pick from the Random Number Table represents your powers of ENDURANCE. ");
	    			
	    	this.ENDURANCE = zufallzahl.nextInt(9) +20;
	      	System.out.println("Deine ENDURANCE are :" + this.ENDURANCE);
	    	spiele.warte_auf_eingabe();
	    	
	    			System.out.println("If you are wounded in combat you will lose ENDURANCE points. If at any time your ENDURANCE "
	    			+ "points fall to zero or below, you are dead and the adventure is over. Lost ENDURANCE points can be "
	    			+ "regained during the course of the adventure, but your number of ENDURANCE points can never go above the "
	    			+ "number with which you start your adventure.");
	    	
	    	
	    	
	    	eingabe.next();
		}
	    
	    public void Seleckt_kaiDisciplines () 
	    {
	    	spiele.ClearConsole();
	    	System.out.println("Kai Disciplines\r\n"
	    			+ "\r\n"
	    			+ "Over the centuries, the Kai monks have mastered the skills of the warrior. These skills are known as the Kai "
	    			+ "Disciplines, and they are taught to all Kai Lords. You have learnt only five of the skills listed below. The choice of which five skills these are, is for you to make. As all of the Disciplines may be of use to you at some point on your perilous quest, pick your five with care. The correct use of a Discipline at the right time can save your life.\r\n"
	    			+ "\r\n"
	    			+ "When you have chosen your five Disciplines, enter them in the Kai Disciplines section of your ");
	    	int i=1;
	    	
	    	do {
	    		System.out.println("Wählen sie aus derl Liste eine Kai Disciplines."
	    				+ "\r\n"
	    				+ "\r\n"
	    				+ "1 : Camouflage \r\n"
	    				+ "2 : Hunting \r\n"
	    				+ "3 : Sixth Sense \r\n"
	    				+ "4 : Tracking \r\n"
	    				+ "5 : Healing \r\n"
	    				+ "6 : Weaponskill \r\n"
	    				+ "7 : Mindshield \r\n"
	    				+ "8 : Mindblast \r\n"
	    				+ "8 : Animal Kinship \r\n"
	    				+ "9 : Mind Over Matter \r\n");
	    		
	    		int auswahl=0;
	    		try {
	    			auswahl=eingabe.nextInt();
	    			
	    		} catch (Exception e) {
	    			// TODO: handle exception
	    		}
				
	    		switch (auswahl) {
	    		case 1: 
	    			break;
	    

				default:
					break;
				}
			
	    	} while (i<=4);
	    }
	    
	    public static Charakter Charakter_Laden() {
			return new Charakter();
		}
	    
	    
		public String getName() {
			return name;
		}	
		
		/**
		 * @return the capitel
		 */
		public int getCapitel() {
			return capitel;
		}

		/**
		 * @return the cOMBAT_SKILL
		 */
		public int getCOMBAT_SKILL() {
			return COMBAT_SKILL;
		}

		/**
		 * @return the eNDURANCE
		 */
		public int getENDURANCE() {
			return ENDURANCE;
		}

		/**
		 * @return the kaiDisciplines
		 */
		public ArrayList<KaiDisciplines> getKaiDisciplines() {
			return kaiDisciplines;
		}

		/**
		 * @return the weapons
		 */
		public ArrayList<Equipment> getWeapons() {
			return weapons;
		}

		/**
		 * @return the belt_Pouch
		 */
		public Equipment getBelt_Pouch() {
			return belt_Pouch;
		}

		/**
		 * @return the meals
		 */
		public Equipment getMeals() {
			return Meals;
		}

		/**
		 * @return the backpackItems
		 */
		public ArrayList<Equipment> getBackpackItems() {
			return backpackItems;
		}

		/**
		 * @return the specialItems
		 */
		public ArrayList<Equipment> getSpecialItems() {
			return specialItems;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @param capitel the capitel to set
		 */
		public void setCapitel(int capitel) {
			this.capitel = capitel;
		}

		/**
		 * @param cOMBAT_SKILL the cOMBAT_SKILL to set
		 */
		public void setCOMBAT_SKILL(int cOMBAT_SKILL) {
			COMBAT_SKILL = cOMBAT_SKILL;
		}

		/**
		 * @param eNDURANCE the eNDURANCE to set
		 */
		public void setENDURANCE(int eNDURANCE) {
			ENDURANCE = eNDURANCE;
		}

		/**
		 * @param kaiDisciplines the kaiDisciplines to set
		 */
		public void setKaiDisciplines(ArrayList<KaiDisciplines> kaiDisciplines) {
			this.kaiDisciplines = kaiDisciplines;
		}

		/**
		 * @param weapons the weapons to set
		 */
		public void setWeapons(ArrayList<Equipment> weapons) {
			this.weapons = weapons;
		}

		/**
		 * @param belt_Pouch the belt_Pouch to set
		 */
		public void setBelt_Pouch(Equipment belt_Pouch) {
			this.belt_Pouch = belt_Pouch;
		}

		/**
		 * @param meals the meals to set
		 */
		public void setMeals(Equipment meals) {
			Meals = meals;
		}

		/**
		 * @param backpackItems the backpackItems to set
		 */
		public void setBackpackItems(ArrayList<Equipment> backpackItems) {
			this.backpackItems = backpackItems;
		}

		/**
		 * @param specialItems the specialItems to set
		 */
		public void setSpecialItems(ArrayList<Equipment> specialItems) {
			this.specialItems = specialItems;
		}

}


