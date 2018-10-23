import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class paroimpar_ficheros {
	public static void main(String [] args) {
		try {
		//declarar lista de enteros//
		ArrayList lista=new ArrayList();
		int[] nums= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<9;i++) {
			lista.add(nums[i]);
		}
		BufferedWriter fw=new BufferedWriter(new FileWriter("numeros.txt",false));
		Iterator it=lista.iterator();
		while(it.hasNext()) {
			fw.write((String)it.next());
			fw.newLine();
		}
		fw.close();
		
		BufferedReader fr=new BufferedReader(new FileReader("numeros.txt"));
		while(fr.ready()) {
			
		}
		}
		catch(IOException e) {
			
		}
	}
}
