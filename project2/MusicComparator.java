package project2;

import java.util.Comparator;


public class MusicComparator implements Comparator<MusicComparable>{
	
	public int compare(MusicComparable s1, MusicComparable s2) {
        int a = 0;
        if (s1.getRating() < s2.getRating()){
            a = -1;
        }
        else if (s1.getRating() > s2.getRating()){
            a = 1;
        }
        else {
            a = 0;
        }			
        return a;
    }

	 

	
}
