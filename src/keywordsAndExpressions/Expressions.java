package keywordsAndExpressions;

public class Expressions {

	public static void main(String[] args) {
		//a mile is equal to 1.609344 KM
		double kilometers = (100 * 1.609344);
		//an expression would be everything after the "double" type
		//so the "kilometers = (100 * 1.609344)" would be the expression
		
		//CHALLENGE 
		//In the following code, write down what parts of the code are expressions
		int score = 100;
		//expression: "score = 100"
		if (score > 99) {
			//expression: "score > 99"
			System.out.println("You got the high score!");
			//expression: "You got the high score!"
			score = 0;
			//expression: "score = 0"
		}
	}
}
