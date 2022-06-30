package Spiele;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Kapitel {
	private Charakter Spielefiguer;
	private ArrayList<Supplier<Integer>> Kapittelliste = new ArrayList<Supplier<Integer>>();
	private Random zufalzahl = new Random();
	
	
public Kapitel() {
		
		Kapittelliste.add(()->Kapitel_1());
		Kapittelliste.add(()->Kapitel_2());
		Kapittelliste.add(()->Kapitel_3());
		Kapittelliste.add(()->Kapitel_4());
		Kapittelliste.add(()->Kapitel_5());
		Kapittelliste.add(()->Kapitel_6());
		Kapittelliste.add(()->Kapitel_7());
		Kapittelliste.add(()->Kapitel_8());
		Kapittelliste.add(()->Kapitel_9());
		Kapittelliste.add(()->Kapitel_10());
		Kapittelliste.add(()->Kapitel_11());
		Kapittelliste.add(()->Kapitel_12());
		Kapittelliste.add(()->Kapitel_13());
		Kapittelliste.add(()->Kapitel_14());
		Kapittelliste.add(()->Kapitel_15());
		Kapittelliste.add(()->Kapitel_16());
		Kapittelliste.add(()->Kapitel_17());
		Kapittelliste.add(()->Kapitel_18());
		Kapittelliste.add(()->Kapitel_19());
		Kapittelliste.add(()->Kapitel_20());
		Kapittelliste.add(()->Kapitel_21());
		Kapittelliste.add(()->Kapitel_22());
		Kapittelliste.add(()->Kapitel_23());
		Kapittelliste.add(()->Kapitel_24());
		Kapittelliste.add(()->Kapitel_25());
		Kapittelliste.add(()->Kapitel_26());
		Kapittelliste.add(()->Kapitel_27());
		Kapittelliste.add(()->Kapitel_28());
		Kapittelliste.add(()->Kapitel_29());
		Kapittelliste.add(()->Kapitel_30());
		Kapittelliste.add(()->Kapitel_31());
		Kapittelliste.add(()->Kapitel_32());
		Kapittelliste.add(()->Kapitel_33());
		Kapittelliste.add(()->Kapitel_34());
		Kapittelliste.add(()->Kapitel_35());
		Kapittelliste.add(()->Kapitel_36());
		Kapittelliste.add(()->Kapitel_37());
		Kapittelliste.add(()->Kapitel_38());
		Kapittelliste.add(()->Kapitel_39());
		Kapittelliste.add(()->Kapitel_40());
		Kapittelliste.add(()->Kapitel_41());
		Kapittelliste.add(()->Kapitel_42());
		Kapittelliste.add(()->Kapitel_43());
		Kapittelliste.add(()->Kapitel_44());
		Kapittelliste.add(()->Kapitel_45());
		Kapittelliste.add(()->Kapitel_46());
		Kapittelliste.add(()->Kapitel_47());
		Kapittelliste.add(()->Kapitel_48());
		Kapittelliste.add(()->Kapitel_49());
		Kapittelliste.add(()->Kapitel_50());
		Kapittelliste.add(()->Kapitel_51());
		Kapittelliste.add(()->Kapitel_52());
		Kapittelliste.add(()->Kapitel_53());
		Kapittelliste.add(()->Kapitel_54());
		Kapittelliste.add(()->Kapitel_55());
		Kapittelliste.add(()->Kapitel_56());
		Kapittelliste.add(()->Kapitel_57());
		Kapittelliste.add(()->Kapitel_58());
		Kapittelliste.add(()->Kapitel_59());
		Kapittelliste.add(()->Kapitel_60());
		Kapittelliste.add(()->Kapitel_61());
		Kapittelliste.add(()->Kapitel_62());
		Kapittelliste.add(()->Kapitel_63());
		Kapittelliste.add(()->Kapitel_64());
		Kapittelliste.add(()->Kapitel_65());
		Kapittelliste.add(()->Kapitel_66());
		Kapittelliste.add(()->Kapitel_67());
		Kapittelliste.add(()->Kapitel_68());
		Kapittelliste.add(()->Kapitel_69());
		Kapittelliste.add(()->Kapitel_60());
		Kapittelliste.add(()->Kapitel_71());
		Kapittelliste.add(()->Kapitel_72());
		Kapittelliste.add(()->Kapitel_73());
		Kapittelliste.add(()->Kapitel_74());
		Kapittelliste.add(()->Kapitel_75());
		Kapittelliste.add(()->Kapitel_76());
		Kapittelliste.add(()->Kapitel_77());
		Kapittelliste.add(()->Kapitel_78());
		Kapittelliste.add(()->Kapitel_79());
		Kapittelliste.add(()->Kapitel_80());
		Kapittelliste.add(()->Kapitel_81());
		Kapittelliste.add(()->Kapitel_82());
		Kapittelliste.add(()->Kapitel_83());
		Kapittelliste.add(()->Kapitel_84());
		Kapittelliste.add(()->Kapitel_85());
		Kapittelliste.add(()->Kapitel_86());
		Kapittelliste.add(()->Kapitel_87());
		Kapittelliste.add(()->Kapitel_88());
		Kapittelliste.add(()->Kapitel_89());
		Kapittelliste.add(()->Kapitel_80());
		Kapittelliste.add(()->Kapitel_91());
		Kapittelliste.add(()->Kapitel_92());
		Kapittelliste.add(()->Kapitel_93());
		Kapittelliste.add(()->Kapitel_94());
		Kapittelliste.add(()->Kapitel_95());
		Kapittelliste.add(()->Kapitel_96());
		Kapittelliste.add(()->Kapitel_97());
		Kapittelliste.add(()->Kapitel_98());
		Kapittelliste.add(()->Kapitel_99());
		Kapittelliste.add(()->Kapitel_100());
		Kapittelliste.add(()->Kapitel_101());
		Kapittelliste.add(()->Kapitel_102());
		Kapittelliste.add(()->Kapitel_103());
		Kapittelliste.add(()->Kapitel_104());
		Kapittelliste.add(()->Kapitel_105());
		Kapittelliste.add(()->Kapitel_106());
		Kapittelliste.add(()->Kapitel_107());
		Kapittelliste.add(()->Kapitel_108());
		Kapittelliste.add(()->Kapitel_109());
		Kapittelliste.add(()->Kapitel_110());
		Kapittelliste.add(()->Kapitel_111());
		Kapittelliste.add(()->Kapitel_112());
		Kapittelliste.add(()->Kapitel_113());
		Kapittelliste.add(()->Kapitel_114());
		Kapittelliste.add(()->Kapitel_115());
		Kapittelliste.add(()->Kapitel_116());
		Kapittelliste.add(()->Kapitel_117());
		Kapittelliste.add(()->Kapitel_118());
		Kapittelliste.add(()->Kapitel_119());
		Kapittelliste.add(()->Kapitel_120());
		Kapittelliste.add(()->Kapitel_121());
		Kapittelliste.add(()->Kapitel_122());
		Kapittelliste.add(()->Kapitel_123());
		Kapittelliste.add(()->Kapitel_124());
		Kapittelliste.add(()->Kapitel_125());
		Kapittelliste.add(()->Kapitel_126());
		Kapittelliste.add(()->Kapitel_127());
		Kapittelliste.add(()->Kapitel_128());
		Kapittelliste.add(()->Kapitel_129());
		Kapittelliste.add(()->Kapitel_130());
		Kapittelliste.add(()->Kapitel_131());
		Kapittelliste.add(()->Kapitel_132());
		Kapittelliste.add(()->Kapitel_133());
		Kapittelliste.add(()->Kapitel_134());
		Kapittelliste.add(()->Kapitel_135());
		Kapittelliste.add(()->Kapitel_136());
		Kapittelliste.add(()->Kapitel_137());
		Kapittelliste.add(()->Kapitel_138());
		Kapittelliste.add(()->Kapitel_139());
		Kapittelliste.add(()->Kapitel_140());
		Kapittelliste.add(()->Kapitel_141());
		Kapittelliste.add(()->Kapitel_142());
		Kapittelliste.add(()->Kapitel_143());
		Kapittelliste.add(()->Kapitel_144());
		Kapittelliste.add(()->Kapitel_145());
		Kapittelliste.add(()->Kapitel_146());
		Kapittelliste.add(()->Kapitel_147());
		Kapittelliste.add(()->Kapitel_148());
		Kapittelliste.add(()->Kapitel_149());
		Kapittelliste.add(()->Kapitel_150());
		Kapittelliste.add(()->Kapitel_151());
		Kapittelliste.add(()->Kapitel_152());
		Kapittelliste.add(()->Kapitel_153());
		Kapittelliste.add(()->Kapitel_154());
		Kapittelliste.add(()->Kapitel_155());
		Kapittelliste.add(()->Kapitel_156());
		Kapittelliste.add(()->Kapitel_157());
		Kapittelliste.add(()->Kapitel_158());
		Kapittelliste.add(()->Kapitel_159());
		Kapittelliste.add(()->Kapitel_160());
		Kapittelliste.add(()->Kapitel_161());
		Kapittelliste.add(()->Kapitel_162());
		Kapittelliste.add(()->Kapitel_163());
		Kapittelliste.add(()->Kapitel_164());
		Kapittelliste.add(()->Kapitel_165());
		Kapittelliste.add(()->Kapitel_166());
		Kapittelliste.add(()->Kapitel_167());
		Kapittelliste.add(()->Kapitel_168());
		Kapittelliste.add(()->Kapitel_169());
		Kapittelliste.add(()->Kapitel_160());
		Kapittelliste.add(()->Kapitel_171());
		Kapittelliste.add(()->Kapitel_172());
		Kapittelliste.add(()->Kapitel_173());
		Kapittelliste.add(()->Kapitel_174());
		Kapittelliste.add(()->Kapitel_175());
		Kapittelliste.add(()->Kapitel_176());
		Kapittelliste.add(()->Kapitel_177());
		Kapittelliste.add(()->Kapitel_178());
		Kapittelliste.add(()->Kapitel_179());
		Kapittelliste.add(()->Kapitel_180());
		Kapittelliste.add(()->Kapitel_181());
		Kapittelliste.add(()->Kapitel_182());
		Kapittelliste.add(()->Kapitel_183());
		Kapittelliste.add(()->Kapitel_184());
		Kapittelliste.add(()->Kapitel_185());
		Kapittelliste.add(()->Kapitel_186());
		Kapittelliste.add(()->Kapitel_187());
		Kapittelliste.add(()->Kapitel_188());
		Kapittelliste.add(()->Kapitel_189());
		Kapittelliste.add(()->Kapitel_180());
		Kapittelliste.add(()->Kapitel_191());
		Kapittelliste.add(()->Kapitel_192());
		Kapittelliste.add(()->Kapitel_193());
		Kapittelliste.add(()->Kapitel_194());
		Kapittelliste.add(()->Kapitel_195());
		Kapittelliste.add(()->Kapitel_196());
		Kapittelliste.add(()->Kapitel_197());
		Kapittelliste.add(()->Kapitel_198());
		Kapittelliste.add(()->Kapitel_199());
		Kapittelliste.add(()->Kapitel_200());
		Kapittelliste.add(()->Kapitel_201());
		Kapittelliste.add(()->Kapitel_202());
		Kapittelliste.add(()->Kapitel_203());
		Kapittelliste.add(()->Kapitel_204());
		Kapittelliste.add(()->Kapitel_205());
		Kapittelliste.add(()->Kapitel_206());
		Kapittelliste.add(()->Kapitel_207());
		Kapittelliste.add(()->Kapitel_208());
		Kapittelliste.add(()->Kapitel_209());
		Kapittelliste.add(()->Kapitel_210());
		Kapittelliste.add(()->Kapitel_211());
		Kapittelliste.add(()->Kapitel_212());
		Kapittelliste.add(()->Kapitel_213());
		Kapittelliste.add(()->Kapitel_214());
		Kapittelliste.add(()->Kapitel_215());
		Kapittelliste.add(()->Kapitel_216());
		Kapittelliste.add(()->Kapitel_217());
		Kapittelliste.add(()->Kapitel_218());
		Kapittelliste.add(()->Kapitel_219());
		Kapittelliste.add(()->Kapitel_220());
		Kapittelliste.add(()->Kapitel_221());
		Kapittelliste.add(()->Kapitel_222());
		Kapittelliste.add(()->Kapitel_223());
		Kapittelliste.add(()->Kapitel_224());
		Kapittelliste.add(()->Kapitel_225());
		Kapittelliste.add(()->Kapitel_226());
		Kapittelliste.add(()->Kapitel_227());
		Kapittelliste.add(()->Kapitel_228());
		Kapittelliste.add(()->Kapitel_229());
		Kapittelliste.add(()->Kapitel_230());
		Kapittelliste.add(()->Kapitel_231());
		Kapittelliste.add(()->Kapitel_232());
		Kapittelliste.add(()->Kapitel_233());
		Kapittelliste.add(()->Kapitel_234());
		Kapittelliste.add(()->Kapitel_235());
		Kapittelliste.add(()->Kapitel_236());
		Kapittelliste.add(()->Kapitel_237());
		Kapittelliste.add(()->Kapitel_238());
		Kapittelliste.add(()->Kapitel_239());
		Kapittelliste.add(()->Kapitel_240());
		Kapittelliste.add(()->Kapitel_241());
		Kapittelliste.add(()->Kapitel_242());
		Kapittelliste.add(()->Kapitel_243());
		Kapittelliste.add(()->Kapitel_244());
		Kapittelliste.add(()->Kapitel_245());
		Kapittelliste.add(()->Kapitel_246());
		Kapittelliste.add(()->Kapitel_247());
		Kapittelliste.add(()->Kapitel_248());
		Kapittelliste.add(()->Kapitel_249());
		Kapittelliste.add(()->Kapitel_250());
		Kapittelliste.add(()->Kapitel_251());
		Kapittelliste.add(()->Kapitel_252());
		Kapittelliste.add(()->Kapitel_253());
		Kapittelliste.add(()->Kapitel_254());
		Kapittelliste.add(()->Kapitel_255());
		Kapittelliste.add(()->Kapitel_256());
		Kapittelliste.add(()->Kapitel_257());
		Kapittelliste.add(()->Kapitel_258());
		Kapittelliste.add(()->Kapitel_259());
		Kapittelliste.add(()->Kapitel_260());
		/*
		Kapittelliste.add(()->Kapitel_261());
		Kapittelliste.add(()->Kapitel_262());
		Kapittelliste.add(()->Kapitel_263());
		Kapittelliste.add(()->Kapitel_264());
		Kapittelliste.add(()->Kapitel_265());
		Kapittelliste.add(()->Kapitel_266());
		Kapittelliste.add(()->Kapitel_267());
		Kapittelliste.add(()->Kapitel_268());
		Kapittelliste.add(()->Kapitel_269());
		Kapittelliste.add(()->Kapitel_260());
		Kapittelliste.add(()->Kapitel_271());
		Kapittelliste.add(()->Kapitel_272());
		Kapittelliste.add(()->Kapitel_273());
		Kapittelliste.add(()->Kapitel_274());
		Kapittelliste.add(()->Kapitel_275());
		Kapittelliste.add(()->Kapitel_276());
		Kapittelliste.add(()->Kapitel_277());
		Kapittelliste.add(()->Kapitel_278());
		Kapittelliste.add(()->Kapitel_279());
		Kapittelliste.add(()->Kapitel_280());
		Kapittelliste.add(()->Kapitel_281());
		Kapittelliste.add(()->Kapitel_282());
		Kapittelliste.add(()->Kapitel_283());
		Kapittelliste.add(()->Kapitel_284());
		Kapittelliste.add(()->Kapitel_285());
		Kapittelliste.add(()->Kapitel_286());
		Kapittelliste.add(()->Kapitel_287());
		Kapittelliste.add(()->Kapitel_288());
		Kapittelliste.add(()->Kapitel_289());
		Kapittelliste.add(()->Kapitel_280());
		Kapittelliste.add(()->Kapitel_291());
		Kapittelliste.add(()->Kapitel_292());
		Kapittelliste.add(()->Kapitel_293());
		Kapittelliste.add(()->Kapitel_294());
		Kapittelliste.add(()->Kapitel_295());
		Kapittelliste.add(()->Kapitel_296());
		Kapittelliste.add(()->Kapitel_297());
		Kapittelliste.add(()->Kapitel_298());
		Kapittelliste.add(()->Kapitel_299());
		Kapittelliste.add(()->Kapitel_300());
		Kapittelliste.add(()->Kapitel_301());
		Kapittelliste.add(()->Kapitel_302());
		Kapittelliste.add(()->Kapitel_303());
		Kapittelliste.add(()->Kapitel_304());
		Kapittelliste.add(()->Kapitel_305());
		Kapittelliste.add(()->Kapitel_306());
		Kapittelliste.add(()->Kapitel_307());
		Kapittelliste.add(()->Kapitel_308());
		Kapittelliste.add(()->Kapitel_309());
		Kapittelliste.add(()->Kapitel_310());
		Kapittelliste.add(()->Kapitel_311());
		Kapittelliste.add(()->Kapitel_312());
		Kapittelliste.add(()->Kapitel_313());
		Kapittelliste.add(()->Kapitel_314());
		Kapittelliste.add(()->Kapitel_315());
		Kapittelliste.add(()->Kapitel_316());
		Kapittelliste.add(()->Kapitel_317());
		Kapittelliste.add(()->Kapitel_318());
		Kapittelliste.add(()->Kapitel_319());
		Kapittelliste.add(()->Kapitel_320());
		Kapittelliste.add(()->Kapitel_321());
		Kapittelliste.add(()->Kapitel_322());
		Kapittelliste.add(()->Kapitel_323());
		Kapittelliste.add(()->Kapitel_324());
		Kapittelliste.add(()->Kapitel_325());
		Kapittelliste.add(()->Kapitel_326());
		Kapittelliste.add(()->Kapitel_327());
		Kapittelliste.add(()->Kapitel_328());
		Kapittelliste.add(()->Kapitel_329());
		Kapittelliste.add(()->Kapitel_330());
		Kapittelliste.add(()->Kapitel_331());
		Kapittelliste.add(()->Kapitel_332());
		Kapittelliste.add(()->Kapitel_333());
		Kapittelliste.add(()->Kapitel_334());
		Kapittelliste.add(()->Kapitel_335());
		Kapittelliste.add(()->Kapitel_336());
		Kapittelliste.add(()->Kapitel_337());
		Kapittelliste.add(()->Kapitel_338());
		Kapittelliste.add(()->Kapitel_339());
		Kapittelliste.add(()->Kapitel_340());
		Kapittelliste.add(()->Kapitel_341());
		Kapittelliste.add(()->Kapitel_342());
		Kapittelliste.add(()->Kapitel_343());
		Kapittelliste.add(()->Kapitel_344());
		Kapittelliste.add(()->Kapitel_345());
		Kapittelliste.add(()->Kapitel_346());
		Kapittelliste.add(()->Kapitel_347());
		Kapittelliste.add(()->Kapitel_348());
		Kapittelliste.add(()->Kapitel_349());
		Kapittelliste.add(()->Kapitel_350());
		*/
		
	}



public void Get_Spielfiguer(Charakter Spielfiguer){
	
		this.Spielefiguer= Spielfiguer;
	
}

public void KapitelAuswahl(int start) 
{
	int Kapitel = start;
	do {		
		
		Kapitel=Kapittelliste.get(Kapitel-1).get();	
	
	} while (true);
}
public int Kapitel_1 () 
{
	return spiele.optionauswahl(Spielefiguer,
		"You must make haste for you sense it is not safe to linger by the smoking remains of the "
				+ "ruined monastery. The black-winged beasts could return at any moment. You must set out for the "
				+ "Sommlending capital of Holmgard and tell the King the terrible news of the massacre: that the whole "
				+ "élite of Kai warriors, save yourself, have been slaughtered. Without the Kai Lords to lead her armies, "
				+ "Sommerlund will be at the mercy of their ancient enemy, the Darklords.\r\n"
				+ "\r\n"
				+ "Fighting back tears, you bid farewell to your dead kinsmen. Silently, you promise that their deaths "
				+ "will be avenged. You turn away from the ruins and carefully descend the steep track.\r\n"
				+ "\r\n"
				+ "At the foot of the hill, the path splits into two directions, both leading into a large wood.",
		Option.CharakterZeigen(),
		new Option("If you wish to use your Kai Discipline of Sixth Sense, turn to 141.","141",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Sixth Sense")),
		new Option("If you wish to take the right path into the wood, turn to 85.","85",true),
		new Option("If you wish to follow the left track, turn to 275.","275",true)
		);
}

public int Kapitel_2()
{

System.out.println("As you dash through the thickening trees, the shouts of the Giaks begin to fade behind you. You have nearly\r\n"
		+ "outdistanced them completely, when you crash headlong into a tangle of low branches.");

if (zufalzahl.nextInt(9)<=5) {
	System.out.println(" you have picked a number 0–4");
	spiele.warte_auf_eingabe();
	return 343;
} 
else {
	System.out.println(" you have picked a number 5–9");
	spiele.warte_auf_eingabe();
	return 276;
}
}

public int Kapitel_3 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Staying close to the officer, you follow him through an arched portal and up a short flight of stairs to a long\r\n" + 
				"hall. Soldiers run back and forth bearing orders on ornate scrolls to officers stationed around the city wall.\r\n" + 
				"A haggard and scar-faced man dressed in the white and purple robes of the King’s court approaches you and\r\n" + 
				"bids you follow him to the citadel.",
		Option.CharakterZeigen(),
		new Option("If you wish to follow this man, turn to 196.","196",true),
		new Option("If you wish to decline his offer and return to the crowded streets, turn to 144.","144",true)
		);
}

public int Kapitel_4 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"It is a small one-man canoe in very poor condition. The wood has split and warped, and the craft appears to\r\n" + 
				"be leaking in several places. You quickly patch up the worst of the holes with some clay and bail out the\r\n" + 
				"water. This seems to stop the leaking for the moment. Stowing your equipment at the bow, you set off\r\n" + 
				"downstream, using a piece of driftwood as a paddle.\r\n" + 
				"After a short while, you hear the sound of horses galloping towards you along the left bank.",
		Option.CharakterZeigen(),
		new Option("If you wish to use the Kai Discipline of Sixth Sense, turn to 218.","218",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Sixth Sense")),
		new Option("If you wish to hide in the bottom of the canoe, turn to 75.","75",true),
		new Option("If you wish to try to attract their attention, turn to 175.","175",true)
		);
}

public int Kapitel_5 ()
{
return spiele.optionauswahl(Spielefiguer,
		"After about an hour of walking, the track slowly bears round to the east. You reach a shallow ford where a\r\n" + 
				"fast-flowing brook runs on a steep rocky course towards the south. Just beyond the ford is a junction where\r\n" + 
				"the track meets a wider path running north to south. Realizing that the north path will take you away from the\r\n" + 
				"capital, you turn right at the junction and head south.",
		Option.CharakterZeigen(),
		new Option("Turn to 111.","111",true));
}

public int Kapitel_6 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"In the distance you can hear the sound of horses galloping nearer. "
				+ "You crouch behind a tree and wait as the "
				+ "riders come closer. They are the cavalry of the King’s Guard wearing the white "
				+ "uniforms of His Majesty’s army.",
		Option.CharakterZeigen(),
		new Option("If you wish to call them, turn to 183.","183",true),
		new Option("If you wish to let them pass and then continue on your way through the forest, "
				+ "turn to 200.","200",true));

}

public int Kapitel_7 ()
{
System.out.println("For what seems an eternity, the rush of the crowd carries you along like a leaf on a fast-flowing stream. You desperately fight to stay on your feet, but you feel weak and dizzy from your ordeal, and your legs are as heavy as lead. Suddenly, you catch a glimpse of a long, narrow stone stairway that leads up to the roof of an inn.\r\n" + 
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
		"");
if (zufalzahl.nextInt(9)<=2) {
	System.out.println(" you have picked a number 0–2");
	spiele.warte_auf_eingabe();
	return 108;
} 
else {
	System.out.println(" you have picked a number 3–9");
	spiele.warte_auf_eingabe();
	return 25;
}
}

public int Kapitel_8 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Your Kai Sixth Sense warns there is a fierce battle raging in the south. Your common "
		+ "sense tells you that the "
				+ "south is also the quickest route to the capital.",
		Option.CharakterZeigen(),
		new Option("Turn to 70.","70",true));
}

public int Kapitel_9 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You cannot move: you are being held rigid by some powerful force. Your eyes are drawn towards the "
				+ "mouth of the skeleton. From deep in the earth you hear a low humming, like the sound of millions of "
				+ "angry bees. A dull red glow appears in the empty eye sockets of the dead King and the humming increases "
				+ "until your ears are filled with the deafening roar. You are in the presence of an ancient evil, far older "
				+ "and stronger than the Darklords themselves.",
		Option.CharakterZeigen(),
		new Option("You are in possess of a Vordak Gem, turn to 236.","236",Spielefiguer.getSpecialItems().haveItems("Vordak Gem")),
		new Option("You are not in possess of a Vordak Gem, turn to 292.","292",!Spielefiguer.getSpecialItems().haveItems("Vordak Gem")));
}

public int Kapitel_10 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You are sweating and your legs ache. In the middle distance you can see a "
				+ "group of cottages.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to enter a cottage and rest for a while, turn to 115.\r\n","115",true),
		new Option("If you wish to press on, turn to 83.","83",true));
}

public int Kapitel_11 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You quickly dodge into the doorway of a stable and hide your surgeon’s cloak in the straw, for it "
				+ "would be better to be seen as a Kai Lord than as a charlatan.\r\n"
				+ "\r\n"
				+ "Without wasting a second, you set off towards the Great Hall on the other side of the courtyard.",
		Option.CharakterZeigen(),
		new Option("Turn to 139.","139",true));
}

public int Kapitel_12 ()
{
String Text = "You have "+Spielefiguer.getBelt_Pouch().getAnzahl()+" "+ Spielefiguer.getBelt_Pouch().getName() 
			+"You have 10 Gold Crowns and wish to pay him, turn to 262.";

int speicher = spiele.optionauswahl(Spielefiguer,
		"The bodyguard looks at you with great suspicion and then slams the door shut. You can hear the sound "
				+ "of voices inside the caravan. Suddenly the door swings open and the face of a wealthy "
				+ "merchant appears.\r\n"
				+ "\r\n"
				+ "He demands 10 Gold Crowns as payment for the ride.",
		Option.CharakterZeigen(),
		new Option(Text,"262",Spielefiguer.getBelt_Pouch().getAnzahl()>=10),
		new Option("If you do not have enough Gold Crowns or do not wish to pay him, turn to 247.","247",true));
if (speicher == 262) {
	Spielefiguer.getBelt_Pouch().setAnzahl(Spielefiguer.getBelt_Pouch().getAnzahl()-10);
}
return speicher;
}

public int Kapitel_13 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The path soon ends at a large clearing. In the centre of the clearing is a "
				+ "tree much taller and wider than any others you have seen in the forest.\r\n"
				+ "\r\n"
				+ "Looking up through the massive branches you can see a large treehouse some "
				+ "twenty-five to thirty feet above the ground. There is no ladder, but the gnarled "
				+ "bark of the tree offers many footholds.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to climb the tree and search the treehouse, turn to 307.\r\n","307",true),
		new Option("If you would rather press on, turn to 213.","213",true));
}

public int Kapitel_14 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You reach the top of a small wooded hill on which several large boulders form a rough circle. "
				+ "Suddenly you hear a loud growl from behind a rock to your left.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to draw your weapon and prepare to fight, turn to 43.\r\n","43",true),
		new Option("If you would rather take evasive action by running as fast as "
				+ "you can over the hill, turn to 106.","106",true));
}

public int Kapitel_15 ()
{
int speicher = spiele.optionauswahl(Spielefiguer,
		"You pass through a long, dark tunnel of overhanging branches that eventually "
				+ "opens out into a large clearing. On a stone plinth in the centre of the clearing is a Sword, "
				+ "sheathed in a black leather scabbard. A handwritten note has been tied to the hilt, but it is "
				+ "in a language which is foreign to you.\r\n"
				+ "\r\n"
				+ "You may take the Sword if you wish, and note it on your Action Chart.\r\n"
				+ "\r\n"
				+ "There are three exits from the clearing.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you decide to go east, turn to 207.\r\n","207",true),
		new Option("If you decide to go west, turn to 201.\r\n","201",true),
		new Option("If you decide to go south, turn to 35.","35",true));
Spielefiguer.getWeapons().add(new Equipment("Sword", 1, null));
return speicher;
}

public int Kapitel_16 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You manage to free a horse from the straps securing it to the caravan. "
				+ "It is frightened by the scent of the approaching Doomwolves, and the cries of "
				+ "their evil riders—the Giaks.\r\n"
				+ "\r\n"
				+ "Preparing your weapon, you spur your skittish horse towards the oncoming beasts. "
				+ "They are less than fifty yards away and they are lowering their lances at you as "
				+ "they get nearer and nearer.\r\n"
				+ "\r\n"
				+ "You are charging head-on towards each other.",
		Option.CharakterZeigen(),
		new Option("Turn to 192.","192",true));
}

public int Kapitel_17 ()
{
System.out.println("You raise your weapon to strike at the beast as its razor-fanged "
		+ "mouth snaps shut just inches from your head. Buffeted by the beating of "
		+ "its wings you find it difficult to stand.\r\n"
		+ "\r\n"
		+ "Deduct 1 point from your COMBAT SKILL and fight the Kraan.\r\n"
		+ "\r\n"
		+ "Kraan: COMBAT SKILL 16   ENDURANCE 24\r\n"
		+ "\r\n"
		+ "If you kill the creature, you quickly descend the far side of the hill to "
		+ "avoid the Giaks.\r\n"
		+ "\r\n"
		+ "Pick a number from the Random Number Table.\r\n");

if (combatRules.Combat(Spielefiguer, new Enemy("Kraan",16,24),-2)==combatResult.Lost){
	return 351;
	}
int speicher =zufalzahl.nextInt(10);
if (speicher<=0) {
	System.out.println(" You have picked a number 0");
	spiele.warte_auf_eingabe();
	return 53;
} 
else if (speicher<=2) {
	System.out.println(" You have picked a number 1-2");
	spiele.warte_auf_eingabe();
	return 274;
	
} else {System.out.println(" You have picked a number 3–9");
	spiele.warte_auf_eingabe();
	return 316;	
}
}

public int Kapitel_18 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You are awoken by the sound of troops in the distance. Across the lake "
				+ "you see the black-cloaked figures of Drakkarim and a pack of Doomwolves and their "
				+ "riders. A Kraan appears from above the trees and lands on the roof of the small wooden shack.\r\n"
				+ "\r\n"
				+ "It is ridden by a creature dressed in red. The Kraan takes off and begins to fly across the lake "
				+ "to where you are hidden.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to use the Kai Discipline of Camouflage, turn to 114.\r\n","114",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Camouflage")),
		new Option("If you wish to ride deeper in the forest, turn to 239.\r\n","239",true),
		new Option("If you wish to fight the creature, turn to 29.","29",true));

}

public int Kapitel_19 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Just ahead through the tall trees you can see clumps of dark-red gallowbrush, a thorny briar with "
				+ "sharp crimson barbs. The common name for this forest weed is ‘Sleeptooth’, for the thorns are very sharp "
				+ "and can make you feel weak and sleepy if they scratch your skin.\r\n",
		Option.CharakterZeigen(),
		new Option("If you have the Kai Discipline of Tracking, turn to 69.\r\n","69",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Tracking")),
		new Option("You can avoid the Sleeptooth by returning to the track. Turn to 272.\r\n","272",true),
		new Option("Or you can push on through the briars, deeper into the forest, by turning to 119.","119",true));
}

public int Kapitel_20 ()
{
System.out.println("It seems that whoever lived here left in a great hurry—and they must have left quite recently. "
		+ "A half-eaten meal still remains on the table, and a mug of dark jala is still warm to the touch.\r\n"
		+ "\r\n"
		+ "Searching a chest and small wardrobe, you find a Backpack, food (enough for two Meals), and a Dagger.\r\n"
		+ "\r\n"
		+ "If you wish to take these items, remember to mark them on your Action Chart. You continue your mission.\r\n");
if (spiele.bestädigen_Entscheidung()) {
	Spielefiguer.getMeals().setAnzahl(Spielefiguer.getMeals().getAnzahl()+2);
	Spielefiguer.getWeapons().add(new Equipment("Dagger", 1, ""));
}
return 273;
}

public int Kapitel_21 ()
{
System.out.println("You have ridden about two miles into the tangle of trees when the "
		+ "ground becomes very marshy.\r\n"
		+ "\r\n"
		+ "Pick a number from the Random Number Table.\r\n");
int speicher =zufalzahl.nextInt(10);
if (speicher<=5) {
	System.out.println("Your Nummer is below 5, your horse has suddenly plunged into thick mud up to its belly. If the number is 5 or "
		+ "above, you manage to steer clear of the morass and may now turn to 189.\r\n");
	spiele.warte_auf_eingabe();
	return 189;	
} 
else{
	System.out.println("If you are stuck, pick another number from the Random Number Table. If this time the number is 7 or "
		+ "less, the mud engulfs you up to your armpits. Your horse gives one last despairing scream as its "
		+ "muzzle disappears into the bubbling mud. If you scored above 7, you drag yourself onto firm "
		+ "ground and turn to 189.\r\n");
	speicher =zufalzahl.nextInt(10);
	if (speicher>7) {
		System.out.println(" You have picked a number above 7");
		spiele.warte_auf_eingabe();
		return 189;
		}
	else {
		System.out.println("If not, then this is your last chance! If you pick any number except a 9, the foul-smelling bog sucks "
		+ "you under and claims another victim. Your life and your mission end here. But if you have picked a 9, "
		+ "turn to 312.");
			speicher =zufalzahl.nextInt(10);
			if (speicher==7) {
				System.out.println(" You have picked a number 9");
				spiele.warte_auf_eingabe();
				return 312;
				}
			else {
				System.out.println(" You have picked a number below 9");
				spiele.warte_auf_eingabe();
				return 0;
			}
		}
	}
}

public int Kapitel_22 ()
{
System.out.println("Knocking aside the leader, you sprint off along the highway. Then behind you the "
		+ "ominous click of a crossbow being cocked sends a shiver down your spine.\r\n"
		+ "\r\n"
		+ "Pick a number from the Random Number Table.\r\n");

if (zufalzahl.nextInt(10)<=4) {
	System.out.println("If you have picked a number 0–4, turn to 181.\r\n");
	spiele.warte_auf_eingabe();
	return 181;
} 
else {
	System.out.println("If you have picked a number 5–9, turn to 145.");
	spiele.warte_auf_eingabe();
	return 145;
}
}

public int Kapitel_23 ()
{return spiele.optionauswahl(Spielefiguer,
		"The corridor soon widens into a large hall. At the far end, a stone staircase leads up to "
				+ "a huge door. Two black candles on either side of the stone steps dimly illuminate the chamber. "
				+ "You notice that no wax has melted, and as you get nearer you can feel that they give off no heat. "
				+ "Ancient engravings cover the stone surfaces of the walls.\r\n"
				+ "\r\n"
				+ "Anxious to leave this evil tomb, you examine the door for a latch. An ornate pin appears to lock the "
				+ "door, but there is also a keyhole in the lockplate.\r\n",
		Option.CharakterZeigen(),
		new Option("If you have a Golden Key and wish to use it, turn to 326.\r\n","326",Spielefiguer.getSpecialItems().haveItems("Golden Key")),
		new Option("If you have the Kai Discipline of Mind Over Matter, turn to 151.\r\n","151",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Mind Over Matter")),
		new Option("If you wish to remove the pin, turn to 337.","337",true));
}

public int Kapitel_24 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The merchant shouts to the driver of the caravan to jump. ‘We’re under attack!’ he cries, "
				+ "disappearing through a circular window.\r\n",
		Option.CharakterZeigen(),
		new Option("If you decide to jump after him, turn to 234.\r\n","234",true),
		new Option("If you decide to run through the caravan and grab the reins of the horse team, turn to 184.","184",true));
}

public int Kapitel_25 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You land with such a crash on the opposite roof, that the wind is knocked out of you and "
				+ "you lie flat on your back with your head in a spin.\r\n"
				+ "\r\n"
				+ "It takes a minute or so for you to realize that you’ve made it and are perfectly safe. When "
				+ "you are sure you are all right, you jump up and let out a shout for joy at your skill and daring.\r\n"
				+ "\r\n"
				+ "Quickly you find a way across the roof and climb down a long drainpipe to the street below. "
				+ "You see the large iron doors of the citadel open, and a wagon drawn by two large horses tries to leave. "
				+ "The horses are frightened by the noisy crowd and they both rear up, causing the wagon to smash a front "
				+ "wheel against the door. In the confusion, you see a chance to enter and quickly slip inside just as the "
				+ "guards slam the doors shut.\r\n",
		Option.CharakterZeigen(),
		new Option("Turne 139","139",true));


}

public int Kapitel_26 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Cautiously, you move along the corridor until you come to a sharp eastward turn. A strange greenish "
				+ "light can be seen in the distance.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to continue, turn to 249.\r\n","249",true),
		new Option("If you wish to go back and try the southern route, turn to 100.","100",true));
}

public int Kapitel_27 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You walk along this path for over an hour, carefully watching the sky above you in case the Kraan "
				+ "attack again. Up ahead, a large tree has fallen across the path. As you approach, you can hear voices "
				+ "coming from the other side of the massive trunk.\r\n",
		Option.CharakterZeigen(),
		new Option("If you choose to attack, turn to 250.\r\n","250",true),
		new Option("If you choose to listen to what the voices say, turn to 52.","52",true));
}

public int Kapitel_28 ()
{
return spiele.optionauswahl(Spielefiguer,
		"After a few hundred yards, the path joins another one running north to south.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to go northwards, turn to 130.\r\n","130",true),
		new Option("If you wish to head south, turn to 147.","147",true));
}

public int Kapitel_29 ()
{

System.out.println("You stride out to the water’s edge and prepare yourself for combat. The Kraan and "
		+ "its rider spot you and begin to speed across the lake barely inches above the "
		+ "surface.\r\n"
		+ "\r\n"
		+ "The rider lets out a scream that freezes your blood. He is a Vordak, a fierce "
		+ "lieutenant of the Darklords.\r\n"
		+ "\r\n"
		+ "He is upon you and you must fight him. Deduct 2 points from your COMBAT SKILL "
		+ "unless you have the Kai Discipline of Mindshield, for the creature is "
		+ "attacking you with its Mindforce as well as with a huge black mace.\r\n"
		+ "\r\n"
		+ "Vordak: COMBAT SKILL 17   ENDURANCE 25\r\n"
		+ "\r\n"
		+ "If you win the fight, turn to 270.");
	if (combatRules.Combat(Spielefiguer, new Enemy("Vordak",17,25,false,true),0)==combatResult.Win){
		return 270;
	}
	return 351;
}

public int Kapitel_30 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The people look tired and hungry. They have come many miles from their "
				+ "burning city. Suddenly, you hear the beat of huge wings coming from the north.\r\n"
				+ "\r\n"
				+ "‘Kraan, Kraan! Hide yourselves!’ the cry goes up all along the road.\r\n"
				+ "\r\n"
				+ "Just in front of you, a wagon carrying small children breaks down, its right wheel "
				+ "jammed in a furrow. The children scream in panic.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to help the children, turn to 194.\r\n","194",true),
		new Option("If you’d rather run for the cover of the trees, turn to 261.","261",true));
}

public int Kapitel_31 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You try to comfort the injured man as best you can, but his wounds are "
				+ "serious and he is soon unconscious again. Covering him with his cape, you turn and "
				+ "press deeper into the forest.\r\n"
				+ "\r\n"
				+ "Turn to 264.",
		Option.CharakterZeigen(),
		new Option("\"Turn to 264.","264",true));
}

public int Kapitel_32 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You have ridden about three miles when, in the distance, you spot the "
				+ "unmistakable silhouette of five large Doomwolves. Riding on their backs are Giaks. "
				+ "They seem to be going on ahead to where the path leads down into an open meadow. "
				+ "Suddenly, one of the Giaks leaves the others and begins to ride back along the "
				+ "path towards you.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to hide in the undergrowth and let him pass, turn to 176.\r\n","176",true),
		new Option("If you wish to fight him, turn to 340.","340",true));
}

public int Kapitel_33 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The floor of the cave is quite dry and dusty. As you explore deeper in the "
				+ "half-light, you detect the stale odour of rotting flesh. Littering a crevice are "
				+ "the bones, fur, and teeth of several small animals. You notice a small cloth bag "
				+ "among these remains which you open to discover 3 Gold Crowns. Pocketing these coins, "
				+ "you leave what appears to be the lair of a mountain cat and carefully descend the "
				+ "hill.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 248.","248",true));
}

public int Kapitel_34 ()
{
System.out.println("Without warning, a terrible apparition in red robes swoops down from the "
		+ "sky on the back of a Kraan. Its cry freezes your blood. The beast is a Vordak, "
		+ "a fierce lieutenant of the Darklords.\r\n"
		+ "\r\n"
		+ "He is above you and you must fight him.\r\n"
		+ "\r\n"
		+ "Deduct 2 points from your COMBAT SKILL unless you have the Kai Discipline of "
		+ "Mindshield, for the creature is attacking you with the power of its Mindforce as "
		+ "well as with a huge black mace.\r\n"
		+ "\r\n"
		+ "Vordak: COMBAT SKILL 17   ENDURANCE 25\r\n"
		+ "\r\n"
		+ "If you win, turn to 328.");
if (combatRules.Combat(Spielefiguer, new Enemy("Vordak",17,25,false,true),0)==combatResult.Win){
	return 328;
}
return 351;
}

public int Kapitel_35 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The forest is becoming denser, and the path more tangled with thorny briars. "
				+ "Almost completely hidden by the undergrowth, you notice another path branching off "
				+ "towards the east. Your current route seems to be coming to a prickly end, so you "
				+ "decide to follow the new path eastwards.\r\n"
				+ "\r\n"
				+ "Turn to 207.",
		Option.CharakterZeigen(),
		new Option("Turn to 207.","207",true));
}

public int Kapitel_36 ()
{
System.out.println("The old watchtower ladder is rotten and several rungs break as you climb. "
		+ "Pick a number from the Random Number Table.\r\n");

if (zufalzahl.nextInt(9)<=4) {
	System.out.println("If the number is 4 or lower, you have fallen. Lose 2 ENDURANCE points "
			+ "and turn to 140.\r\n");
	Spielefiguer.decresENDURANCE(4);
	spiele.warte_auf_eingabe();
	return 140;
} 
else {
	System.out.println("If the number is 5 or higher, you do not fall. Turn to 323.");
	spiele.warte_auf_eingabe();
	return 323;
}
}

public int Kapitel_37 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You are feeling tired and hungry and you must stop to eat. After your Meal, "
				+ "you retrace your steps back to the citadel and begin to walk around the high, "
				+ "indomitable stone wall.\r\n"
				+ "\r\n"
				+ "You discover another entrance on the eastern side, guarded as before by two "
				+ "armoured soldiers.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to use the Kai Discipline of Camouflage, turn to 282.\r\n","282",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Camouflage")),
		new Option("If you wish to approach them and tell your story, turn to 289.","289",true));
}

public int Kapitel_38 ()
{
return spiele.optionauswahl(Spielefiguer,
		"For half an hour or more you press on through the forest, through the rich "
				+ "vegetation and ferns. You happen upon a small clear stream where you stop for a "
				+ "few minutes to wash your face and drink of the cold, fresh water.\r\n"
				+ "\r\n"
				+ "Feeling revitalized, you cross the stream and press on. You soon notice the smell "
				+ "of wood smoke which seems to be drifting towards you from the north.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to investigate the smell of wood smoke, turn to 128.\r\n","128",true),
		new Option("If you would rather avoid the source of this smoke, turn to 347.","347",true));
}

public int Kapitel_39 ()
{
return spiele.optionauswahl(Spielefiguer,
		"After a few seconds, two small furry faces nervously appear over the top of the "
				+ "trunk. They say they are Kakarmi and tell you that the Kraan are everywhere. To the "
				+ "west lie the remains of their village but little is left of it now. They are trying "
				+ "to find the rest of their tribe who took to the forest when the ‘Black-wings’ "
				+ "attacked. They point behind them—east along the path—and tell you that the trail "
				+ "appears to be a dead end, but that if you continue through the undergrowth for a "
				+ "few yards more, you will find a watchtower where the path splits into three "
				+ "directions. Take the east path. This leads to the King’s highway between the capital "
				+ "city—Holmgard—and the northern port of Toran.\r\n"
				+ "\r\n"
				+ "You thank the Kakarmi, and bid them farewell.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 228.","228",true));
}

public int Kapitel_40 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Keeping a careful watch on the huts for any sign of the enemy, you make your "
				+ "way around the clearing under the cover of the trees and bracken. Rejoining the "
				+ "track, you hurry away from Fogwood.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 105.","105",true));
}

public int Kapitel_41 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Three rangers gallop past the river bank, closely followed by the Giaks on "
				+ "their snarling Doomwolves.\r\n"
				+ "\r\n"
				+ "The bank is steep and you are spotted by the Giak leader who orders five of "
				+ "his troops to open fire at you with their bows. Their black arrows rain down "
				+ "on you.\r\n",
		Option.CharakterZeigen(),
		new Option("If you decide to paddle downstream as fast as you can, turn to 174.\r\n","174",true),
		new Option("If you decide to head for the cover of the trees on the opposite bank, turn to 116.","116",true));
}

public int Kapitel_42 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You follow the track for nearly an hour when you come to a crossroads.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to continue east, turn to 86.\r\n","86",true),
		new Option("If you would rather head north, turn to 238.\r\n","238",true),
		new Option("If you decide to venture south, turn to 157.\r\n","157",true),
		new Option("Or if you prefer to go west, turn to 147.","147",true));
}

public int Kapitel_43 ()
{
System.out.println("From behind the rock a huge black bear comes into view. It advances slowly towards "
		+ "you, its mouth open and its face lined in anger and pain.\r\n"
		+ "\r\n"
		+ "You notice that it is badly wounded and is bleeding from its neck and back. "
		+ "You must fight it.\r\n"
		+ "\r\n"
		+ "Black Bear: COMBAT SKILL 16   ENDURANCE 10\r\n"
		+ "\r\n"
		+ "If you win, turn to 195.\r\n"
		+ "\r\n"
		+ "After three rounds of combat, you position yourself so that you can run down the hill. If you wish to evade at this time then turn to 106 and chance being wounded as you flee.");
if (combatRules.Combat(Spielefiguer, new Enemy("Kraan",16,24),0,3)==combatResult.Win){
	return 195;
	}
return 351;
}

public int Kapitel_44 ()
{
System.out.println("Without warning, the old track ends abruptly at the edge of a steep "
		+ "slope. The ground here is very loose and unstable. You lose your footing and "
		+ "fall headlong over the edge.\r\n"
		+ "\r\n"
		+ "Pick a number from the Random Number Table.\r\n");
int speicher =zufalzahl.nextInt(10);
if (speicher<=4) {
	System.out.println("If you have picked a number that is 0–4, turn to 277.\r\n");
	spiele.warte_auf_eingabe();
	return 277;
}
else {System.out.println("If the number is 5–9, turn to 338.");
	spiele.warte_auf_eingabe();
	return 338;	
}

}

public int Kapitel_45 ()
{
return spiele.optionauswahl(Spielefiguer,
		"These men are not what they seem. The tunic of the leader is genuine "
				+ "but it is heavily bloodstained around the collar, as if its true owner had "
				+ "been murdered. Their weapons are not army issue, but expensive and lavishly "
				+ "decorated like the weapons made by the armourers of Durenor.\r\n"
				+ "\r\n"
				+ "The leader has a crossbow slung over his pack. An attempt to run would be "
				+ "suicide. You decide that you must fight them or you will surely be murdered "
				+ "as soon as you drop your weapon.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 180.","180",true));
}

public int Kapitel_46 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You have covered about two miles when the trees ahead thin out. "
				+ "You can see a small wooden shack on the edge of a lake. A cloaked man "
				+ "approaches you and offers to row you and your horse across the lake for "
				+ "a fee of 2 Gold Crowns.\r\n",
		Option.CharakterZeigen(),
		new Option("If you have the Kai Discipline of Sixth Sense, turn to 296.\r\n","296",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Sixth Sense")),
		new Option("If you accept the offer, turn to 246.\r\n","246",true),
		new Option("If you refuse and try to ride around the lake, turn to 90.","90",true));
}

public int Kapitel_47 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Breathless and sweating, you claw your way towards the summit of the "
				+ "hill. Suddenly, a large winged shadow passes across the hillside. You look "
				+ "up to see a Kraan circling the peak above. Behind you the Giaks are gaining "
				+ "ground.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Do you stand and fight the Giaks where you are, using the high ground "
				+ "to your advantage? If so, turn to 136.\r\n","136",true),
		new Option("Or do you grit your teeth and press on towards the peak of the hill? "
				+ "Turn to 322.","322",true));
}

public int Kapitel_48 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Your Sixth Sense warns you that these troops are not all they seem. "
				+ "You can detect an aura of evil about them. They are in the service of the "
				+ "Darklords.\r\n"
				+ "\r\n"
				+ "You must leave here quickly before you are spotted. ",
		Option.CharakterZeigen(),
		new Option("Turn to 243.","243",true));
}

public int Kapitel_49 ()
{
System.out.println("As you begin to read the inscription, you notice a shadow moving "
		+ "towards you from behind the screen.\r\n"
		+ "\r\n"
		+ "Pick a number from the Random Number Table.\r\n");
if (zufalzahl.nextInt(9)<=4) {
	System.out.println("If you have chosen a number that is 0–4, turn to 339.\r\n");
	Spielefiguer.decresENDURANCE(4);
	spiele.warte_auf_eingabe();
	return 339;
} 
else {
	System.out.println("If the number is 5–9, turn to 60.");
	spiele.warte_auf_eingabe();
	return 323;
}
}

public int Kapitel_50 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The sound of fighting can be heard in the distance.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to continue towards the sound of battle, turn to 97.\r\n","97",true),
		new Option("If you wish to avoid the fighting, change direction and turn to 243.","243",true));
}

public int Kapitel_51 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You climb the wooded bank of the river and see the log walls of the "
				+ "fieldworks disappearing into the distance.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "A battle rages about two miles away and the log wall has collapsed in several "
				+ "places where the Darklords are attacking.\r\n"
				+ "\r\n"
				+ "Most of the fieldworks ahead are unmanned, the soldiers having left to supply "
				+ "reinforcements for the raging battle.\r\n"
				+ "\r\n"
				+ "There is a gate in the log wall. ",
		Option.CharakterZeigen(),
		new Option("If you wish to approach it, turn to 288.\r\n","288",true),
		new Option("If you would prefer to climb over the wall instead, turn to 221.","221",true));
}

public int Kapitel_52 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Now that you are closer, you can make out that the voices are not "
				+ "human. The sound is more like a kind of grunting and squeaking.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you have the Kai Discipline of Animal Kinship, turn to 225.\r\n","225",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Animal Kinship")),
		new Option("If not, you must climb over the tree and face whatever lurks on the other side. Turn to 250.","250",true));
}

public int Kapitel_53 ()
{
System.out.println("A searing pain tears through your right leg as it is twisted "
		+ "and crushed by the weight of your body. Down and down you tumble, "
		+ "until you finally land in a ditch at the base of the hill with such "
		+ "force that the wind is knocked out of you and you lose consciousness.\r\n"
		+ "\r\n"
		+ "You are awoken by the sharp pain of something stabbing your chest. "
		+ "It proves to be the tip of a Giak spear. You are greeted by the malicious "
		+ "sneer of its owner as he pins your left arm to the ground. Instinctively "
		+ "you reach for your weapon but it is no longer there.\r\n"
		+ "\r\n"
		+ "Defenceless against the cruel Giaks, the last thing that you see before "
		+ "all light fades is the jagged point of a Giak lance hurtling down towards "
		+ "your throat.\r\n"
		+ "\r\n"
		+ "Your mission ends here.");
spiele.warte_auf_eingabe();
return 351;
}

public int Kapitel_54 ()
{
System.out.println("It would seem that the heavens have not heard your prayers. A spear "
		+ "whistles past your head and embeds itself in the neck of your galloping horse. "
		+ "With a shriek of pain, the horse topples forward and you both roll in a tangled "
		+ "heap on the highway.\r\n"
		+ "\r\n"
		+ "Dazed and pinned down by the weight of the dead body of your horse, the "
		+ "last thing you remember is the sharp penetrating spearheads of the Giak "
		+ "lances.\r\n"
		+ "\r\n"
		+ "You have failed in your mission.");
spiele.warte_auf_eingabe();
return 351;
}

public int Kapitel_55 ()
{
System.out.println("Just as the Giak makes his leap, you race forward and strike out "
		+ "with your weapon—knocking the creature away from the young wizard’s back.\r\n"
		+ "\r\n"
		+ "You jump onto the struggling Giak and strike again. Due to the surprise "
		+ "of your attack, add 4 points to your COMBAT SKILL for the duration "
		+ "of this fight but remember to deduct it again as soon as the fight is"
		+ " over.\r\n"
		+ "\r\n"
		+ "Giak: COMBAT SKILL 9   ENDURANCE 9\r\n"
		+ "\r\n"
		+ "If you win, turn to 325.");
if (combatRules.Combat(Spielefiguer, new Enemy("Giak",9,9),4)==combatResult.Win){
	return 325;
	}
return 351;
}

public int Kapitel_56 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You hear the scream of a large winged beast above the trees. "
				+ "It is a Kraan, a deadly servant of the Darklords. Quickly you hide "
				+ "beneath the thick fronds of fern until the horrible shrieks have passed "
				+ "away.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option( "Now turn to 222.","222",true));
}

public int Kapitel_57 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The cabin has only one room. In it you see a wooden table and two "
				+ "benches, "
				+ "a large bed made of straw bales lashed together, several bottles of coloured "
				+ "liquids, and an embroidered rug in the centre of the floor.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you choose to take a closer look at the bottles, turn to 164.\r\n","164",true),
		new Option("If you choose to leave the room and investigate the stable, "
				+ "turn to 308.","308",true));
}

public int Kapitel_58 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Bracing yourself for the run, you head off down the ridge at a "
				+ "steady pace. To the west, the army of the Darklords looks like a giant "
				+ "pot of black ink that has been spilled between the mountains and is "
				+ "spreading into the land below.\r\n"
				+ "\r\n"
				+ "You have been running for twenty minutes when you catch sight of a "
				+ "pack of Doomwolves lining a shallow ridge to your right.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you decide to flatten yourself against the rocks along the side of "
				+ "the road and wait until they pass, turn to 251.\r\n","251",true),
		new Option("If you decide to carry on running, but draw your weapon just in "
				+ "case they attack, turn to 160.","160",true));
}

public int Kapitel_59 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Peering into the darkness, you notice that rough stairs have been "
				+ "cut into the earth and that the mouth of the cave is in fact the entrance "
				+ "to a tunnel.\r\n"
				+ "\r\n"
				+ "Carefully descending the slippery stairway, you notice a small silver "
				+ "box on a shelf at the bottom of the staircase.\r\n",
		Option.CharakterZeigen(),
		new Option("If you want to open the silver box, turn to 124.\r\n","124",true),
		new Option("If you wish to return to the surface and press on, turn to 106.\r\n","106",true),
		new Option("If you wish to investigate the tunnel further, turn to 211.","211",true));
}

public int Kapitel_60 ()
{
System.out.println("The last thing you remember before darkness engulfs you is "
		+ "the flash of a long curved steel knife. You have become yet another "
		+ "victim of the Sage and his robber son—the very one who has just slit "
		+ "your throat!\r\n"
		+ "\r\n"
		+ "Your quest ends here.");
spiele.warte_auf_eingabe();
return 351;
}

public int Kapitel_61 ()
{
return spiele.optionauswahl(Spielefiguer,
		"At last you can reach the wooden fieldworks surrounding the "
				+ "outer city. As you race towards a sentry post, you can hear the excited "
				+ "shouts of the guards cheering you on. Thank the gods that they recognize "
				+ "you, for you must appear a ragged and suspicious figure. Your cloak is "
				+ "torn and hangs in tatters, your face is scratched and blood-smeared, and "
				+ "the dust of the Graveyard covers you from head to toe.\r\n"
				+ "\r\n"
				+ "Splashing through a shallow stream, you stagger towards the gate. "
				+ "The full horror of the Graveyard encounter begins to catch up with "
				+ "you. The last thing you recall before exhaustion robs you of consciousness, "
				+ "is falling into the outstretched arms of two soldiers who have run from the "
				+ "fieldworks to help you.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 268.","268",true));
}

public int Kapitel_62 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You walk along this path for over an hour, carefully watching the sky above you in case the Kraan "
				+ "attack again. Up ahead, a large tree has fallen across the path. As you approach, you can hear voices "
				+ "coming from the other side of the massive trunk.\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 288.","288",true));
}

public int Kapitel_63 ()
{
System.out.println("The wild old man is screaming at you. He blames you for the war "
		+ "and curses the Kai Lords as agents of the Darklords. He will not listen "
		+ "to reason and you must fight him.\r\n"
		+ "\r\n"
		+ "Madman: COMBAT SKILL 11   ENDURANCE 10\r\n"
		+ "\r\n"
		+ "If you win, turn to 269.");
if (combatRules.Combat(Spielefiguer, new Enemy("Madman",11,10),0)==combatResult.Win){
	return 269;
	}
return 351;
}

public int Kapitel_64 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You are awoken by the cries of a Kraan circling above the caravan. "
				+ "It is early morning and the sky is clear and bright. You can see a pack "
				+ "of Doomwolves less than a quarter of a mile away along the highway ahead. "
				+ "They are preparing to attack. You must act quickly.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you decide to gather your equipment and run for the cover of the "
				+ "trees, turn to 188.\r\n","188",true),
		new Option("If you decide to cut free one of the horses and try to break through "
				+ "the attacking Doomwolves to the clear road beyond, then turn to 16.","16",true));
}

public int Kapitel_65 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Your senses scream at you that this place is very evil. "
				+ "Leave as quickly as you can.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 104.","104",true));
}

public int Kapitel_66 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Startled, you turn around to see a burly sergeant and two soldiers "
				+ "running towards you, their swords drawn as if to strike.\r\n"
				+ "\r\n"
				+ "You prepare to defend yourself for it looks as if they are about to "
				+ "attack first and ask questions later; but suddenly the sergeant calls his "
				+ "men to a halt. He has recognized your cloak. They put away their weapons "
				+ "and apologize many times for their mistake. The sergeant orders one of "
				+ "the men to fetch the captain of the Guard as he leads you to the doors "
				+ "of the Great Hall.\r\n"
				+ "\r\n"
				+ "You are greeted by a tall and handsome warrior who listens intently "
				+ "to your story. When you have finished the account of your perilous "
				+ "journey to the capital, you notice a tear in the brave man’s eye as "
				+ "he bids you to follow him. You walk through the splendid halls and "
				+ "corridors of the inner Palace. The richness and grandeur "
				+ "are a wonder to behold. You eventually arrive at a large "
				+ "carved door, guarded by two soldiers wearing silver armour.\r\n"
				+ "\r\n"
				+ "You are about to meet the King.\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 350.","350",true));
}

public int Kapitel_67 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Your Kai Discipline of Tracking reveals to you fresh paw prints "
				+ "leading off along the south path.\r\n"
				+ "\r\n"
				+ "They are the prints of a black bear, an animal renowned for its ferocity. "
				+ "You decide the east path would be a much safer route.\r\n"
				+ "\r\n"
				+ "Turn to 252.",
		Option.CharakterZeigen(),
		new Option("Turn to 252.","252",true));
}

public int Kapitel_68 ()
{
return spiele.optionauswahl(Spielefiguer,
		"After a short walk, you reach a junction where a path crosses your "
				+ "present route heading from west to east.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to turn west, go to 130.\r\n","130",true),
		new Option("If you wish to head east, turn to 15.","15",true));
}

public int Kapitel_69 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You are very near a friendly village.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Avoid the gallowbrush and turn to 272.","272",true));
}

public int Kapitel_70 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You have reached a small bridge. A track follows the stream "
				+ "towards the east. A much narrower path disappears into thick forest "
				+ "towards the south.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to use the Kai Discipline of Sixth Sense, turn to 8.\r\n","8",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Sixth Sense")),
		new Option("If you wish to go east, turn to 28.\r\n","28",true),
		new Option("If you wish to go south, turn to 157.","157",true));
}

public int Kapitel_71 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You are winded but not hurt. You have fallen fifteen feet "
				+ "or so through the roof of an underground tomb. The walls are sheer "
				+ "and you cannot climb them. An arched tunnel leads out of the tomb "
				+ "towards the east, in front of which lies the sarcophagus of some "
				+ "ancient noble.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to use the Kai Discipline of Sixth Sense, turn to 65.\r\n","65",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Sixth Sense")),
		new Option("If you wish to open the sarcophagus to see if it contains "
				+ "any treasure, turn to 242.\r\n","242",true),
		new Option("If you wish to leave via the tunnel, turn to 104.","104",true));
}

public int Kapitel_72 ()
{
System.out.println("You turn to face a sneering Giak and the razor-fanged jaws of "
		+ "its mount. You must fight them as one enemy.\r\n"
		+ "\r\n"
		+ "Giak + Doomwolf: COMBAT SKILL 15   ENDURANCE 24\r\n"
		+ "\r\n"
		+ "If you win, turn to 265.");
if (combatRules.Combat(Spielefiguer, new Enemy("Giak + Doomwolf",15,24),0)==combatResult.Win){
	return 265;
	}
return 351;
}

public int Kapitel_73 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Pulling your green cloak about you, you blend into the foliage and rocks. Peering "
				+ "carefully up at the track, you are shocked to see that they are not the King’s men at all.\r\n"
				+ "\r\n"
				+ "They are Drakkarim, some of the Darklords’ cruellest troops. They must have disguised "
				+ "themselves as soldiers of the King in order to get this far into the forest. Thanking "
				+ "your Kai training for saving your life, you silently slip away from the stream and push "
				+ "on into the forest.\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 243.","243",true));
}

public int Kapitel_74 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The Kraan and its riders land on the track barely ten feet from where you are "
				+ "hidden.\r\n"
				+ "\r\n"
				+ "The Giaks leap from the scaly backs of the Kraan and move towards you, their spears "
				+ "raised to strike. You have been seen.\r\n",
		Option.CharakterZeigen(),
		new Option("If you decide to fight them, turn to 138.\r\n","138",true),
		new Option("If you decide to run deeper into the forest without delay, turn to 281.","281",true));
}

public int Kapitel_75 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Peering out carefully, you can see three green-clad men on horses racing along "
				+ "the bank. You recognize them as Border Rangers, the regiment of the King’s Army that "
				+ "police the western borders. One of them is wounded and is slumped over the neck of "
				+ "his horse.\r\n"
				+ "\r\n"
				+ "Close behind follow a pack of twenty Doomwolves. Their Giak riders are firing arrows "
				+ "at the rangers which fall all around them. One ranger drops from his horse and rolls "
				+ "down the river bank, a black arrow deeply embedded in his right leg.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to help the ranger, turn to 260.\r\n","260",true),
		new Option("If you wish to stay hidden and drift downstream, turn to 163.","163",true));
}

public int Kapitel_76 ()
{
Spielefiguer.decresENDURANCE(2);
Spielefiguer.getBackpackItems().add(new Equipment("Vordak Gem", 1, null));
return spiele.optionauswahl(Spielefiguer,
		"The Gem feels very hot and burns your hand. Lose 2 ENDURANCE points. You quickly grab "
				+ "it with the edge of your cloak and slip this Vordak Gem into your Backpack. A Gem that size "
				+ "must be worth hundreds of Crowns! You smile at your good fortune, mount your horse, and ride "
				+ "off along the south track.\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 118.","118",true));
}

public int Kapitel_77 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The Mountain Giaks are unaccustomed to pursuing their prey through forests and you soon "
				+ "outdistance them, until finally the sound of their grunts and curses disappears completely.\r\n"
				+ "\r\n"
				+ "When you are satisfied that they have given up the chase, you stop for a few minutes to catch "
				+ "your breath and check your equipment. With the memory of your ruined monastery still blazing in "
				+ "your mind, you gather up your meagre belongings and push on.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 19.","19",true));
}

public int Kapitel_78 ()
{
return spiele.optionauswahl(Spielefiguer,
		"As the caravan careers past, you leap for the tailboard and manage to hold fast. "
				+ "Pulling yourself upright, you find that you are standing on the bottom rung of a ladder "
				+ "leading to the rear door of the wagon. Suddenly the top half of the door flies open and "
				+ "you are confronted by the angry face of a bodyguard.\r\n",
		Option.CharakterZeigen(),
		new Option("If you decide to inform him that you are a Kai Lord with an urgent message for "
				+ "the King, turn to 132.\r\n","132",true),
		new Option("If you decide to offer him Gold Crowns for safe passage to the capital, turn to 12.\r\n","12",true),
		new Option("If you decide to attack the guard with your weapon, turn to 220.","220",true));
}

public int Kapitel_79 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You come to a small footbridge across a fast-flowing stream. On the other side of the "
				+ "bridge the path turns south. You cross the bridge and follow the path.\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 204.","204",true));
}

public int Kapitel_80 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You stumble backwards through the front door, clutching your burnt chest with "
				+ "both hands. Smoke is billowing from the shop and you must run—before the Sage or his "
				+ "robber son catch you.\r\n"
				+ "\r\n"
				+ "You make it back to the main street and lose yourself in the rush of the crowds.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 7.","7",true));
}

public int Kapitel_81 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"After nearly an hour, the Kraan and their cruel riders vanish towards the west. "
				+ "As the shocked refugees start to emerge from the woods, you can hear the sound of "
				+ "horses in the distance galloping nearer. You stay hidden and wait as the riders come "
				+ "closer. They are the cavalry of the King’s Guard wearing the white uniforms of "
				+ "His Majesty’s army.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to call to them, turn to 183.\r\n","183",true),
		new Option("If you would rather continue along the forest edge towards the south, turn to 200.","200",true));
}

public int Kapitel_82 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The giant Gourgaz lies dead at your feet. His evil followers hiss at you and then "
				+ "fall back from the bridge. The Prince’s soldiers form a protective wall around you and "
				+ "their dying leader with their shields. Black arrows whistle past your head.\r\n"
				+ "\r\n"
				+ "The dying Prince looks up into your eyes and says, ‘Kai Lord, you must take a message "
				+ "to my father. The enemy is too strong, we cannot hold him. The King must seek that which "
				+ "is in Durenor or all is lost. Take my horse and ride for the capital. May the luck of the "
				+ "gods ride with you.’\r\n"
				+ "\r\n"
				+ "You bid a sad farewell to the Prince, mount his white steed, and head south along "
				+ "the forest path. The battle still rages behind you as the Prince’s men fight off "
				+ "another assault on the bridge.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 235.","235",true));
}

public int Kapitel_83 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You have run about a mile when three soldiers appear from beneath a small footbridge. "
				+ "They demand that you halt and drop your weapons and equipment.\r\n"
				+ "\r\n"
				+ "They are bloodstained and unshaven. Their leader is wearing the tunic of a soldier "
				+ "of the Toran garrison.\r\n",
		Option.CharakterZeigen(),
		new Option("If you possess the Kai Discipline of Sixth Sense, turn to 45.\r\n","45",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Sixth Sense")),
		new Option("If you wish to do as they say, turn to 205.\r\n","205",true),
		new Option("If you wish to prepare to fight them, turn to 180.\r\n","180",true),
		new Option("If you demand to know what they want, turn to 232.","232",true));
}

public int Kapitel_84 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Just as you feel the air beating on your back, you slip free of your horse and roll "
				+ "over—landing with a splash in a muddy ditch by the side of the highway.\r\n"
				+ "\r\n"
				+ "You are uninjured, and you quickly scramble to your feet and make a dash for the "
				+ "cover of the trees—but with thirty yards left to run, you see the Kraan circling above "
				+ "for another dive.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 188.","188",true));
}

public int Kapitel_85 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The path is wide and leads straight into thick undergrowth. The trees are tall "
				+ "here and unusually quiet. You walk for over a mile when suddenly you hear the beating of "
				+ "large wings directly above you. Looking up, you are shocked to see the sinister black outline "
				+ "of a Kraan diving to attack you.\r\n",
		Option.CharakterZeigen(),
		new Option("If you draw your weapon and prepare to fight, turn to 229.\r\n","229",true),
		new Option("If you evade the attack by running south, deeper into the forest, turn to 99.","99",true));
}

public int Kapitel_86 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You soon reach another crossroads.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to journey east, turn to 6.\r\n","6",true),
		new Option("If you wish to head north, turn to 35.\r\n","35",true),
		new Option("If you prefer to go south, turn to 167.\r\n","167",true),
		new Option("Or if you wish to turn west, turn to 42.","42",true));
}

public int Kapitel_87 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Focusing your powers on the lock, you try to visualize the inner mechanism. "
				+ "Gradually its image appears in your mind’s eye. It is old and corroded but it still "
				+ "functions. You are in danger of losing your concentration when a subtle click confirms "
				+ "that your effort has not been in vain.\r\n"
				+ "\r\n"
				+ "The pin is an easier task. Slowly it rises out of the lock and falls to the floor. "
				+ "The granite door swings towards you on hidden hinges and the grey half-light of the "
				+ "Graveyard floods into the tomb. The exit is overgrown with graveweed and you suffer "
				+ "many small cuts to your face and hands as you fight your way through to the surface. "
				+ "You are startled by a sudden noise. You turn to see the disembodied head of a corpse "
				+ "laughing at you.\r\n"
				+ "\r\n"
				+ "In blind panic, you race through the eerie necropolis towards the southern gate.\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 61.","61",true));
}

public int Kapitel_88 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You cautiously peer around the rock to see a soldier lying on his back. By his side "
				+ "is a Spear and shield. On the shield is the painting of a white pegasus—the Prince of "
				+ "Sommerlund’s emblem. He is one of the Prince’s soldiers, and he is only just conscious. "
				+ "His uniform is badly torn, and you can see that he has a deep wound in his left arm. "
				+ "As you move nearer, his eyes flicker open. ‘Heal me, my lord,’ he begs. ‘I can barely "
				+ "feel my arm.’\r\n",
		Option.CharakterZeigen(),
		new Option("If you possess and wish to use the Kai Discipline of Healing on this man, turn to 216.\r\n","216",true),
		new Option("If you do not possess the skill, or if you do not want to use it, then turn to 31.","31",true));
}

public int Kapitel_89 ()
{
System.out.println("In a cloud of dust and loose rocks you career down the steep hillside. The Kraan is still "
		+ "circling above as if waiting to direct the Giaks after you.\r\n"
		+ "\r\n"
		+ "Pick a number from the Random Number Table.\r\n");
int speicher =zufalzahl.nextInt(10);
if (speicher<=1) {
	System.out.println("If you have picked 0–1, turn to 53.\r\n");
	spiele.warte_auf_eingabe();
	return 53;
}
else if (speicher<=4) {
	System.out.println("If it is 2–4, turn to 274.\r\n");
	spiele.warte_auf_eingabe();
	return 274;
}
else {
	System.out.println("If it is 5–9, turn to 316.");
	spiele.warte_auf_eingabe();
	return 316;
}
}

public int Kapitel_90 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Night falls and you are soon engulfed in total darkness. To press on would be useless, "
				+ "for you would be sure to lose your way. Tethering your horse to a tree, you pull your green "
				+ "Kai cloak about you and fall into a restless sleep.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 18.","18",true));
}

public int Kapitel_91 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The small shop is dark and musty. Books and bottles of every size and colour fill "
				+ "the many shelves. As you close the door, a small black dog begins to yap at you. A bald "
				+ "man appears from behind a large screen and bids you welcome. He politely enquires as to "
				+ "the nature of your visit and offers you a choice of his wares from the glass counter.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you have the Kai Discipline of Sixth Sense, turn to 198.\r\n","198",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Sixth Sense")),
		new Option("If you wish to look at his wares, turn to 152.\r\n","152",true),
		new Option("If you would rather decline his offer and return to the street, turn to 7.","7",true));
}

public int Kapitel_92 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You dive for cover not a moment too soon, for a hail of black arrows scream out "
				+ "of the woods and bombard the area where you were standing seconds before. Pulling your "
				+ "cloak around you to blend into the dense bracken, you dash through the forest and away "
				+ "from the hidden ambushers as fast as possible. This entire area is infested by Giaks and "
				+ "you must escape as quickly as you can. You run without rest for over an hour until you "
				+ "happen to fall upon a straight forest path heading towards the east. You follow the path, "
				+ "taking care to keep watch for signs of the enemy.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 13.","13",true));
}

public int Kapitel_93 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You turn and run for the stairs just as a large block falls with a crash behind you. "
				+ "The room you were in has been completely sealed off. As you escape into the daylight, "
				+ "you glimpse behind you the crooked figure of an old druid as he raises his staff. "
				+ "A second later, a bolt of lightning explodes at your feet. You do not stop but run "
				+ "headlong down the hill, cursing the delay but thankful for your Sixth Sense.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 106.","106",true));
}

public int Kapitel_94 ()
{
Spielefiguer.getBelt_Pouch().incrementAnzahl(12+4);
return spiele.optionauswahl(Spielefiguer,
		"The Sage, seeing that you have killed his son, turns and runs from the shop by a back door.\r\n"
				+ "\r\n"
				+ "You find 12 Gold Crowns in the robber’s purse and another 4 Gold Crowns in a wooden box "
				+ "under the counter. Carefully examining the potions and the wand you soon realize that "
				+ "they are all cheap counterfeits. In fact the entire shop is full of imitations. "
				+ "You shake your head and return to the main street.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 7.","7",true));
}

public int Kapitel_95 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You soon stumble upon a narrow forest track running from north to south.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to set off along the track towards the north, turn to 240.\r\n","240",true),
		new Option("If you wish to go south instead, turn to 5.","5",true));
}

public int Kapitel_96 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Holding your breath, you tighten your grip on your weapon and prepare to strike. "
				+ "The tension is unbearable—the Giaks are so close that the foul stench of their unwashed "
				+ "bodies fills your nostrils. You hear them curse in their strange alien tongue and then "
				+ "leave the ledge and start to scramble towards the peak. When you are sure they have gone, "
				+ "you finally exhale and wipe the sweat from your eyes.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to explore the cave further, turn to 33.\r\n","33",true),
		new Option("If you wish to leave the cave and descend the hill in case the Giaks return, turn to 248.","248",true));
}

public int Kapitel_97 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Ahead of you, you can see a fierce battle raging across a stone bridge. The clash of "
				+ "steel and the cries of men and beasts echo through the forest. In the midst of the fighting, "
				+ "you see Prince Pelathar, the King’s son. He is in combat with a large grey Gourgaz who is "
				+ "wielding a black axe above his scaly head. Suddenly, the Prince falls wounded—a black arrow "
				+ "in his side.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to defend the fallen Prince, turn to 255.\r\n","255",true),
		new Option("If you wish to run into the forest, turn to 306.","306",true));
}

public int Kapitel_98 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The guards seem to believe your story and bow with respect to your rank of Kai Lord. "
				+ "One of them pulls a concealed bell-rope and the huge doors start to swing open. They usher "
				+ "you inside and you hear the doors close behind you.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 139.","139",true));
}

public int Kapitel_99 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You dive into the undergrowth just as the beast screams past your head. You quickly "
				+ "look back to see the Kraan turning in the air in preparation for another dive. You scramble "
				+ "to your feet and run deeper into the safety of the forest.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 222.","222",true));
}

public int Kapitel_100 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The cold corridor suddenly makes an abrupt turning towards the east. You notice a greenish "
				+ "glow that lights the tunnel in the far distance. As you creep nearer you can see that the corridor "
				+ "opens out into a larger chamber.\r\n"
				+ "\r\n"
				+ "The strange light seems to emanate from a large bowl resting upon the top of a granite throne. "
				+ "On a plinth in front of the throne stands a statue. It looks like a winged serpent curved in the "
				+ "shape of an ‘S’.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to sit on the throne, turn to 161.\r\n","161",true),
		new Option("If you wish to examine the statue, turn to 133.\r\n","133",true),
		new Option("If you wish to look for an exit from this chamber, turn to 257.","257",true));
}

public int Kapitel_101 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The noise of battle soon fades behind you but the ensuing silence is broken by a voice in "
				+ "your head that accuses you of being a coward, and deserting a fellow human in danger. "
				+ "You try to rid yourself of your nagging conscience by telling yourself that your mission "
				+ "is far more important, and that not only is the life of the young magician in peril but the "
				+ "lives of all your countrymen depend on you reaching the capital alive.\r\n"
				+ "\r\n"
				+ "Suddenly, the sight of a Giak war party in the distance makes you quickly take cover and hide. "
				+ "But it is too late—they have spotted you and you must run as fast as you can.\r\n"
				+ "\r\n"
				+ "Turn to 281.",
		Option.CharakterZeigen(),
		new Option("Turn to 281.","281",true));
}

public int Kapitel_102 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"As you descend the rocky slope towards the Graveyard of the Ancients, you are aware of a "
				+ "strange mist and cloud that swirls all around this grey and forbidding place, blocking the "
				+ "sun and covering the Graveyard in a perpetual gloom. A chill creeps forward to greet your "
				+ "approach.\r\n"
				+ "\r\n"
				+ "With a feeling of deep dread, you enter the eerie necropolis.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 284.","284",true));
}

public int Kapitel_103 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The overgrown path leads to a junction where another track branches off "
				+ "towards the east.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to take this path, turn to 13.\r\n","13",true),
		new Option("If you would rather continue towards the northeast, turn to 287.","287",true));
}

public int Kapitel_104 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The walls are dank and slimy. The stale air chokes you and cobwebs brush across your face. "
				+ "You can feel panic grip your stomach, as the tunnel gets darker and darker.\r\n"
				+ "\r\n"
				+ "You reach a junction where the tunnel meets a corridor leading from north to south.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to turn north, go to 26.\r\n","26",true),
		new Option("If you wish to go south, turn to 100.","100",true));
}

public int Kapitel_105 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"In the distance, perched on the branch of an old oak tree is a jet-black raven.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you have the Kai Discipline of Animal Kinship, you may call "
				+ "to this bird by turning to 298.\r\n","298",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Animal Kinship")),
		new Option("If you do not possess Animal Kinship, or if you do not wish to use it, turn to 335.","335",true));
}

public int Kapitel_106 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Eventually you come to the edge of a fast-flowing icy stream. The white water cascades over "
				+ "the mossy rocks and disappears towards the east.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to follow the stream to the east, turn to 263.\r\n","263",true),
		new Option("If you would rather explore upstream, turn to 334.","334",true));
}

public int Kapitel_107 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Running across the room, you lash out at the skulls, smashing them to fragments. You "
				+ "notice that inside each skull is a bubbling grey jelly that seems to writhe and change its "
				+ "shape, sprouting bat-like wings and suckers from its glistening form. In horror and loathing, "
				+ "you race for the exit corridor and escape just as a heavy portcullis falls with a crash, "
				+ "completely sealing off the chamber.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 23.","23",true));
}

public int Kapitel_108 ()
{
System.out.println("You fly in an arc through the air towards the opposite roof. Everything seems to "
		+ "be happening in slow motion. You see the teeming crowds below in the street, and a nest "
		+ "of callysparrows in the eaves of a roof to your right. You hear their startled cries as "
		+ "you land with a crash on the other side. But it is the last sound that you will ever hear. "
		+ "The tiles splinter and collapse and you fall through the four floors of the ‘Green Slipper Inn’ "
		+ "breaking your back in several places.\r\n"
		+ "\r\n"
		+ "Your mission and your life end here.");
spiele.warte_auf_eingabe();
return 284;
}

public int Kapitel_109 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The only thing under the carpet is dirt!\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("You may take a closer look at the bottles by turning to 164.\r\n","164",true),
		new Option("Or you can leave the room and investigate the stable by turning to 308.","308",true));
}

public int Kapitel_110 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You quickly take aim and hurl the rock at the Giak’s head as hard as you "
				+ "can, but to your horror the creature ducks and the rock arcs harmlessly over its back. "
				+ "You must act immediately to save the wizard.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 55.","55",true));
}

public int Kapitel_111 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Only a few minutes after leaving the junction, you see in the distance a "
				+ "small log cabin and stable. On arrival you check the interior through a side window. "
				+ "The cabin looks deserted.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to enter the cabin, turn to 57.\r\n","57",true),
		new Option("If you wish to search the stable, turn to 308.","308",true));
}

public int Kapitel_112 ()
{
System.out.println("Suddenly, the large rock you are hiding behind is rolled aside and you are faced by "
		+ "two snarling Giaks intent on your death. The cave mouth is a narrow entrance and you can "
		+ "only fight the Giaks one at a time.\r\n"
		+ "\r\n"
		+ "Giak 1: COMBAT SKILL 13   ENDURANCE 10\r\n"
		+ "\r\n"
		+ "Giak 2: COMBAT SKILL 12   ENDURANCE 10\r\n"
		+ "\r\n");
if (combatRules.Combat(Spielefiguer,new Enemy("Giak 1", 13, 10), 0)==combatResult.Lost) {
	return 350;
}
if (combatRules.Combat(Spielefiguer,new Enemy("Giak 1", 13, 10), 0)==combatResult.Win) {
	System.out.println("If you win, you may explore the cave further by turning to 33.\r\n");
	System.out.println("Or you may leave and descend the hill. Turn to 248.");
	return spiele.EingabeInt(33,248);
}
return 351;
}

public int Kapitel_113 ()
{return spiele.optionauswahl(Spielefiguer,
		"You have been walking for over half an hour when your eye is caught by some bright "
				+ "red flowers growing near to a mossy bank. You recognize the plants to be Laumspur, a "
				+ "rare and beautiful herb much prized for its healing properties.\r\n"
				+ "\r\n"
				+ "Kneeling down, you pick a handful of Laumspur and place it in your Backpack. You "
				+ "may eat this herb to regain lost ENDURANCE points. Each Meal of Laumspur will restore "
				+ "3 ENDURANCE points, and you have gathered enough for two such Meals.1 Closing your pack, "
				+ "you continue your mission.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to head northeast, turn to 347.\r\n","347",true),
		new Option("If you wish to head east, turn to 295.","295",true));
}

public int Kapitel_114 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You coax the horse to lie down and begin to cover him and yourself "
				+ "with branches and dead leaves. You hear the wings of the Kraan as it passes over the "
				+ "trees. It returns and circles above you, but soon retreats back across the lake.\r\n"
				+ "\r\n"
				+ "You decide to leave now, in case it returns with some of its friends.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 239.","239",true));
}

public int Kapitel_115 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You stumble into the first building and fall to the floor exhausted. You can "
				+ "smell cooked meat. You notice a small cauldron hanging over the embers of a dying "
				+ "fire, and a large oak table that has been set for a meal. Whoever lived here must "
				+ "have left in a great hurry this very morning. There is water in a jug and a loaf of "
				+ "fresh bread on the table.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you decide to take a quick Meal, turn to 150.\r\n","150",true),
		new Option("If you decide to search the building, turn to 177.\r\n","177",true),
		new Option("If you would rather leave now and continue your run, turn to 83.","83",true));
}

public int Kapitel_116 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"As you climb out of the muddy water, black arrows fall all around you. "
				+ "Quickly, you dash for the cover of the trees and wait for the Giaks to leave "
				+ "the opposite bank, before continuing on foot towards the capital.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 321.","321",true));
}

public int Kapitel_117 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The man is badly injured and near to death. "
				+ "If you have the Kai Discipline of Healing, you may ease the pain of his wounds "
				+ "but he has been so seriously hurt he is beyond repair by your skills alone. "
				+ "He soon lapses into unconsciousness. You try to make him as comfortable as "
				+ "possible beneath a large forest oak, before leaving and pressing on through "
				+ "the thick woodland towards the northeast.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 330.","330",true));
}

public int Kapitel_118 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You spur your horse to a gallop and race down the long straight path. "
				+ "In the far distance you can just make out the silhouette of Holmgard on the horizon, "
				+ "its high walls and tall spires glinting in the morning sun. Your path joins a highway "
				+ "running from north to south. It is the main turnpike road between the northern port of Toran "
				+ "and the capital. You set off towards Holmgard, your eyes peeled for Kraan in the clear morning sky.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 224.","224",true));
}

public int Kapitel_119 ()
{
	Spielefiguer.decresENDURANCE(2);
	return spiele.optionauswahl(Spielefiguer,
		"The gallowbrush tears your cloak and scratches deep into your arms and legs as you "
				+ "slowly force your way through. Fifteen minutes later you emerge from the briars and "
				+ "stagger onwards between the trees.\r\n"
				+ "\r\n"
				+ "Deduct 2 ENDURANCE points from your current score for the wounds you have sustained.\r\n"
				+ "\r\n"
				+ "You feel a little dizzy as you push on, and your eyelids seem very heavy. You suddenly "
				+ "find yourself at the edge of a steep wooded slope.\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to slide down the slope as carefully as you can, turn to 226.\r\n","226",true),
		new Option("If you do not feel that you are up to the risk of this tricky descent in your "
				+ "present sleepy state, walk around the edge of the ridge by turning to 38.","38",true));
}

public int Kapitel_120 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Behind you can hear the blood-crazy Giaks killing the caravan horses. "
				+ "You risk a quick glance over your shoulder and see a Kraan start to climb "
				+ "high into the air. Will it attack you or is it interested in something else? "
				+ "The dark shadow that is gradually getting larger all around you tells you that "
				+ "you are its intended victim. The Kraan is diving full speed at you!\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wait until it is about to strike and then jump from the saddle, turn to 84.\r\n","84",true),
		new Option("If you head as fast as you can for the trees, turn to 171.\r\n","171",true),
		new Option("If you put your head down, pray to the heavens for good luck and gallop on "
				+ "regardless, turn to 54.","54",true));
}

public int Kapitel_121 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"After a few minutes walking you see a stranger, clad in red, standing in the "
				+ "centre of the track ahead. He has his back towards you, and his head is covered by the "
				+ "hood of his robes. Perched on his outstretched arm is the black raven that you saw earlier.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to call the stranger, turn to 342.\r\n","342",true),
		new Option("If you wish to approach the stranger cautiously, turn to 309.\r\n","309",true),
		new Option("If you would rather draw your weapon and attack, turn to 283.","283",true));
}

public int Kapitel_122 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Immediately the horse senses your communication. He calms down. "
				+ "You walk towards the beautiful animal and stroke his head reassuringly. "
				+ "You sense that he is frightened and confused. Mounting him, you lead him off "
				+ "to the path and head south once again.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 206.","206",true));
}

public int Kapitel_123 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"As the creature dies, its body slowly dissolves into a vile green liquid. "
				+ "You notice that all of the grass and the plants beneath the smoking fluid are "
				+ "beginning to shrivel and die. A large valuable looking Gem lies on the ground "
				+ "near to the decaying body.\r\n"
				+ "\r\n"
				+ "Further along the track you can see a large war party of Giaks running towards you.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to take the Gem, turn to 304.\r\n","304",true),
		new Option("If you would rather leave it and run, turn to 2.","2",true));
}

public int Kapitel_124 ()
{
System.out.println("Inside the box you find 15 Gold Crowns and a Silver Key. "
		+ "If you wish to keep the key, ");
if (spiele.bestädigen_Entscheidung())
	Spielefiguer.getSpecialItems().add(new Equipment("Silver Key", 1,null));

return spiele.optionauswahl(Spielefiguer,
		"Inside the box you find 15 Gold Crowns and a Silver Key. "
				+ "If you wish to keep the key, ",
		Option.CharakterZeigen(),
		new Option("You can continue to investigate the tunnel by turning to 211.\r\n","211",true),
		new Option("Or you may leave and descend the hill by turning to 106.","106",true));
}

public int Kapitel_125 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The path opens out into a large clearing. You notice strange claw prints in the "
				+ "earth. Kraan have landed here. By the number of prints and by the size of the area "
				+ "disturbed, you judge that at least five of the foul creatures landed here in the last "
				+ "twelve hours.\r\n"
				+ "\r\n"
				+ "You see two exits on the far side of the clearing. One leads west, the other south.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you have the Kai Discipline of Tracking, turn to 301.\r\n","301",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Tracking")),
		new Option("If you wish to take the south path, turn to 27.\r\n","27",true),
		new Option("If you wish to take the west path, turn to 214.","214",true));
}

public int Kapitel_126 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You ride deeper and deeper into the forest. Silently you thank the "
				+ "Prince for such a fine horse, for although the ground is a tangle of briars "
				+ "and roots, he never once falters. The Doomwolves are soon left far behind and "
				+ "you bring your horse to a halt. The light has faded fast and it is almost night.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to press on ahead, turn to 46.\r\n","46",true),
		new Option("If you wish to bear left (the same direction as the path you left "
				+ "far behind) then turn to 143.","143",true));
}

public int Kapitel_127 ()
{
System.out.println("After an hour of marching, the Drakkarim suddenly halt as a large, grey scaly "
		+ "creature approaches along the track. As the beast draws closer, you can smell its "
		+ "fetid breath on your face. It lets out a roar and grabs your head in its powerful "
		+ "webbed hands. The last thing you hear is the sharp crack of your spine snapping.\r\n"
		+ "\r\n"
		+ "Your quest ends here.");
return 351;
}

public int Kapitel_128 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Carefully parting the dense foliage, you are horrified by the sight that meets you. "
				+ "In a small clearing ahead, three Giaks have tied a man to a wooden stake and are setting "
				+ "fire to a mass of brushwood bundled at his feet. You recognize his tunic as that of a "
				+ "Border Ranger, one of the King’s men who police the kingdom near the Durncrag Mountains "
				+ "of the west. He has been badly beaten and is nearly unconscious.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you have the Kai Discipline of Hunting, turn to 297.\r\n","297",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Hunting")),
		new Option("If you do not, you must attack the Giaks now in order to save the ranger’s life. Turn to 336.","336",true));
}

public int Kapitel_129 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You reach the main gates of the capital, and stare in awe at the height of the city’s "
				+ "walls. Two hundred feet high, the walls of Holmgard have withstood the ravages of both "
				+ "time and the Darklords. You and the officer race through the tunnel of the inner "
				+ "gatehouse, one hundred yards in length, and finally halt outside the doorway of "
				+ "the main watchtower. Great crowds of soldiers and civilians are running to and fro.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to continue following the officer, turn to 3.\r\n","3",true),
		new Option("If you feel that you stand a better chance of making your way to the King’s citadel on "
				+ "your own, turn to 144.","144",true));
}

public int Kapitel_130 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You soon reach a small clearing in the woods. A bench, carved from a fallen "
				+ "tree is set in the centre of the clearing. You are hungry and must now eat a Meal here.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("When you have finished, if you decide to leave the clearing by the south way, turn to 28.\r\n","28",true),
		new Option("Or if you prefer the smaller track that leads eastwards into the forest, turn to 201.","201",true));
}

public int Kapitel_131 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You have covered about a quarter of a mile when you hear shouting and a noise like "
				+ "thunderclaps ahead. Edging nearer, you soon make out a clearing that you recognize to be "
				+ "the site of the ruins of Raumas, an ancient forest temple.\r\n"
				+ "\r\n"
				+ "A war party of Giaks, some twenty-five to thirty strong, are attacking the ruins from "
				+ "all sides. Many more of the Giaks are dead or dying among the broken pillars of marble, "
				+ "but still they assault whatever is hidden inside. Suddenly, a bolt of blue lightning rips "
				+ "through the front rank of Giaks sending the armour-clad creatures tumbling in all directions. "
				+ "A Giak, taller than the others and dressed from head to foot in black chainmail, curses at his "
				+ "troops as he whips them forward with a barbed flail.\r\n"
				+ "\r\n"
				+ "With weapon ready, you move to the edge of the clearing, under cover of the thick foliage, "
				+ "and try to catch a glimpse of the defenders. To your amazement, the ruins are being defended "
				+ "by a young man no older than yourself. You recognize his sky-blue robes, embroidered with stars. "
				+ "He is a young theurgist of the Magicians’ Guild of Toran: an apprentice in magic.\r\n"
				+ "\r\n"
				+ "Five Giaks charge forward, their spears raised to stab the apprentice as he hurriedly retreats "
				+ "deeper into the ruins. You see him turn and raise his left hand just before a bolt of blue "
				+ "flame shoots from his fingertips into the snarling Giak soldiers. Close to where you are "
				+ "hidden, you see a Giak scuttle past and climb one of the pillars of the temple. He has a "
				+ "long curved dagger in his mouth and he is about to jump on the young wizard standing below.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to shout a warning to the wizard, turn to 241.\r\n","241",true),
		new Option("If you wish to run forward and attack the Giak when he jumps, turn to 55.\r\n","55",true),
		new Option("If you wish to pick up a chunk of temple marble and throw it at the Giak’s head, turn to 302.\r\n","302",true),
		new Option("Or if you would rather turn and leave the battle area and run back into the woods, turn to 101.","101",true));
}

public int Kapitel_132 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The bodyguard looks at you with great suspicion and slams the door. You "
				+ "can hear voices chattering inside the caravan. Suddenly the door swings open "
				+ "and the face of a wealthy merchant appears. He recognizes your Kai cloak and "
				+ "apologizes for his servant’s behaviour.\r\n"
				+ "\r\n"
				+ "He says that they have been attacked several times since they left Toran: "
				+ "by Kraan, by bandits, and by robbers. They thought you may have been a bandit. "
				+ "Inside, the caravan is full of silks and spices. The merchant offers you food which "
				+ "you gratefully accept. After your sumptuous meal, the fatigue of your ordeal finally "
				+ "overcomes you and you slip into a deep sleep.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 64.","64",true));
}

public int Kapitel_133 ()
{
	System.out.println("As you approach the statue, several cracks appear in its stone surface. "
		+ "It suddenly explodes before you as a real Winged Serpent breaks free of its "
		+ "stone mantle and attacks you.\r\n"
		+ "\r\n"
		+ "You must fight the creature.\r\n"
		+ "\r\n"
		+ "Winged Serpent: COMBAT SKILL 16   ENDURANCE 18\r\n"
		+ "\r\n"
		+ "(This creature is immune to Mindblast.)\r\n"
		+ "\r\n"
		+ "If you win the fight, turn to 266.");
if (combatRules.Combat(Spielefiguer,new Enemy("Winged Serpent", 16, 18, true, false), 0)==combatResult.Win) {
	return 266;
}
return 351;

}

public int Kapitel_134 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Using your skills, you detect Giak tracks around the perimeter of the clearing. "
				+ "The prints are fresh and you can tell that these cruel minions of the Darklords were "
				+ "in this area less than two hours ago.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Forewarned by this knowledge, if you decide to investigate the huts, turn to 305.\r\n","305",true),
		new Option("If you would rather avoid the clearing, turn to 40.","40",true));
}

public int Kapitel_135 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Peering over the steep undercut of the river bank, you can see a tangle of "
				+ "driftwood along the water’s edge. A large tree trunk has grounded on the clay "
				+ "bank next to a small canoe.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to use the log to float down the river, turn to 223.\r\n","223",true),
		new Option("If you wish to use the canoe, turn to 4.","4",true));
}

public int Kapitel_136 ()
{
	System.out.println("The Giaks get nearer and then crouch down as if preparing themselves to "
		+ "pounce. You can see the sharp serrated points of their spears and hear their "
		+ "low guttural speech. The larger of the two creatures screams, ‘Orgadak taag! "
		+ "Nogjat aga ok!’ and attacks you.\r\n"
		+ "\r\n"
		+ "You must fight each of the Giaks in turn. Add 1 point to your COMBAT SKILL "
		+ "during this fight, as you have the advantage of the higher ground in your favour.\r\n"
		+ "\r\n"
		+ "Giak 1: COMBAT SKILL 13   ENDURANCE 10\r\n"
		+ "\r\n"
		+ "Giak 2: COMBAT SKILL 12   ENDURANCE 10\r\n"
		+ "\r\n"
		+ "If you win, turn to 313.");
	if (combatRules.Combat(Spielefiguer,new Enemy("Giak 1", 13, 10), 0)==combatResult.Lost) {
	return 351;
	}
	if (combatRules.Combat(Spielefiguer,new Enemy("Giak 2", 12, 10), 0)==combatResult.Win) {
	return 313;
	}
	return 351;

}

public int Kapitel_137 ()
{
Spielefiguer.getBackpackItems().add(new Equipment("Tomb Guardian Gems", 20, null));
return spiele.optionauswahl(Spielefiguer,
		"As the last of the foul creatures die, so the greenish light starts to "
				+ "fade. You notice that in each of the broken skulls lies a Gem. You take "
				+ "these 20 Tomb Guardian Gems before darkness engulfs the chamber. "
				+ "Remember to mark these on your Action Chart as a single Backpack Item.\r\n"
				+ "\r\n"
				+ "You quickly leave the dead Crypt spawn and press on.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 23.","23",true));
}

public int Kapitel_138 ()
{
System.out.println("You prepare your weapon and advance to meet the enemy. There are two "
		+ "Mountain Giaks and you must fight them one at a time.\r\n"
		+ "\r\n"
		+ "Giak 1: COMBAT SKILL 13   ENDURANCE 10\r\n"
		+ "\r\n"
		+ "Giak 2: COMBAT SKILL 12   ENDURANCE 10\r\n"
		+ "\r\n"
		+ "If you win, turn to 291.");
	if (combatRules.Combat(Spielefiguer,new Enemy("Giak 1", 13, 10), 0)==combatResult.Lost) {
	return 351;
	}
	if (combatRules.Combat(Spielefiguer,new Enemy("Giak 2", 12, 10), 0)==combatResult.Win) {
	return 291;
	}
	return 351;

}

public int Kapitel_139 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The inner courtyard is a bustle of activity. Cavalry scouts are waiting "
				+ "beside their nervous horses for messages from their unit commanders inside "
				+ "the Great Hall. They take orders with great speed to the defenders of the "
				+ "outer fieldworks. No sooner do they gallop off, than other scouts return, "
				+ "many of them breathless and wounded.\r\n"
				+ "\r\n"
				+ "You have taken less than a dozen steps across the courtyard when you hear "
				+ "a deep voice boom out. ‘Stop that man!’\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 66.","66",true));
}

public int Kapitel_140 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You are in a clearing where several trees have been cut down to make a rickety "
				+ "watchtower. Below the tower are three paths leading off in different directions.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you take the south path, turn to 14.\r\n","14",true),
		new Option("If you take the east path, turn to 252.\r\n","252",true),
		new Option("If you take the southwest path, turn to 215.\r\n","215",true),
		new Option("If you decide to climb the watchtower, turn to 36.","36",true));
}

public int Kapitel_141 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Your Sixth Sense has warned you that some of the creatures "
				+ "that attacked the monastery are searching the two paths for any "
				+ "survivors of their raid, but you can avoid both tracks by making "
				+ "your way through the undergrowth of the woods.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to head south, turn to 56.\r\n","56",true),
		new Option("Or if you wish to cut through the heavier foliage towards the northeast, turn to 333.","333",true));
}

public int Kapitel_142 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You can see the tall grey-white walls and glimmering spires of "
				+ "Holmgard, its banners fluttering from the battlements in the fresh "
				+ "morning breeze. Stretching out towards the west, the River Eledil "
				+ "traces its course from the mountains of the Durncrag Range to the "
				+ "Holmgulf. But from below the mountain peaks you can see a vast black "
				+ "army marching relentlessly on towards the city.\r\n"
				+ "\r\n"
				+ "To your right you can see the highway heading off over the rolling "
				+ "plain towards Holmgard. At a run you could reach the outer fieldworks "
				+ "of the city defences in an hour, but you would be in the open for most "
				+ "of the time and vulnerable to attack by Kraan. However, ahead of you, a "
				+ "wide and muddy river drifts sluggishly towards the Eledil. You could "
				+ "use the cover of the river banks and swim towards the capital. Or "
				+ "towards your left lies the Graveyard of the Ancients. These tombs "
				+ "and crumbling monuments to a forgotten age would conceal your "
				+ "approach, but it is a forbidden area. Many are the unnamed horrors "
				+ "that lie there in restless sleep, waiting to consume the unwary trespasser.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you will try your luck by the highway, turn to 58.\r\n","58",true),
		new Option("If you feel that you stand a better chance of reaching the capital via "
				+ "the river, then turn to 135.\r\n","135",true),
		new Option("Or if you are brave enough to risk the unknown perils of the Graveyard "
				+ "of the Ancients, turn to 102.","102",true));
}

public int Kapitel_143 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You soon emerge from the woods onto a main highway. "
				+ "You recognize it as being the main road between the port of "
				+ "Toran in the north and the capital in the south. Spurring your "
				+ "horse on, you estimate you will reach the capital by morning.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 149.","149",true));
}

public int Kapitel_144 ()
{
Spielefiguer.decresENDURANCE(2);
return spiele.optionauswahl(Spielefiguer,
		"You fight your way through the press of bodies "
				+ "along the main street towards the citadel in the distance. "
				+ "City folk are rushing to and fro in the grip of panic, as the "
				+ "cries of Kraan are heard circling high above.\r\n"
				+ "\r\n"
				+ "In the crush, one item is stolen from your Backpack. If you no "
				+ "longer have a Backpack or if you have no Backpack Items, you lose "
				+ "a Weapon. Remember to take this off your Action Chart.\r\n"
				+ "\r\n"
				+ "A runaway horse and cart career past and knock you into a doorway. "
				+ "You are stunned and you lose 2 ENDURANCE points. As you stagger to your "
				+ "feet, the door bursts open and a decrepit old man attacks you with a "
				+ "meat cleaver. He is quite insane and you must fight him or take "
				+ "evasive action.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you choose to fight, turn to 63.\r\n","63",true),
		new Option("If you wish to evade a fight, turn to 217.","217",true));
}

public int Kapitel_145 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You feel as if you have been run down by a cart or wagon. "
				+ "As you fall forward the last thing that you remember before the "
				+ "darkness overcomes you, is the taste of the sandy road and "
				+ "the terrible pain in your back.\r\n"
				+ "\r\n"
				+ "Turn to 165.",
		Option.CharakterZeigen(),
		new Option("Turn to 165.","165",true));
}

public int Kapitel_146 ()
{
	Spielefiguer.decresENDURANCE(3);
	return spiele.optionauswahl(Spielefiguer,
		"You have ridden about a mile when you are knocked from your "
				+ "horse by an arrow grazing your forehead. You lose 3 ENDURANCE points.\r\n"
				+ "\r\n"
				+ "As you pull yourself to your feet, you see a patrol of "
				+ "rakkarim emerge from the woods on either side of the road. "
				+ "You have been ambushed and must evade them as quickly as possible "
				+ "by going into the forest.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 154.","154",true));
}

public int Kapitel_147 ()
{
	Spielefiguer.decresENDURANCE(3);
	return spiele.optionauswahl(Spielefiguer,
		"After a few minutes walking, you find a mossy hut "
				+ "set back from the path. You are hungry and must eat a "
				+ "Meal here or lose 3 ENDURANCE points. As you eat you "
				+ "notice that the path starts to curve towards the east. 2\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to follow it, turn to 42.\r\n","42",true),
		new Option("If you wish to return the way you have come, turn to 28.","28",true));
}

public int Kapitel_148 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The noise of battle soon fades behind you but the ensuing silence is broken by a voice in "
				+ "your head that accuses you of being a coward, and deserting a fellow human in danger. "
				+ "You try to rid yourself of your nagging conscience by telling yourself that your mission "
				+ "is far more important, and that not only is the life of the young magician in peril but the "
				+ "lives of all your countrymen depend on you reaching the capital alive.\r\n"
				+ "\r\n"
				+ "Suddenly, the sight of a Giak war party in the distance makes you quickly take cover "
				+ "and hide. "
				+ "But it is too late—they have spotted you and you must run as fast as you can.\r\n"
				+ "\r\n"
				+ "Turn to 281.",
		Option.CharakterZeigen(),
		new Option("If you want to stay in the farmhouse, turn to 81.\r\n","81",true),
		new Option("If you would feel safer in the forest, you can make a dash by turning to 320.\r\n","320",true),
		new Option("If you wish to search the room further, turn to 199.","199",true));
}

public int Kapitel_149 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"As you ride along the highway, you notice that light is "
				+ "getting worse. It will soon be completely dark—and impossible "
				+ "to see any dangers that may lurk ahead. You decide to hide and "
				+ "rest at the wood’s edge until morning.\r\n"
				+ "\r\n"
				+ "When you are satisfied that no one can see you, you pull your "
				+ "warm green cloak about you and drift off into an uneasy sleep.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 256.","256",true));
}

public int Kapitel_150 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Although a little overcooked, the food tastes fine "
				+ "(although it is not enough for a whole Meal) and the clear "
				+ "water slakes your thirst. You have spent nearly half an hour "
				+ "resting in this house when you suddenly realize the delay.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Prepare your equipment and leave. Turn to 83.","83",true));
}

public int Kapitel_151 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"If you concentrate on the keyhole, you could move the mechanism "
				+ "of the lock and open it. You can then make the pin levitate and free "
				+ "it from the lockplate, avoiding falling prey to any traps that may be "
				+ "set off as the door unlocks.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to use your Kai Discipline of Mind Over Matter to open "
				+ "this lock and levitate the pin, turn to 87.\r\n","87",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Mind Over Matter")),
		new Option("If you wish to remove the pin, turn to 337.","337",true));
}

public int Kapitel_152 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The herbalist offers you a selection of special potions. "
				+ "Some increase your strength; some induce invisibility; some give "
				+ "you great powers of stealth; and others give you the power of "
				+ "turning yourself into a gaseous form. The man pulls open the "
				+ "bottom drawer of the counter to reveal a magnificent wand. "
				+ "He says that it is a powerful weapon against all evil creatures, "
				+ "and that it will make you invulnerable in battle. He points to the "
				+ "mystical inscriptions which cover the black staff.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to lean over the counter and read the strange inscriptions, turn to 49.\r\n","49",true),
		new Option("If you are more interested in the potions, turn to 231.","231",true));
}

public int Kapitel_153 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Before you are the tall grey-white walls and glimmering spires "
				+ "of Holmgard, the city’s banners fluttering from the battlements "
				+ "in the fresh morning breeze. Stretching out towards the west, "
				+ "the River Eledil traces its course from the mountains of the "
				+ "Durncrag Range to the Holmgulf. But below the mountain peaks you "
				+ "can see a vast black army marching relentlessly on towards the capital.\r\n"
				+ "\r\n"
				+ "To your right you can see the highway heading off over the rolling "
				+ "plain towards Holmgard. At a gallop you could make the outer fieldworks "
				+ "of the city’s defences in less than an hour, but you would be in the open "
				+ "for most of the time and vulnerable to attack by Kraan. Directly ahead of "
				+ "you, a wide river drifts sluggishly towards the Eledil. If you abandoned your "
				+ "horse, you could swim towards the outer defences under cover of the river banks. "
				+ "Or there is a final alternative. To your left lies the Graveyard of the Ancients. "
				+ "These tombs and crumbling monuments to a forgotten age would conceal your approach "
				+ "but it is a forbidden area. Many are the unnamed horrors that lie there in restless "
				+ "sleep, waiting to consume the unwary trespasser.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you will try your luck by the highway, turn to 202.\r\n","202",true),
		new Option("If you feel that you stand a better chance of reaching the capital via the "
				+ "river then turn to 135.\r\n","135",true),
		new Option("Or if you are brave enough to risk the unknown perils of the Graveyard of "
				+ "the Ancients, turn to 329.","329",true));
}

public int Kapitel_154 ()
{
	System.out.println("You are dizzy from your wound and you stumble through the trees like a blind man.\r\n"
		+ "\r\n"
		+ "Suddenly you fall forward as if the ground has been snatched from "
		+ "beneath your feet. You have fallen head-first into a hunting pit. "
		+ "As you look up, you can see four Drakkarim levelling their bows at "
		+ "you, evil sneers spreading simultaneously across their ugly faces.\r\n"
		+ "\r\n"
		+ "As the world darkens, the last thing you feel is the black shafts "
		+ "of their arrows deep in your chest. You have failed in your mission.");
	spiele.warte_auf_eingabe();
	return 154;

}

public int Kapitel_155 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"As you approach, the group of people stop talking. "
				+ "You can see by their expressions that they recognize your "
				+ "green Kai cloak. Slowly, one of the men extends his hand in "
				+ "friendship and says, ‘My Lord, we had heard a rumour that the "
				+ "Kai were destroyed. Heaven be praised that it is not so. We feared all was lost.’\r\n"
				+ "\r\n"
				+ "You do not tell them of the destruction of the monastery, for "
				+ "they are refugees from Toran and have lost everything they owned. "
				+ "Their only hope now is that the Kai Lords will lead an army to victory. "
				+ "You learn that the northern port was attacked from both air and sea, and "
				+ "that the forces of the Darklords far outnumbered the King’s brave garrison. "
				+ "You reassure them that Sommerlund will not fall and wish them luck on their journey ahead.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 70.","70",true));
}

public int Kapitel_156 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Black arrows embed themselves in the mud all around you. "
				+ "More Giaks have appeared on the steep slope of the river bank and are "
				+ "firing at you. There is no cover on this side of the river.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to dive into the water and swim with the current, turn to 294.\r\n","294",true),
		new Option("If you wish to swim across to the cover of the trees on the other bank, turn to 245.","245",true));
}

public int Kapitel_157 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The forest begins to thin out until finally you can "
				+ "make out a road through the trees ahead. The highway is full of "
				+ "people heading south. Many are wheeling their possessions along on handcarts.\r\n"
				+ "\r\n"
				+ "If you wish to join the refugees and perhaps learn more of what ",
		Option.CharakterZeigen(),
		new Option("If you wish to join the refugees and perhaps learn more of what "
				+ "has happened in the north, turn to 30.\r\n","30",true),
		new Option("If you would prefer to continue to move south but under cover of the trees, turn to 167.","167",true));
}

public int Kapitel_158 ()
{
String Text = "The Key fits and the lock opens. You pull back the door to "
		+ "find yourself face to face with a strange old man. In his right hand is a "
		+ "staff. Suddenly a bolt of lightning shoots from the staff and hits you square "
		+ "in the chest. You lose 6 ENDURANCE points. Gasping with pain, you knock "
		+ "the old man aside and run up the steep staircase towards daylight. "
		+ "You are halfway up the stairs when he fires another bolt at you.\r\n"
		+ "\r\n"
		+ "Pick a number from the Random Number Table.\r\n"
		+ "\r\n"
		+ "If the number is 0–5, the bolt misses you and shatters part of the wall.\r\n"
		+ "\r\n"
		+ "If the number is 6–9, then you have been hit in the back and lose a further 4 ENDURANCE points.\r\n"
		+ "\r\n"
		+ "If you survive, you stagger out into the daylight and curse your bad luck. It was only by an unlucky chance you discovered the secret temple of a sect of evil druids. You are very lucky to have escaped with your life. You quickly rejoin the path which now disappears over the hill.\r\n"
		+ "\r\n"
		+ "Turn to 106.";
return 158;

}

public int Kapitel_159 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The noise of battle soon fades behind you but the ensuing silence is broken by a voice in "
				+ "your head that accuses you of being a coward, and deserting a fellow human in danger. "
				+ "You try to rid yourself of your nagging conscience by telling yourself that your mission "
				+ "is far more important, and that not only is the life of the young magician in peril but the "
				+ "lives of all your countrymen depend on you reaching the capital alive.\r\n"
				+ "\r\n"
				+ "Suddenly, the sight of a Giak war party in the distance makes you quickly take cover and hide. "
				+ "But it is too late—they have spotted you and you must run as fast as you can.\r\n"
				+ "\r\n"
				+ "Turn to 281.",
		Option.CharakterZeigen(),
		new Option("You must fight him by turning to 191.\r\n","191",true),
		new Option("Or you must jump clear of the speeding caravan. Turn to 234.","234",true));
}

public int Kapitel_160 ()
{
String Text = "Pick a number from the Random Number Table.\r\n"
		+ "\r\n"
		+ "If it is 0–4, you have been seen. Turn to 286.\r\n"
		+ "\r\n"
		+ "If it is 5–9, they do not spot you and they slowly file away along the far side of the ridge. Turn to 10.";
return 160;
}

public int Kapitel_161 ()
{
return spiele.optionauswahl(Spielefiguer,
		"As you sit down, the stone serpent slowly moves forward "
				+ "on its plinth. You suddenly break out in a cold sweat and grasp your "
				+ "weapon with trembling fingers in case it should attack. A red forked "
				+ "tongue appears from the head of this strange statue and dips into the "
				+ "bowl of green light above your head. Slowly the tongue re-emerges holding "
				+ "a Golden Key which, to your surprise, it drops into your lap. A panel "
				+ "in the east wall clicks open to reveal an exit.\r\n"
				+ "\r\n"
				+ "You take the Key and leave as quickly as possible.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 209.","209",true));
}

public int Kapitel_162 ()
{
return spiele.optionauswahl(Spielefiguer,
		"As you get nearer to the men, you call to them. As they turn to face "
				+ "you, your skin turns cold and your heart pounds, for they are Drakkarim "
				+ "in disguise. Suddenly they charge at you. Forced to the ground, you are "
				+ "tied up with ropes and dragged behind them along a track. They take your "
				+ "Backpack and Weapons, but do not search your cloak or find your Gold Crowns. "
				+ "They cackle menacingly to themselves, and talk at great length of the tortures "
				+ "that await you at their camp.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you have the Kai Discipline of Mind Over Matter, turn to 258.\r\n"
				+ "\r\n","258",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Mind Over Matter")),
		new Option("If you do not have this skill, turn to 127.","127",true));
}

public int Kapitel_163 ()
{
return spiele.optionauswahl(Spielefiguer,
		"After nearly half an hour you feel the current getting "
				+ "stronger. Looking out across the surface you can see that "
				+ "you are approaching a whirlpool in the middle of a large "
				+ "river bend. You will surely drown if caught in its current, "
				+ "so you quickly swim towards the right hand river bank and "
				+ "continue your mission on foot, carrying all your equipment.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 321.","321",true));
}

public int Kapitel_164 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Carefully opening the seals on each of the bottles, you "
				+ "sniff at the contents. They all seem to be different types of "
				+ "wine. Suddenly a smaller bottle tucked behind the others catches "
				+ "your eye. Pulling out the glass stopper, you recognize the smell "
				+ "to be that of Alether, a Potion of Strength, which is orange in colour.\r\n"
				+ "\r\n"
				+ "You may keep this Potion and swallow it before you fight. It will "
				+ "increase your COMBAT SKILL by 2 points for the duration of your "
				+ "fight. Be sure to mark it down on your Action Chart and to strike "
				+ "it off once you have used it.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("You now decide to investigate the stable by turning to 308.","308",true));
}

public int Kapitel_165 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You awake in a fever. Images swim before your eyes and then "
				+ "fade completely. The pain in your back is intense and you cry out "
				+ "for relief. You feel a cool, damp cloth placed on your forehead and "
				+ "glimpse the worried face of a young woman. An old man whispers in "
				+ "her ear and then he disappears from view. The girl kneels at your "
				+ "side and comforts you with words of kindness and reassurance, "
				+ "but the light quickly fades and darkness engulfs you once more.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 212.","212",true));
}

public int Kapitel_166 ()
{
return spiele.optionauswahl(Spielefiguer,
		"You are in the presence of a great evil. Your mind is "
				+ "being probed by a powerful and timeless being and you must "
				+ "shield yourself. The struggle has begun and your sanity is at "
				+ "stake. It is a long and torturous ordeal, during which you "
				+ "experience many fantastic and terrible apparitions that tempt "
				+ "and appal you. After this you must lose 4 ENDURANCE points and "
				+ "stagger towards the tunnel.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 104.","104",true));
}

public int Kapitel_167 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You have been travelling for about a mile when you notice two "
				+ "legs sticking out from behind a large boulder.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you possess and wish to use the Kai Discipline of Sixth Sense, turn to 178.\r\n","178",
				Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Sixth Sense")),
		new Option("If you wish to take a closer look, turn to 88.\r\n","88",true),
		new Option("If you would rather avoid meeting their owner and press on into the forest, turn to 264.","264",true)
		);
}

public int Kapitel_168 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You pull yourself to the top of the opulent caravan and "
				+ "nestle among the travelling cases and bags. Night will soon "
				+ "engulf the highway. A chill wind blows from the west and you "
				+ "pull your cloak around yourself to keep warm. You listen to the "
				+ "voices below and you can smell the mouthwatering aroma of spiced "
				+ "meat. It reminds you that you are very hungry and must now take a Meal.\r\n"
				+ "\r\n"
				+ "The fatigue of your ordeal finally catches up with you and you drift "
				+ "off into a restless sleep.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 64.","64",true));
}

public int Kapitel_169 ()
{
System.out.println("As you pass each skull, it slowly turns, as if watching your "
		+ "every move. You are halfway across the room when you hear the sharp "
		+ "crack of bone splitting. Suddenly you see hideous shapes hatching "
		+ "inside the skulls, and stretching their wings.\r\n"
		+ "\r\n"
		+ "Ten slimy winged creatures attack you, and you must fight them as one enemy.\r\n"
		+ "\r\n"
		+ "Crypt Spawn: COMBAT SKILL 16   ENDURANCE 16\r\n"
		+ "\r\n"
		+ "You may evade more fighting after the first round of combat and run for the archway "
		+ "by turning to 23.\r\n"
		+ "\r\n"
		+ "If you win the combat, turn to 137.");
	combatResult ergebnis = combatRules.Combat(Spielefiguer,new Enemy("Crypt Spawn", 16, 16), 0,1);
	if (ergebnis==combatResult.Evade) {
	return 23;
	}
	if (ergebnis==combatResult.Win) {
	return 137;
	}
	return 351;
}

public int Kapitel_170 ()
{
System.out.println("The tunnel is dark and the air is much cooler than outside. "
		+ "You carefully advance with one hand on the tunnel wall to aid your "
		+ "sense of direction. You have been in total darkness for three minutes "
		+ "when you detect the foul smell of decay ahead, similar to rotting meat. "
		+ "If you have a Torch and Tinderbox in your Pack, you may light the Torch "
		+ "to see your way ahead.\r\n"
		+ "\r\n"
		+ "Suddenly, something heavy drops from the tunnel ceiling onto your back and "
		+ "you fall to your knees. It is a Burrowcrawler and you must fight it, for "
		+ "it is trying to strangle you with its long slimy tentacles.\r\n"
		+ "\r\n"
		+ "Burrowcrawler: COMBAT SKILL 17   ENDURANCE 7\r\n"
		+ "\r\n"
		+ "If you do not have a torch, deduct 3 points from your COMBAT SKILL "
		+ "during this fight. The Burrowcrawler is immune to Mindblast and Animal Kinship.\r\n"
		+ "\r\n"
		+ "If you win, turn to 319.");
	if (combatRules.Combat(Spielefiguer,new Enemy("Burrowcrawler", 13, 10,true,false), -3)==combatResult.Win) {
	return 319;
	}
	return 351;

}

public int Kapitel_171 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You are at the very edge of the wood when your "
				+ "horse rears up in agony. The Kraan has sunk its claws deep "
				+ "into the horse’s hind legs and is trying to knock you to the "
				+ "ground with its wings. The ghoulish Giak rider squeals with "
				+ "delight as he stabs at you with his spear. You jump to the ground "
				+ "and dash for the trees, leaving the poor dying horse in the clutches of the Kraan.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 303.","303",true));
}

public int Kapitel_172 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Night falls and you are soon engulfed in darkness. "
				+ "To press on any further would be futile, for you would be "
				+ "sure to lose your way. Tethering your horse to a tree, you "
				+ "pull your green Kai cloak about you and fall into a restless sleep.\r\n"
				+ "\r\n"
				+ "You are awoken by the sound of troops in the distance. Across "
				+ "the lake you see the black shapes of Drakkarim and a pack of "
				+ "Doomwolves. A Kraan appears from above the trees and lands on "
				+ "the roof of the small wooden shack. It is being ridden by a creature "
				+ "dressed in red robes. The Kraan takes off and begins to fly across the "
				+ "lake to where you are hidden.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to use the Kai Discipline of Camouflage to hide yourself and your horse, turn to 114.\r\n","281",
				Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Camouflage")),
		new Option("If you wish to ride deeper into the forest to escape the Kraan, turn to 239.\r\n","281",true),
		new Option("If you wish to prepare to fight the creature, turn to 29.","281",true));
}

public int Kapitel_173 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"As you reach the door you hear the crash of a giant stone slab "
				+ "as it falls from the ceiling. Turning around, you see that your exit is now blocked.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you have a Silver Key, you may try to open the door by turning to 158.\r\n","158",
				Spielefiguer.getSpecialItems().haveItems("Silver Key")),
		new Option("If you do not possess a Silver Key, turn to 259.","259",
				!Spielefiguer.getSpecialItems().haveItems("Silver Key")));
}

public int Kapitel_174 ()
{
return spiele.optionauswahl(Spielefiguer,
		"After nearly an hour of drifting downstream, the water current "
				+ "becomes quite strong and you can see that you are being drawn towards "
				+ "a whirlpool near the centre as the river curves round. You know that if "
				+ "you are caught in the swirling water, you stand very little chance of "
				+ "escaping a watery death. You dive into the muddy river and as you begin "
				+ "to swim towards the shore you unfortunately lose your Backpack and Weapons. "
				+ "Without your equipment, you reach the wooded bank.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 190.","190",true));
}

public int Kapitel_175 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Waving your arms at the approaching cavalry, you recognize them to "
				+ "be Border Rangers of the King’s army, tough woodsmen who police the troubled "
				+ "western frontier of the kingdom. Your relief at seeing them soon fades when you "
				+ "realize that they are fleeing from a pack of Doomwolves with snarling Giak riders. "
				+ "Black arrows are dropping all around the rangers, as the vicious Doomwolves get "
				+ "nearer and nearer.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you possess the Kai Discipline of Camouflage, turn to 182.\r\n","182",
				Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Camouflage")),
		new Option("If you wish to take cover and hide, turn to 41.\r\n","41",true),
		new Option("If you wish to make for the other bank, turn to 116.","116",true));
}

public int Kapitel_176 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You hide behind some thick bushes so that the Doomwolf and "
				+ "its rider will not see your white horse. Luckily it works—the "
				+ "beast lopes past and vanishes down the track that you have just come along.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to attack the remaining Doomwolves and their riders, turn to 253.\r\n","253",true),
		new Option("If you wish to press on deeper into the forest, turn to 126.","126",true));
}

public int Kapitel_177 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You search all of the cupboards in the small cottage but do not find "
				+ "anything of use or value. You decide that you have wasted enough time here "
				+ "and must press on without further delay.\r\n"
				+ "\r\n"
				+ "Turn to 83.",
		Option.CharakterZeigen(),
		new Option("Turn to 83.","83",true));
}

public int Kapitel_178 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Your skill enables you to recognize the boots and leggings of "
				+ "a King’s soldier. You can sense that the man is wounded and in need of help.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to aid him, turn to 88.\r\n","88",true),
		new Option("If you would rather leave him here, turn to 264.","264",true));
}

public int Kapitel_179 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You have been spotted by the guards who level their crossbows at you.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to raise your hands above your head and walk slowly towards them, turn to 318.\r\n","318",true),
		new Option("If you wish to run for cover in the trees, turn to 51.","51",true));
}

@SuppressWarnings("unused")
public int Kapitel_180 ()
{
	System.out.println("They see you raise your weapon, and they instantly attack you.\r\n"
		+ "\r\n"
		+ "If you decide to fight them, you must fight them one at a time.\r\n"
		+ "\r\n"
		+ "Leader: COMBAT SKILL 15   ENDURANCE 22\r\n"
		+ "\r\n"
		+ "Soldier 1: COMBAT SKILL 13   ENDURANCE 20\r\n"
		+ "\r\n"
		+ "Soldier 2: COMBAT SKILL 12   ENDURANCE 20\r\n"
		+ "\r\n"
		+ "If you kill all three of them, turn to 62.\r\n"
		+ "\r\n"
		+ "If you wish to evade combat, turn to 22.");
	combatResult ergebnis = combatResult.Win;
	
	for (int i = 1; i < 3; i++) {
		switch (i) {
		case 1:
			ergebnis=combatRules.Combat(Spielefiguer,new Enemy("Giak 1", 13, 10), 0);
			break;
		case 2:
			ergebnis=combatRules.Combat(Spielefiguer,new Enemy("Giak 1", 13, 10), 0);
			break;
		case 3:
			ergebnis=combatRules.Combat(Spielefiguer,new Enemy("Giak 1", 13, 10), 0);
			break;
		}
		
		if (ergebnis==combatResult.Evade) {
			return 22;
		}
		if (ergebnis==combatResult.Lost) {
			return 351;
		}
		else {
			return 62;
		}
	}
	return 62;
}

public int Kapitel_181 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Instinctively you duck, and dive to avoid the crossbow bolt. "
				+ "The bandit fires and you feel the sleeve of your jacket tear as "
				+ "the missile grazes past your left arm. You thank the gods for "
				+ "your good fortune and sprint on.\r\n"
				+ "\r\n"
				+ "None of the other bandits have bows and they soon give up the chase. "
				+ "As you sprint off into the distance, you leave them all far behind.\r\n"
				+ "\r\n"
				+ "You stop just long enough to strap up your wounded arm and then continue "
				+ "along the road towards the outer defences of the capital.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 288.","288",true));
}

public int Kapitel_182 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Three rangers gallop past the river bank, closely followed by the "
				+ "Giaks on their snarling mounts—the Doomwolves. But your Camouflage skill "
				+ "has saved you from being spotted. The pack of evil Giaks continue on their "
				+ "chase without even glancing at the river.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 174.","174",true));
}

public int Kapitel_183 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The officer orders his men to halt and asks you your business. "
				+ "You tell him who you are, and how the monastery has been destroyed. "
				+ "He is deeply saddened to hear your news. He offers you a horse and asks "
				+ "you to accompany him to Prince Pelathar, the King’s son.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you accept, turn to 97.\r\n","97",true),
		new Option("If you decide to decline his offer, turn to 200.","200",true));
}

public int Kapitel_184 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The caravan is out of control and is bumping wildly through the "
				+ "rough ground that borders the highway. With difficulty you eventually "
				+ "steer the frightened horses back onto the road and halt the caravan.\r\n"
				+ "\r\n"
				+ "A quick search of the interior reveals 40 Gold Crowns, a Sword, and enough "
				+ "Food for 4 Meals. If you wish to keep any of these items, mark them on your "
				+ "Action Chart.\r\n"
				+ "\r\n"
				+ "The fatigue of your ordeal finally catches up with you. You must eat a "
				+ "Meal after which you fall into a deep sleep.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 64.","64",true));
}

public int Kapitel_185 ()
{
	System.out.println("You narrow your eyes and scan the trees for some sign of the hidden archer. "
		+ "Your wait is not a long one, for a moment later a sharp pain tears through your "
		+ "chest and you are thrown back by the force of three arrows. Two of the black shafts "
		+ "have sunk deep into your rib cage, and the third has pierced your thigh.\r\n"
		+ "\r\n"
		+ "The last thing that you see is the canopy of fern trees above and a large green "
		+ "dragonfly as it settles on your belt buckle.\r\n"
		+ "\r\n"
		+ "Your life and your mission end here.");
	return 351;
}

public int Kapitel_186 ()
{
return spiele.optionauswahl(Spielefiguer,
		"The Kakarmi disappear into the dense undergrowth and you soon find yourself lost. "
				+ "After nearly two hours of walking you hear the sound of running water. You decide "
				+ "to investigate a little closer.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 106.","106",true));
}

public int Kapitel_187 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Two furry faces appear over the top of the trunk. Both pairs of eyes stare at "
				+ "your weapon and the two creatures let out a shriek of fright. Leaping from the trunk, "
				+ "they disappear into the forest.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to follow them, turn to 186.\r\n","186",true),
		new Option("If you wish to let them go and continue, turn to 228.","228",true));
}

public int Kapitel_188 ()
{
String Text = "You can see the shadow of the Kraan getting larger all around you. It "
		+ "suddenly strikes, pitching you forward onto your face with the power of its attack.\r\n"
		+ "\r\n"
		+ "Pick a number from the Random Number Table.\r\n"
		+ "\r\n"
		+ "If the number you have picked is 0–6, the Kraan has ripped away your Backpack. You have "
		+ "lost the Pack and all the Equipment that was inside it.\r\n"
		+ "\r\n"
		+ "If the number picked is 7–9, your Backpack is intact but you have been wounded "
		+ "in both arms. Lose 3 ENDURANCE points and run to the trees.\r\n"
		+ "\r\n"
		+ "Now turn to 303.";
return 188;
}

public int Kapitel_189 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You thank your Kai training and your quick thinking, for that "
				+ "bog could have proved as deadly as any Drakkarim or Kraan.\r\n"
				+ "\r\n"
				+ "You are worried about losing time, and push on further into the trees "
				+ "towards the south. Ahead of you, you see a wide path that also leads south.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 118.","118",true));
}

public int Kapitel_190 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You walk for three miles along the water’s edge until you chance "
				+ "upon a wrecked river barge. It appears to have served as shelter for "
				+ "someone, as you can see a bed and some cooking utensils through a hole in the deck.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to search the barge, turn to 20.\r\n","20",true),
		new Option("If you wish to press on, turn to 273.","273",true));
}

public int Kapitel_191 ()
{
System.out.println("The bodyguard unsheathes a large scimitar and strikes at your head.\r\n"
		+ "\r\n"
		+ "Bodyguard: COMBAT SKILL 11   ENDURANCE 21\r\n"
		+ "\r\n"
		+ "If you win, turn to 24.\r\n"
		+ "\r\n"
		+ "If you wish to evade more combat during the fight, you can jump from the "
		+ "speeding caravan by turning to 234.");

combatResult ergebnis = combatRules.Combat(Spielefiguer,new Enemy("Bodyguard", 11, 21), 0,0);
	if (ergebnis==combatResult.Evade) {
	return 234;
	}
	if (ergebnis==combatResult.Win) {
	return 24;
	}
	return 351;
}

public int Kapitel_192 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You see the razor-fanged mouth of a Doomwolf and hear the hideous "
				+ "cries of the Giaks. Two of them are coming straight for you. You are "
				+ "saved from certain death when your horse jumps at the approaching beasts, "
				+ "knocking them both to the ground. You lash out at the Giak and open a large "
				+ "wound in his head…and then suddenly, as if by a miracle, you’re through and "
				+ "racing on down the highway, clear of the rest of the pack.\r\n"
				+ "\r\n"
				+ "But a shadow follows you. It is a Kraan and it has started to dive. Its target is you.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you veer off the highway towards the cover of the trees, turn to 171.\r\n","171",true),
		new Option("If you press on regardless of the Kraan and gallop flat out down the highway, turn to 120.","120",true));
}

public int Kapitel_193 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"The beast and its rider lie dead. You notice a Scroll tucked into the Giak’s "
				+ "belt. You may take this if you wish, but remember to mark it on your Action Chart. "
				+ "The other Doomwolves are charging along the path towards you.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to fight them, turn to 253.\r\n","253",true),
		new Option("If you wish to escape into the woods, turn to 126.","126",true));
}

public int Kapitel_194 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You sprint towards the wagon. People are running everywhere in panic as the Kraan "
				+ "make their attack, carrying their poor victims off into the darkening sky. A large Kraan "
				+ "is hovering above the wagon and three snarling Giaks drop from its back onto the startled "
				+ "horses. You must fight them or leave the wagon and run to the safety of a nearby farmhouse.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to fight the Giaks, turn to 208.\r\n","208",true),
		new Option("If you wish to run to the farmhouse, turn to 148.","148",true));
}

public int Kapitel_195 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Wiping the bear’s blood from your weapon, you notice the mouth of a cave hidden "
				+ "behind the rock from which the bear attacked.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to investigate this cave further, turn to 59.\r\n","59",true),
		new Option("If you wish to press on, turn to 106.","106",true));
}

public int Kapitel_196 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You follow the man into a small library off the main hall. He pushes one of the "
				+ "many books on the shelves which line all four walls, and you hear a metallic click. "
				+ "One section of the bookcase slowly slides back to reveal a hidden passage.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to follow the man into the passage, turn to 332.\r\n","332",true),
		new Option("If you do not want to enter the dark corridor, leave the guildhall and return to the street. Turn to 144.","144",true));
}

public int Kapitel_197 ()
{
	Spielefiguer.getBelt_Pouch().incrementAnzahl(6);
	Spielefiguer.getWeapons().add(new Equipment("Short Sword", 1, null));
	return spiele.optionauswahl(Spielefiguer,
		"The Drakkar lies dead at the bottom of the ferry. He has a Short Sword and "
				+ "6 Gold Crowns which you may keep if you wish. You push the body into the water where "
				+ "it floats for a few seconds before disappearing into the icy depths.\r\n"
				+ "\r\n"
				+ "Grabbing the pole, you steer to the other side of the lake and abandon the ferry.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("Turn to 172.","172",true));
}

public int Kapitel_198 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"You can sense that there is someone else behind the screen. There is a lingering "
				+ "aura of wickedness around this shop. Be on your guard—something is wrong here.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to return to the street, turn to 7.\r\n","7",true),
		new Option("If you wish to examine the goods in the glass counter, turn to 152.","152",true));
}

public int Kapitel_199 ()
{
	return spiele.optionauswahl(Spielefiguer,
		"Most of the cupboards and drawers are empty. Whoever lived here took nearly "
				+ "everything they owned with them, but you do manage to scrape together enough fruit "
				+ "in the cellar for one Meal. You may mark this on your Action Chart.\r\n"
				+ "\r\n"
				+ "Turn to 81.",
		Option.CharakterZeigen(),
		new Option( "Turn to 81.","81",true));
}

public int Kapitel_200 ()
{
return spiele.optionauswahl(Spielefiguer,
		"Night is starting to close in. The shadows of the forest are growing "
				+ "longer and darker. Just as you are about to stop and rest, you see through "
				+ "the trees a line of people moving south along a wide highway. Moving closer, "
				+ "you notice a large merchant’s caravan in the centre of the dusty turnpike. "
				+ "It is drawn by six large horses and is moving much faster than any of the other "
				+ "traffic. This could be your chance to reach the capital as quickly as possible.\r\n"
				+ "\r\n",
		Option.CharakterZeigen(),
		new Option("If you wish to use the Kai Discipline of Camouflage to hide in among the packing cases "
				+ "strapped to the roof, turn to 168.\r\n","168",Spielefiguer.getKaiDisciplines().haveKaiDisciplines("Camouflage")),
		new Option("If you wish to jump onto the caravan, turn to 78.","78",true));
}

public int Kapitel_201 ()
{
String Text = "You follow the rough track for nearly an hour when you notice ahead of you another wider path branching off towards the south.\r\n"
		+ "\r\n"
		+ "If you wish to turn south along the new path, turn to 238.\r\n"
		+ "\r\n"
		+ "But if you wish to head east, turn to 15.\r\n"
		+ "\r\n"
		+ "Or if you wish to go west, turn to 130.";
return 201;
}

public int Kapitel_202 ()
{
String Text = "Urging your horse forward, you gallop down the long stretch of highway towards the capital. After only a few minutes your horse suddenly slows and finally limps to a halt. You dismount and examine its raised right foreleg. You curse your ill luck, for you see that it has thrown a shoe and injured its hoof quite badly. You will have to leave him here and proceed on foot as quickly as you can.\r\n"
		+ "\r\n"
		+ "Turn to 58.";
return 202;
}

public int Kapitel_203 ()
{
String Text = "You suddenly feel a searing pain shoot through your chest as something explodes against you in a shower of red sparks.\r\n"
		+ "\r\n"
		+ "You lose 10 ENDURANCE points. Through the smoke, the Sage is preparing to throw more explosives at you.\r\n"
		+ "\r\n"
		+ "If you have 10 or more ENDURANCE points left, turn to 80.\r\n"
		+ "\r\n"
		+ "If you now have less than 10 ENDURANCE points, turn to 344.";
return 203;
}

public int Kapitel_204 ()
{
String Text = "After an hour of walking you arrive at a junction. The path continues south and another path joins it from the west. You realize that the west path will lead you back to the marsh, so you continue southwards.\r\n"
		+ "\r\n"
		+ "Turn to 111.";
return 204;
}

public int Kapitel_205 ()
{
String Text = "Their leader picks up your discarded Equipment and ushers you along the road ahead. (You must now erase all Weapons and Backpack Items from your Action Chart.) An evil grin spreads across the face of the other two men, and you suddenly realize that they are not soldiers after all. You make a break for it and run away from there, sprinting towards the distant capital.\r\n"
		+ "\r\n"
		+ "Behind you, the ominous click of a crossbow being primed sends a shiver down your spine.\r\n"
		+ "\r\n"
		+ "Pick a number from the Random Number Table.\r\n"
		+ "\r\n"
		+ "If the number you have picked is 0–4, turn to 181.\r\n"
		+ "\r\n"
		+ "If the number is 5–9, turn to 145.";
return 205;
}

public int Kapitel_206 ()
{
String Text = "The path soon joins a highway where a signpost indicates Toran to the north and Holmgard to the south. You turn south towards the capital.\r\n"
		+ "\r\n"
		+ "Turn to 224.";
return 206;
}

public int Kapitel_207 ()
{
String Text = "The track soon reaches a larger road which crosses the stream via a stone bridge. A signpost at the bridge points north to Toran and south to Holmgard. The road itself is jammed with people moving south, some pushing their possessions along on handcarts. You join the refugee column and head towards the capital.\r\n"
		+ "\r\n"
		+ "Turn to 30.";
return 207;
}

public int Kapitel_208 ()
{
String Text = "The ghoulish creatures thrust their spears at you and attack. Fight these creatures as a single enemy.\r\n"
		+ "\r\n"
		+ "Giaks: COMBAT SKILL 15   ENDURANCE 13\r\n"
		+ "\r\n"
		+ "If you win, you can run to the safety of the farmhouse by turning to 148.\r\n"
		+ "\r\n"
		+ "Or you can return to the woods by turning to 320.";
return 208;
}

public int Kapitel_209 ()
{
String Text = "You see ahead a corridor sloping upwards, and as you reach the top of this slope, a stone portal slides across to reveal another passage ahead.\r\n"
		+ "\r\n"
		+ "You step through the opening which then quickly closes with a crunch.\r\n"
		+ "\r\n"
		+ "Turn to 23.";
return 209;
}

public int Kapitel_210 ()
{
String Text = "Just inside the door, you are stopped by a journeyman of the Guildhall and asked to explain your intrusion. You calmly inform him of your urgent message for the King, and he hurries you into the Guildmaster’s chambers.\r\n"
		+ "\r\n"
		+ "A distinguished old man in deep purple robes turns to greet you and listens to your story. Taking you by the arm, he leads you into an adjoining library and closes the door. Pressing one of the many thousands of books, he releases a secret panel in the wall and beckons you to follow him.\r\n"
		+ "\r\n"
		+ "If you wish to follow him into the dark passage, turn to 332.\r\n"
		+ "\r\n"
		+ "If you are not completely happy about this man and wish to leave the Guildhall, turn to 37.";
return 210;
}

public int Kapitel_211 ()
{
String Text = "You walk along a dimly lit corridor which opens out into a large square room, with an oak door in the far wall.\r\n"
		+ "\r\n"
		+ "If you possess the Kai Discipline of Sixth Sense turn to 244.\r\n"
		+ "\r\n"
		+ "If you wish to walk across to the door, turn to 173.\r\n"
		+ "\r\n"
		+ "If you would prefer to return to the surface and continue your journey, turn to 106.";
return 211;
}

public int Kapitel_212 ()
{
String Text = "When you awake, the pain is but a memory. Restore all lost ENDURANCE points to your original score. A tall man dressed in white robes stands before you, a bowl of herbs in his hands. Placing the leaves into a kettle of boiling water, he then turns to greet you.\r\n"
		+ "[Illustration XIII]\r\n"
		+ "\r\n"
		+ "‘You have passed close to death and have seen his face, Kai Lord, but the Grey One has not claimed you for his flock. You are healed in body but I sense that you are wounded in spirit. What is it that troubles you so?’\r\n"
		+ "\r\n"
		+ "You recognize the man to be one of the King’s senior physicians, for the gold embroidered emblem of a dove upon his sleeve is the sign of his respected vocation. You tell the aged cleric of the events at the monastery and of your perilous journey to the King.\r\n"
		+ "\r\n"
		+ "Raising you gently from the bed by your arm, he bids you follow him. You notice that you are in a lavishly decorated room which leads out through a long corridor lined with tapestries. It slowly dawns on you just where you are.\r\n"
		+ "\r\n"
		+ "This is the citadel of Holmgard and you are about to meet the King.\r\n"
		+ "\r\n"
		+ "Turn to 350.";
return 212;
}

public int Kapitel_213 ()
{
String Text = "You have been trudging through the forest for nearly two hours. The nagging fear that you are lost begins to seem a reality. Apart from the occasional cry of a Kraan in the far distance, you have seen or heard no evidence that the enemy is in this part of the forest. As you descend a rocky hillock, you see something unusual in the tangled woods ahead.\r\n"
		+ "\r\n"
		+ "Turn to 331.";
return 213;
}

public int Kapitel_214 ()
{
String Text = "The path gradually narrows until it disappears completely into a mass of dense vegetation. You cannot go any further on this route and therefore you must return to the clearing.\r\n"
		+ "\r\n"
		+ "Turn to 125 and take the south path.";
return 214;
}

public int Kapitel_215 ()
{
String Text = "You emerge into a small clearing. In the centre you see the skeletal remains of a large animal. To the south a narrow track leads off into the distance.\r\n"
		+ "\r\n"
		+ "If you wish to examine the skeleton, turn to 346.\r\n"
		+ "\r\n"
		+ "If you would rather press on, turn to 14.";
return 215;
}

public int Kapitel_216 ()
{
String Text = "Placing one hand on his forehead and the other on his wounded arm, you feel the warmth of your healing powers leave your body and give strength to the injured man.\r\n"
		+ "\r\n"
		+ "He tells you his name is Trimis and he is a soldier in Prince Pelathar’s army. The Prince and his troops are engaged in battle to the south, where a large force of the Darklords’ creatures are attacking the bridge of Alema. During the fight, he had been snatched into the air by a Kraan, and dropped into the forest.\r\n"
		+ "\r\n"
		+ "You make the soldier as comfortable as possible before continuing on your mission.\r\n"
		+ "\r\n"
		+ "Turn to 264.";
return 216;
}

public int Kapitel_217 ()
{
String Text = "You quickly escape from the madman and dodge along a dark alleyway where the houses are small and cramped together. At the very end is a green door with a sign above it that says:\r\n"
		+ "Kolanis—Sage & Herbalist\r\n"
		+ "\r\n"
		+ "If you wish to enter, turn to 91.\r\n"
		+ "\r\n"
		+ "If you wish to wait until you are sure the madman has disappeared and then return to the main street, turn to 7.";
return 217;
}

public int Kapitel_218 ()
{
String Text = "Your senses reveal that more than just horses are heading towards you. You can just make out the very high shrieks of Giak war-cries in the distance. By the number of cries and curses you estimate that there are over a dozen Giaks, and probably Doomwolves as well. You decide that advertising your existence is perhaps not quite such a good idea after all!\r\n"
		+ "\r\n"
		+ "Turn to 75.";
return 218;
}

public int Kapitel_219 ()
{
String Text = "All that remains of you now is embedded five feet into the stairs on which you were standing, beneath a vast granite block.\r\n"
		+ "\r\n"
		+ "Your mission and your life end here.";
return 219;
}

public int Kapitel_220 ()
{
String Text = "The bodyguard unsheathes a scimitar and lunges for your head.\r\n"
		+ "\r\n"
		+ "Bodyguard: COMBAT SKILL 11   ENDURANCE 20\r\n"
		+ "\r\n"
		+ "If you win, turn to 24.\r\n"
		+ "\r\n"
		+ "If you wish to evade combat at any time during the fight, you can jump from the speeding caravan by turning to 234.";
return 220;
}

public int Kapitel_221 ()
{
String Text = "Cautiously, you approach the base of the log wall. The tree trunks are rough-hewn and afford plenty of footholds for your climb. As you reach the top of the wall, you come face to face with a crossbow. The soldier holding it in your face motions for you to descend a wooden ladder to the ground. You do not argue with him. Slowly you descend the ladder.\r\n"
		+ "\r\n"
		+ "Turn to 318.";
return 221;
}

public int Kapitel_222 ()
{
String Text = "As you go on you discover a forest path that divides at the point you join it.\r\n"
		+ "\r\n"
		+ "If you wish to use your Kai Discipline of Tracking, turn to 67.\r\n"
		+ "\r\n"
		+ "If you wish to take the south fork, turn to 140.\r\n"
		+ "\r\n"
		+ "If you wish to take the east fork, turn to 252.";
return 222;
}

public int Kapitel_223 ()
{
String Text = "After quite a struggle, you manage to free the heavy trunk from the river bank. Gathering your equipment in a bundle, you stow it on top of the log and then slowly wade out into the river. The current soon takes you and you drift slowly downstream.\r\n"
		+ "\r\n"
		+ "After twenty minutes you hear the sound of horses along the left bank.\r\n"
		+ "\r\n"
		+ "If you wish to hide behind the log, turn to 75.\r\n"
		+ "\r\n"
		+ "If you wish to climb onto the log and prepare to catch the riders’ attention, then turn to 175.";
return 223;
}

public int Kapitel_224 ()
{
String Text = "You have ridden several miles and have seen no sign of refugees or of the enemy. You race on towards a high ridge in the middle distance. You should be able to see the capital from there.\r\n"
		+ "\r\n"
		+ "As you reach the peak, the sight that meets you on the far side is one of hope—but there is still one challenge you know you have to face.\r\n"
		+ "\r\n"
		+ "Turn to 153.";
return 224;
}

public int Kapitel_225 ()
{
String Text = "You recognize the language to be that of the Kakarmi, an intelligent race of forest animals that live in, and care for the forests of Sommerlund. You have nothing to fear from these creatures as they are very timid and gentle in their behaviour. Using your skill of Animal Kinship, you call to them in their strange native tongue.\r\n"
		+ "\r\n"
		+ "If you say ‘Do not be afraid, I am a friend,’ turn to 187.\r\n"
		+ "\r\n"
		+ "If you say ‘I am a Kai Lord. I wish you no harm. I must talk with you,’ turn to 39.";
return 225;
}

public int Kapitel_226 ()
{
String Text = "At first the descent is quite easy, but you soon find it difficult to see clearly and your legs feel very weak. The ‘Sleeptooth’ scratches are affecting you, and suddenly you pitch forward and slip head-first into darkness.\r\n"
		+ "\r\n"
		+ "Pick a number from the Random Number Table.\r\n"
		+ "\r\n"
		+ "If the number you have picked is 0–4, turn to 277.\r\n"
		+ "\r\n"
		+ "If the number is 5–9, turn to 338.";
return 226;
}

public int Kapitel_227 ()
{
String Text = "You are now up to your waist in slimy water. The air is thick with small insects that sting your face and clog your nose. Something wraps itself around your leg. It is a Marshviper and you must fight it.\r\n"
		+ "\r\n"
		+ "Marshviper: COMBAT SKILL 16   ENDURANCE 6\r\n"
		+ "\r\n"
		+ "If you lose any ENDURANCE points in the combat, turn to 271.\r\n"
		+ "\r\n"
		+ "If you kill it without losing any ENDURANCE points, turn to 348.";
return 227;
}

public int Kapitel_228 ()
{
String Text = "The path continues eastwards but soon disappears into thick undergrowth.\r\n"
		+ "\r\n"
		+ "If you continue east, cutting through the vegetation with your weapon, turn to 140.\r\n"
		+ "\r\n"
		+ "If you head south to where the bushes are less dense and then press on through the forest, turn to 215.";
return 228;
}

public int Kapitel_229 ()
{
String Text = "The Kraan hovers above you, raising dust with the beat of its huge black wings. The dust gets into your eyes and nose, and you start to cough. Now the beast attacks.\r\n"
		+ "\r\n"
		+ "You must fight it to the death. Because of the dust, you must reduce your COMBAT SKILL by 1 point.\r\n"
		+ "\r\n"
		+ "Kraan: COMBAT SKILL 16   ENDURANCE 25\r\n"
		+ "\r\n"
		+ "If you win you have a choice.\r\n"
		+ "\r\n"
		+ "Will you search the body by turning to 267?\r\n"
		+ "\r\n"
		+ "Or will you continue along the east path by turning to 125?";
return 229;
}

public int Kapitel_230 ()
{
String Text = "In the far distance, you can make out the silhouette of soldiers on barges that are strung out in a line across the river. You can hear the low growls of Doomwolves returning along the opposite bank.\r\n"
		+ "\r\n"
		+ "For once you throw caution to the wind and sprint along the river bank towards the barges in the distance.\r\n"
		+ "\r\n"
		+ "Turn to 179.";
return 230;
}

public int Kapitel_231 ()
{
String Text = "You are about to ask the price of the potions when the bamboo screen crashes down and a young man leaps at you. He has a long curved dagger in his hand.\r\n"
		+ "\r\n"
		+ "He is upon you and you must fight for your life.\r\n"
		+ "\r\n"
		+ "Robber: COMBAT SKILL 13   ENDURANCE 20\r\n"
		+ "\r\n"
		+ "If you kill him within 4 rounds of combat, turn to 94.\r\n"
		+ "\r\n"
		+ "If you are still fighting after 4 rounds of combat, turn to 203.\r\n"
		+ "\r\n"
		+ "You may evade more fighting after 2 rounds of combat by dashing through the front door. If you wish to do this, turn to 7.";
return 231;
}

public int Kapitel_232 ()
{
String Text = "The rough-looking leader approaches you and says, ‘Our needs are simple, kind sir. Your money or your life!’\r\n"
		+ "\r\n"
		+ "If you wish to fight them, turn to 180.\r\n"
		+ "\r\n"
		+ "If you wish to run, turn to 22.";
return 232;
}

public int Kapitel_233 ()
{
String Text = "After nearly an hour, you catch up with the horse and succeed in calming him down. You are now north of the cabin, but you are confident of finding your way back.\r\n"
		+ "\r\n"
		+ "Mounting the horse, you ride back past the cabin, and press on towards the south once again.\r\n"
		+ "\r\n"
		+ "Turn to 206.";
return 233;
}

public int Kapitel_234 ()
{
String Text = "You jump clear of the speeding caravan but land very badly and break your ankle. The pain is terrible and you soon lose consciousness.\r\n"
		+ "\r\n"
		+ "Unfortunately you never wake up, but it may be of interest to you that your head is now adorning the saddle of a Kraan.\r\n"
		+ "\r\n"
		+ "Your life and your mission end here.";
return 234;
}

public int Kapitel_235 ()
{
String Text = "The Prince’s horse is indeed a magnificent animal, fast and sure of foot. You gallop along the twisting track as if it were a straight highway, until the noise of battle has disappeared far behind you.\r\n"
		+ "\r\n"
		+ "You are hungry and must eat a Meal during your ride.\r\n"
		+ "\r\n"
		+ "After several miles, the path stops abruptly at a junction. There is a signpost, but it has been hacked down.\r\n"
		+ "\r\n"
		+ "If you wish to use your Kai Discipline of Tracking, turn to 254.\r\n"
		+ "\r\n"
		+ "If you wish to turn left, go to 32.\r\n"
		+ "\r\n"
		+ "If you wish to turn right, go to 146.";
return 235;
}

public int Kapitel_236 ()
{
String Text = "The Gem hovers above the mouth of the skeleton king, glowing a fierce red. Suddenly, an explosion of searing crimson flame lashes upwards from the sarcophagus, destroying the Gem completely. You are thrown against the far wall and knocked unconscious.\r\n"
		+ "\r\n"
		+ "When you awake, the chamber is completely empty. The skeleton king and the sarcophagus have vanished. You have lost 6 ENDURANCE points, and your initial COMBAT SKILL is reduced by 1 point for the rest of your life. (Remember to erase the Vordak Gem from your Action Chart. If you had two Gems, you need erase only one.)\r\n"
		+ "\r\n"
		+ "You carefully get to your feet and stagger towards the tunnel.\r\n"
		+ "\r\n"
		+ "Turn to 104.";
return 236;
}

public int Kapitel_237 ()
{
String Text = "You make full use of your Kai Discipline and quickly burrow deep into the loose earth of the wooded hillside. Covering yourself with your cloak, you pull a loose branch across your hastily dug shelter.\r\n"
		+ "\r\n"
		+ "Pick a number from the Random Number Table.\r\n"
		+ "\r\n"
		+ "If you have picked a number 0–4, then you have passed undetected. Turn to 265.\r\n"
		+ "\r\n"
		+ "If you have picked a number 5–9, then you are not so lucky! Turn to 72.";
return 237;
}

public int Kapitel_238 ()
{
String Text = "The path meanders between several small, wooded hills and eventually leads to a ruined log cabin. It seems that it had burnt down not so long ago, for the ashes are still warm and a haze of smoke still lingers. You sense possible danger here.\r\n"
		+ "\r\n"
		+ "You may leave by the south route by turning to 42.\r\n"
		+ "\r\n"
		+ "Or you may take the north track by turning to 68.";
return 238;
}

public int Kapitel_239 ()
{
String Text = "As you push on into the forest, you hear the wings of the Kraan pass above the trees and disappear northwards. You ride on for nearly an hour until you come to a clearing. On the far side is a track that leads off to the south.\r\n"
		+ "\r\n"
		+ "If you wish to enter the clearing and take the south exit, turn to 34.\r\n"
		+ "\r\n"
		+ "If you would rather skirt the edge of the clearing and pick up the track further on, turn to 118.";
return 239;
}

public int Kapitel_240 ()
{
String Text = "The path leads along a ridge of wooded hillocks and changes direction towards the east.\r\n"
		+ "\r\n"
		+ "Turn to 79.";
return 240;
}

public int Kapitel_241 ()
{
String Text = "The wizard heeds your cry and spins around just in time to loose a searing bolt of energy at the Giak. The creature’s head disintegrates in flames and its twitching body falls in a heap at the foot of the pillar. The Giak officer sees you and shouts, ‘Ogot…Ogot!’ to his cowering troops, who quickly run away from the ruins to the safety of the forest beyond.\r\n"
		+ "\r\n"
		+ "The young wizard wipes his brow, and walks towards you, his hand extended in gratitude and friendship.\r\n"
		+ "\r\n"
		+ "Turn to 349.";
return 241;
}

public int Kapitel_242 ()
{
String Text = "The lid of the sarcophagus slips to the floor with a dull crunch. You are looking at the remains of an ancient king, who lies still surrounded by his treasure. An ornate crown is still in position on his skull. The jaw of the skeleton is wide open and the darkness of the mouth seems strangely bottomless. A distant rumbling can now be heard from deep in the earth.\r\n"
		+ "\r\n"
		+ "If you have the Kai Discipline of Mindshield, turn to 166.\r\n"
		+ "\r\n"
		+ "If you do not, turn to 9.";
return 242;
}

public int Kapitel_243 ()
{
String Text = "Hurrying through the forest, you stumble and fall down a steep slope which drops you in a heap on a hidden path below. On the path is a dead body. It is a Giak, a spiteful and ghoulish servant of the Darklords. Many centuries ago, their ancestors were used by the Darklords to build for them the infernal city of Helgedad, which lies in the volcanic wastelands beyond the Durncrag range of mountains. The construction of the city was a long and torturous nightmare, and only the strongest of the Giaks survived the heat and poisonous atmospheres of Helgedad. This creature that lies before you is a descendant of these Giak slaves. It has been killed by a sword blow to its head, and by its side lies a Mace. You may take this Weapon if you wish.\r\n"
		+ "\r\n"
		+ "Continue along the hidden path by turning to 97.";
return 243;
}

public int Kapitel_244 ()
{
String Text = "Your senses tell you that you are not alone. You are in very great danger. Return to the surface as quickly as you can.\r\n"
		+ "\r\n"
		+ "Turn to 93.";
return 244;
}

public int Kapitel_245 ()
{
String Text = "Arrows hit the water above you, and drop harmlessly past as you swim beneath the surface towards the opposite bank.\r\n"
		+ "\r\n"
		+ "Quickly you wade out of the river and dash for the trees. You are now out of range of the Giaks, who remount their Doomwolves and continue their chase.\r\n"
		+ "\r\n"
		+ "Turn to 190.";
return 245;
}

public int Kapitel_246 ()
{
String Text = "When the ferry reaches the middle of the lake, the man stops rowing and stands up. He laughs menacingly and pulls back the hood of his cloak to reveal himself. He is a Drakkar and you must fight him.\r\n"
		+ "[Illustration XIV]\r\n"
		+ "\r\n"
		+ "Drakkar: COMBAT SKILL 15   ENDURANCE 23\r\n"
		+ "\r\n"
		+ "If you win, turn to 197.";
return 246;
}

public int Kapitel_247 ()
{
String Text = "The merchant looks angry. He calls to his bodyguard. You must think of something quickly.\r\n"
		+ "\r\n"
		+ "If you decide to offer him something of greater value that you have in your Backpack, turn to 159.\r\n"
		+ "\r\n"
		+ "If you prepare to fight the bodyguard, turn to 220.";
return 247;
}

public int Kapitel_248 ()
{
String Text = "You reach the base of the hill and hurry into the forest. After only a few minutes you discover an old forest track.\r\n"
		+ "\r\n"
		+ "If you wish to follow this track north, turn to 44.\r\n"
		+ "\r\n"
		+ "If you wish to follow this track east, turn to 300.";
return 248;
}

public int Kapitel_249 ()
{
String Text = "You descend a flight of stone stairs that lead to a large chamber. A macabre sight awaits you. Directly opposite, across the large stone room, is an ornate archway with a corridor leading into the darkness beyond. The strange green light radiates from two lines of skulls each resting on a stone plinth. They face each other to form an eerie walkway across the room.\r\n"
		+ "\r\n"
		+ "If you wish to walk across the room to the archway, turn to 169.\r\n"
		+ "\r\n"
		+ "If you wish to attack the skulls, turn to 107.";
return 249;
}

public int Kapitel_250 ()
{
String Text = "Leaping from the top of the trunk, you land in front of two small furry creatures. You recognize that they are Kakarmi, an intelligent race of animals that inhabit and tend the forests of Sommerlund. Before you can apologize for your dramatic entrance, the frightened little creatures scurry off into the forest.\r\n"
		+ "\r\n"
		+ "If you wish to follow them, turn to 186.\r\n"
		+ "\r\n"
		+ "If you wish to continue, turn to 228.";
return 250;
}

public int Kapitel_251 ()
{
String Text = "You are lucky, they do not seem to have spotted you. They slowly move on and have soon disappeared along the far side of the ridge. You continue your run.\r\n"
		+ "\r\n"
		+ "Turn to 10.";
return 251;
}

public int Kapitel_252 ()
{
String Text = "In the centre of a small clearing you see a group of humans talking excitedly and gesturing wildly with their hands. There are two children, three men, and a woman. Their belongings are wrapped in bundles which they carry slung over their shoulders. Their clothes look well made and expensive but they are dirty and torn.\r\n"
		+ "\r\n"
		+ "If you wish to approach them and ask who they are, turn to 155.\r\n"
		+ "\r\n"
		+ "If you wish to avoid them and continue onwards on your mission, turn to 70.";
return 252;
}

public int Kapitel_253 ()
{
String Text = "The Doomwolves are soon on you and you must fight them one at a time.\r\n"
		+ "\r\n"
		+ "Doomwolf 1: COMBAT SKILL 13   ENDURANCE 24\r\n"
		+ "\r\n"
		+ "Doomwolf 2: COMBAT SKILL 14   ENDURANCE 23\r\n"
		+ "\r\n"
		+ "Doomwolf 3: COMBAT SKILL 14   ENDURANCE 22\r\n"
		+ "\r\n"
		+ "Doomwolf 4: COMBAT SKILL 15   ENDURANCE 21\r\n"
		+ "\r\n"
		+ "If you kill them all in battle, turn to 278.";
return 253;
}

public int Kapitel_254 ()
{
String Text = "Your Tracking ability tells you that several trails from the right path lead off in the direction of the left path. They have been made by large wolves. The Darklords use such beasts to scout for their armies. They are vicious creatures and are often ridden by Giaks. The left path leads towards Holmgard, and the right path leads off towards the Durncrag Mountains. The choice of route is yours.\r\n"
		+ "\r\n"
		+ "If you wish to turn left, go to 32.\r\n"
		+ "\r\n"
		+ "If you wish to turn right, go to 146.";
return 254;
}

public int Kapitel_255 ()
{
String Text = "The creature that you now face is a Gourgaz, one of a race of cold-blooded reptilian creatures that dwell deep in the treacherous Maakenmire swamps. Their favourite food is human flesh!\r\n"
		+ "\r\n"
		+ "The Prince’s Sword lies at your feet. You may pick up and use this weapon if you wish. The Gourgaz is about to strike at you—you must fight him to the death.\r\n"
		+ "\r\n"
		+ "Gourgaz: COMBAT SKILL 20   ENDURANCE 30\r\n"
		+ "\r\n"
		+ "This creature is immune to Mindblast.\r\n"
		+ "\r\n"
		+ "If you win, turn to 82.";
return 255;
}

public int Kapitel_256 ()
{
String Text = "You are awoken by the cries of Kraan high above you in the clear morning sky. Rubbing your eyes, you peer upwards through the canopy of branches to see three of the loathsome creatures fly off towards the north.\r\n"
		+ "\r\n"
		+ "You are sure you have not been spotted, but perhaps it would be best to leave now—just in case. You mount your horse and ride south along the highway.\r\n"
		+ "\r\n"
		+ "Turn to 224.";
return 256;
}

public int Kapitel_257 ()
{
String Text = "You find a stone portal in the east wall, but there does not appear to be any way of opening it.\r\n"
		+ "\r\n"
		+ "If you wish to examine the statue, turn to 133.\r\n"
		+ "\r\n"
		+ "If you wish to sit on the seat, turn to 161.";
return 257;
}

public int Kapitel_258 ()
{
String Text = "Using your Kai Discipline of Mind Over Matter, you untie the ropes binding your hands. You wait for a chance to make a break for it and then sprint as fast as you can into the dense undergrowth. Black arrows whistle past you, but you are soon deep among the trees and safe again. You have lost your Backpack and Weapons but you have your life and limbs intact. You continue to push on into the forest.\r\n"
		+ "\r\n"
		+ "Turn to 50.";
return 258;
}

public int Kapitel_259 ()
{
String Text = "The room is getting colder. You gradually notice the smell of sulphur in the air. You can hear chanting in the distance. It sounds as if it is somewhere in another part of this cave. A slit in the stone wall opens, and the end of a black staff begins to appear. Suddenly a bolt of blue lightning leaps from the staff and hits you in the chest.\r\n"
		+ "\r\n"
		+ "As your life slowly drains away, the last thing you see is an old man dressed in black robes raising a dagger above your throat.\r\n"
		+ "\r\n"
		+ "Your life and your mission end here";
return 259;
}

public int Kapitel_260 ()
{
String Text = "Swimming towards the bank, you can see the ranger spread-eagled at the "
		+ "water’s edge. You reach him but only to find that he has broken his neck in the "
		+ "fall and is dead.\r\n"
		+ "\r\n"
		+ "Suddenly, two Giaks jump on you from above and you must fight them. "
		+ "You are unarmed and must fight the Giaks with your bare hands. Deduct 4 points "
		+ "from your COMBAT SKILL and fight them one at a time.\r\n"
		+ "\r\n"
		+ "Giak 1: COMBAT SKILL 11   ENDURANCE 18\r\n"
		+ "\r\n"
		+ "Giak 2: COMBAT SKILL 12   ENDURANCE 17\r\n"
		+ "\r\n"
		+ "If you win, turn to 156.";
return 260;
}
}
