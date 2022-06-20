package Spiele;

import java.util.ArrayList;
import java.util.Scanner;

public class EquipmentList extends ArrayList<Equipment> {
	
	private String name;
	private int equipmentSitze;
	
	public EquipmentList(String name, int sitze) {
		super();
		this.name = name;
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
		Equipment[] speicher = new Equipment[this.size()];
		
		  for (int i = 0; i < this.size(); i++)
			  speicher[i] = this.get(i);
		  
		  System.out.println("Welches Gegenstand soll ausgetaust wertden");
		  for (int i = 0; i < speicher.length; i++) {			  
			System.out.println(i+"  "+speicher[i].getName());
		}
		auswahl = eingabe.nextInt();
		this.set(auswahl, e);
		eingabe.close();
	}
	
	public boolean haveItems(String Name) {
		
		Equipment[] speicher = new Equipment[this.size()];		
		  for (int i = 0; i < this.size(); i++)
			  speicher[i] = this.get(i);
		
		for (Equipment equipment : speicher) {
			if (equipment.getName()==Name) {
				return true;
			}
		}
		return false;
	}
	
}
