package com.java.projects;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.JSpinner;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class heightConverter extends JFrame {

	private JPanel contentPane;
	private JTextField inText;
	private JTextField cenText;
	private JButton btnNewButton_2;
	private JLabel cenLable;
	private JButton clrButton;
	private JTextField ftText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					heightConverter frame = new heightConverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public heightConverter() {
		setTitle("Feet and Inches conversion ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 387);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ProgressBar.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel ftLable = new JLabel("Feet");
		ftLable.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		ftLable.setLabelFor(ftLable);
		ftLable.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_ftLable = new GridBagConstraints();
		gbc_ftLable.insets = new Insets(0, 0, 5, 5);
		gbc_ftLable.gridx = 0;
		gbc_ftLable.gridy = 1;
		contentPane.add(ftLable, gbc_ftLable);
		
		ftText = new JTextField();
		GridBagConstraints gbc_ftText = new GridBagConstraints();
		gbc_ftText.anchor = GridBagConstraints.EAST;
		gbc_ftText.insets = new Insets(0, 0, 5, 5);
		gbc_ftText.gridx = 1;
		gbc_ftText.gridy = 1;
		contentPane.add(ftText, gbc_ftText);
		ftText.setColumns(10);
		
		JLabel inLable = new JLabel("Inches");
		inLable.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_inLable = new GridBagConstraints();
		gbc_inLable.insets = new Insets(0, 0, 5, 5);
		gbc_inLable.gridx = 0;
		gbc_inLable.gridy = 3;
		contentPane.add(inLable, gbc_inLable);
		
		inText = new JTextField();
		GridBagConstraints gbc_inText = new GridBagConstraints();
		gbc_inText.anchor = GridBagConstraints.EAST;
		gbc_inText.insets = new Insets(0, 0, 5, 5);
		gbc_inText.gridx = 1;
		gbc_inText.gridy = 3;
		contentPane.add(inText, gbc_inText);
		inText.setColumns(10);
		
		JButton conButton = new JButton("Convert To");
		conButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double feet, inches,centimeters;
				
				feet = Double.parseDouble(ftText.getText());
				inches = Double.parseDouble(inText.getText());
				centimeters = (feet * 12 + inches) * 2.54;
				cenText.setText(String.valueOf(centimeters));
			}
		});
		conButton.setForeground(UIManager.getColor("Button.foreground"));
		conButton.setBackground(UIManager.getColor("Button.focus"));
		conButton.setFont(new Font("Verdana", Font.BOLD, 24));
		GridBagConstraints gbc_conButton = new GridBagConstraints();
		gbc_conButton.anchor = GridBagConstraints.WEST;
		gbc_conButton.insets = new Insets(0, 0, 5, 5);
		gbc_conButton.gridx = 1;
		gbc_conButton.gridy = 5;
		contentPane.add(conButton, gbc_conButton);
		
		cenLable = new JLabel("Centimeters");
		cenLable.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_cenLable = new GridBagConstraints();
		gbc_cenLable.insets = new Insets(0, 0, 5, 5);
		gbc_cenLable.gridx = 0;
		gbc_cenLable.gridy = 7;
		contentPane.add(cenLable, gbc_cenLable);
		
		cenText = new JTextField();
		GridBagConstraints gbc_cenText = new GridBagConstraints();
		gbc_cenText.anchor = GridBagConstraints.EAST;
		gbc_cenText.insets = new Insets(0, 0, 5, 5);
		gbc_cenText.gridx = 1;
		gbc_cenText.gridy = 7;
		contentPane.add(cenText, gbc_cenText);
		cenText.setColumns(10);
		
		clrButton = new JButton("Clear");
		clrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ftText.setText("");
				inText.setText("");
				cenText.setText("");
			}
		});
		clrButton.setBackground(Color.MAGENTA);
		clrButton.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_clrButton = new GridBagConstraints();
		gbc_clrButton.anchor = GridBagConstraints.WEST;
		gbc_clrButton.insets = new Insets(0, 0, 5, 5);
		gbc_clrButton.gridx = 0;
		gbc_clrButton.gridy = 9;
		contentPane.add(clrButton, gbc_clrButton);
		
		btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBackground(new Color(255, 102, 102));
		btnNewButton_2.setForeground(UIManager.getColor("Button.focus"));
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 14));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 9;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
	}

}
