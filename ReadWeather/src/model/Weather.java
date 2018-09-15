package model;

public class Weather {
	private int temperature;
	private int humidity;
	boolean flag = false;
	
	public Weather() {
		
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	public synchronized void generate() {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int tem = getTemperature();
		int hum = getHumidity();
		tem = (int)(Math.random()*40);
		hum = (int)(Math.random()*100);
		setTemperature(tem);
		setHumidity(hum);
		String str1 = "生成天气数据 [温度："+temperature+", 湿度:"+humidity+"]";
		System.out.println(str1);
		flag =true;
		notifyAll();
	}
	
	public synchronized void read() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String str2 = "读取天气数据 [温度："+temperature+", 湿度:"+humidity+"]";
		System.out.println(str2);
		flag = false;
		notifyAll();
	}
	
	public String toString() {
		String str3 = "[温度："+temperature+", 湿度:"+humidity+"]";
		return str3;
	}

}
