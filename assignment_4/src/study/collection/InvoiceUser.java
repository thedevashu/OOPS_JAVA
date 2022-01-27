package study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class InvoiceUser {

	public static void main(String[] args) {
		List<Invoice> l =new ArrayList<>();
		populate(l);
		
		menu(l);
		
		
//		for (Invoice in : l) {
//			System.out.println(in);
//		}
//		System.out.println("---");
//		Collections.sort(l);
//		for (Invoice in : l) {
//			System.out.println(in);
//		}
		
	}

	private static void menu(List<Invoice> l) {
		while(true) {
		System.out.println("1. Show invoice sorted by dateOfInvoice  (  default/natural ordering )  --- show using Iterator\r\n" + 
				"2. Show sorted by amount in  descending order   ---show for normal for loop\r\n" + 
				"3. Sorted on invoiceGivenBy  --- show using for(Invoice v : invoices )\r\n" + 
				"4. Sorted on invoiceGivenTo --- show by Enumeration\r\n" + 
				"5.  Show the Invoice details of invoice with max amount  ( Collections.max )\r\n" + 
				"6. Show the Invoice details of invoice with latest date ( Collections.max ) \r\n" + 
				" 7. quit");
		
		Scanner sc =new Scanner(System.in);
		int key =sc.nextInt();
		if(key == 7) break;
		
		switch (key) {
		case 1:{
			Collections.sort(l, new SortByInvoiceDate());
			for (Invoice i : l) {
				System.out.println(i);
			}
			break;
		}
		case 2:{
			Collections.sort(l, new SortByAmountDecending());
			for(int i =l.size()-1;i>=0;i--) {
				System.out.println(l.get(i)+"\n");
			}
			break;
		}
		case 3:{
			Collections.sort(l, new SortByInvoiceGiven());
			Iterator< Invoice> it =l.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			break;
		}
		
		case 4:{
			Collections.sort(l, new SortByInvoiceTaken());
			Enumeration<Invoice> e = Collections.enumeration(l);
			while (e.hasMoreElements()) {
				System.out.println(e.nextElement());
			}
			
			break;
		}
		case 5:{
			Invoice imax=Collections.max(l,new SortByAmountDecending());
			System.out.println(imax);
			break;
		}
		case 6:{
			Invoice latestDate =Collections.max(l, new SortByInvoiceDate());
			System.out.println(latestDate);
			break;
		}

		default:
			break;
		}
		
		}
		
	}

	private static void populate(List<Invoice> l) {
		l.add(new Invoice(new MyDate3(19, 11, 2021), 500, "cae", "hmf"));
		l.add(new Invoice(new MyDate3(12, 11, 2001), 3400, "brrs", "fgf"));
		l.add(new Invoice(new MyDate3(29, 8, 1971), 200, "dhnd", "dfb 3"));
		l.add(new Invoice(new MyDate3(14, 6, 2012), 1000, "zafs", "erdh 4"));
		l.add(new Invoice(new MyDate3(21, 4, 2015), 760, "ahe", "agvag 5"));
		
		
	}

}//end user


class SortByInvoiceDate implements Comparator<Invoice>{

	@Override
	public int compare(Invoice o1, Invoice o2) {
		
		return o1.getDateOfInvoice().compareTo(o2.getDateOfInvoice());
	}

	
	
	
	
}//end SortByInvoiceDate