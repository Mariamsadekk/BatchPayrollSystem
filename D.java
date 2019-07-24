import java.util.concurrent.ConcurrentLinkedQueue;

import javafx.scene.chart.PieChart.Data;


public class D implements Runnable {
private boolean cancel = false;
private ConcurrentLinkedQueue<Data> queue = new ConcurrentLinkedQueue<>();
private F nextComponent;

	@Override
	public void run() {
		   while(!cancel) {
	           Data data = queue.poll();
	           if(data != null) {
	        	   System.out.println("this is D");
	               nextComponent.enqueue(data);
	           } else break;
	       }
		
	}
	
	   public void enqueue(Data data) {
	       queue.offer(data);
	   }
	   public void cancel() {
	       cancel = true;
	   }
	   public void setFetchOperands(F nextComponent) {
	       this.nextComponent = nextComponent;
	   }
	   public static void main(String []dd){
			 D trial=new D();
		 }
}
