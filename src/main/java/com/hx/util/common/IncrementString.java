package com.hx.util.common;

public class IncrementString {
	public static String generater(String lastString) {
		// 转换为数字并加一
		Integer i = Integer.valueOf(lastString) + 1;
		// 判断
		StringBuilder sb = new StringBuilder();
		if (i / 10 < 7) {// 小于8位数
			int num = 7 - i / 10;// i=9 num=0
			for (int j = 0; j < num; j++) {
				sb.append("0");
			}
		}
		// 在转换为字符串
		String nowString = sb + String.valueOf(i);
		return nowString;
	}
}
