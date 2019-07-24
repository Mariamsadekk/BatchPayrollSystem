
public class  Write_Back extends Stage{
  public Write_Back(String[] inputarray,Registers reg){
	  super(inputarray,reg);
	  int j=(int)  reg.getMEMWB(12);
		System.out.println(" ~Write Back inst."+""+j+"~ ");
		// System.out.println(" ~Write Back~ ");
		 String opcode=(String) reg.getMEMWB(0);
		 String shift=(String) reg.getMEMWB(5);
		 String funct=(String) reg.getMEMWB(6);
		 int rs= (int) reg.getMEMWB(1);
		 int rt= (int) reg.getMEMWB(2);
		 int npc=(int) reg.getMEMWB(8);
		 String immediate=(String) reg.getMEMWB(7);
		 String offset=(String) reg.getMEMWB(9);
		 String rsa=(String) reg.getMEMWB(3);
		 String rta=(String) reg.getMEMWB(4);
		 String result=(String) reg.getMEMWB(10);
		 int value=(int) reg.getMEMWB(11);
		 
	  if(opcode.equals("010")){
		  System.out.println("RegWrite: "+"1");
		  System.out.println("MemReg: "+"1");
		  reg.setRegisterfile(value,Integer.parseInt(rta,2));
		 
		}
	  else   if(opcode.equals("000")||opcode.equals("100")){
		  System.out.println("RegWrite: "+"1");
		  System.out.println("MemReg: "+"0");
		  reg.setRegisterfile(Integer.parseInt(result,2),Integer.parseInt(rta,2));
		 		}
	  else{
	  System.out.println("RegWrite: "+"0");
	  System.out.println("MemReg: "+"x");
  }
	  String wbv=Integer.toBinaryString(Integer.parseInt(result,2));
	 // System.out.println("wbv: "+wbv);
	  System.out.println("result: "+result);
	  System.out.println("the value of the write back register: "+ reg.getRegisterfile(Integer.parseInt(rta,2)));
	 reg.setWb(true);
  }
 
}
