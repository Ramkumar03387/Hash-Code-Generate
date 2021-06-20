package tutorial;

import java.util.Random;
import java.util.Scanner;

public class FirstProgram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lenth of hash value:");
		int length = sc.nextInt();
		String arr1[] = 
		{
	        ("1"),("2"),("3"),("4"),("5"),("6"),("7"),("8"),("9"),("0"),
			("a"),("b"),("c"),("d"),("e"),("f"),("g"),("h"),("i"),("j"),("k"),("l"),("m"),("n"),("o"),("p"),("q"),("r"),("s"),("t"),("u"),("v"),("w"),("x"),("y"),("z"),
		};//("A"),("B"),("C"),("D"),("E"),("F"),("G"),("H"),("I"),("J"),("K"),("L"),("M"),("N"),("O"),("P"),("Q"),("R"),("S"),("T"),("U"),("V"),("W"),("X"),("Y"),("Z")
		
		Random random = new Random();
		
		for(int i=0;i<length;i++) {
			int a = random.nextInt(arr1.length-1);
			System.out.print(arr1[a]);
			
		}
	}
}
