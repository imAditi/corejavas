package com.yash.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadArrayList {
public static void main(String[] args) {
	CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
	list.add(1);
	list.add(2);
	Iterator<Integer> it = list.iterator();
	while(it.hasNext()) {
		list.add(1);
		System.out.println(it.next());
	}
}
}
