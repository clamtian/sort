package FactoryPattern_02;

public class BMW extends Car{
	public void run(){
		System.out.println("BMW is running!!");
	}
	public String getType(){
		return "BMW";
	}
}
