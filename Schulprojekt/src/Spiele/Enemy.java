package Spiele;

public class Enemy {

	private String Name;
	private int COMBATSKILL;
	private int ENDURANCE;

	public Enemy(String name, int combatskill, int endurance) {
		// TODO Automatisch generierter Konstruktorstub
		this.Name = name;
		this.COMBATSKILL = combatskill;
		this.ENDURANCE = endurance;
	}

	public int getCOMBATSKILL() {
		return COMBATSKILL;
	}

	public int getENDURANCE() {
		return ENDURANCE;
	}

}
