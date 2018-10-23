import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;

public class List_a_fichero {

	public static void main(String[] args) {
		try {
		
		//declaracion del array list y relleno
		ArrayList lista=new ArrayList();
		String[]cantantes= {"Gang starr","Ski mask","Denzel curry","Wu tang clan","Nas"};
		for(int i=0;i<5;i++) {
			lista.add(cantantes[i]);
		}
		//declaracion de el RAF
		
		RandomAccessFile fa=new RandomAccessFile("cantantes.txt","rw");
		
		//introduccion de datos al fichero
		Iterator it=lista.iterator();
		while(it.hasNext()) {
			fa.writeUTF(convertUTF((String)it.next(),20));
		}
		fa.close();
		//leer el primero y el ultimo
		
		leerAleatorio("cantantes.txt",0);
		leerAleatorio("cantantes.txt",88);
		
		
		}
		catch(IOException e) {
			
		}
	}


public static String convertUTF (String txt, int largo) {
	String s = txt;
	// Trunca el string si es más grande siempre será 30 si es más sólo mostrará 30
	if (s.length() > largo)  //
		return s.substring(0, largo);
	// Rellena con espacios si le faltan
	for (int n=s.length(); n<largo; n++)
		s=s +" ";
	return s;

}
public static void leerAleatorio(String fichero,int pos) {
	try {
	RandomAccessFile fa2=new RandomAccessFile(fichero,"rw");
	String res;
	fa2.seek(pos);
	res=fa2.readUTF();
	System.out.println(res);
	
	fa2.close();
	}catch(IOException e) {
		
	}
}
}