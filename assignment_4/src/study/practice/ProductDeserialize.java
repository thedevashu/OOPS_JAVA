package study.practice;
import java.io.*;


public class ProductDeserialize {
	
	public static Product[] deserializeProduct() {
		//make input stream to read file from hdd
		FileInputStream fread=null;
		
		//deserializing object file
		
		ObjectInputStream oin =null;
		
		try {
			fread=new FileInputStream("P://products.obj");
			oin =new ObjectInputStream(fread);
			
			Object obj =oin.readObject();//taking object file reference in obj
			
			return (Product[])obj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		finally {
			try {
				fread.close();
				oin.close();
				
			}
			catch(Exception e) {
				
			}
			
		}
		
		
	}
		
		
		
		

}
