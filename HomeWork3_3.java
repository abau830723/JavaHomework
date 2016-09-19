import java.util.Scanner;

public class HomeWork3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int scannum;
		while(true){
			System.out.println("請輸入討厭的數字");
			scannum = scan.nextInt();
			if(scannum <= 0 || scannum > 49){
				System.out.println("請輸入1~49");
				continue;
			}else{
				int j = 0;
				for(int i = 1; i <=49 ;i++){
					
					if(i % 10 != scannum && i / 10 != scannum){
						System.out.print(i + " ");
						j++;
					}	
				}
				System.out.print("總共有" + j + "數字可選\n");
				break;
			}
		}
		
		//進階
		Scanner scan2 = new Scanner(System.in);
		int random;
		int scannum2;
		while(true){
			System.out.println("請輸入討厭的數字，將會產出六個亂數");
			scannum2 = scan2.nextInt();
			if(scannum2 <= 0 || scannum2 > 49){
				System.out.println("請輸入1~49");
				continue;
			}else{
				int randomArray[] = new int[6];
				for (int i = 0; i < 6; i++){
					random= (int)(Math.random() * 49) + 1;
					if(random % 10 != scannum2 && random / 10 != scannum2){
						randomArray[i] = random;
						for (int j =0; j < i; j++){
							if(randomArray[i] != randomArray[j]){
								randomArray[i] = random;
							}else{
								i--;
							}
						}
					}else{
						i--;
					}
				}
				for(int x=0;x<6;x++){
					   System.out.print(randomArray[x]+" ");
					  }
				break;
			}			
		}

	}

}
