import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class LabelEx01 extends JFrame implements Runnable{
	LabelEx01() {
		super("진동하는 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLocation(200,200);
		setVisible(true);
		Thread th = new Thread(this);
		th.start();
	}
	@Override //Runnable을 상속받아서 오버라이딩함
	public void run() {//실행
		while(true) {
			try {
				Thread.sleep(10);//10ms초 간격으로 떨림
			}
			catch(InterruptedException e) {return;}
		
		int x = (int)(Math.random()*5);
		int y = (int)(Math.random()*5);
		setLocation(x,y);//x,y축 (5,5)에서 랜덤으로 떨림
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx01();
	}

}
