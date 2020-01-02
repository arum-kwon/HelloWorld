package test;

import java.util.Scanner;

class Sample{
	int price;
	String item;
	int qty;
	 
	Sample(){
	}
	Sample(int price) {
		super();
		this.price = price;
	}
	Sample(int price, String item) {
		super();
		this.price = price;
		this.item = item;
	}
	Sample(int price, String item, int qty) {
		super();
		this.price = price;
		this.item = item;
		this.qty = qty;
	}
	
}

public class SampleExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cal(10,3);
		Sample sample = null;
		sample = new Sample(30, "apple"); //오버로딩 오버라이딩
		Sample[] samAry = new Sample[100];
		samAry[0] = sample;
	}
	
	static int Cal(int a, int b) {
		return a+b;
	}
}
