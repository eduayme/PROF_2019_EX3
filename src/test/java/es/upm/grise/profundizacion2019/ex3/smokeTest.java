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
	public void add2min_OK() {
		Time t = new Time();
		String date1 = "2020/01/01 00:00:00";
		String date2 = "2020/01/01 00:02:00";
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
