package com.Day3;

public class GenericsDemo<T> {
	
	private T data;

	public GenericsDemo(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "GenericsDemo [data=" + data + "]";
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String ar[]) {
		GenericsDemo<String> d1 = new GenericsDemo<String>("Hello");
		System.out.println(d1.getData());
		
		GenericsDemo<Integer> d2 = new GenericsDemo<Integer>(100);
		System.out.println(d2.getData());
		
		GenericsDemo<GenericsDemo> d3 = new GenericsDemo<GenericsDemo>(new GenericsDemo("abc"));
		System.out.println(d3.getData());
	}
	
}

