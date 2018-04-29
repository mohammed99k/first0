
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1=new Computer(1,"Sony","Windows",4);
		Computer c2=new Computer(2,"Sony","Windows",6);
		Computer c3=new Computer(3,"Sony","Windows",8);
		Computer c4=new Computer(4,"HP","Unix",4);
		Computer c5=new Computer(5,"Sony","Unix",12);
		Computer c6=new Computer(6,"Sony","Windows",10);
		Computer c7=new Computer(7,"HP","Unix",4);
		Computer c8=new Computer(8,"HP","Unix",16);
		ComputerLab L1=new ComputerLab(26,2);
		System.out.println(L1.addComputer(c1));
		System.out.println(L1.addComputer(c2));
		System.out.println(L1.addComputer(c3));
		ComputerLab L2=new ComputerLab(40,3);
		System.out.println(L2.addComputer(c3));
		System.out.println(L2.addComputer(c4));
		System.out.println(L2.addComputer(c5));
		ComputerLab L3=new ComputerLab(112,3);
		System.out.println(L3.addComputer(c6));
		System.out.println(L3.addComputer(c7));
		System.out.println(L3.addComputer(c8));
		LabInstructor inst=new LabInstructor(1001,"Mudassar");
		System.out.println(inst.addLab(L1));
		System.out.println(inst.addLab(L2));
		System.out.println(inst.addLab(L3));
		System.out.println("\n\nFollowing are Windows Computers in Lab26:");
		inst.displayWindowsComputers(26); // two windows computers
		System.out.println("\n\nTotal Number of Unix Computers in AllLabs :"+ inst.countUnixComputersOfAllLabs());
		 // 4 Unix Computers
		Computer fastest=inst.getFastestofAllLabs();
		System.out.println("\n\nBased on RAM, Fastest Computer in alllabs is following : ");
		
		fastest.displayComputerInfo();
	}

}
