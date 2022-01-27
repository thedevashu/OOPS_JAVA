package study.practice;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductMain {

	public static void serializeArr() {
		Product arr[]=new Product[5];
		arr[0] =new Product("ABC", "sdkf", 599, "XYZ");
		arr[1] =new Product("YHN", "wer", 789, "MJU");
		arr[2] =new Product("UJM", "yui", 369, "BGT");
		arr[3] =new Product("RFV", "bnm", 696, "CDE");
		arr[4] =new Product("EDC", "sdasdfkf", 7989, "ZQA");
		
		//making Output Stream to write file on HDD
		FileOutputStream fwrite=null;
		//making object output stream to write the serialize object arr in file
		ObjectOutputStream objWrite =null;
		try {
			fwrite =new FileOutputStream("P://products.obj");
			objWrite = new ObjectOutputStream(fwrite);
			
			objWrite.writeObject(arr);//passing arr object to be written on file
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fwrite.flush();
				fwrite.close();
				
				objWrite.flush();
				objWrite.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
