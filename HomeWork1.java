
public class HomeWork1 {
	public static void main(String[] args) {
		//第一題
		int num1_1 = 12, num1_2 = 6; //宣告整數變數並定義數值
		int sum	, product; //宣告整數變數分別存放和與積
		sum = num1_1 + num1_2; //兩變數相加即可得和，存入sum變數
		product = num1_1 * num1_2; //兩變數相乘即可得積，存入product變數
		System.out.println("第一題：\n兩數之和為："+sum+"\n兩數之積為："+product+"\n"); //輸出結果
		
		//第二題
		int eggSum = 200; //宣告整數變數並定義數值(200顆蛋)
		int dst , bom; //宣告整數變數分別存放?打和?顆
		dst = eggSum / 12; //將蛋之總數除一打所需顆數即計算商數，並存入dst變數
		bom = eggSum % 12; //將蛋之總數對一打所需顆數求餘數即可得餘數，並存入bom變數
		System.out.println("第二題：\n"+eggSum+"顆蛋共是"+dst+"打"+bom+"顆"+"\n"); //輸出結果
		
		//第三題
		int secSum = 256559 ; //宣告整數變數並定義數值(256559秒)
		int day , hr , min , sec; //宣告整數變數天、小時、分鐘、秒
		day = secSum / (24*3600); //將總秒數除一天所需秒數可得day之商數
		secSum %= (24*3600);  //將總秒數對一天所需秒數求餘數可得剩餘之總秒數
		hr = secSum / 3600; //將剩餘總秒數除一小時所需秒數可得hr之商數
		secSum %= 3600; //將總秒數對一小時所需秒數求餘數可得剩餘之總秒數
		min = secSum / 60; //將剩餘總秒數除一分鐘所需秒數可得min之商數
		secSum %=60; //將剩餘總秒數對一分鐘所需秒數求餘數可得剩餘之秒數
		sec = secSum; //將剩餘秒數放入sec變數
		secSum = 256559; //將總秒數設定為初始直用來做輸出
		System.out.println("第三題：\n"+secSum+"秒為"+day+"天"+hr+"小時"+min+"分"+sec+"秒"+"\n"); //輸出結果
		
		//第四題
		final double pi = 3.1415; //宣告圓周率浮點數常數 
		int r=5; //宣告半徑變數並設定半徑為5
		double ca , cl; //宣告存放圓面積、圓周長之浮點數變數
		ca = r * r * pi; //圓面積公式為 半徑*半徑*圓周率
		cl = r * 2 * pi; //圓周長公式為 直徑(半徑*2)*圓周率
		System.out.println("第四題：\n圓面積："+ca+"\n圓周長："+cl+"\n"); //輸出結果
		
		//第五題
		int cor = 1_000_000; //宣告整數變數並定義本金數值
		int years = 10;//宣告整數變數並定義年之數值
		double r_5 = 0.06; //宣告浮點數變數並定義年利率數值
		double fv; //宣告終值浮點數變數
		//複利終值公式為：本金*(1+利率)^年數
		fv = cor *(Math.pow((1+r_5),years)); //數學函式Math.pow(底數,次方數) 求次方結果
		System.out.println("第五題：\n十年後複利終值為："+fv+"\n"); //輸出結果
		
		//第六題
		System.out.println("第六題："); 
		System.out.println(5+5); //java預設數字為int整數型態，故整數相加5+5為10
		System.out.println(5+'5'); //因數字字元的ascii碼是從48開始算，因此'5'則是48+5=53，所以當用字元5與整數5相加則會變成53+5=58，
		System.out.println(5+"5"); //將整數與字串用+連結，只是單純的串接，並無計算功能，因此得到55
		   
	}
}
