import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 File file = new File("buff.txt");
		 String [] array = new String[5];
		
		try {
			 Scanner scan = new Scanner(file);
			 while(scan.hasNextLine()){
				for (int i = 0; i < array.length; i++) {
					array[i] = scan.nextLine();
				}
			}
			 scan.close();
		} catch (Exception e) {
			System.out.println("Error! ");
		}
		
		for (int j = 0; j < array.length; j++) {
			String equation = array[j];
			if(checkBracket(equation)){
				String eqn = convert(equation);
				stack3 stack = new stack3(eqn.length());
				int x, y, z = 0;
				for (int i = 0; i < eqn.length(); i++) {
					char character = eqn.charAt(i);
					if (isNumeric(character)) {
						String s = character+"";
						int number = Integer.parseInt(s);
						stack.push(number);
					} else if ((character == '+') || (character == '-')
							|| (character == '*') || (character == '/')) {
						x = stack.pop();
						y = stack.pop();
						if (character == '/') {
							z = y / x;
						} else if (character == '*') {
							z = x *y;
						} else if (character == '+') {
							z = x + y;
						}
						else if (character == '-') {
							z = y - x;
						}
						stack.push(z);

					}
				}
				System.out.println(eqn+" = "+stack.pop());
				System.out.println();
			}
			else {
				System.out.println("Cannot perform any action if the equation is not valid");
			}
			}
		}

	private static String convert(String string) {
		String eqn = string;
		Stack2 s = new Stack2(eqn.length());
		Queue q = new Queue(eqn.length());
		for (int i = 0; i < eqn.length(); i++) {
			char c = eqn.charAt(i);
			if (isNumeric(c) || (c > 'A' && c < 'z')) {

				q.push(c);
			} else if (c == '-' || c == '+' || c == '/' || c == '*') {
				s.push(c);
			} else if (c == ')') {
				char op = s.pop();
				q.push(op);
			}
		}
		while (!s.empty()) {
			char op = s.pop();
			q.push(op);
		}
		System.out.print(eqn+ " = ");
		String z = "";
		for (int i = 0; i < eqn.length(); i++) {
			String y = null;
			y = q.pop()+"";
			z += y;
		}
		System.out.println(z);
		return z;
	}
		
	public static boolean isNumeric(char c) {
		String input = c+"";
		  try {
		    Integer.parseInt(input);
		    return true;
		  }
		  catch (NumberFormatException e) {
		    
		    return false;
		  }		
	}

	private static boolean checkBracket(String f) {
		Stack1 opening = new Stack1();
		Stack1 closing = new Stack1();
		opening.stackArray = new char[f.toString().length()];
		closing.stackArray = new char[f.toString().length()];
		for (int i = 0; i < f.toString().length(); i++) {
			char character = f.toString().charAt(i);

			if ((character == '(') || (character == '{')
					|| (character == '[')) {
				opening.push(character);
			} else if ((character == ')') || (character == '}')
					|| (character == ']')) {
				if (character == ')') {
					closing.push('(');

				} else if (character == '}') {
					closing.push('{');

				} else {
					closing.push('[');
				}
			}
		}
		String k = new String(closing.stackArray);
		String o = new String(opening.stackArray).trim();
		String c = new String(new StringBuilder(k).reverse()).trim();
		if (o.equals(c)) {
			System.out.println(f+ "   is" + " a valid equation.");
			return true;
		} else {
			System.out.println(f+ "   is " + "not a valid equation.");
			return false;
		}
		
	}
}
