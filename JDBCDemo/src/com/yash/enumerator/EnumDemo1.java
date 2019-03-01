package com.yash.enumerator;

 enum Color {
	RED,GREEN,BLUE
};

public class EnumDemo1 {
public static void main(String[] args) {
	Color color = Color.RED;
	System.out.println(color);
	System.out.println(color.ordinal());
}
}
