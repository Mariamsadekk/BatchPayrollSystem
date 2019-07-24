import java.util.ArrayList;

public class Registers {
	private String[] instructionmem= new String[30];
	private int [] registerfile= new int[30];

	private int[] Memory = new int[40];
		
	private int pc;
	private  Object [] IFID;
	private  Object [] IDEX;
	private  Object [] EXMEM;
	private Object [] MEMWB;
	private boolean f;
	private boolean d;
	private boolean e;
	private boolean m;
	private boolean wb;
public Registers(){
	f=false;
	d=false;
	e=false;
	m=false;
	wb=false;
	IFID= new Object[100];
	IDEX= new Object[100];
	EXMEM= new Object[100];
	MEMWB= new Object[100];	
registerfile[0]= 0b0000000000000010;
registerfile[1]= 0b1000000000001100;
registerfile[2]= 0b0000000000000000;
registerfile[3]= 0b1100100110001000;
registerfile[4]= 0b000000000000000;
registerfile[9]= 0b000000000000010;
registerfile[10]= 0b000000000000010;

Memory[0]=0b0000000000001000;
Memory[1]=0b1111000000000000;
Memory[2]=0b1000010100001000;
Memory[3]=0b0001011000010000;
Memory[4]=0b1000101000000011;
Memory[5]=0b0100000000000111;
Memory[6]=0b1100000000100010;
Memory[7]=0b1010010100000010;
Memory[8]=0b0000100101010000;
Memory[9]=0b1000000000000000;
Memory[10]=0b0000000000000001;
}

public String getInstructionmem(int i) {
	return instructionmem[i];
}
public int getRegisterfile(int i) {
	return registerfile[i];
}
public int getMemory(int i) {
	return Memory[i];
}
public int getPc() {
	return pc;
}
public Object getIFID(int i) {
	return IFID[i];
}
public Object[] getIFID() {
	return IFID;
}
public Object getIDEX(int i) {
	return IDEX[i];
}
public Object getEXMEM(int i) {
	return EXMEM[i];
}
public Object getMEMWB(int i) {
	return MEMWB[i];
}
public  boolean isF() {
	return f;
}
public  boolean isD() {
	return d;
}
public boolean isE() {
	return e;
}
public boolean isM() {
	return m;
}
public boolean isWb() {
	return wb;
}
public void setInstructionmem(String instructionmem,int i) {
	this.instructionmem[i] = instructionmem;
}
public void setRegisterfile(int registerfile,int i) {
	this.registerfile[i] = registerfile;
}
public void setMemory(int memory,int i) {
	Memory[i] = memory;
}
public void setPc(int pc) {
	this.pc = pc;
}
public void setIFID(Object iFID,int i) {
	IFID[i] = iFID;
}
public void setIDEX(Object iDEX,int i) {
	IDEX[i] = iDEX;
}
public void setEXMEM(Object eXMEM,int i) {
	EXMEM[i] = eXMEM;
}
public void setMEMWB(Object mEMWB,int i) {
	MEMWB[i] = mEMWB;
}
public  void setF(boolean f) {
	this.f = f;
}
public  void setD(boolean d) {
	this.d = d;
}
public void setE(boolean e) {
	this.e = e;
}
public void setM(boolean m) {
	this.m = m;
}
public void setWb(boolean wb) {
	this.wb = wb;
}
	
	
	
	
}

