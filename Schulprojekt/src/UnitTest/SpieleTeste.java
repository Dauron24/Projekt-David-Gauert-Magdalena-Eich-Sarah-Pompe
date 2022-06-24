package UnitTest;
import Spiele.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class SpieleTeste {

	@Test
	public void haveKaiDisciplines() {
		KaiDisciplinesList TestKaiDiscipleLinestList = new KaiDisciplinesList(1);
		TestKaiDiscipleLinestList.add(KaiDisciplines.Crate_Animal_Kinship());
		TestKaiDiscipleLinestList.add(KaiDisciplines.Crate_Camouflage());
		
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

}
