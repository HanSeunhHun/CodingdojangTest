/*
컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
사용자는 이 숫자를 맞추어야 합니다.
입력한 숫자보다 정답이 크면 → "UP" 출력,
입력한 숫자보다 정답이 작으면 → "DOWN" 출력.
정답을 맞추면 → "정답"을 출력하고, 지금까지 숫자를 입력한 횟수를 알려줍니다.
 */

package javatest;
import java.util.Scanner;
import java.util.Random;

public class hellojava {

	public static void main(String[] args) {
		{
			int i = 0;
			int num;
			var scan  = new Scanner(System.in);
			Random random = new Random();
			int x = random.nextInt(100);
			
			do {
				System.out.println("숫자를 입력하세요 : ");
				num = scan.nextInt();
				
				if (x>num)
				{
					System.out.println("Up");
				}
				else if (x<num)
				{
					System.out.println("Down");
				}
				i++;
			}
			while (x!=num);
			System.out.println("정답입니다. "+i+"회 만에 맞췄습니다.");
			
			
		}
	}

}
