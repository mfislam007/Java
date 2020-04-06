package project2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MainMusic{

	public static void main(String[] args) {
		List<MusicComparable> musics = new ArrayList<>();
        musics.add(new MusicComparable ("Aill Bill","bbb", 10.00, 4));
        musics.add(new MusicComparable ("Bill Bill","yyy", 8.00, 2));
        musics.add(new MusicComparable ("Cill Bill","xxx", 15.00, 4));
        musics.add(new MusicComparable ("Dill Bill","zzz", 20.00, 2));
        
        MusicComparable musiccomparable1 = new MusicComparable("Dill Bull","aaa", 12,10);
        musiccomparable1.getTitle();
        musiccomparable1.getArtist();
        musiccomparable1.getDuration();
        musiccomparable1.getDuration();
        System.out.println(musiccomparable1);
        
        Collections.sort(musics);
        
        for(MusicComparable s: musics){
            System.out.println(s);
        }
            
            Collections.sort(musics, new MusicComparator());
            
            for(MusicComparable s: musics){
                System.out.println(s + ", rating " + s.getRating());
            
        }

            Collections.sort(musics, (s1, s2) -> 
            (s1.getRating() < s2.getRating() ? -1 : (s1.getRating() > s2.getRating() ? 1 : 0)));
       
       for(MusicComparable s: musics){
           System.out.println(s + ", rating " + s.getRating());
       }
       musics.stream()
       .sorted(Comparator.comparing(MusicComparable::getDuration))
       .forEach(System.out::println);	

   
    List<MusicComparable> musics2 = musics
        .stream().filter(o -> o.getDuration() > 1.0)
        .collect(Collectors.toList());
    
    System.out.println();
    System.out.println("Duration over 3:");
    musics2.stream()
        .forEach(s -> System.out.println(s + ", Duration" + s.getDuration()));
	}

}
