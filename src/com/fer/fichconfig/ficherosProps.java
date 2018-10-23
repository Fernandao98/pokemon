package com.fer.fichconfig;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ficherosProps {

	public static void main(String[] args) {
		
		Properties config=new Properties();
		config.setProperty("user", "Fernandao");
		config.setProperty("password", "1234");
		config.setProperty("port", "2205");
		config.setProperty("reproduccion_continua", String.valueOf(true));
		config.setProperty("subtitulo", String.valueOf(true));
		System.out.println(System.getProperty("java.class.path"));
		try {
		config.store(new FileOutputStream(System.getProperty("user.home")+File.separator+"configuracion.props"), "Configuracion del programa");
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
