package Spiele;

import java.util.*;

public class Charakter {


		//Name des Helden und welche Position er im Spiel hatt.
		private String name;
		/**
		 * @return the name
		 */
		

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


