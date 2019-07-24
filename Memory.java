
public class  Memory extends Stage{

	int value;
	public Memory(String[] inputarray,Registers reg){
		super(inputarray,reg);
		int j=(int)  reg.getEXMEM(11);
		System.out.println(" ~Memory inst."+""+j+"~ ");
		// System.out.println(" ~Memory~ ");
		 String opcode=(String) reg.getEXMEM(0);
		 String shift=(String) reg.getEXMEM(5);
		 String funct=(String) reg.getEXMEM(6);
		 int rs= (int) reg.getEXMEM(1);
		 int rt= (int) reg.getEXMEM(2);
		 int npc=(int) reg.getEXMEM(8);
		 String immediate=(String) reg.getEXMEM(7);
		 String offset=(String) reg.getEXMEM(9);
		 String rsa=(String) reg.getEXMEM(3);
		 String rta=(String) reg.getEXMEM(4);
		 String result=(String) reg.getEXMEM(10);
		 
		if(opcode.equals("010")){
			System.out.println("MemRead: "+"1");
			System.out.println("MemWrite: "+"0");
			System.out.println(value);
			value=reg.getMemory(Integer.parseInt(result,2));
			System.out.println("obtained value of memory at"+Integer.parseInt(result,2)+"is "+value);
		}
		else if(opcode.equals("011")){
			System.out.println("MemRead: "+"0");
			System.out.println("MemWrite: "+"1");
			reg.setMemory(rt, Integer.parseInt(result,2));
			System.out.println("Value of memory at "+Integer.parseInt(result,2)+"is "+reg.getMemory(Integer.parseInt(result,2)));
		}else{
			System.out.println("MemRead: "+"x");
			System.out.println("MemWrite: "+"x");
		}
		reg.setM(true);
		reg.setMEMWB(opcode,0);
		reg.setMEMWB(rs,1);
		reg.setMEMWB(rt,2);
		reg.setMEMWB(rsa,3);
		reg.setMEMWB(rta,4);
		reg.setMEMWB(shift,5);
		reg.setMEMWB(funct,6);
		reg.setMEMWB(immediate,7);
		reg.setMEMWB(npc,8);
		reg.setMEMWB(offset,9);
		reg.setMEMWB(result,10);
		reg.setMEMWB(value,11);
		reg.setMEMWB(j,12);
		//Write_Back a=new Write_Back(opcode,rs,rt,shift,funct,immediate,offset,npc,result, value, rsa, rta);
	}
	

}
