package month;

public class Months {
	public int getDays(int months) {
		int day = 0;
		
		switch(months) {
		case 9 : case 4 : case  6 : case 11 : 
			day = 30; break;
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day = 31; break;
		case 2 : day = 28; break;
		}
		return day;
	}
}
