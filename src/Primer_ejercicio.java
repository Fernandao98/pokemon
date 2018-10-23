import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Primer_ejercicio {
	
	
	public static void main (String[]args) throws Exception {


		Persona p1 =new Persona("Wily");
		Persona p2 =new Persona("Fernando");
		Persona p3=new Persona("Juan");
		Map<String,Persona>m=new HashMap();
		
		//añadir en un map
		
		m.put("01",p1);
		m.put("02",p2);
		m.put("03",p3);
		
		Iterator it=m.keySet().iterator();
		while(it.hasNext()) {
			String clave=(String)it.next();
			Object valor=(Object)m.get(clave);
			System.out.println("La clave es "+clave+" y el valor "+valor);
		}
		
	}
}
