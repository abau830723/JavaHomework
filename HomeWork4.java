import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		int[] num = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0 ,average = 0;
		for(int i = 0 ; i < num.length ; i++){
			sum += num[i];
		}
		average = sum / num.length;
		System.out.println("第一題：\n" + average);
		System.out.println("大於平均數之元素有：" + " ");
		for(int i = 0 ; i < num.length ; i++){
			if(num[i] > average){
				System.out.print(num[i] + " ");
			}
		}
		System.out.print("\n");

		//2
		System.out.println("第二題：");
		String s1 = new String("Hello World");
		String Hello[] = new String[11];
		for (int i = 10 ; i >=0 ; i--){
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		//3
		System.out.println("第三題：");
		String[] uni ={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		uni[0].length();
		int aeiou = 0;
		for (int i = 0 ; i < uni.length ; i++){
			for(int j = 0 ; j < uni[i].length() ; j++){
				switch (uni[i].charAt(j)){
				case 'a':
					aeiou++;
					break;
				case 'e':
					aeiou++;
					break;
				case 'i':
					aeiou++;
					break;
				case 'o':
					aeiou++;
					break;
				case 'u':
					aeiou++;
					break;
				default:
					break;
				}
			}
		}
		System.out.println("母音總數為" + aeiou);
		//4
		System.out.println("第四題：");
		System.out.println("請輸入需要借多少$");
		Scanner scan = new Scanner(System.in);
		int scannum;
			scannum = scan.nextInt();
		int[][] Array = {{25,32,8,19,27},{2500,800,500,1000,1200}};
		String fri = "";
		int numm = 0 ;
		for (int i = 0 ; i < Array[1].length ; i++){
			if(Array[1][i] >= scannum){
				fri = Array[0][i] + " " +fri;
				numm++;
			}
		}
		System.out.println("有錢可借的員工編號：" + fri + "共" + numm + "人！");
		
		//進階1
		Scanner scan2 = new Scanner(System.in);
		int years, month, day, days = 0;
		years = scan.nextInt(); month = scan.nextInt(); day = scan.nextInt(); 
		int[] mdays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(years % 4 ==0 && years % 100 ==0 | years % 400 ==0){
			mdays[2] = 29; 
		}
		for (int i = 0; i <month; i++){
			days+= mdays[i];
		}
			days+= day;
			System.out.println("西元" + years + "年，第" + days + "天");
			
		//進階2
			int st1,st2,st3,st4,st5,st6,st7,st8;
			st1 = 0; st2 = 0; st3 = 0; st4 = 0; st5 = 0; st6 = 0; st7 = 0; st8 = 0;
			int[][] classArray = 
				{{10,35,40,100,90,85,75,70},
				 {37,75,77,89,64,75,70,95},
				 {100,70,79,90,75,70,79,90},
				 {77,95,70,89,60,75,85,89},
				 {98,70,89,90,75,90,89,90},
				 {90,80,100,75,50,20,99,75}};
			
			System.out.println( classArray[5][2] + " " + classArray[0].length);
			for (int i = 0 ;i < classArray.length ;i++){
				int max = 0, maxstudent = 0;
				for (int j = 0 ; j < classArray[i].length ;j++){
					if(classArray[i][j] > max){
						max = classArray[i][j];
						maxstudent = j;
						}
					}
				switch (maxstudent){
				case 0:
					st1++;
					break;
				case 1:
					st2++;
					break;
				case 2:
					st3++;
					break;
				case 3:
					st4++;
					break;
				case 4:
					st5++;
					break;
				case 5:
					st6++;
					break;
				case 6:
					st7++;
					break;
				case 7:
					st8++;
					break;
				default:
					break;
				}				
			}
			System.out.println("最高分次數：\n1號：" + st1 + "次\n2號：" + st2 + "次\n3號：" + st3 + "次\n4號：" + st4 + "次\n5號：" + st5 + "次\n6號：" + st6 + "次\n7號：" + st7 + "次\n8號：" + st8 + "次");
			
	}

}
