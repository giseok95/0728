import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도 입력: ");
		int bornyear= sc.nextInt();
		System.out.println(2022-bornyear+1+"살");
		
		if(bornyear%12==0) System.out.println("원숭이띠");
		if(bornyear%12==1) System.out.println("닭띠");
		if(bornyear%12==2) System.out.println("개띠");
		if(bornyear%12==3) System.out.println("돼지띠");
		if(bornyear%12==4) System.out.println("쥐띠");
		if(bornyear%12==5) System.out.println("소띠");
		if(bornyear%12==6) System.out.println("호랑이띠");
		if(bornyear%12==7) System.out.println("토끼띠");
		if(bornyear%12==8) System.out.println("용띠");
		if(bornyear%12==9) System.out.println("뱀띠");
		if(bornyear%12==10) System.out.println("말띠");
		if(bornyear%12==11) System.out.println("양띠");
	}
}
