
public class  Decode extends Stage  {
	String opcode;
	String rs;
	String rt;
	String shift;
	String funct;
	String immediate;
	String offset;
	//int [] registerfile= new int[16];
public Decode (String[] inputarray,Registers reg){
	super(inputarray,reg);
	int i=(int)  reg.getIFID(2);
	System.out.println(" ~Decode inst."+""+i+"~ ");
	// System.out.println(" ~Decode~ ");
	String a=(String) reg.getIFID(0);
	//System.out.println(a);
	int npc=(int)  reg.getIFID(1);
	opcode=a.substring(0, 3);
	rt=a.substring(3, 7);
	rs=a.substring(7,11);
	shift=a.substring(11,12);
	funct=a.substring(12,16);
	immediate=a.substring(8,16);
	offset=a.substring(4,16);
	System.out.println("decimal rs " +Integer.parseInt(rs,2));
	System.out.println("decimal rt " +Integer.parseInt(rt,2));
	int rtdata=reg.getRegisterfile(Integer.parseInt(rt,2));
	int rsdata=reg.getRegisterfile(Integer.parseInt(rs,2));
	System.out.println("decode rs "+rsdata);
	System.out.println("decode rt "+rtdata);
	System.out.println("opcode: "+opcode);
	System.out.println("rs: "+rs);
	System.out.println("rt: "+rt);
	System.out.println("shift: "+shift);
	System.out.println("funct: "+funct);
	System.out.println("immediate: "+immediate);
	System.out.println("offset: "+offset);
	reg.setD(true);
	reg.setIDEX(opcode,0);
	reg.setIDEX(rsdata,1);
	reg.setIDEX(rtdata,2);
	reg.setIDEX(rs,3);
	reg.setIDEX(rt,4);
	reg.setIDEX(shift,5);
	reg.setIDEX(funct,6);
	reg.setIDEX(immediate,7);
	reg.setIDEX(npc,8);
	reg.setIDEX(offset,9);
	reg.setIDEX(i,10);

	//Execute b= new Execute(opcode,rsdata,rtdata,shift,funct,immediate,offset,npc,rs, rt);
}
}
