import java.util.*;
public class Persona {
	String nombre;
	
Persona(String nombre) {
	
	this.nombre=nombre;
	
}

@Override
public String toString() {
	return "Persona [nombre=" + nombre + "]";
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
}