package study.collection;

import java.util.Comparator;

public class SortByAmountDecending implements Comparator<Invoice> {

	@Override
	public int compare(Invoice o1, Invoice o2) {
//		Double d1 =o1.getAmount();
//		Double d2 =o2.getAmount();
		if(o1.getAmount() > o2.getAmount() ) return 1;
		if(o1.getAmount() < o2.getAmount() ) return -1;
		else	return 0;
	}

}
