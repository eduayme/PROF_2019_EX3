package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	public static String getFutureTime(long seconds) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime time = LocalDateTime.now();
		time.plusSeconds(seconds);
		return formatter.format(time);	
	}

	public static String getFutureTime(long seconds, String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime time = LocalDateTime.parse(date, formatter);
		time = time.plusSeconds(seconds);
		return formatter.format(time);
	}

}
