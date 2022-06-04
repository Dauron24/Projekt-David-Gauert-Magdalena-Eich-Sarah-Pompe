package Spiele;

public class Equipment {

	private String Name;
	private boolean besitz;
	private int anzahl;
	private String howToCarry;



	public Equipment(String Name,int anzahl,String howToCarry) {
		this.Name=Name;
		this.besitz=false;
		this.anzahl=anzahl;
		this.howToCarry=howToCarry;
	}


	public String getName() {
		return Name;
		}
	public void setName(String name) {
		Name = name;
	}
	public boolean isBesitz() {
		return besitz;
	}
	public void setBesitz(boolean besitz) {
		this.besitz = besitz;
	}
	public int getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	public String getHowToCarry() {
		return howToCarry;
	}
	public void setHowToCarry(String howToCarry) {
		this.howToCarry = howToCarry;
	}
}

