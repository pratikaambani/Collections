package com.rts.compare;

class ComparableEX {

	public static void main(String[] args) {
		
		HDTV hdtv1 = new HDTV(50, "Sony");
		HDTV hdtv2 = new HDTV(60, "Samsung");
		
		if(hdtv1.compareTo(hdtv2) > 0) {
			System.out.println( hdtv1.getBrand() + " is better");
		} else 
			System.out.println( hdtv2.getBrand() + " is better");
	}

}
