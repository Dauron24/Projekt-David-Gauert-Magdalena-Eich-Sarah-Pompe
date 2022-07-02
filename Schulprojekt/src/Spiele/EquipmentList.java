package Spiele;

import java.util.ArrayList;
import java.util.Scanner;

public class EquipmentList extends ArrayList<Equipment> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int equipmentSitze;
	
	public EquipmentList(String name, int sitze) {
		super();
		this.equipmentSitze = sitze;
	}

	@Override
	public boolean add(Equipment e) {
		
		if (this.equipmentSitze==this.size()) {			
			changeItems(e);
			return true;			
		}
		return super.add(e);
	}
	
	private void changeItems(Equipment e) {
		
		Scanner eingabe = new Scanner(System.in);
		int auswahl;
		 
		System.out.println("Welches Gegenstand soll ausgetaust wertden");
		  for (int i = 0; i < this.size() ; i++) {			  
			System.out.println(i+"  "+ this.get(i).getName());
		}
		System.out.println();
		System.out.println("Whit this " + e.getName());
		auswahl = spiele.EingabeIntMinMAx(0, this.size());
		if (spiele.bestädigen_Entscheidung()) {
			this.set(auswahl, e);
		}			
		
		eingabe.close();
	}
	
	public boolean haveItems(String Name) {
		
		for (Equipment element : this) {
			if (element.getName()==Name) {
				return true;
			}
		}
		return false;
	}
	
}
