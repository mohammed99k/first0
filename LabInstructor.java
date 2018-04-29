
public class LabInstructor {
private int id;
private String name;
private ComputerLab arrLabs[];
int nbl;
public LabInstructor(int id,String name){
	this.id=id;
	this.name=name;
	arrLabs=new ComputerLab[4];
	nbl=0;
}
public boolean addLab(ComputerLab l){
	if(nbl<arrLabs.length){
		arrLabs[nbl++]=l;
		return true;
	}
	return false;
}
public int countUnixComputersOfAllLabs(){
	int total=0;
	for(int i=0;i<nbl;i++){
		total+=arrLabs[i].countComputers("unix");
	}
	return total;
}
public Computer getFastestofAllLabs(){
	Computer max =arrLabs[0].getFastestComputer();
	for(int i=1;i<nbl;i++){
		if(arrLabs[i].getFastestComputer().getRAM()>max.getRAM())
			max=arrLabs[i].getFastestComputer();
	}
	return max;
}
public void displayWindowsComputers(int labNo){
Computer ComputersWithWindows []=null;
for(int i=0;i<nbl;i++)
	if(arrLabs[i].getLabNo()==labNo)
	{
		ComputersWithWindows=arrLabs[i].getComputersWithOS("windows");
		for(int k=0;k<ComputersWithWindows.length;k++)
			ComputersWithWindows[k].displayComputerInfo();
	}
}
}
