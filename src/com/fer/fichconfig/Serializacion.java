package com.fer.fichconfig;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Serializacion implements Serializable{
	public static void main(String[]args) {
		HashMap<String,Producto> listaProductos=new HashMap();
		listaProductos.put("Manzanas",new Producto());
		listaProductos.put("Platanos",new Producto());
		listaProductos.put("Teclado",new Producto());
		ObjectOutputStream serializador = null;
		
		try {
		serializador=new ObjectOutputStream(new FileOutputStream("productos.dat"));
		serializador.writeObject(listaProductos);
		}catch(IOException e)
		{
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

}
