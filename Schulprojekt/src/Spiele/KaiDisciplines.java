package Spiele;

public class KaiDisciplines {
	private String Name;
	private boolean besitz;
	private int Level;


	public KaiDisciplines(String Name) {
		this.Name = Name;
		this.Level = 5;
		this.besitz = true;
	}
	public KaiDisciplines(String Name,int Level) {
		this.Name = Name;
		this.Level = Level;
		this.besitz = true;
	}

	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	public String getName() {
		return Name;
	}
	public boolean isBesitz() {
		return besitz;
	}
	
	public void Info() {
		switch (this.Name) 
		{
		case "Camouflage":
			System.out.println("This Discipline enables a Kai Lord to blend in with his surroundings. "
				+ "In the countryside, he can hide undetected among trees and rocks and pass close to "
				+ "an enemy without being seen. In a town or city, it enables him to look and sound like a "
				+ "native of that area, and can help him to find shelter or a safe hiding place.");
			return;
		case "Hunting":
			System.out.println("This skill ensures that a Kai Lord will never starve in the wild. He will "
					+ "always be able to hunt for food for himself except in areas of wasteland and desert. "
					+ "The skill also enables a Kai Lord to be able to move stealthily when stalking his prey.");
			return;
		case "Sixth Sense":
			System.out.println("This skill may warn a Kai Lord of imminent danger. It may also reveal the true "
					+ "purpose of a stranger or strange object encountered in your adventure.");
			return;
		case "Tracking":
			System.out.println("This skill enables a Kai Lord to make the correct choice of a path in the wild, "
					+ "to discover the location of a person or object in a town or city and to read the secrets "
					+ "of footprints or tracks.");
			return;
		case "Healing":
			System.out.println("This Discipline can be used to restore ENDURANCE points lost in combat. If you "
					+ "possess this skill you may restore 1 ENDURANCE point to your total for every numbered "
					+ "section of the book you pass through in which you are not involved in combat. (This is only "
					+ "to be used after your ENDURANCE has fallen below its original level.) Remember that your "
					+ "ENDURANCE cannot rise above its original level.");
			return;
		case "Mindshield":
			System.out.println("The Darklords and many of the evil "
					+ "creatures in their command have the ability to attack you using their Mindforce. The Kai Discipline "
					+ "of Mindshield prevents you from losing any ENDURANCE points when subjected to this form of attack.");
			return;
		case "Mindblast":
			System.out.println("This enables a Kai Lord to attack an enemy using the force of his mind. It can be used at "
					+ "the same time as normal combat weapons and adds two extra points to your COMBAT SKILL. Not all the "
					+ "creatures encountered on this adventure will be harmed by Mindblast. You will be told if a creature is immune.");
			return;
		case "Animal Kinship":
			System.out.println("This skill enables a Kai Lord to communicate with some animals and to be able to guess the intentions of others.");
			return;
		case "Mind Over Matter":
			System.out.println("This skill enables a Kai Lord to communicate with some animals and to be able to guess the intentions of others.");
			return;

		default:
			System.out.println("Upon entering the Kai Monastery, each initiate is taught to master one type of weapon. "
					+ "If Weaponskill is to be one of your Kai Disciplines, pick a number in the usual way from the "
					+ "Random Number Table, and then find the corresponding weapon from the list below. This is the weapon "
					+ "in which you have skill. When you enter combat carrying this weapon, you add 2 points to your "
					+ "COMBAT SKILL.\r\n"
					+ "\r\n"
					+ "The fact that you are skilled with a weapon does not mean you set out on the adventure carrying "
					+ "that particular weapon. However, you will have opportunities to acquire weapons in the course of "
					+ "your adventures. If you pick the axe, you are lucky enough to be skilled in the one weapon Lone Wolf "
					+ "is carrying from the start of the adventure.");
			break;
		}
		
	}
	public static KaiDisciplines Crate_Camouflage() {
		
		return new KaiDisciplines("Camouflage");
	}
	public static KaiDisciplines Crate_Hunting() {
		return new KaiDisciplines("Hunting");
	}
	public static KaiDisciplines Crate_Sixth_Sense() {
		return new KaiDisciplines("Sixth Sense");
	}
	public static KaiDisciplines Crate_Tracking() {
		return new KaiDisciplines("Tracking");
	}
	public static KaiDisciplines Crate_Healing() {
		return new KaiDisciplines("Healing");
	}
	public static KaiDisciplines Crate_Weaponskill(String Waffen_Arte) {
		return new KaiDisciplines(Waffen_Arte);
	}
	public static KaiDisciplines Crate_Mindshield() {
		return new KaiDisciplines("Mindshield");
	}
	public static KaiDisciplines Crate_Mindblast() {
		return new KaiDisciplines("Mindblast");
	}
	public static KaiDisciplines Crate_Animal_Kinship() {
		return new KaiDisciplines("Animal Kinship");
	}
	
	public static KaiDisciplines Crate_Mind_Over_Matter() {
		return new KaiDisciplines("Mind Over Matter");
	}


}


