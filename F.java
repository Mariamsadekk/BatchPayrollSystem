import java.util.concurrent.ConcurrentLinkedQueue;

import javafx.scene.chart.PieChart.Data;


public class F implements Runnable{
	  private boolean cancel = false;
	   private ConcurrentLinkedQueue<Data> queue = new ConcurrentLinkedQueue<>();
	@Override
	public void run() {
		while(!cancel) {
	           Data data = queue.poll();
	           if(data != null) {
	        	   System.out.println("this is F");
	              // nextComponent.enqueue(data);
	           } else break;
	       }
		
	}
	   public void enqueue(Data data) {
	       queue.offer(data);
	   }

	   public void cancel() {
	       cancel = true;
	   }


}
