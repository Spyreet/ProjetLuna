package com.formation.vue;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JTable;
import java.awt.ComponentOrientation;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.DebugGraphics;
import java.awt.Cursor;
import javax.swing.JTabbedPane;

public class PCommands extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public PCommands() {
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 0));
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setPressedIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Home-48-actif.png")));
		btnAccueil.setFocusPainted(false);
		btnAccueil.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAccueil.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAccueil.setContentAreaFilled(false);
		btnAccueil.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Home-48.png")));
		
		JButton btnNewButton_1 = new JButton("Commandes existantes");
		btnNewButton_1.setPressedIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/commande/Receipt-48-actif.png")));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/commande/Receipt-48.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_2 = new JButton("Supprimer");
		btnNewButton_2.setPressedIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Cancel-48-actif.png")));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Cancel-48.png")));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setContentAreaFilled(false);
		
		JButton btnNewButton_3 = new JButton("Supprimer toutes les lignes");
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setPressedIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Garbage-Open-48-actif.png")));
		btnNewButton_3.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Garbage-Open-48.png")));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnValiderCommande = new JButton("Valider commande");
		btnValiderCommande.setPressedIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/commande/Shopping-Cart-05-48-actif.png")));
		btnValiderCommande.setFocusPainted(false);
		btnValiderCommande.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/commande/Shopping-Cart-05-48.png")));
		btnValiderCommande.setContentAreaFilled(false);
		btnValiderCommande.setForeground(new Color(255, 255, 255));
		btnValiderCommande.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnAperu = new JButton("Aper\u00E7u");
		btnAperu.setFocusPainted(false);
		btnAperu.setPressedIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Preview-48-actif.png")));
		btnAperu.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Preview-48.png")));
		btnAperu.setContentAreaFilled(false);
		btnAperu.setForeground(new Color(255, 255, 255));
		btnAperu.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAperu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setPressedIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Printer-48-actif.png")));
		btnImprimer.setFocusPainted(false);
		btnImprimer.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Printer-48.png")));
		btnImprimer.setContentAreaFilled(false);
		btnImprimer.setForeground(new Color(255, 255, 255));
		btnImprimer.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnExport = new JButton("Export");
		btnExport.setFocusPainted(false);
		btnExport.setPressedIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Data-Export-48-actif.png")));
		btnExport.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Data-Export-48.png")));
		btnExport.setContentAreaFilled(false);
		btnExport.setForeground(new Color(255, 255, 255));
		btnExport.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblCommandes = new JLabel("Commandes");
		lblCommandes.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/commande/Shopping-Bag-64-actif.png")));
		lblCommandes.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAccueil, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(34)
							.addComponent(lblCommandes, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_1)
						.addComponent(btnValiderCommande)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
						.addComponent(btnAperu)
						.addComponent(btnImprimer)
						.addComponent(btnExport))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCommandes)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(btnValiderCommande, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAperu, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimer)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnExport, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAccueil)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 153, 0)), "Informations g\u00E9n\u00E9rales", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 153, 0)), "Valeurs de la commande", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 549, Short.MAX_VALUE)
					.addGap(1))
		);
		
		JButton btnNewButton_4 = new JButton("S\u00E9lectionner un article");
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton_4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 51, 0)));
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBackground(new Color(255, 153, 0));
		btnNewButton_4.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Search-32.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblCode = new JLabel("Code");
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cat\u00E9gorie");
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("D\u00E9signation");
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		JLabel lblMontant = new JLabel("Montant");
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		
		JSpinner spinner = new JSpinner();
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setContentAreaFilled(false);
		btnAjouter.setFocusPainted(false);
		btnAjouter.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Add-New-48.png")));
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setContentAreaFilled(false);
		btnModifier.setFocusPainted(false);
		btnModifier.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Data-Edit-48.png")));
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Cancel-48.png")));
		btnSupprimer.setContentAreaFilled(false);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblCode)
									.addGap(10)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(4)
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblMontant)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblQuantit)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(spinner, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(20)
							.addComponent(btnAjouter)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnModifier)
							.addGap(18)
							.addComponent(btnSupprimer)))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCode))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMontant)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblQuantit))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAjouter)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(103, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblCommandes_1 = new JLabel("Commandes en cours");
		lblCommandes_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JLabel lblNomDuClient = new JLabel("Nom du client ");
		lblNomDuClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnNewButton = new JButton("S\u00E9lectionner le client");
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 51, 0)));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setIcon(new ImageIcon(PCommands.class.getResource("/images/gestion/Search-32.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNomDuClient)
						.addComponent(lblCommandes_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblDate)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCommandes_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDate)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomDuClient)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(87))
		);
		panel_1.setLayout(gl_panel_1);
		setLayout(groupLayout);

	}
}