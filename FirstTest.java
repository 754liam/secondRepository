package firstTest;
import java.util.Scanner;
public class FirstTest {

	public static void main(String[] args) {
		int num;
		int total = 0;
		boolean a = true;
		Scanner input = new Scanner(System.in);
		while (a) {
			System.out.println("Enter a number");
			num = input.nextInt();
			if (num > 0) {
			total += num;
			}
			else if (num < 0) {
				System.out.println("invalid.");
				num = input.nextInt();
				
			}
			else {
				a = false;
				System.out.println(total);
			}
		}

	}

}
