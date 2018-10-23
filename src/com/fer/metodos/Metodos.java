package com.fer.metodos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Metodos {
	public static void serializarHashMap(Map map,String nom_archivo) {
		ObjectOutputStream serializador=null;
		
		try {
			serializador=new ObjectOutputStream(new FileOutputStream(nom_archivo));
			serializador.writeObject(map);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if (serializador!=null)
			{
				try
				{
					serializador.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 * Copia una imagen desde la ruta original a la carpeta de imagenes
	 * @param rutaOrigen
	 * @param rutaDestino
	 */
	public static void copiarImagen(String rutaOrigen,String rutaDestino) throws IOException
	{
		Path origen = FileSystems.getDefault().getPath(rutaOrigen);
		
		FileOutputStream destino= new FileOutputStream(new File(System.getProperty("user.dir")+File.separator + "imagenes" + File.separator + rutaDestino));
		Files.copy(origen, destino);
	}
}

