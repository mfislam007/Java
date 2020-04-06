package project2;


public class Date implements Comparable<Date>{
	private int day,month,year;
	public Date(){
		java.time.LocalDate today = java.time.LocalDate.now();
		day = today.getDayOfMonth();
		month = today.getMonthValue();
		year = today.getYear();
	}
	public String toString(){
		return day + "/" + month +"/" + year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public  Date(int day , int month, int year){
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date(String date){
		String[] parts = date.split("/");
		day = Integer.parseInt(parts[0]);
		month = Integer.parseInt(parts[1]);
		year = Integer.parseInt(parts[2]);
	}
		
	public boolean equals(Date another){
		return day == another.day && month == another.month && year == another.year;
	}
	public static final String[] MONTHNAMES = {"January", "February",
		"March", "April", "May", "June", "July", "August",
		"September", "October", "November", "December"};
	
	public String toLongString(){
		return day + " of " + MONTHNAMES[month-1] +", " + year;
	}
	public static int monthNumber(String name){
       for(int i=0; i<12; i++){
    	   if(name.equalsIgnoreCase(MONTHNAMES[i]))
    			   return i+1;
    	   
       }
       return 0;
    }
	@Override
	public int compareTo(Date o) {
		if (this.year<o.year || this.year==o.year && this.month<o.month || this.year==o.year && this.month==o.month &&this.day<o.day ) {
            return -1;
        }

        if (this.equals(o)) {
            return 0;
        }

      return 1;
	}
	}
	

