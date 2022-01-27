package study.interfacekey;

public interface Sellable {
	 double getSellingPrice(); 
	 void setDiscount(double dis);

}//end Sellable interface
class CD implements Sellable{
	/**
	 * @param name
	 * @param format
	 * @param artist
	 * @param cost
	 * @param duration
	 */
	public CD(String name, String format, String artist, double cost, double duration,double dis) {
		this.disPrice =dis;
		Name = name;
		this.format = format;
		this.artist = artist;
		this.cost = cost;
		this.duration = duration;
		
	}
	private String Name,  format  ,  artist;
	private double cost , duration ;
	private double disPrice;
	
	//getter setter
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	@Override
	public double getSellingPrice() {
		
		return  this.cost - (this.cost*(this.disPrice/100.00));
	}
	@Override
	public void setDiscount(double dis) {
		this.disPrice =dis;
		
	}
	
	@Override
	public String toString() {
		
		return "Name: "+this.Name+" Format: "+this.format+" Artist: "+this.artist+" Cost: "+this.cost+" Duration: "+this.duration+" Final Price: "+this.getSellingPrice();
	}
}//end CD class


class Laptop implements Sellable{
	/**
	 * @param brand
	 * @param rAM
	 * @param hDD
	 * @param cPUtype
	 * @param cost
	 */
	public Laptop(String brand, String rAM, String hDD, String cPUtype, double cost) {
		super();
		this.brand = brand;
		RAM = rAM;
		HDD = hDD;
		CPUtype = cPUtype;
		this.cost = cost;
	}
	private String brand, RAM, HDD, CPUtype ;
	private double cost;
	private double discount;
	
	//Getter and setter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getHDD() {
		return HDD;
	}
	public void setHDD(String hDD) {
		HDD = hDD;
	}
	public String getCPUtype() {
		return CPUtype;
	}
	public void setCPUtype(String cPUtype) {
		CPUtype = cPUtype;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	@Override
	public double getSellingPrice() {
		// TODO Auto-generated method stub
		return this.cost - (this.cost*(this.discount/100));
	}
	@Override
	public void setDiscount(double dis) {
		this.discount =dis;
		
	}
	@Override
	public String toString() {
		
		return "Brand: "+this.brand+" RAM: "+this.RAM+" HDD: "+this.HDD+" CPU: "+this.CPUtype+" Cost: "+this.cost+" Final Price: "+ this.getSellingPrice();
	}
	
}//end Laptop class


