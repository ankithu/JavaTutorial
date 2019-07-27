
public class ClassesAndMethods {
	public static void main(String[] args) {
		String reversable = "Ankith";
		print(reverse(reversable));
		print(getTime());
	}
	public static void printHello() {
		System.out.println("hello");
	}
	public static void print(String in) {
		System.out.println(in);
	}
	public static void print(long in) {
		System.out.println(in);
	}
	public static int square(int a) {
		return a * a;
	}
	public static String reverse(String input) {
		String output = "";
		for (int i = input.length()-1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}
	public static long getTime() {
		return ((System.currentTimeMillis()/1000)/60/60/24)/365;
	}
}
