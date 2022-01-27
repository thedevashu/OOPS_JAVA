package study.collection;

import java.util.Comparator;

public class SortByInvoiceTaken implements Comparator<Invoice> {

	@Override
	public int compare(Invoice o1, Invoice o2) {
		
		return o1.getInvoiceGivenTo().compareTo(o2.getInvoiceGivenTo());
	}
}
