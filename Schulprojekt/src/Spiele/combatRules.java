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
	    do {	
		
	    	//Pick a number from the Random Number Table.
		    //Turn to the Combat Results Table.	
	    int runde = zufallzahl.nextInt(10);
	    switch (runde) {
		case 9:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(14);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(16);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(18);
				Spiler.decresENDURANCE(0);
				break;
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
				break;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(1);
				break;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(1);
				break;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(14);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(16);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(18);
				Spiler.decresENDURANCE(0);
				break;
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
				break;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(5);
				break;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(1);
				break;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(14);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(16);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(18);
				Spiler.decresENDURANCE(0);
				break;
			}
		case 6:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(6);
				break;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(6);
				break;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(5);
				break;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(1);
				break;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(1);
				break;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(14);
				Spiler.decresENDURANCE(1);
				break;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(16);
				Spiler.decresENDURANCE(1);
				break;
			}
		case 5:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(1);
				Spiler.decresENDURANCE(7);
				break;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(6);
				break;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(5);
				break;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(14);
				Spiler.decresENDURANCE(1);
				break;
			}
		case 4:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(8);
				break;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(1);
				Spiler.decresENDURANCE(7);
				break;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(6);
				break;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(5);
				break;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(12);
				Spiler.decresENDURANCE(2);
				break;
			}	
		case 3:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(8);
				break;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(7);
				break;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(1);
				Spiler.decresENDURANCE(6);
				break;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(5);
				break;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(5);
				break;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(2);
				break;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(11);
				Spiler.decresENDURANCE(2);
				break;
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
				break;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(7);
				break;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(1);
				Spiler.decresENDURANCE(6);
				break;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(5);
				break;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(5);
				break;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(10);
				Spiler.decresENDURANCE(2);
				break;
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
				break;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(0);
				Spiler.decresENDURANCE(6);
				break;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(1);
				Spiler.decresENDURANCE(6);
				break;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(2);
				Spiler.decresENDURANCE(5);
				break;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(3);
				Spiler.decresENDURANCE(5);
				break;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(4);
				Spiler.decresENDURANCE(5);
				break;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(5);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=8) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(4);
				break;
			}
			if (CombatRatio<=10) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(3);
				break;
			}
			if (CombatRatio>=11) {
				Spiler.decresENDURANCE(9);
				Spiler.decresENDURANCE(3);
				break;
			}
		case 0:
			if (CombatRatio<=-11) {
				Gegner.decresENDURANCE(6);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=-9) {
				Gegner.decresENDURANCE(7);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=-7) {
				Gegner.decresENDURANCE(8);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=-5) {
				Gegner.decresENDURANCE(9);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=-3) {
				Gegner.decresENDURANCE(10);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=-1) {
				Gegner.decresENDURANCE(11);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio==0) {
				Gegner.decresENDURANCE(12);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=2) {
				Gegner.decresENDURANCE(14);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=4) {
				Gegner.decresENDURANCE(16);
				Spiler.decresENDURANCE(0);
				break;
			}
			if (CombatRatio<=6) {
				Gegner.decresENDURANCE(18);
				Spiler.decresENDURANCE(0);
				break;
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
		}
	    
	    System.out.println("Your ENDURANCE are "+ Spiler.getENDURANCE()+" and "+ Gegner.getName()+ " ENDURANCE are "+ Gegner.getENDURANCE());
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
	    spiele.warte_auf_eingabe();
	    
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
	

	
	


}
