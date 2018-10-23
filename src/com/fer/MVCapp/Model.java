package com.fer.MVCapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.fer.MVCapp.base.Pokemon;
import com.fer.MVCapp.ui.View;


public class Model {
	private HashMap<String,Pokemon> pokemones;
	private final String ARCHIVO="Pokemones.dat";
	
	public Model() throws ClassNotFoundException, IOException {
		if(new File(ARCHIVO).exists())
			cargarDeDisco();
		else
			pokemones= new HashMap<String,Pokemon>();
	}
	public void guardar(Pokemon pokemon) throws IOException {
		
		pokemones.put(pokemon.getNombre(), pokemon);
		serializarHashMap();
	}
	
	public void eliminar(Pokemon pokemon){
		
	}
	
	public void modificar(String nombre,Pokemon pokemon) {
		
	}
	
	public Pokemon getPokemon(String nombre) {
		return null;
	}
	
	public ArrayList<Pokemon> getPokemones(){
		return new ArrayList<Pokemon>(pokemones.values());
	}
	public void eliminarTodo() {
		
	}
	
	public HashMap<String,Pokemon> getHashMap() {
		return pokemones;
	}
	public void setHashMap(HashMap<String,Pokemon> pokemones) {
		this.pokemones = pokemones;
	}
	
	public HashMap damelo() {
		return pokemones;
	}
	public void serializar() throws IOException{
		ObjectOutputStream serializador=new ObjectOutputStream(new FileOutputStream(ARCHIVO));
		serializador.writeObject(pokemones);
		serializador.close();	
	}
	public void cargarDeDisco() throws IOException,ClassNotFoundException{
		ObjectInputStream deserializador=new ObjectInputStream(new FileInputStream (ARCHIVO));
		pokemones=(HashMap<String, Pokemon>) deserializador.readObject();
		deserializador.close();
		
	}
	public void serializarHashMap() {
		ObjectOutputStream serializador=null;
		
		try {
			serializador=new ObjectOutputStream(new FileOutputStream(ARCHIVO));
			serializador.writeObject(pokemones);
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
}



