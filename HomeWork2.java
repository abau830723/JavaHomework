
public class HomeWork2 {

	public static void main(String[] args) {
		System.out.println("HW2-1：");
		int sum_1 = 0; //宣告變數存放偶數和
		for (int i = 1; i<=1000; i++){	
			if(i % 2 == 0){ //判斷是否為偶數
			sum_1 += i;	 //若是偶數，將偶數和變數做累加
			}
		}
		System.out.println(sum_1 + "\n"); //輸出結果
		
		System.out.println("HW2-2：");
		int sum_for = 1; //宣告變數存放連乘積
		for (int i =1; i<=10; i++){ //1-10的迴圈 每圈i值+1
			sum_for *= i; //每圈迴圈做累乘 - sum_for = sum_for * i
		}
		System.out.println(sum_for + "\n"); //輸出結果
		
		System.out.println("HW2-3：");
		int sum_while = 1; //宣告變數存放連乘積
		int i = 1; 
		while (i <=10){ 
			sum_while *= i; //每圈迴圈做累乘 - sum_for = sum_for * i
			i++;
		}
		System.out.println(sum_while + "\n"); //輸出結果
		
		System.out.println("HW2-4：");
		int sum_ii = 0; //宣告變數用來存放運算資料
		for (int ii = 1; ii<=100; ii++){
			
			if (ii % 2 ==1 && sum_ii < 100){ //判斷是否為偶數且(&&)總值不可大於100
				sum_ii=ii+sum_ii; //若符合條件 將sum_ii做累加，在此不直接使用迴圈之ii變數是因會影響迴圈偶數之判斷
				System.out.print(sum_ii+" "); //輸出結果
				
			}
			
		}
		System.out.println("\n");
		
		System.out.println("HW進階2-1：");
		for (int n4 = 1; n4<=49; n4++){ 
			if(n4 % 10 !=4 && n4/10 !=4){ //以求餘數的方式判斷個位數是否為4且(&&)以整除的方式判斷十位數是否為4
				System.out.print(n4+" "); //若條件符合則輸出結果
			}
		}
		System.out.println("\n");
		
		System.out.println("HW進階2-2：");
		for(int ii = 10; ii>=1; ii--){ //外圈從10個數字開始做迴圈，每圈-1
			for(int jj = 1; jj<=ii; jj++){ //內圈每列從1開始 內圈每圈+1
				System.out.print(jj +" "); //輸出結果
			}
			System.out.println();
		}
		System.out.println("\n");
		
		System.out.println("HW進階2-3：");
		for (int ii = 1; ii<=6; ii++){
			char eng = 'A'; 
			switch (ii){ //題目是由A - F做迴圈三角型 ，且1 - 6層分別為A - F 因此在第一層迴圈判斷ii之值
				case 1:
					eng = 'A'; //若ii比對為1(第一列) 則eng = 'A'
					break;
				case 2:
					eng = 'B'; //若ii比對為2(第二列) 則eng = 'B' 以下以此類推
					break;
				case 3:
					eng = 'C'; 
					break;
				case 4:
					eng = 'D';
					break;
				case 5:
					eng = 'E';
					break;
				case 6:
					eng = 'F';
					break;
			}
			for (int jj = 1; jj<=ii; jj++){ //第二層迴圈
				System.out.print(eng + " "); //以eng字元做輸出
			}
			System.out.println();
		}
	}

}
