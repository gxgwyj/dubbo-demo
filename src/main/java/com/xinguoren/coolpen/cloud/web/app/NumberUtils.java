package com.xinguoren.coolpen.cloud.web.app;

public class NumberUtils {
	private String[] ss = { "", "十", "百", "千", "万", "十万", "百万", "千万", "亿" };
	private String[] bs = { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九" };

	public void str() {
		System.out.println(bs[9]);
	}

	/**
	 * 获取整数的个数
	 * 
	 * @param number
	 * @return
	 */
	public int getNuberLength(int number) {
		int length = 0;
		while (number > 0) {
			number = number / 10;
			length++;
		}
		return length;
	}

	/**
	 * 打印整形数字上的每一位数据
	 * 
	 * @param val
	 * @return
	 */
	public void int2Str(int val) {
		while (val > 0) {
			System.out.println(val % 10);
			val /= 10;
		}
	}

	public static void main(String[] args) {
		NumberUtils numberUtils = new NumberUtils();
		// numberUtils.str();
		int size = numberUtils.getNuberLength(898989898);
		numberUtils.int2Str(1258006);
		// System.out.println(numberUtils.getNuberLength(898989898));
	}

}
