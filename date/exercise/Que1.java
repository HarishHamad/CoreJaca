package date.exercise;

import java.time.LocalDate;
import java.time.Period;

public class Que1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2001, 8, 19);
		Period period = Period.between(birthday, today);
		System.out.println("days= " + period.getDays());
		System.out.println("month= " + period.getMonths());
		System.out.println("year= " + period.getYears());

	}
}
