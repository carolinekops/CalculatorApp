
public class Days {
	protected int month;
	protected int day;
	protected int year;

public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

Days(int month, int day, int year){
	this.month = month;
	this.day = day;
	this.year = year;
}

@Override
public String toString() {
	return "Days [month=" + month + ", day=" + day + ", year=" + year + "]";
}

public int FinalDays() {
	int result = getDay() + Month() + totalYears();
	
	return result;
}


public int Month() {
		int[] montharr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int monthdays = 0;
		for(int x = 0; x < montharr.length;x++) {
			monthdays += montharr[month-1];
		}return monthdays;
		}

public int totalYears() {
	int age = 2018 - year;
	int yeardays = age * 365;
	double leap;
	//int finalyeardays;
	
	//double f = Math.floor(7.343);
	 if(year%4 == 0){
		if(month < 3) {
		leap = Math.floor(age/4);
		}
		else {
		leap = Math.ceil(age/4);
		 }
	 }else if(year%4 == 1) {
		 leap = Math.floor(age/4); 
	 }else if(year%4 == 2) {
		 leap = age/4;
	 }else {
		 leap = Math.ceil(age/4);
	 }
	double finalyeardays = yeardays - leap;
	return (int) finalyeardays;
}


}


