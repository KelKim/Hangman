import java.io.*;
import java.util.*;

class SelectFruit {
	private String fruit;
	Console myConsole = System.console();

	public void selectFruit(){
		String[] fruits = {"banana", "pears", "mango", "apple", "pawpaw"};
		Random number = new Random();
		int i = number.nextInt(fruits.length);
		fruit = fruits[i];
	}

	public String getFruit(){
		return fruit;
	}

}