
public class  Execute extends Stage {
	String result="";
	
public Execute(String[] inputarray,Registers reg){
	super(inputarray,reg);
	int j=(int)  reg.getIDEX(10);
	System.out.println(" ~Execute inst."+""+j+"~ ");
	// System.out.println(" ~Execute~ ");
	 String opcode=(String) reg.getIDEX(0);
	 String shift=(String) reg.getIDEX(5);
	 String funct=(String) reg.getIDEX(6);
	 int rs= (int) reg.getIDEX(1);
	 int rt= (int) reg.getIDEX(2);
	 int npc=(int) reg.getIDEX(8);
	 String immediate=(String) reg.getIDEX(7);
	 String offset=(String) reg.getIDEX(9);
	 String rsa=(String) reg.getIDEX(3);
	 String rta=(String) reg.getIDEX(4);
	 
	System.out.println("ALUop: "+opcode);
	if(opcode.equals("000")){
	System.out.println("ALU src(A): "+"1");
	System.out.println("ALU src(A): "+"0");
	System.out.println("Branch: "+"0");
	//System.out.println(rs);
	//System.out.println(rt);
		int r;
		switch(funct){
			case "0000":{
				r=rs+rt;
				result=Integer.toBinaryString(r);
			/*	System.out.println("answer in decimal: "+result);
				System.out.println("answer in decimal: "+r);*/
		
			}
				break;
			case "0001":{
				r=rs-rt;
				 result=Integer.toBinaryString(r);
		/*		System.out.println("answer in decimal: "+result);
				System.out.println("answer in decimal: "+r);*/
				}
				break;
			case "0010":{
				r=rs*rt;
			  result=Integer.toBinaryString(r);
				/*System.out.println("answer in decimal: "+result);
				System.out.println("answer in decimal: "+r);*/
			}
				break;
			case "0011":{
				r=rs/rt;
				 result=Integer.toBinaryString(r);
		/*		System.out.println("answer in decimal: "+result);
				System.out.println("answer in decimal: "+r);*/
			}
				break;
			case "0100":{
				r=rs&rt;
				 result=Integer.toBinaryString(r);
				/*System.out.println("answer in decimal: "+result);
				System.out.println("answer in decimal: "+r);*/
			}
				break;
			case "0101":{
				r=rs|rt;
				result=Integer.toBinaryString(r);
		/*		System.out.println("answer in decimal: "+result);
				System.out.println("answer in decimal: "+r);*/
			}
				break;
			case "0110":{
				int s=(rs|rt);
				System.out.println("or result: "+s);
				r=s;
				System.out.println("nor result: "+s);
				 result=Integer.toBinaryString(r);
				 System.out.println("result nor1 "+result);
				 String temp="";
				 String a ="0";
				 for(int i=0;i<result.length();i++){
					 if(result.substring(i, i).equals("0")){
						temp+="1";
						//System.out.println("yes");
					 }else{
						 temp+="0";
						// System.out.println("no");
					 } 
				 }
				 result=temp;
				 System.out.println("result nor1 "+result);
				 int i=16-result.length();
					 temp="";
					while(i>0){
						temp+="1";
						i--;
					}
					result=temp+result;	
					 System.out.println("result nor2 "+result);
				/*System.out.println("answer in decimal: "+result);
				System.out.println("answer in decimal: "+r);*/
			}
				break;
			case "0111":{
				if(rs<rt){
					r=1;
				}else{
					r=0;
				}
				 result=Integer.toBinaryString(r);
			/*	System.out.println("answer in decimal: "+result);
				System.out.println("answer in decimal: "+r);*/
			}
				break;
			case "1000":{
				r=rs>>1;
			
				result=Integer.toBinaryString(r);
/*				System.out.println("answer in decimal: "+result);;*/
				System.out.println("answer in decimal: "+r);
			}
				break;
			case "1001":{
				r=rs<<1;
				 result=Integer.toBinaryString(r);
				/*System.out.println("answer in decimal: "+result);*/
				System.out.println("answer in decimal: "+r);
			}
				break;
				}
	
	}
	else if(opcode.equals("001")){
		System.out.println("ALU src(A): "+"1");
		System.out.println("ALU src(A): "+"1");
		if(rt==0){
			System.out.println("Branch: "+"1");
			result=Integer.toBinaryString((npc+Integer.parseInt(immediate,2)));
			reg.setPc((npc+Integer.parseInt(immediate,2)));
		}else{
			System.out.println("Branch: "+"0");
		}
		
	}
	else if(opcode.equals("010")){
		System.out.println("ALU src(A): "+"1");
		System.out.println("ALU src(A): "+"1");
		System.out.println("Branch: "+"0");
		System.out.println("immediate: "+Integer.parseInt(immediate,2));
		System.out.println("rt: "+rt);
		result=Integer.toBinaryString((rt+Integer.parseInt(immediate,2)));
		
	}
	else if(opcode.equals("011")){
		System.out.println("ALU src(A): "+"1");
		System.out.println("ALU src(A): "+"1");
		System.out.println("Branch: "+"0");
		result=Integer.toBinaryString((rt+Integer.parseInt(immediate,2)));
	}
	else if(opcode.equals("100")){
		System.out.println("ALU src(A): "+"1");
		System.out.println("ALU src(A): "+"1");
		System.out.println("Branch: "+"0");
		result=Integer.toBinaryString((Integer.parseInt(immediate,2)));
	}
	else if(opcode.equals("101")){
		System.out.println("ALU src(A): "+"0");
		System.out.println("ALU src(A): "+"1");
		System.out.println("Branch: "+"0");
		result=Integer.toBinaryString((npc+Integer.parseInt(offset,2)));
		reg.setPc((npc+Integer.parseInt(offset,2)));
		//System.out.println("branch");
	}
	else if(opcode.equals("110")){
		System.out.println("ALU src(A): "+"0");
		System.out.println("ALU src(A): "+"1");
		System.out.println("Branch: "+"0");
		result=Integer.toBinaryString((npc+2));
		reg.setPc((npc+2));
	}
	if(result.length()>16){
		result=result.substring(0,16);
	}
	else if(result.length()<16){
		int i=16-result.length();
		String temp="";
		while(i>0){
			temp+="0";
			i--;
		}
		result=temp+result;	
	}
	System.out.println("answer in binary: "+result);
	reg.setE(true);
	reg.setEXMEM(opcode,0);
	reg.setEXMEM(rs,1);
	reg.setEXMEM(rt,2);
	reg.setEXMEM(rsa,3);
	reg.setEXMEM(rta,4);
	reg.setEXMEM(shift,5);
	reg.setEXMEM(funct,6);
	reg.setEXMEM(immediate,7);
	reg.setEXMEM(npc,8);
	reg.setEXMEM(offset,9);
	reg.setEXMEM(result,10);
	reg.setEXMEM(j,11);
	//Memory r = new Memory(opcode, rs, rt, shift, funct, immediate, offset, npc,result,rsa,rta);
}
public static void main(String[]sss){
	//Execute r= new Execute("000","0001","0010","0","0000","10000000","100010000000");
	
}
}
