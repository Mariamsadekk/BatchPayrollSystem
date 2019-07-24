
public class  Fetch extends Stage {
 // int pc=0;
 // String[] instructionmem= new String[30];
 // String[] instructionmem= new String[16];
  String instr;
 
  public Fetch(String [] inputarray,Registers reg){
	  super(inputarray,reg);
	  System.out.println(" ~Fetch inst."+""+reg.getPc()+"~ ");
	  System.out.println("old pc value: "+reg.getPc());  
	  instr=reg.getInstructionmem(reg.getPc());
if(reg.getPc()<inputarray.length){
	 System.out.println(instr);
	 int npc=reg.getPc();
	 reg.setPc(reg.getPc()+1);
	 
	 System.out.println("new pc value: "+reg.getPc());
	 reg.setIFID(instr,0);
	 reg.setIFID(npc,1);
	 reg.setIFID(npc,2);
	 reg.setF(true);
	 //IFID[0]=instr;
	// IFID[1]=npc; 
	// f=true;
	// Decode a = new Decode();
	
  }
  else{
	  reg.setIFID(inputarray.length,2);
	  reg.setIFID(inputarray.length,1);
	  reg.setPc(reg.getPc()+1);
	  System.out.println("no more instructions");
  }
}
  public static void main(String[]sss){
	  //Fetch a = new Fetch();
  }
}
