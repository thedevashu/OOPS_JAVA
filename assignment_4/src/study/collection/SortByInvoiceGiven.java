package study.collection;

import java.util.Comparator;

public class SortByInvoiceGiven implements Comparator<Invoice> {

	@Override
	public int compare(Invoice o1, Invoice o2) {
		
		return o1.getInvoiceGivenBy().compareTo(o2.getInvoiceGivenBy());
	}

}
