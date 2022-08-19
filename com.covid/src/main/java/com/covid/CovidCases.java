package com.covid;

public class CovidCases {
	
	static int sum = 1;

	public static void main(String[] args) {
		
		int total = sumOfCovidCases(1,2);
		
		System.out.println(total);
			
		}
	
	public static int sumOfCovidCases (int a, int b) {
		
		 sum = a + b;
		
		return sum;

	}

}
