package game;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


@SuppressWarnings("serial")
public class StartMenüe extends JDialog {

	/**
	 * Erstellen den Start Menües.
	 */
	public StartMenüe() {
		
		//Die Große des Genster
		setBounds(100, 100, 303, 300);
		
		//Einrichte des Tittel der Seite
		JLabel lblNewLabel = new JLabel("Flight from the Dark");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 16));
		
		//Die Auswhliste
		String[] values = new String[] {"Neues Spiele", "Spiele Laden", "Danksagung", "Spiele Benden"};	
		JList<Object> list = new JList<Object>(values);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//Listen Evente
		
		list.addListSelectionListener((ListSelectionListener) new ListSelectionListener() {			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				switch (list.getSelectedValue().toString()) {
				case "Neues Spiele" ->{ 
					createCharakter neuerCharakter = new createCharakter();
					neuerCharakter.setVisible(true);
					dispose();
				}
				case "Spiele Laden" -> JOptionPane.showMessageDialog(null, "Spiele Laden");
				case "Danksagung" -> JOptionPane.showMessageDialog(null, "Danksagung");
				case "Spiele Benden" -> JOptionPane.showMessageDialog(null, "Spiele Benden");	
				
				}
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(52)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(125))
		);
		getContentPane().setLayout(groupLayout);
	}

}
