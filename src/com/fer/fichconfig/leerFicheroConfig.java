package com.fer.fichconfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class leerFicheroConfig {

	public static void main(String[] args) {
		Properties config=new Properties();
		try {
		config.load(new FileInputStream(System.getProperty("user.home") + File.separator + "configuracion.props"));
		boolean subtitulo=Boolean.parseBoolean(config.getProperty("subtitulo"));
		if(!subtitulo)
		{
			System.out.println("No hay que cargar los subtitulos");
		}else
		{
			System.out.println("Hay que cargar los subtitulos");
		}
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
