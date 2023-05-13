package com.javapractice;

enum Level{
	BEGINNER("Core Java"),INTERMEDIATE("Advanced Java"),ADVANCED("Java fullstack Developer");
	String define ;
	Level(String definition){
		define = definition ;
	}
	public String getDefine() {
		return define;
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		Level l1 = Level.BEGINNER;
		System.out.println(l1.getDefine());
	}

}
