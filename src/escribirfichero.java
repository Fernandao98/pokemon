import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class escribirfichero {
public static void main(String[] args) {
	try {
		BufferedWriter fe=new BufferedWriter(new FileWriter("Productos.txt",true));
		for (int i=0;i<3;i++)
		{
			fe.write("Producto "+i);
			fe.newLine();
		}
	fe.close();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
}
