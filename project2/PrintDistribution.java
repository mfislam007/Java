package project2;

public class PrintDistribution {

	
	 private Distribution value;
	 
	 public PrintDistribution(Distribution value){
		
		 this.value= value;
	 }
	 
	public void DisplayDistribution(){
		if (value != null){
			for(int i=value.getMin();i<= value.getMax(); i++ ){
				System.out.println(i+ ":" + value.frequency(i));
			}
			System.out.println("average :"+ value.average());
		}
		
	}
		 
	 
}
