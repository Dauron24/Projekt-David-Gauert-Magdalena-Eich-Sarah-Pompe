package Spiele;

public class Option {
	
	private String OptionText;
	private String Auswahl;
	private boolean möglich;
	
	public Option(String OptionText, String Auswahl, boolean möglich ) 
	{
		this.OptionText = OptionText;
		this.Auswahl = Auswahl;
		this.möglich = möglich;
	}
	
	public String getOptionText() {
		return this.OptionText;
	}
	public String getAuswahl() {
		return this.Auswahl;
	}
	public boolean getMöglich() {
		return this.möglich;
	}
	
	public static Option CharakterZeigen()
	{
		return new Option("Do you want to display the character sheet? Enter character", "character", true);
	}

}
