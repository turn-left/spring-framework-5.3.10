package com.zhouyu.util;

public class TimeUtil {

	public static void spend(long millis) {
		assert millis >= 0;
		final long deadline = System.currentTimeMillis() + millis;
		while (System.currentTimeMillis() <= deadline) {};
//		if(1==1) System.err.println(11);
	}
}
