import java.util.Scanner;

public class Number {

	static public void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아무 키나 입력>> ");
		scanner.nextLine(); // 입력
		scanner.close();
		
		Thread th = new Thread(new CountingThread());	
		th.start();
	}
}

class CountingThread implements Runnable {//Runnable 인터페이스 사용
	@Override
	public void run() {
		System.out.println("스레드 실행 시작");		
		for(int i=1; i<=10; i++)//1~10까지 출력
			System.out.print(i + " ");
		System.out.println();
		System.out.println("스레드 종료");
	}
}
