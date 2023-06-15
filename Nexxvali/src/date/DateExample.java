package date;

import java.time.LocalDate;
import java.time.Period;

public class DateExample {

	public static void main(String[] args) {

		
		LocalDate birthday = LocalDate.of(1992, 12, 10);
		LocalDate date = LocalDate.now();
		Period diff = Period.between( birthday , date );
		
		
		//System.out.println(diff);
		
		
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = date.plusDays(1);
		
		
		System.out.println("Today's date : " + date);
		System.out.println("Yesterday date : " + yesterday);
		System.out.println("Tomorrow's date : "+ tomorrow);
		
		
		System.out.println( "Your age is: " + diff.getYears() + " years, " + diff.getMonths() + " Month, " + diff.getDays()+ " Days. ");

	}

}
