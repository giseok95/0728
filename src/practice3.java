import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		int count =0;
		int line =1;
		
		for(char i=65; i<=90; i++) {
			if(line %2==0) System.out.printf("%c \t",i+32);
			else System.out.printf("%c \t",i);
				count++;
			if(count%5==0) {
				System.out.println();
				line++;
			}
		}
	}
}
