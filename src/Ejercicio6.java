import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		Map<String,Empleado>m=new HashMap();
	
	
		
		m.put("34806408V",new Empleado("Pablo Fdez"));
		m.put("34186581A",new Empleado("Pablo Fdez"));
		mostrarDatos(m);
		m.remove("34186581A");
				
	}
	public static void mostrarDatos(Map m){
		Iterator it=m.keySet().iterator();
		while(it.hasNext()) {
			String clave=(String)it.next();
			Object valor=(Object)m.get(clave);
			System.out.println("Nombre :"+clave+"\nNumero :"+valor);
	}
	}
}
