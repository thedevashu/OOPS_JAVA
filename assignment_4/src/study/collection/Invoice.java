package study.collection;

public class Invoice implements Comparable<Invoice> {

	private MyDate3  dateOfInvoice;
	private double amount ;
	private String invoiceGivenBy;
	private String  invoiceGivenTo;
	
	public Invoice() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param dateOfInvoice
	 * @param amount
	 * @param invoiceGivenBy
	 * @param invoiceGivenTo
	 */
	public Invoice(MyDate3 dateOfInvoice, double amount, String invoiceGivenBy, String invoiceGivenTo) {
		super();
		this.dateOfInvoice = dateOfInvoice;
		this.amount = amount;
		this.invoiceGivenBy = invoiceGivenBy;
		this.invoiceGivenTo = invoiceGivenTo;
	}
	

	@Override
	public String toString() {
		return "Invoice [dateOfInvoice=" + dateOfInvoice + ", amount=" + amount + ", invoiceGivenBy=" + invoiceGivenBy
				+ ", invoiceGivenTo=" + invoiceGivenTo + "]";
	}

	public MyDate3 getDateOfInvoice() {
		return dateOfInvoice;
	}

	public void setDateOfInvoice(MyDate3 dateOfInvoice) {
		this.dateOfInvoice = dateOfInvoice;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getInvoiceGivenBy() {
		return invoiceGivenBy;
	}

	public void setInvoiceGivenBy(String invoiceGivenBy) {
		this.invoiceGivenBy = invoiceGivenBy;
	}

	public String getInvoiceGivenTo() {
		return invoiceGivenTo;
	}

	public void setInvoiceGivenTo(String invoiceGivenTo) {
		this.invoiceGivenTo = invoiceGivenTo;
	}

	@Override
	public int compareTo(Invoice o) {
		
		return this.dateOfInvoice.compareTo(o.dateOfInvoice);
//		return this.getInvoiceGivenBy().compareTo(o.getInvoiceGivenBy());
	}
}
