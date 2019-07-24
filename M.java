
public class M implements Runnable{

	@Override
	public void run() {
		    D d= new D();
	        F fetchOperands = new F();
	        d.setFetchOperands(fetchOperands);
	        Thread t1 = new Thread(d);
	        Thread t2 = new Thread(fetchOperands);
	        t1.start();
	        t2.start();
	        try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
 public static void main(String []dd){
	 M trial=new M();
 }
}
