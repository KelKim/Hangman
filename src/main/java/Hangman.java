import java.io.*;
import java.util.*;

public class Hangman {

	Console myConsole = System.console();
	char[] fruitArray;

	int guesses;
	int score;
	int attempts;

	public void playGame(){
		SelectFruit select = new SelectFruit();
		select.selectFruit();
		String fruit = select.getFruit();
		fruitArray = fruit.toCharArray();
		System.out.println("Welcome to Hangman. A random fruit has been selected for you. Please guess the selected fruit.\r\n CLUE: The word is " + fruitArray.length + " characters long.");
		score = 0;
		guesses = 0;
		attempts = 7;
		char[] guess = new char[fruitArray.length];
		for (int i=0;i<fruitArray.length;i++){
			guess[i] = '_';
		}
		String selected = new String(guess);
		StringBuilder correct = new StringBuilder(selected);

		for (int a=0;a<7;a++){
			System.out.println("You have " + attempts + " remaining. \r\nPlease guess a letter: ");
			String letter = myConsole.readLine();
			char character = letter.charAt(0);
			System.out.println("Inputted Character: " + character);
			for (int e=0;e<fruitArray.length;e++){
				if(character == fruitArray[e]){
					correct.setCharAt(e, character);
					System.out.println(correct + "\r\n");
					score++;
				}
			}
			guesses++;
			attempts--;
			if(score == fruitArray.length){
				System.out.println("You've the fruit correctly.");
				a=7;
			}
			if(guesses == 7){
				System.out.println("You've failed.");
			}
		}
	}


}