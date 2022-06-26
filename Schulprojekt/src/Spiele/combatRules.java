package Spiele;

import java.util.Random;

import javax.management.loading.PrivateClassLoader;

public class combatRules {
	
	private static Random zufallzahl = new Random();
	
	
	public static combatResult Combat(Charakter Spiler, Enemy Gegner)
	{

	    int CombatRatio = 0;
	    //Add your COMBAT SKILL to any extra points given to you by your Kai Disciplines.
	    CombatRatio += Spiler.getCOMBAT_SKILL();
	    CombatRatio += Spiler.CombatFaktor();
	    
	    //Subtract the COMBAT SKILL of your enemy from this total. This number = Combat Ratio.
	    CombatRatio -= Gegner.getCOMBATSKILL();
	    //Playser Mindshiel and Mindblast vs Gener Mindshiel and Mindblast 
	    CombatRatio += MindshieldMindblast(Spiler, Gegner);
	    
	    System.out.println("The Fighte startet");
	    System.out.println("Your ENDURANCE are "+ Spiler.getENDURANCE()+" and "+ Gegner.getName()+ " ENDURANCE are "+ Gegner.getENDURANCE());
	    spiele.warte_auf_eingabe();
	    
	    combatResult returnWert;
	    
	    do {
	    	System.out.println("Your ENDURANCE are "+ Spiler.getENDURANCE() +" and "+ Gegner.getName()+ " ENDURANCE are "+ Gegner.getENDURANCE());
	    	returnWert=Runden(Spiler, Gegner, CombatRatio);
	    	
	    	
	    if (Gegner.getENDURANCE()<=0) {
	    	System.out.println("Your Win");
	    	spiele.warte_auf_eingabe();
	    	return combatResult.Win;
		}
	    
	    if (Spiler.getENDURANCE()<=0) {
	    	System.out.println("Your Lost");
	    	spiele.warte_auf_eingabe();
	    	return combatResult.Lost;
		}
	    
	    if (returnWert == combatResult.ongoing) { 
	    		spiele.warte_auf_eingabe();
	    		continue;}
	    if (returnWert == combatResult.Lost) {
	    		System.out.println("Your Lost Instand Kill");
	    		return returnWert;
	    		}
	    if(returnWert == combatResult.Win) {
	    		System.out.println("Your Win Instand Kill");
	    		return returnWert;}
	    
	    
	    } while (true);	
		
	}
	
	public static combatResult Combat(Charakter Spiler, Enemy Gegner,int afterRun)
	{

	    int CombatRatio = 0;
	    //Add your COMBAT SKILL to any extra points given to you by your Kai Disciplines.
	    CombatRatio += Spiler.getCOMBAT_SKILL();
	    CombatRatio += Spiler.CombatFaktor();
	    
	    //Subtract the COMBAT SKILL of your enemy from this total. This number = Combat Ratio.
	    CombatRatio -= Gegner.getCOMBATSKILL();
	    //Playser Mindshiel and Mindblast vs Gener Mindshiel and Mindblast 
	    CombatRatio += MindshieldMindblast(Spiler, Gegner);
	    
	    System.out.println("The Fighte startet");
	    System.out.println("Your ENDURANCE are "+ Spiler.getENDURANCE()+" and "+ Gegner.getName()+ " ENDURANCE are "+ Gegner.getENDURANCE());
	    spiele.warte_auf_eingabe();
	    
	    combatResult returnWert;
	    int runde = 0;
	    do {
	    	runde ++;
	    	System.out.println("Your ENDURANCE are "+ Spiler.getENDURANCE() +" and "+ Gegner.getName()+ " ENDURANCE are "+ Gegner.getENDURANCE());
	    	returnWert=Runden(Spiler, Gegner, CombatRatio);
	    	    	
	    	if (runde >= afterRun) {
	    		System.out.println("Do they want to flee from the fight?");
	    		if(spiele.bestädigen_Entscheidung()) {
	    			returnWert=Runden(Spiler, Gegner, CombatRatio);
	    			if (returnWert != combatResult.Lost&&Spiler.getENDURANCE()>0) {
	    				System.out.println("Your ENDURANCE are "+ Spiler.getENDURANCE());
	    				System.out.println("You have successfully escaped");
	    				return combatResult.Evade;
					}
	    		}
			}
	    	
	    	
	    if (Gegner.getENDURANCE()<=0) {
	    	System.out.println("Your Win");
	    	spiele.warte_auf_eingabe();
	    	return combatResult.Win;
		}
	    
	    if (Spiler.getENDURANCE()<=0) {
	    	System.out.println("Your Lost");
	    	spiele.warte_auf_eingabe();
	    	return combatResult.Lost;
		}
	    
	    if (returnWert == combatResult.ongoing) { 
	    		spiele.warte_auf_eingabe();
	    		continue;}
	    if (returnWert == combatResult.Lost) {
	    		System.out.println("Your Lost Instand Kill");
	    		return returnWert;
	    		}
	    if(returnWert == combatResult.Win) {
	    		System.out.println("Your Win Instand Kill");
	    		return returnWert;}
	    
	    
	    } while (true);	
		
	}
	
	public static int MindshieldMindblast(Charakter Spiler, Enemy Gegner)
	{
						
		if (Spiler.getKaiDisciplines().haveKaiDisciplines("Mindblast")
				&&Spiler.getKaiDisciplines().haveKaiDisciplines("Mindshield")) 
		{
			if (Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindblast")
					&&Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindshield")) 
				return 0;
			if (Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindblast")
					&&!Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindshield")) 
				return 2;
			if (!Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindblast")
					&&Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindshield")) 
				return  0;
			else 
				return  2;
		}
		if (Spiler.getKaiDisciplines().haveKaiDisciplines("Mindblast")
				&&!Spiler.getKaiDisciplines().haveKaiDisciplines("Mindshield")) 
		{
			if (Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindblast")
					&&Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindshield")) 
				return -2;
			if (Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindblast")
					&&!Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindshield")) 
				return 0;
			if (!Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindblast")
					&&Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindshield")) 
				return  0;
			else 
				return  +2;
		}
		if (!Spiler.getKaiDisciplines().haveKaiDisciplines("Mindblast")
				&& Spiler.getKaiDisciplines().haveKaiDisciplines("Mindshield")) 
		{
			return  0;
		}
		else
		{
			if (Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindblast")
					&&Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindshield")) 
				return -2;
			if (Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindblast")
					&&!Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindshield")) 
				return -2;
			if (!Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindblast")
					&&Gegner.getCombiteAbilityE().haveKaiDisciplines("Mindshield")) 
				return  0;
			else 
				return  0;
		}		
		
	}
	
	private static combatResult Runden(Charakter Spiler, Enemy Gegner,int CombatRatio) 
	{		
					
	    	//Pick a number from the Random Number Table.
		    //Turn to the Combat Results Table.	
	    int runde = zufallzahl.nextInt(10);
	    switch (runde) {
		case 9:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(14);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(16);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(18);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=10) {
				Spiler.decresENDURANCE(0);
				System.out.println("Your Win");
				 spiele.warte_auf_eingabe();
				return combatResult.Win;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(0);
				System.out.println("Your Win");
				 spiele.warte_auf_eingabe();
				return combatResult.Win;
			}			
		case 8:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(1);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(1);
				return combatResult.ongoing;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(14);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(16);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(18);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(0);
				System.out.println("Your Win");
				 spiele.warte_auf_eingabe();
				return combatResult.Win;
			}			
		case 7:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(1);
				return combatResult.ongoing;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(14);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(16);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(18);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
		case 6:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(6);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(6);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(1);
				return combatResult.ongoing;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(1);
				return combatResult.ongoing;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(14);
				Spiler.decresENDURANCE(1);
				return combatResult.ongoing;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(16);
				Spiler.decresENDURANCE(1);
				return combatResult.ongoing;
			}
		case 5:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(1);
				Spiler.decresENDURANCE(7);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(6);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(14);
				Spiler.decresENDURANCE(1);
				return combatResult.ongoing;
			}
		case 4:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(8);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(1);
				Spiler.decresENDURANCE(7);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(6);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(12);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}	
		case 3:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(8);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(7);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(1);
				Spiler.decresENDURANCE(6);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(11);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}		
		case 2:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(0);
				System.out.println("Your Lost");
				 spiele.warte_auf_eingabe();
				return combatResult.Lost;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(8);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(7);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(1);
				Spiler.decresENDURANCE(6);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(10);
				Spiler.decresENDURANCE(2);
				return combatResult.ongoing;
			}	
		case 1:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(0);
				System.out.println("Your Lost");
				 spiele.warte_auf_eingabe();
				return combatResult.Lost;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(0);
				System.out.println("Your Lost");
				 spiele.warte_auf_eingabe();
				return combatResult.Lost;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(8);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(6);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(1);
				Spiler.decresENDURANCE(6);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(5);
				return combatResult.ongoing;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(4);
				return combatResult.ongoing;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(9);
				Spiler.decresENDURANCE(3);
				return combatResult.ongoing;
			}
		case 0:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(14);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(16);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(18);
				Spiler.decresENDURANCE(0);
				return combatResult.ongoing;
			}
			if (CombatRatio<=8) {
				Spiler.decresENDURANCE(0);
				System.out.println("Your Win");
				spiele.warte_auf_eingabe();
				return combatResult.Win;
			}
			if (CombatRatio<=10) {
				Spiler.decresENDURANCE(0);
				System.out.println("Your Win");
				spiele.warte_auf_eingabe();
				return combatResult.Win;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(0);
				System.out.println("Your Win");
				spiele.warte_auf_eingabe();
				return combatResult.Win;
			}
		default:
			return combatResult.ongoing;		
		}	    	    		
	}
	

	
	


}
