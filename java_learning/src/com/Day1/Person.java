package com.Day1;

public class Person implements Cloneable{
	
		private String name;
		private int age;
	
		public Person() {
			this("Unknown",1);		//constructor chaining (calling constructor inside a constructor code reusability)
		}
		
		public Person(String name,int age) {
			this.name = name;
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Person) {
				Person p = (Person) obj;
				if(this.age == p.age && this.name == p.name) {
					return true;
				}
				else {
					return false;
				}
			}
			return false;
			
		}

		public void print(){
			System.out.println("Name: "+name+", Age: "+age);
		}
		
		public static void main(String ar[]) throws CloneNotSupportedException {
			Person p = new Person("Varun",21);
			p.print();
			
			System.out.println(p);			//printing obeject implicitly calls toString() method from Object class
			
			Person p2 = new Person("Varun",21);
			
			System.out.println(p.equals(p2));  //by default compares hashcode if not overriden
			
			Person pclone = (Person) p2.clone();
			System.out.println(pclone);
		}
		
}