import java.util.*;

public class Primerejercicio {
	
	
	public static void main (String[]args) throws Exception {
		ArrayList lista=new ArrayList();
		//En este array list se puede mezclarlos tipos
		//aunque se pueden poner restricciones que se hace asi:
		//ArrayList<Tipo> lista =new ArrayList();
		Persona p1 =new Persona("Wily");
		Persona p2 =new Persona("Fernando");
		Persona p3=new Persona("Juan");
		Map<String,Persona>m=new HashMap();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		Iterator it=lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//para imprimir una posicion concreta
		System.out.println(lista.get(0));
		
		//modificar el valor de una posicion
		Persona p4=new Persona("dsfgOQIghfoadg");
		lista.add(1,p4);
		System.out.println(lista.get(1));
		//para borrar un campo de la lista
		lista.remove(1);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//El array list no ordena y permite duplicados
	}
}
