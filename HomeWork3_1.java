import java.util.Scanner;

public class HomeWork3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int sc1, sc2, sc3, a, b, c; 
		while(true){
			System.out.print("請輸入三個整數：\n"); 
			sc1 = scan.nextInt(); sc2 = scan.nextInt(); sc3 = scan.nextInt(); 
			a = (int) Math.pow(sc1, 2); b = (int) Math.pow(sc2, 2); c = (int) Math.pow(sc3, 2);
			if (sc1 <=0 || sc2 <=0 || sc3 <=0 || sc1 + sc2 < sc3 || sc2 + sc3 < sc1 || sc3 + sc1 < sc2){
				System.out.println("這不是三角形，請重新輸入");
				continue;
			} else if (sc1 == sc2 && sc2 == sc3 && sc3 == sc1){
				System.out.println("正三角形"); 
				break;
			} else if (sc1 == sc2 || sc2 == sc3 || sc3 == sc1){
				System.out.println("等腰三角形"); 
				break;
			} else if (a * a == b * b+ c || b == a + c || c == a + b){
				System.out.println("直角三角形"); 
				break;
			} else {
				System.out.println("其他三角型"); 
				break;
			}
		}
	}

}
