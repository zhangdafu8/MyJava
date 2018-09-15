package model;

public class ReadWeather implements Runnable {
	
	Weather weather;
	public ReadWeather(Weather weather) {
		this.weather = weather;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			weather.read();

		}
	}

}
