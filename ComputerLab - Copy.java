
public class ComputerLab {
	private int labNo;
	private Computer arrComputer[];
	private int nbc;
	public ComputerLab(int size,int labNo){
		arrComputer=new Computer[size];
		this.labNo=labNo;
		nbc=0;
	}
	public boolean addComputer(Computer c){
		if(nbc<arrComputer.length){
		arrComputer[nbc++]=new Computer(c);
		return true;
		}
		return false;
	}
public int countComputers(String os){
	int total=0;
	for(int i=0;i<nbc;i++){
		if(arrComputer[i].getOperatingSys().equalsIgnoreCase(os))
			total++;
	}
	return total;
}
public Computer getFastestComputer(){
	Computer max =arrComputer[0];
	for(int i=1;1<nbc;i++){
		if(arrComputer[i].getRAM()>max.getRAM())
			max=arrComputer[i];
	}
	return max;
}
public Computer[] getComputersWithOS(String os){
	Computer arrOS[]=new Computer[countComputers(os)];
	int nbo=0;
	for(int i=0;i<nbc;i++){
		if(arrComputer[i].getOperatingSys().equalsIgnoreCase(os))
			arrOS[nbo]=arrComputer[i];
		nbo++;
	}
	return arrOS;
}
public int getLabNo(){
	return labNo;
}
public int getnbc(){
	return nbc;
}
}
