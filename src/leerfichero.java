import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class leerfichero {
public static void main(String[] args) {
	try {
		BufferedReader fr=new BufferedReader(new FileReader("Productos.txt"));
		while(fr.ready()) {
			
			String linea=fr.readLine();
			System.out.println(linea);
			
		}
		fr.close();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
}