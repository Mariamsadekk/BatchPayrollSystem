
public abstract class Stage {
	protected static Registers a;
	
	public Stage(String[]  inputarray,Registers a){ 
		this.setreg(a);
		
		
	//Fetch test=new Fetch(0,inputarray);
	 }
	
	
	
	public Stage(){ 
		
		}
	public Registers getreg() {
		return a;
	}
	public void setreg(Registers m) {
		this.a = m;
	}
		
	 public static void main(String[]dss){
		//String [] inputarray=new String[]{"0000000010000000","0000000010000001","0000000010000010","0000000010000011","0000000010000100","0000000010000101","0000000010000110","0000000010000111","0000000010001000"};
		//Stage a = new Stage(inputarray);
		//Fetch test=new Fetch(0);	

	 }
}
