package game;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

@SuppressWarnings("serial")
public class createCharakter extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the dialog.
	 */
	public createCharakter() {
		setBounds(100, 100, 642, 580);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Spieler Name");
		
		JLabel lblNewLabel_1 = new JLabel("Action Chart");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblCombatSkill = new JLabel("COMBAT SKILL");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("W\u00FCrfeln");
		
		JLabel lblEndurance = new JLabel("ENDURANCE");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("W\u00FCrfeln");
		
		JList list = new JList();
		
		JLabel lblKaiDisciplines = new JLabel("Kai Disciplines");
		
		
		
		JButton btnNewButton_2 = new JButton("Kai Discipline hinzuf\u00FCgen");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(43)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(list, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(lblCombatSkill, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnNewButton))
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(lblKaiDisciplines, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(60)
									.addComponent(lblEndurance, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addGap(4)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(34)
									.addComponent(btnNewButton_2))))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addGap(60)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblEndurance))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_1)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCombatSkill)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton)))
					.addGap(18)
					.addComponent(lblKaiDisciplines)
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2))
					.addContainerGap(212, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
		
		
	}
}
