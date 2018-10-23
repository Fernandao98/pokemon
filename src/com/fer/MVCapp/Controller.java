package com.fer.MVCapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.fer.MVCapp.base.Pokemon;
import com.fer.MVCapp.base.Pokemon.Tipo;
import com.fer.MVCapp.ui.View;
import com.fer.metodos.Metodos;

public class Controller implements ActionListener, MouseListener{
	
	private Model Model;
	private View vista;
	private File ficheroSeleccionado;
	
	public Controller(View vista,Model modelo) throws ClassNotFoundException, IOException {
		this.vista=vista;
		this.Model=modelo;
		addListeners();
		poblarTiposPokemon();
		
		refrescarLista();
		
		Pokemon valor=null;
		Iterator it= Model.getHashMap().keySet().iterator();
		while(it.hasNext()) {
			String clave=(String)it.next();
			valor=(Pokemon)Model.getHashMap().get(clave);
			vista.pokemonsModelo.addElement(valor);
			
		}
		
		
		
	}
	public void addListeners() {
		vista.anadirBt.addActionListener(this);
		vista.imagenL.addMouseListener(this);
	}
	public void pintarHashMap(Map<String,Pokemon> pokemones) {
		
		Pokemon valor=null;
		Iterator it= pokemones.keySet().iterator();
		while(it.hasNext()) {
			String clave=(String)it.next();
			valor=(Pokemon)pokemones.get(clave);
			vista.pokemonsModelo.addElement(valor);
			
		}
	}
	private void poblarTiposPokemon() {
		for(Tipo tipo: Tipo.values()) {
			vista.tipoCB.addItem(tipo);
		}
	}
	
	private void refrescarLista() {
		vista.pokemonsModelo.removeAllElements();
		for(Pokemon pokemon : Model.getPokemones()) {
			vista.pokemonsModelo.addElement(pokemon);
		}
		
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		case "anadir":
			
			comprobarDatos();
			
			String nombre=vista.nombreF.getText();
			Tipo tipo=(Tipo) vista.tipoCB.getSelectedItem();
			int nivel= Integer.parseInt(vista.nivelF.getText());
			float peso=Float.parseFloat(vista.pesoF.getText());
			Pokemon pokemon=new Pokemon();
			pokemon.setNombre(nombre);
			pokemon.setNivel(nivel);
			pokemon.setPeso(peso);
			pokemon.setTipo(tipo);
			
			try {
			Model.guardar(pokemon);
			vista.pokemonsModelo.addElement(pokemon);
			}catch(IOException e1) {
				JOptionPane.showMessageDialog(null, "Error al guardar en el disco", "Error", JOptionPane.ERROR_MESSAGE);
			}
					break;
		default:
			break;
		}
	}
	public boolean comprobarDatos() {
		
		
		if(vista.nombreF.getText().equals("")) {
			JOptionPane.showMessageDialog(null,
					"El campo es obligatorio",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		if(vista.nivelF.getText().equals("")){
			vista.nivelF.setText("0");
		}
		
		if(vista.pesoF.getText().equals("")){
			vista.pesoF.setText("0");
		}
		
		if (!vista.nivelF.getText().matches("[0-9]*")){
			JOptionPane.showMessageDialog(null, "El nivel tiene que ser un numero", "Error", JOptionPane.ERROR_MESSAGE);
			vista.nivelF.selectAll();
			vista.nivelF.requestFocus();
			return false;
		}
		
		if (!vista.pesoF.getText().matches("[0-9]*.[0-9]*")){
			JOptionPane.showMessageDialog(null, "El peso tiene que ser un numero", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		return true;
}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(null)==JFileChooser.CANCEL_OPTION) {
			return;
		}
		File ficheroSeleccionado = jfc.getSelectedFile();
		vista.imagenL.setIcon(new ImageIcon(ficheroSeleccionado.getAbsolutePath()));
		nombreImagen = ficheroSeleccionado.getName();
		try {
			Metodos.copiarImagen(ficheroSeleccionado.getAbsolutePath(), nombreImagen);
		}catch(IOException e) {
			e.printStackTrace();
			//TODO JOptionPane
		}
	
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

