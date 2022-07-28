import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int rand = (int)(Math.random()*10+1);
		
		switch(rand) {
		case 1: System.out.println("Bananas"); break;
		case 2: System.out.println("Orange");break;
		case 3: System.out.println("Peach");
		case 4: System.out.println("Apple");
		case 5: System.out.println("Plums");break;
		case 6: System.out.println("Pineapples");break;
		case 7: break;
		default : System.out.println("Nuts");break;
		}
	}
}
