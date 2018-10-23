package com.fer.MVCapp.ui;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import com.fer.MVCapp.base.Pokemon;
import com.fer.MVCapp.base.Pokemon.Tipo;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class View extends JFrame {

	
	
	public JTextField nombreF;
	public JTextField nivelF;
	public JTextField pesoF;
	public JButton anadirBt;
	public JComboBox<Tipo> tipoCB;
	public JScrollPane scrollPane;
	public JList<Pokemon> pokemonsLista;
	public DefaultListModel<Pokemon> pokemonsModelo ;
	public JLabel imagenL;
	

	public View() {
		
		
		
		initGUI();
	}
	private void initGUI() {
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel nombreL = new JLabel("Nombre*");
		springLayout.putConstraint(SpringLayout.NORTH, nombreL, 13, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, nombreL, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, nombreL, 57, SpringLayout.WEST, getContentPane());
		getContentPane().add(nombreL);
		
		nombreF = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, nombreF, 25, SpringLayout.EAST, nombreL);
		springLayout.putConstraint(SpringLayout.EAST, nombreF, -511, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, nombreF, 10, SpringLayout.NORTH, getContentPane());
		getContentPane().add(nombreF);
		nombreF.setColumns(10);
		
		JLabel nivelL = new JLabel("Nivel");
		springLayout.putConstraint(SpringLayout.NORTH, nivelL, 23, SpringLayout.SOUTH, nombreL);
		springLayout.putConstraint(SpringLayout.EAST, nivelL, 0, SpringLayout.EAST, nombreL);
		getContentPane().add(nivelL);
		
		nivelF = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, nivelF, 17, SpringLayout.SOUTH, nombreF);
		springLayout.putConstraint(SpringLayout.WEST, nivelF, 25, SpringLayout.EAST, nivelL);
		springLayout.putConstraint(SpringLayout.EAST, nivelF, -511, SpringLayout.EAST, getContentPane());
		getContentPane().add(nivelF);
		nivelF.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		springLayout.putConstraint(SpringLayout.NORTH, lblTipo, 21, SpringLayout.SOUTH, nivelL);
		springLayout.putConstraint(SpringLayout.EAST, lblTipo, 0, SpringLayout.EAST, nombreL);
		getContentPane().add(lblTipo);
		
		tipoCB = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, tipoCB, 15, SpringLayout.SOUTH, nivelF);
		springLayout.putConstraint(SpringLayout.WEST, tipoCB, 25, SpringLayout.EAST, lblTipo);
		springLayout.putConstraint(SpringLayout.EAST, tipoCB, -511, SpringLayout.EAST, getContentPane());
		getContentPane().add(tipoCB);
		
		JLabel pesoL = new JLabel("Peso");
		springLayout.putConstraint(SpringLayout.NORTH, pesoL, 19, SpringLayout.SOUTH, lblTipo);
		springLayout.putConstraint(SpringLayout.EAST, pesoL, 0, SpringLayout.EAST, nombreL);
		getContentPane().add(pesoL);
		
		pesoF = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, pesoF, 13, SpringLayout.SOUTH, tipoCB);
		springLayout.putConstraint(SpringLayout.WEST, pesoF, 25, SpringLayout.EAST, pesoL);
		springLayout.putConstraint(SpringLayout.EAST, pesoF, -511, SpringLayout.EAST, getContentPane());
		getContentPane().add(pesoF);
		pesoF.setColumns(10);
		
		anadirBt = new JButton("A\u00F1adir");
		springLayout.putConstraint(SpringLayout.NORTH, anadirBt, 30, SpringLayout.SOUTH, pesoF);
		springLayout.putConstraint(SpringLayout.WEST, anadirBt, 82, SpringLayout.WEST, getContentPane());
		anadirBt.setActionCommand("anadir");
		getContentPane().add(anadirBt);
		
		this.setVisible(true);
		this.setSize(700, 500);
		
		scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 0, SpringLayout.NORTH, nombreL);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 108, SpringLayout.EAST, nombreF);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 191, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 250, SpringLayout.EAST, nivelF);
		getContentPane().add(scrollPane);
		
		pokemonsLista = new JList<>();
		scrollPane.setViewportView(pokemonsLista);
		pokemonsModelo=new DefaultListModel<>();
		pokemonsLista.setModel(pokemonsModelo);
		
		imagenL = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, imagenL, 0, SpringLayout.NORTH, nombreL);
		springLayout.putConstraint(SpringLayout.WEST, imagenL, 36, SpringLayout.EAST, scrollPane);
		springLayout.putConstraint(SpringLayout.SOUTH, imagenL, 172, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, imagenL, 161, SpringLayout.EAST, scrollPane);
		imagenL.setIcon(new ImageIcon("C:\\Users\\AlumnoT\\Desktop\\Nueva carpeta\\sad.PNG"));
		imagenL.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(imagenL);
	}
}
