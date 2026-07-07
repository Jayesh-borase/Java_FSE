package com.Day3;

class SubDemo<T, P> extends GenericsDemo<T>{

	private P temp;
	
	public SubDemo(T data, P temp) {
		super(data);
		this.temp = temp;
	}

	public P getTemp() {
		return temp;
	}

	public void setTemp(P temp) {
		this.temp = temp;
	}
	
	public static void main(String ar[]){
		SubDemo<String,Integer> sub = new SubDemo<String,Integer>("Varun",21);
		System.out.print(sub.getData() + "\t" + sub.getTemp());
	}
	
}
