package Spiele;

public class Enemy {

	private String Name;
	private int COMBATSKILL;
	private int ENDURANCE;
	private KaiDisciplinesList CombiteAbility;

	public Enemy(String name, int combatskill, int endurance) {
		// TODO Automatisch generierter Konstruktorstub
		this.Name = name;
		this.COMBATSKILL = combatskill;
		this.ENDURANCE = endurance;
		this.CombiteAbility = new KaiDisciplinesList(new KaiDisciplines("Default"));
	}
	
	public Enemy(String name, int combatskill, int endurance, boolean Mindshield, boolean Mindblast) {
		// TODO Automatisch generierter Konstruktorstub
		this(name,combatskill,endurance);
		
		if (Mindblast&&Mindshield) {
			CombiteAbility = new KaiDisciplinesList(new KaiDisciplines("Mindshield"),new KaiDisciplines("Mindblast"));
		}
		else if (Mindshield) {
			CombiteAbility = new KaiDisciplinesList(new KaiDisciplines("Mindshield"));
		}
		else if (Mindblast) {
			CombiteAbility = new KaiDisciplinesList(new KaiDisciplines("Mindblast"));
		}
		else {
			CombiteAbility = new KaiDisciplinesList(new KaiDisciplines("Default"));
		}
	}

	public String getName() {
		return this.Name;
	}
	public int getCOMBATSKILL() {
		return COMBATSKILL;
	}

	public int getENDURANCE() {
		return ENDURANCE;
	}
	public void decresENDURANCE(int i) {
		ENDURANCE -=i;
	}
	public KaiDisciplinesList getCombiteAbilityE() {
		return this.CombiteAbility;
	}
	
	

}
