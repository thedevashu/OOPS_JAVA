package product.hasrelation;

import java.util.Scanner;

public class MainShop {

	public static void main(String[] args) {
		MainShop s= new MainShop();
		s.toString();
		Scanner scn =new Scanner(System.in);

		int size =3;
		int newSize=3;
		Product p[] =new Product[100];
		
		MyDate expD =new MyDate(1,1,2021);
		while(true) {
			System.out.println("Press 1 to Update Products\nPress 2 to Buy Products");

			short user =scn.nextShort();
			if(user >2) break;
			if(user ==1) {
				newSize =updateFun(p,scn,size,expD);
				System.out.println("UPDATE DONE");
				}
			
			else {


				p[0]= new Product("Maggi ","Good",10,expD);
				expD=new MyDate(2,12,2020); 
				p[1]=new Product("Parle G ","Vgood",5,expD);
				expD=new MyDate(3,12,2021); 
				p[2]=new Product("Chips ","VVgood",15,expD);

				for(int i=0;i<newSize;i++) {
					System.out.println("Prod No."+(i+1)+" -->"+p[i]);
				}
				System.out.println("Enter product number and its quantity");
				int prod =scn.nextInt();
				int num =scn.nextInt();

				bill(prod-1,p,num);
			}
		}
	}
	private static int  updateFun(Product[] p, Scanner scn, int size, MyDate expD) {
		System.out.println("Enter no of product to be added");
		int pUpdate =scn.nextInt();
		size+=pUpdate;
		for(int i=3;i<size;i++) {
			System.out.println("Enter product name: ");
			String pName =scn.next();
			System.out.println("Enter Description:");
			String pDis =scn.next();
			System.out.println("Enter price :");
			int pCost =scn.nextInt();

			System.out.println("Enter expire Date in dd/mm/yyyy");
			String expDate = scn.next();

			String dt[] =expDate.split("/");

			int day = Integer.parseInt(dt[0]);
			int month = Integer.parseInt(dt[1]);
			int year = Integer.parseInt(dt[2]);
			expD =new MyDate(day,month,year);
			p[i] =new Product(pName,pDis,pCost,expD);
		
	}
		return size;
	}

	private static void bill(int pNo,Product[] p,int num) {

		
		if(p[pNo].getExpDate().getYear() >= 2021 && p[pNo].getExpDate().getMonth() <= 11 && p[pNo].getExpDate().getDay() <= 12) {
			System.out.println(p[pNo].getProductName()+","+p[pNo].getDesc() +"Quantity: "+num+",Total Price: "+p[pNo].getCost()*num);

		}
		else {
			System.out.println("Sorry Date Expired!!");
		}

	}

}
