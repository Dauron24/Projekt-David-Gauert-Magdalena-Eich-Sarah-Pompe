package Spiele;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class KaiDisciplinesList extends ArrayList<KaiDisciplines> {

	public KaiDisciplinesList() {
		super();
		// TODO Auto-generated constructor stub
		Random zufallzahl = new Random();
		Scanner eingabe = new Scanner(System.in);
		
		int i=1;
    	ArrayList<KaiDisciplines>kaiDiscipinesOprionList = new ArrayList<KaiDisciplines>();
    	kaiDiscipinesOprionList.add(KaiDisciplines.Crate_Animal_Kinship());
    	kaiDiscipinesOprionList.add(KaiDisciplines.Crate_Camouflage());
    	kaiDiscipinesOprionList.add(KaiDisciplines.Crate_Healing());
    	kaiDiscipinesOprionList.add(KaiDisciplines.Crate_Hunting());
    	kaiDiscipinesOprionList.add(KaiDisciplines.Crate_Mind_Over_Matter());
    	kaiDiscipinesOprionList.add(KaiDisciplines.Crate_Mindblast());
    	kaiDiscipinesOprionList.add(KaiDisciplines.Crate_Mindshield());
    	kaiDiscipinesOprionList.add(KaiDisciplines.Crate_Sixth_Sense());
    	kaiDiscipinesOprionList.add(KaiDisciplines.Crate_Tracking());
    	kaiDiscipinesOprionList.add(KaiDisciplines.Crate_Weaponskill("Weaponskill"));    	
    	
    	ArrayList<KaiDisciplines>wapeonOprionList = new ArrayList<KaiDisciplines>();
    	
    	wapeonOprionList.add(KaiDisciplines.Crate_Weaponskill("Dagger"));
    	wapeonOprionList.add(KaiDisciplines.Crate_Weaponskill("Spear"));
    	wapeonOprionList.add(KaiDisciplines.Crate_Weaponskill("Mace"));
    	wapeonOprionList.add(KaiDisciplines.Crate_Weaponskill("Short Sword"));
    	wapeonOprionList.add(KaiDisciplines.Crate_Weaponskill("Warhammer"));
    	wapeonOprionList.add(KaiDisciplines.Crate_Weaponskill("Sword"));
    	wapeonOprionList.add(KaiDisciplines.Crate_Weaponskill("Axe"));
    	wapeonOprionList.add(KaiDisciplines.Crate_Weaponskill("Sword"));
    	wapeonOprionList.add(KaiDisciplines.Crate_Weaponskill("Quarterstaff"));
    	wapeonOprionList.add(KaiDisciplines.Crate_Weaponskill("Broadsword"));
    	
    		    	
    	
    	do {
    	spiele.ClearConsole();
    	System.out.println("Kai Disciplines\r\n"
    			+ "\r\n"
    			+ "Over the centuries, the Kai monks have mastered the skills of the warrior. These skills are known as the Kai "
    			+ "Disciplines, and they are taught to all Kai Lords. You have learnt only five of the skills listed below. The choice of which five skills these are, is for you to make. As all of the Disciplines may be of use to you at some point on your perilous quest, pick your five with care. The correct use of a Discipline at the right time can save your life.\r\n"
    			+ "\r\n"
    			+ "When you have chosen your five Disciplines, enter them in the Kai Disciplines section of your ");
    	System.out.println("Sie haben noch "+(6-i)+"Kai Disciplines auswahlen frei.");
    	System.out.println("Wählen sie aus derl Liste eine Kai Disciplines.");
    	int auswahl=0;
    	int waponePosion = 0;  	
    	
    		for (int j = 0; j < kaiDiscipinesOprionList.size(); j++) {
    			System.out.println(j+ ":" + kaiDiscipinesOprionList.get(j).getName());
    			if (kaiDiscipinesOprionList.get(j).getName().equals("Weaponskill"))
    				waponePosion = j;
    		}
    		    		
    		auswahl = spiele.EingabeInt();
    		
    		if (auswahl==waponePosion) {
    			spiele.ClearConsole();
    			wapeonOprionList.get(0).Info();
    			System.out.println("");
    			System.out.println("Sie haben noch "+(6-i)+"Kai Disciplines auswahlen frei.");
    			System.out.println("");
    			
    			for (int j = 0; j < wapeonOprionList.size(); j++) {
	    			System.out.println(j+ ":" + wapeonOprionList.get(j).getName());		    		
	    		}
    			
    			spiele.warte_auf_eingabe();
    			int Waffen_auswahl=zufallzahl.nextInt(10);
    			System.out.println("You have " + wapeonOprionList.get(Waffen_auswahl).getName());
	    		
	    		
	    		if(spiele.bestädigen_Entscheidung())
	    			{
					this.add(wapeonOprionList.get(Waffen_auswahl));
					wapeonOprionList.remove(Waffen_auswahl);
					i++;
					}
	    		else
	    			continue;
			}
    		else {
			spiele.ClearConsole();	    		
    		kaiDiscipinesOprionList.get(auswahl).Info();						
			if(spiele.bestädigen_Entscheidung()){
			this.add(kaiDiscipinesOprionList.get(auswahl));
			kaiDiscipinesOprionList.remove(auswahl);
			i++;
			}
			else
				continue;
			}
    		
    	} while (i<=5);
	}

	

}
