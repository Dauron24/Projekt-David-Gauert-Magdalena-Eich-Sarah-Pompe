package game;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.*;


public class StartMenüe extends JDialog {
	
	public StartMenüe() {
		// TODO Auto-generated constructor stub
		super();
		//Layout setzen und Komponenten hinzufügen
		setSize(300,200);
		setLayout(new BorderLayout());
		
		JLabel frage = new JLabel("Für welche Themen interessierst du dich?");
         
        // Array für unsere JList
        
        //JList mit Einträgen wird erstellt
        JList themenAuswahl = new JList();
 
        //JList wird Panel hinzugefügt
       	add(frage, BorderLayout.NORTH);
		add(themenAuswahl, BorderLayout.CENTER);
	}

}
