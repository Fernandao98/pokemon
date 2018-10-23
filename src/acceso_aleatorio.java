import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

//crear fichero aleatorio dnd pedimos por teclado nombres y notas
public class acceso_aleatorio {
	public static void main(String[]args) {
		try {
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			RandomAccessFile fa=new RandomAccessFile("notas.txt","rw");
			for (int i=0;i<4;i++) {
				System.out.println("Introduce nombre ");
				fa.writeUTF(convertUTF(teclado.readLine(),20));
				System.out.println("Introduce nota ");
				fa.writeDouble(new Double(teclado.readLine()).doubleValue());
			}
			fa.close();
		}catch(IOException e) {
			
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
}
