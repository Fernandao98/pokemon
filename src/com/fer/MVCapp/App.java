package com.fer.MVCapp;

import java.io.IOException;

import javax.swing.JOptionPane;

import com.fer.MVCapp.ui.View;

public class App {

	public static void main(String[] args) {
		View vista=new View();
		try {
		Model modelo=new Model();
		Controller controlador=new Controller(vista,modelo);
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, "No se puede leer el disco", "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}catch(ClassNotFoundException cnfe) {
			JOptionPane.showMessageDialog(null, "El formato no es correcto.No se puede iniciar", "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
		
	}

}
