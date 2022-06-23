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
		private ArrayList<KaiDisciplines> kaiDisciplines = new ArrayList<KaiDisciplines>();
		private KaiDisciplinesList kaiDisciplines2;
		
	    private EquipmentList weapons = new EquipmentList("Weapons", 2);
	    private Equipment belt_Pouch;
	    private Equipment Meals;
	    private EquipmentList backpackItems = new EquipmentList("Backpack Items", 8);
	    private EquipmentList specialItems = new EquipmentList("SpecialItems", 12);

		
	    public Charakter() {
			// TODO Auto-generated constructor stub
	    	
	    	System.out.println("Who are you, What is your Name?");
	    	
	    	this.name=spiele.EingabeString();
	    	
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
	    	
	    	
	    	kaiDisciplines2 = new KaiDisciplinesList();
	    	
	    	
	    	System.out.println("You are dressed in the green tunic and cloak of a Kai initiate. You have little with you "
	    			+ "to arm yourself for survival.\r\n"
	    			+ "\r\n"
	    			+ "All you possess is an Axe (note under Weapons on your Action Chart) and a Backpack containing 1 Meal "
	    			+ "(note under Meals on your Action Chart). Hanging from your waist is a leather pouch containing Gold Crowns. "
	    			+ "To find out how many, pick a number from the Random Number Table. This number equals the number of Gold Crowns "
	    			+ "you possess at the start of the adventure. (Note the number in the Belt Pouch section of the Action Chart.)\r\n"
	    			+ "\r\n"
	    			+ "You discover amongst the smoking ruins of the monastery, a Map of Sommerlund (note under Special Items on the "
	    			+ "Action Chart) showing the capital city of Holmgard and the land of Durenor, far to the east. You place the "
	    			+ "Map inside your tunic for safety.");
	    	
	    	
	    	this.weapons.add(new Equipment("Axe", 1,"weapons"));
	    	this.Meals = new Equipment("Meals", 1, name);
	    	this.belt_Pouch = new Equipment("weapons", zufallzahl.nextInt(9), "belt_Pouch");
	    	this.specialItems.add(new Equipment("Map of Sommerlund", 1, "specialItems"));
	    		    	
	    	
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

		

}


