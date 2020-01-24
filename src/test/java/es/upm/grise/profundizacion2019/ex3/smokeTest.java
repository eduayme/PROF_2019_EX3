package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class smokeTest {
	MyClass my;
	
	@Before
	public void setUp() {
		my = new MyClass();
	}

	@Test
	public void smoleTest() {
		long SECONDS = 60;
		my.nextTime(SECONDS);
	}

	@Test
	public void add2min_OK() {
		Time t = new Time();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String date1 = "2020/01/01 00:00:00";
		String date2 = "2020/01/01 00:02:00";
		LocalDateTime current_date = LocalDateTime.parse(date1, formatter);
		LocalDateTime final_date   = LocalDateTime.parse(date2, formatter);
		long SECONDS = 120;

		assertEquals( t.getFutureTime(SECONDS, date1), date2 );
	}

	@Test
	public void invokeGetFutureTime_OK() {
		Time t = mock(Time.class);
		long SECONDS = 60;
		int n_times = 1;

		my.nextTime(SECONDS);

		verify(t, times(n_times)).getFutureTime(SECONDS);
	}
}
