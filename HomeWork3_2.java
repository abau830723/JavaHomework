import java.util.Scanner;

public class HomeWork3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int i, scannum;
		i = (int)(Math.random() * 9) + 0;
		System.out.println("開始猜數字吧！");
		while(true){
			scannum = scan.nextInt();
			if (scannum == i){
				System.out.println("答對了！答案就是" + i);
				break;
			}else{
				System.out.println("猜錯囉，答案是" + i);
				continue;
			}
		}
		
		Scanner scan2 = new Scanner(System.in); 
		int j, scannum2;
		j = (int)(Math.random() * 100) + 0;
		System.out.println("開始猜數字吧！(進階)");
		while(true){
			scannum2 = scan.nextInt();
			if (scannum2 == j){
				System.out.println("答對了！答案就是" + j);
				break;
			}else if(scannum2 < j){
				System.out.println("再猜大一點" + j);
				continue;
			}else if(scannum2 > j){
				System.out.println("再猜小一點" + j);
				continue;
			}
		}
	}

}
