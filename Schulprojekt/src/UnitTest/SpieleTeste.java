package UnitTest;
import Spiele.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SpieleTeste {

	@Test
	public void haveKaiDisciplines() {
		KaiDisciplinesList TestKaiDiscipleLinestList = new KaiDisciplinesList(
				KaiDisciplines.Crate_Animal_Kinship(),
				KaiDisciplines.Crate_Camouflage());
			
		assertTrue("Animal Kinshipe ist vorhanden", TestKaiDiscipleLinestList.haveKaiDisciplines("Animal Kinship"));
		assertTrue("Camouflage ist vorhanden", TestKaiDiscipleLinestList.haveKaiDisciplines("Camouflage"));
		assertFalse("was auch immerist nicht vorhanden", TestKaiDiscipleLinestList.haveKaiDisciplines("was auch immer"));
	}
	
	@Test
	public void haveItems() {
		EquipmentList TestObjekt = new EquipmentList("Teste", 3);
		TestObjekt.add(new Equipment("Item 1",5,"Item 1"));
		assertTrue("Es hat was auch immer", TestObjekt.haveItems("Item 1"));
		TestObjekt.add(new Equipment("Item 2",5,"Item 2"));
		assertTrue("Es hat Item 1", TestObjekt.haveItems("Item 2"));		
		assertFalse("Es hat nicht Item 1", TestObjekt.haveItems("Item 3"));
		
	}
	
	@Test
	public void Ittem_add() {
		EquipmentList TestObjekt = new EquipmentList("Teste", 3);
		TestObjekt.add(new Equipment("Item 1",5,"Item 1"));
		TestObjekt.add(new Equipment("Item 2",5,"Item 2"));
		TestObjekt.add(new Equipment("Item 3",5,"Item 3"));
		assertTrue("Have to much Item",TestObjekt.add(new Equipment("Item 2",5,"Item 2")));
		
		  for (int i = 0; i < TestObjekt.size() ; i++) {			  
				System.out.println(i+"  "+ TestObjekt.get(i).getName());
			}
		
	}
	
	@Test
	public void CombatFaktor() {
		Charakter Debuge = new Charakter(
				KaiDisciplines.Crate_Animal_Kinship(), 
				KaiDisciplines.Crate_Camouflage(),
				KaiDisciplines.Crate_Weaponskill("Dagger"), 
				KaiDisciplines.Crate_Weaponskill("Spear"), 
				new Equipment("Dagger", 0, ""),
				new Equipment("Spear", 0, "")
				);
		
		assertEquals(Debuge.CombatFaktor(), 2);		
		
	}
	
	
	@Test
	public void MindshieldMindblastTest() {
		Charakter Debuge_true_true = new Charakter( true,true);
		Charakter Debuge_true_false = new Charakter( true,false);
		Charakter Debuge_false_true = new Charakter( false,true);
		Charakter Debuge_false_false = new Charakter( false,false);
		
		Enemy DebugeGener_true_true = new Enemy("Minster 1", 10, 10, true,true);
		Enemy DebugeGener_true_false = new Enemy("Minster 1", 10, 10, true,false);
		Enemy DebugeGener_false_true = new Enemy("Minster 1", 10, 10, false,true);
		Enemy DebugeGener_false_false = new Enemy("Minster 1", 10, 10, false,false);	
		
		
		
		assertEquals("Debuge_true_true vs Gener_true_true",0, combatRules.MindshieldMindblast(Debuge_true_true, DebugeGener_true_true));
		assertEquals("Debuge_true_true vs Gener_true_false",0, combatRules.MindshieldMindblast(Debuge_true_true, DebugeGener_true_false));
		assertEquals("Debuge_true_true vs Gener_false_true",2, combatRules.MindshieldMindblast(Debuge_true_true, DebugeGener_false_true));
		assertEquals("Debuge_true_true vs Gener_false_false",2, combatRules.MindshieldMindblast(Debuge_true_true, DebugeGener_false_false));
		
		assertEquals("Debuge_true_false  vs Gener_true_true",0, combatRules.MindshieldMindblast(Debuge_true_false, DebugeGener_true_true));
		assertEquals("Debuge_true_false  vs Gener_true_false",0, combatRules.MindshieldMindblast(Debuge_true_false, DebugeGener_true_false));
		assertEquals("Debuge_true_false  vs Gener_false_true",0, combatRules.MindshieldMindblast(Debuge_true_false, DebugeGener_false_true));
		assertEquals("Debuge_true_false vs Gener_false_false",0, combatRules.MindshieldMindblast(Debuge_true_false, DebugeGener_false_false));
		
		assertEquals("Debuge_false_true vs Gener_true_true",-2, combatRules.MindshieldMindblast(Debuge_false_true, DebugeGener_true_true));
		assertEquals("Debuge_false_true vs Gener_true_false",0, combatRules.MindshieldMindblast(Debuge_false_true, DebugeGener_true_false));
		assertEquals("Debuge_false_true vs Gener_false_true",0, combatRules.MindshieldMindblast(Debuge_false_true, DebugeGener_false_true));
		assertEquals("Debuge_false_true vs Gener_false_false",2, combatRules.MindshieldMindblast(Debuge_false_true, DebugeGener_false_false));
		
		assertEquals("Debuge_false_false vs Gener_true_true",-2, combatRules.MindshieldMindblast(Debuge_false_false, DebugeGener_true_true));
		assertEquals("Debuge_false_false vs Gener_true_false",0, combatRules.MindshieldMindblast(Debuge_false_false, DebugeGener_true_false));
		assertEquals("Debuge_false_false vs Gener_false_true",-2, combatRules.MindshieldMindblast(Debuge_false_false, DebugeGener_false_true));
		assertEquals("Debuge_false_false vs Gener_false_false",0, combatRules.MindshieldMindblast(Debuge_false_false, DebugeGener_false_false));
		
	}
	
	@Test
	public void CombackeTest() {
		Charakter Debuge_true_true = new Charakter( true,true);		
		Enemy DebugeGener_true_true = new Enemy("Minster 1", 20, 30, true,true);
			
		combatRules.Combat(Debuge_true_true, DebugeGener_true_true,6);		
	}
	
	@Test
	public void CombackeTest2() {
		Charakter Debuge_true_true = new Charakter( true,true);		
		Enemy DebugeGener_true_true = new Enemy("Minster 1", 20, 30);
			
		combatRules.Combat(Debuge_true_true, DebugeGener_true_true,-10);		
	}
	@Test
	public void CombackeTest3() {
		Charakter Debuge_true_true = new Charakter( true,true);		
		Enemy DebugeGener_true_true = new Enemy("Minster 1", 20, 30);			
		combatRules.Combat(Debuge_true_true, DebugeGener_true_true,5,4);		
	}
	
	@Test
	public void Kapiteltest1() {
		Charakter DebugeCharakter = new Charakter( true,true);	
		DebugeCharakter.getKaiDisciplines().add(KaiDisciplines.Crate_Tracking());
		
		
		System.out.println(spiele.optionauswahl(DebugeCharakter,
				"The path opens out into a large clearing. You notice strange claw prints in the "
						+ "earth. Kraan have landed here. By the number of prints and by the size of "
						+ "the area "
						+ "disturbed, you judge that at least five of the foul creatures landed here "
						+ "in the last "
						+ "twelve hours.\r\n"
						+ "\r\n"
						+ "You see two exits on the far side of the clearing. One leads west, the "
						+ "other south.\r\n"
						+ "\r\n",
				Option.CharakterZeigen(),
				new Option("If you have the Kai Discipline of Tracking, turn to 301.\r\n","301",false),
				new Option("If you wish to take the south path, turn to 27.\r\n","27",true),
				new Option("If you wish to take the west path, turn to 214.","214",true)
				));
	}
	
	@Test
	public void Kapiteltest2() {
		Charakter DebugeCharakter = new Charakter( true,true);	
		DebugeCharakter.getKaiDisciplines().add(KaiDisciplines.Crate_Tracking());
		
		
		System.out.println(spiele.optionauswahl(DebugeCharakter,
				"Your Kai Discipline of Tracking reveals to you fresh paw prints "
						+ "leading off along the south path.\r\n"
						+ "\r\n"
						+ "They are the prints of a black bear, an animal renowned for its ferocity. "
						+ "You decide the east path would be a much safer route.\r\n"
						+ "\r\n",
				Option.CharakterZeigen(),
				new Option("Turn to 252.","252",true)));
	}


}
