package Spiele;

public class Option {
	
	private String OptionText;
	private String Auswahl;
	private boolean m�glich;
	
	public Option(String OptionText, String Auswahl, boolean m�glich ) 
	{
		this.OptionText = OptionText;
		this.Auswahl = Auswahl;
		this.m�glich = m�glich;
	}
	
	public String getOptionText() {
		return this.OptionText;
	}
	public String getAuswahl() {
		return this.Auswahl;
	}
	public boolean getM�glich() {
		return this.m�glich;
	}
	
	public static Option CharakterZeigen()
	{
		return new Option("Do you want to display the character sheet? Enter character", "character", true);
	}

}
