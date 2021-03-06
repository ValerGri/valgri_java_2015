package by.epam.grodno.trainig.val.gri.se02;
import java.lang.annotation.*;
@Documented
@interface ClassPreamble {
	   String author = "Gri";
	   String date="24/10/15";
	   int currentRevision() default 1;
	   String lastModified() default "N/A";
	   String lastModifiedBy() default "N/A";
	   String[] reviewers();
	}

public class Atomsubmarin {
	
	private int volume;
	private int massa;
	private int velocity;
	
	public Atomsubmarin(int volume,int massa, int velocity )
	{
		this.volume=volume;
		this.massa= massa;
		this.velocity=velocity;
	}

	public int getVolume() {
		return volume;
	}

	public int getMassa() {
		return massa;
	}

	public int getVelocity() {
		return velocity;
	}
	
	public void startofEngine()
	{
		
		System.out.println(" Двигатель запущен!!! ");
	}
	

	public  class EngineOfatomsubmarin 
	{
		private int powerOfengine;
		private int rpm;
		public  void startofEngine()
		{
			
			System.out.println(" Двигатель запущен!!! ");
		}
		public void setPowerOfengine(int powerOfengine) {
			this.powerOfengine = powerOfengine;
		}
		public void setRpm(int rpm) {
			this.rpm = rpm;
		}
		public int getPowerOfengine() {
			return powerOfengine;
		}
		public int getRpm() {
			return rpm;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		Atomsubmarin submarin= new Atomsubmarin(678,1000,100);
		submarin.startofEngine();
		
		
	}
	
	
}
