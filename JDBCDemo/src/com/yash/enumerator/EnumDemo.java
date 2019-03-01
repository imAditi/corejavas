package com.yash.enumerator;

class WeekDays {
	private static final int SUNDAY = 1;
	static final int MONDAY = 2;
	private static final int TUESDAY = 3;
	private static final int WEDNESDAY= 4;
	private static final int THURSDAY = 5;
	private static final int FRIDAY = 6;
	private static final int SATURDAY = 7;
}

class Days {
	private int days;

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
}


public class EnumDemo {
	public static void main(String[] args) {
		Days day = new Days();
		day.setDays(WeekDays.MONDAY);
		System.out.println("Day is : "+day.getDays());
	}

}
