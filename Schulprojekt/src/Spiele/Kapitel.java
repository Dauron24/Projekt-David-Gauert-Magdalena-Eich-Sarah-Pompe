package Spiele;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

public class Kapitel {
	private Charakter Spielefiguer;
	private ArrayList<Supplier<Integer>> Kapittelliste = new ArrayList<Supplier<Integer>>();
	
	
public Kapitel() {
		
		Kapittelliste.add(()->Kapitel_1());
		Kapittelliste.add(()->Kapitel_2());
		Kapittelliste.add(()->Kapitel_3());
		Kapittelliste.add(()->Kapitel_4());
		
	}



public void Get_Spielfiguer(Charakter Spielfiguer){
	
		this.Spielefiguer= Spielfiguer;
	
}

public void KapitelAuswahl(int start) 
{
	int Kapitel = start;
	do {		
		Kapittelliste.get(Kapitel).get();	
	
	} while (true);
}
public int Kapitel_1() 
{
	String Text = "You must make haste for you sense it is not safe to linger by the smoking remains of the ruined monastery.\r\n" + 
			"The black-winged beasts could return at any moment. You must set out for the Sommlending capital of\r\n" + 
			"Holmgard and tell the King the terrible news of the massacre: that the whole élite of Kai warriors, save\r\n" + 
			"yourself, have been slaughtered. Without the Kai Lords to lead her armies, Sommerlund will be at the mercy\r\n" + 
			"of their ancient enemy, the Darklords.\r\n" + 
			"Fighting back tears, you bid farewell to your dead kinsmen. Silently, you promise that their deaths will be\r\n" + 
			"avenged. You turn away from the ruins and carefully descend the steep track.\r\n" + 
			"At the foot of the hill, the path splits into two directions, both leading into a large wood.";
	System.out.println(Text);
	return 1;	
	
}

public int Kapitel_2()
{
	String Text ="As you dash through the thickening trees, the shouts of the Giaks begin to fade behind you. You have nearly\r\n" + 
			"outdistanced them completely, when you crash headlong into a tangle of low branches.";
	return 2;
}
public int Kapitel_3 ()
{
	String Text ="Staying close to the officer, you follow him through an arched portal and up a short flight of stairs to a long\r\n" + 
			"hall. Soldiers run back and forth bearing orders on ornate scrolls to officers stationed around the city wall.\r\n" + 
			"A haggard and scar-faced man dressed in the white and purple robes of the King’s court approaches you and\r\n" + 
			"bids you follow him to the citadel.";
	return 3;
}
public int Kapitel_4 ()
{
	String Text = "It is a small one-man canoe in very poor condition. The wood has split and warped, and the craft appears to\r\n" + 
			"be leaking in several places. You quickly patch up the worst of the holes with some clay and bail out the\r\n" + 
			"water. This seems to stop the leaking for the moment. Stowing your equipment at the bow, you set off\r\n" + 
			"downstream, using a piece of driftwood as a paddle.\r\n" + 
			"After a short while, you hear the sound of horses galloping towards you along the left bank.";
	return 4;
}
public int Kapitel_5 ()
{
	String Text = "After about an hour of walking, the track slowly bears round to the east. You reach a shallow ford where a\r\n" + 
			"fast-flowing brook runs on a steep rocky course towards the south. Just beyond the ford is a junction where\r\n" + 
			"the track meets a wider path running north to south. Realizing that the north path will take you away from the\r\n" + 
			"capital, you turn right at the junction and head south.";
	return 5;
}
public int Kapitel_6 ()
{
	String Text = "In the distance you can hear the sound of horses galloping nearer. You crouch behind a tree and wait as the riders come closer. They are the cavalry of the King’s Guard wearing the white uniforms of His Majesty’s army.";
	return 6;
	
}
public int Kapitel_7 ()
{
	String Text = "For what seems an eternity, the rush of the crowd carries you along like a leaf on a fast-flowing stream. You desperately fight to stay on your feet, but you feel weak and dizzy from your ordeal, and your legs are as heavy as lead. Suddenly, you catch a glimpse of a long, narrow stone stairway that leads up to the roof of an inn.\r\n" + 
			"\r\n" + 
			"Gathering the last reserves of your strength, you dive for the stairs and climb slowly up to the top. From here you can see the magnificent view of the rooftops and spires of Holmgard, with the high stone walls of the citadel gleaming in the sun.\r\n" + 
			"\r\n" + 
			"[Illustration I]\r\n" + 
			"\r\n" + 
			"The houses and buildings of the capital are built very close to each other, and it is possible to jump from one roof to the next. In fact many of the citizens of Holmgard used to use the ‘Roofways’ (as they are known) when the heavy autumn rains made the unpaved parts of the streets too muddy for walking. But after many accidents, a royal decree forbade their use.\r\n" + 
			"\r\n" + 
			"After careful thought, you decide to use the ‘Roofways’, as they are your only chance of reaching the King. You have hopped, skipped, and jumped across several streets and you are only one street away from the citadel when you come to the end of a row of rooftops.\r\n" + 
			"\r\n" + 
			"The jump to the next row is much further than anything you have tried before, and your stomach begins to feel as if it were full of butterflies. Determined to reach the citadel, you turn and take a long run-up to the jump. With blood pounding in your ears, you sprint to the edge of the roof and leap into space, your eyes fixed on the opposite rooftop.\r\n" + 
			"";
	return 7;
	
}
public int Kapitel_8 ()
{
	String Text = "Your Kai Sixth Sense warns there is a fierce battle raging in the south. Your common sense tells you that the south is also the quickest route to the capital.";
	return 0;
}
}
