package test;

import model.GenerateWeather;
import model.ReadWeather;
import model.Weather;

public class WeatherTest {

	public static void main(String[] args) {
		Weather we1 = new Weather();
		GenerateWeather gw = new GenerateWeather(we1);
		ReadWeather rw = new ReadWeather(we1);
		Thread t1 = new Thread(gw);
		Thread t2 = new Thread(rw);
		t1.start();
		t2.start();

	}

}
