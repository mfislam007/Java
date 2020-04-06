package project2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRoom {

	public static void main(String[] args) {
	   ArrayList <Room> rooms = new ArrayList<>();
       Room room = new Room();
       room.roomnumber();
       rooms.add(room);
      // System.out.println(room);
       
       OfficeRoom officeroom = new OfficeRoom ();
       officeroom.staff();
       rooms.add(officeroom );
       //System.out.println(officeroom);
       
       ClassRoom classroom = new ClassRoom ();
       classroom.data();
       rooms.add(classroom );
       //System.out.println(classroom);
       // print all the rooms
       System.out.println("All Rooms");
       for(int i=0; i<rooms.size(); i++){
    	   System.out.println(rooms.get(i));
    	   
       }
       System.out.println("OfficeRoom");
       for(int i=0; i<rooms.size(); i++){
    	   if (rooms.get(i) instanceof OfficeRoom)
    	   
    	   System.out.println(rooms.get(i));
       }
       System.out.println("ClassRoom");
       for(int i=0; i<rooms.size(); i++){
    	   if (rooms.get(i) instanceof ClassRoom)
    	   
    	   System.out.println(rooms.get(i));
       }
       System.out.println("Other Room");
       for(int i=0; i<rooms.size(); i++){
    	   if (!(rooms.get(i) instanceof ClassRoom)&& !(rooms.get(i) instanceof OfficeRoom))
    	   System.out.println(rooms.get(i));
       }
       //String search
       System.out.println("Enter the room number: ");
        Scanner a = new Scanner( System.in);
		int s = a.nextInt();
		
		
       for(int i=0; i<rooms.size(); i++){
    	   if (rooms.get(i).getNumber()== s)
    	   System.out.println(rooms.get(i));
       
	}
       System.out.println("Name of the staff number: ");
       Scanner b = new Scanner( System.in);
       String p = b.next();
      
       
       for(int i=0; i<rooms.size(); i++){
    	   if (rooms.get(i) instanceof OfficeRoom && (( OfficeRoom)rooms.get(i)).staff_names(p))
    	   System.out.println(rooms.get(i));
       
	}
	}   
       
       
       
       
       
       
	}
