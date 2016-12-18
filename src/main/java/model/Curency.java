package model;

import java.text.NumberFormat;
import java.util.Locale;

public class Curency {
	public static void main(String[] args) {
		double amout=123444.0800990;
		NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(nf.format(amout));
	}
}
