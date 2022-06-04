package Spiel;

public class KaiDisciplines {
	private String Name;
	private boolean besitz;
	private int Level;


	public KaiDisciplines(String Name) {
		this.Name = Name;
		this.Level = 5;
		this.besitz = true;
	}
	public KaiDisciplines(String Name,int Level) {
		this.Name = Name;
		this.Level = Level;
		this.besitz = true;
	}

	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	public String getName() {
		return Name;
	}
	public boolean isBesitz() {
		return besitz;
	}


}

}
