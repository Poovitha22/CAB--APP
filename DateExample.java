package second;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExample {

	public DateExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LocalDate now=LocalDate.now();
      LocalTime time=LocalTime.now();
      LocalDateTime timestamp=LocalDateTime.now();
      LocalDate dateofbirth=LocalDate.parse("2020-01-01");
      System.out.println(now);
      System.out.println(time);
      System.out.println(timestamp);
      System.out.println(dateofbirth);
      
	}

}
