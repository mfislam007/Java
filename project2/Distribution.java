/*
 * Class represents a (statistical) distribution 
 * so that you can use an object of this class to calculate 
 * the frequencies of integer values min, min+1, min+2, ..., max 
 * and the average.
 */
package project2;

public class Distribution {
	
	private int min, max; //getters 
	private int[] freq; //no setter or getter!
	private double sum = 0;
	private int count = 0;
	
	public Distribution(int min, int max){
		this.min = min;
		this.max = max;
		freq = new int[max - min + 1]; //values are zero automatically
	}
	
	public void insertValue(int value){
		if (value >= min && value <= max){
			freq[value - min]++;
			sum += value;
			count++;
		}
	}

	public int frequency(int value){
		if (value >= min && value <= max){
			return freq[value - min];
		}
		else {
			return 0;
		}
	}
	
	
	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public double average() {
		return sum/count;  
	}
	
	public int getCount(){
		return count;
	}

}