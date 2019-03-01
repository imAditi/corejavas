package ClassObject;

import java.util.Scanner;

 class TimeTest {
	int hours;
	int minutes;
	int seconds;
	TimeTest () {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
		}
	
	TimeTest (int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	void add (TimeTest t1, TimeTest t2) {
		this.hours = t1.hours + t2.hours;
		this.minutes = t1.minutes + t2.minutes;
		this.seconds = t1.seconds + t2.seconds;
	}
	
	void display() {
		if(minutes>59)
		{
			hours++;
			minutes = 0;
		}
		else if(seconds>59)
		{
			minutes++;
			seconds = 0;
		}
		System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
	}

	public String toString() {
		if(seconds>59) {
			int a = seconds/60;
			seconds = seconds%60;
			minutes = minutes + a;
		}
		if(minutes>59) {
			int b = minutes/60;
			minutes = minutes%60;
			hours = hours + b;
		}
		return(this.hours+":"+this.minutes+":"+this.seconds);
	}
 }

	 class Time {
		 
		public static void main (String args[]) {
			TimeTest t1 = new TimeTest(8,30,44);
			t1.display();
			TimeTest t2= new TimeTest(8,34,45);
			t2.display();
			TimeTest t3 = new TimeTest();
			t3.add(t1, t2);
			System.out.println("t3 = "+t3.toString());
			}
	}
 

 
	
	
	 

