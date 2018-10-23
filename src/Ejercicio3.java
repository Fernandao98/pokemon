import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		Map<String,String>m=new HashMap();
		m.put("Doctor", "(+52)-4000-5000");
		m.put("Casa", "(888)-4500-3400");
		m.put("Hermano", "(575)-2042-3233");
		m.put("Tio", "(421)-1010-0020");
		m.put("Suegros", "(334)-6105-4334");
		m.put("Oficina", "(304)-5205-8454");
		m.put("Abogado", "(756)-1205-3454");
		m.put("Papa", "(55)-9555-3270");
		m.put("Tienda", "(874)-2400-8600");
		
		mostrarAgenda(m);
	}
	public static void mostrarAgenda(Map agenda) {
		Iterator it=agenda.keySet().iterator();
		while(it.hasNext()) {
			String clave=(String)it.next();
			Object valor=(Object)agenda.get(clave);
			System.out.println("Nombre :"+clave+"\nNumero :"+valor);
		}
	}
}
