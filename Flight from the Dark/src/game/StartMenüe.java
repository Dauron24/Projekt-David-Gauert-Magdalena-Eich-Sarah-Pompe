package game;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.*;


public class StartMen�e extends JDialog {
	
	public StartMen�e() {
		// TODO Auto-generated constructor stub
		super();
		//Layout setzen und Komponenten hinzuf�gen
		setSize(300,200);
		setLayout(new BorderLayout());
		
		JLabel frage = new JLabel("F�r welche Themen interessierst du dich?");
         
        // Array f�r unsere JList
        
        //JList mit Eintr�gen wird erstellt
        JList themenAuswahl = new JList();
 
        //JList wird Panel hinzugef�gt
       	add(frage, BorderLayout.NORTH);
		add(themenAuswahl, BorderLayout.CENTER);
	}

}
