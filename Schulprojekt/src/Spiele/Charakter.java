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
		private int ENDURANCEMax;
		private KaiDisciplinesList kaiDisciplines;
		
	    private EquipmentList weapons = new EquipmentList("Weapons", 2);
	    private Equipment belt_Pouch;
	    private Equipment Meals;
	    private EquipmentList backpackItems = new EquipmentList("Backpack Items", 8);
	    private EquipmentList specialItems = new EquipmentList("SpecialItems", 12);

	    public Charakter(KaiDisciplines Displ1,
	    		KaiDisciplines Displ2,
	    		KaiDisciplines Wapon1,
	    		KaiDisciplines Wapone2,
	    		Equipment ...wappon) 
	    {
	    	this.COMBAT_SKILL = zufallzahl.nextInt(9) +10;
	    	this.ENDURANCE = zufallzahl.nextInt(9) +20;
	    	this.kaiDisciplines = new KaiDisciplinesList(Displ1,Displ2,Wapon1,Wapone2);
	    	this.weapons.add(wappon[0]);
	    	this.weapons.add(wappon[1]);
	    	
	    }
	    
	    public Charakter(boolean Mindshield, boolean Mindblast) 
	    {
	    
	    	this.COMBAT_SKILL = zufallzahl.nextInt(9) +10;
	    	this.ENDURANCE = zufallzahl.nextInt(9) +20;
	    	if (Mindblast&&Mindshield) {
				kaiDisciplines = new KaiDisciplinesList(new KaiDisciplines("Mindshield"),new KaiDisciplines("Mindblast"));
			}
			else if (Mindshield) {
				kaiDisciplines = new KaiDisciplinesList(new KaiDisciplines("Mindshield"));
			}
			else if (Mindblast) {
				kaiDisciplines = new KaiDisciplinesList(new KaiDisciplines("Mindblast"));
			}
			else {
				kaiDisciplines = new KaiDisciplinesList(new KaiDisciplines("Default"));
			}	    	    	
	    }
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
	    	this.ENDURANCEMax = this.ENDURANCE;
	      	System.out.println("Deine ENDURANCE are :" + this.ENDURANCE);
	    	spiele.warte_auf_eingabe();
	    	
	    			System.out.println("If you are wounded in combat you will lose ENDURANCE points. If at any time your ENDURANCE "
	    			+ "points fall to zero or below, you are dead and the adventure is over. Lost ENDURANCE points can be "
	    			+ "regained during the course of the adventure, but your number of ENDURANCE points can never go above the "
	    			+ "number with which you start your adventure.");
	    	
	    	
	    	kaiDisciplines = new KaiDisciplinesList();
	    	
	    	
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
	    
	    public int CombatFaktor() {
	    	for (KaiDisciplines Disciplines: kaiDisciplines) {
				for (Equipment equipment : weapons) {
					if (Disciplines.getName()==equipment.getName()) {
						return 2;
					}
				}
			}
	    	return 0;
	    }
	    
	    
		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}
				

		public int getCapitel() {
			return capitel;
		}



		public void setCapitel(int capitel) {
			this.capitel = capitel;
		}
		



		public int getCOMBAT_SKILL() {
			return COMBAT_SKILL;
		}



		public void setCOMBAT_SKILL(int cOMBAT_SKILL) {
			COMBAT_SKILL = cOMBAT_SKILL;
		}



		public int getENDURANCE() {
			return ENDURANCE;
		}



		public void setENDURANCE(int eNDURANCE) {
			ENDURANCE = eNDURANCE;
		}
		
		public void decresENDURANCE(int eNDURANCE) {
			ENDURANCE -= eNDURANCE;
		}
		public void incresENDURANCE(int eNDURANCE) {
			
			int protoEnduran = this.ENDURANCE+eNDURANCE;
			
			if (protoEnduran > this.ENDURANCEMax) {
				this.ENDURANCE=this.ENDURANCEMax;
			}
			ENDURANCE = protoEnduran;
		}



		public KaiDisciplinesList getKaiDisciplines() {
			return kaiDisciplines;
		}



		public void setKaiDisciplines(KaiDisciplinesList kaiDisciplines) {
			this.kaiDisciplines = kaiDisciplines;
		}



		public EquipmentList getWeapons() {
			return weapons;
		}



		public void setWeapons(EquipmentList weapons) {
			this.weapons = weapons;
		}



		public Equipment getBelt_Pouch() {
			return belt_Pouch;
		}



		public void setBelt_Pouch(Equipment belt_Pouch) {
			this.belt_Pouch = belt_Pouch;
		}



		public Equipment getMeals() {
			return Meals;
		}



		public void setMeals(Equipment meals) {
			Meals = meals;
		}



		public EquipmentList getBackpackItems() {
			return backpackItems;
		}



		public void setBackpackItems(EquipmentList backpackItems) {
			this.backpackItems = backpackItems;
		}



		public EquipmentList getSpecialItems() {
			return specialItems;
		}



		public void setSpecialItems(EquipmentList specialItems) {
			this.specialItems = specialItems;
		}


		

}


