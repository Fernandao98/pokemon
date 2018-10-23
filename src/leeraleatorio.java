import java.io.IOException;
import java.io.RandomAccessFile;

public class leeraleatorio {
	public static void main(String[] args) {
		try {
			RandomAccessFile fa=new RandomAccessFile("nota.tx","rw");
		
			fa.seek(30);
			String res=fa.readUTF()+" "+fa.readDouble();
			System.out.println(res);
			fa.close();
		}catch(IOException e) {
		e.printStackTrace();

		}
	}
}
