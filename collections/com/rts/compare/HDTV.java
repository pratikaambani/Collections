package com.rts.compare;

class HDTV implements Comparable<HDTV> {
	
	
	

	public HDTV(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}

	int size;
	String brand;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int compareTo(HDTV hd) {

		if (this.getSize() > hd.getSize())
			return 1;
		else if (this.getSize() < hd.getSize())
			return -1;
		else
			return 0;

	}

}
