import java.util.LinkedList;
import java.util.Queue;


public class Main_function {
 /*	 Object [] IFID;
	 Object [] IDEX;
	 Object [] EXMEM;
	 Object [] MEMWB;*/
     static	Fetch a;
	static Decode b;
	
	Execute c;
	 Memory m;
	Write_Back e;
 String[] inputarray;
  protected int pc=0;
 static Queue stages;
 Registers reg;
 public Main_function(String[] inputarray,Registers reg){
	 this.reg=reg;

	 for(int i=0;i<inputarray.length;i++){
			reg.setInstructionmem(inputarray[i], i);
			//System.out.println(reg.getInstructionmem(i));
			}
	stages=new LinkedList();
	reg.setPc(0);
	//System.out.println("before: "+(int) reg.getIFID(1));
		while(true){
		if (inputarray.length==0){
			System.out.println("please insert instructions");
			break;
		}else if(inputarray.length==1){
			this.a=new Fetch(inputarray,reg);
			this.b=new Decode(inputarray,reg);
			this.c= new Execute(inputarray,reg);
			this.m=new Memory(inputarray,reg);	
			this.e=new Write_Back(inputarray,reg) ;
			break;
		}
		else if(inputarray.length==2){
			this.a=new Fetch(inputarray,reg);
			this.b=new Decode(inputarray,reg);
			this.a=new Fetch(inputarray,reg);
			this.c= new Execute(inputarray,reg);
			this.b=new Decode(inputarray,reg);
			this.m=new Memory(inputarray,reg);
			this.c= new Execute(inputarray,reg);
			this.e=new Write_Back(inputarray,reg) ;
			this.m=new Memory(inputarray,reg);
			this.e=new Write_Back(inputarray,reg) ;
			break;
		}
		else if(inputarray.length==3){
			this.a=new Fetch(inputarray,reg);
			this.b=new Decode(inputarray,reg);
			this.a=new Fetch(inputarray,reg);
			this.c= new Execute(inputarray,reg);
			this.b=new Decode(inputarray,reg);
			this.a=new Fetch(inputarray,reg);
			this.m=new Memory(inputarray,reg);
			this.c= new Execute(inputarray,reg);
			this.b=new Decode(inputarray,reg);
			this.e=new Write_Back(inputarray,reg) ;
			this.m=new Memory(inputarray,reg);
			this.c= new Execute(inputarray,reg);
			this.e=new Write_Back(inputarray,reg) ;
			this.m=new Memory(inputarray,reg);
			this.e=new Write_Back(inputarray,reg) ;
			break;
		}
			boolean pass=false;
			if(reg.isM()==true&&(int)reg.getMEMWB(8)<inputarray.length-4){
				this.e=new Write_Back(inputarray,reg) ;
			pass=true;
			}	
			if(reg.isE()==true&&(int)reg.getEXMEM(8)<inputarray.length-2){
				this.m=new Memory(inputarray,reg);	
				pass=true;
			}
			if(reg.isD()==true&&(int)reg.getIDEX(8)<inputarray.length-1){
				this.c= new Execute(inputarray,reg);
				pass=true;
			}
			if(reg.isF()==true&&(int)reg.getIFID(1)<inputarray.length){
				this.b=new Decode(inputarray,reg);
				pass=true;
			}
			if(reg.getPc()<=inputarray.length){
			this.a=new Fetch(inputarray,reg);
			//System.out.println("after: "+(int) reg.getIFID(1));
			pass=true;}
			
			if(pass==false){
				this.e=new Write_Back(inputarray,reg) ;
				this.m=new Memory(inputarray,reg);	
				this.c= new Execute(inputarray,reg);	
				this.e=new Write_Back(inputarray,reg) ;
			
				this.m=new Memory(inputarray,reg);
				this.e=new Write_Back(inputarray,reg) ;
        break;}
			
	}

 }

 public static void main(String[]dss){
	 String[] inputarray=new String[]{"0000000010000110","0000000010000110","0000000010000110","0000000010000110","0000000010000110"};
	//String[] inputarray=new String[]{"0000000010000110","0000000010000001","0000000010000010","0000000010000000","0000000010000001","0000000010001001"};
	//,"0000000010000010","1100000010000001","0000000010000001","0000000010000010","0000000010000011","0000000010000100","0000000010000101","0000000010000110","0000000010000111","0000000010001000"};
		 System.out.println(inputarray.length);
		 Registers reg = new Registers(); 
	/* for(int i=0;i<inputarray.length;i++){
			reg.setInstructionmem(inputarray[i], i);
			//System.out.println(reg.getInstructionmem(i));
			}*/
	// Fetch test = new Fetch(0,inputarray,reg);
	// Decode testd = new Decode(inputarray,reg);
	// Execute test2 = new Execute(inputarray,reg);
	//Memory testm = new Memory(inputarray,reg);
	//Write_Back testw= new Write_Back(inputarray,reg) ;
	
	//stages.add(test);
	//stages.
	 Main_function start= new  Main_function(inputarray,reg);
		
/*	if(f==false){
		stages.add(a);
	}
	if(f==true&&d==false){
		stages.remove(a);
		stages.add(a);
		stages.add(b);
	}*/
 }
}
