
public class Computer {

private int computerId;
private String brand;
private String operatingSys;
private int RAM;
public Computer(int id,String brand,String OS,int RAM){
	computerId=id;
	this.brand=brand;
	operatingSys=OS;
	this.RAM=RAM;
}
public Computer(Computer c){
	this.computerId=c.computerId;
	this.brand=c.brand;
	this.operatingSys=c.operatingSys;
	this.RAM=c.RAM;
}
public int getComputerId() {
	return computerId;
}
public String getBrand() {
	return brand;
}
public String getOperatingSys() {
	return operatingSys;
}
public int getRAM() {
	return RAM;
}
public void displayComputerInfo(){
	System.out.println("Computer ID:"+computerId);
	System.out.println("Brand:"+brand);
	System.out.println("Operating System:"+operatingSys);
	System.out.println("RAM in GBs:"+RAM);
}
}
