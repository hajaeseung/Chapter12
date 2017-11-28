import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class LabelEx2 extends JFrame implements Runnable{
	private JLabel la = new JLabel("진동 레이블");
	LabelEx2() {
		super("진동하는 레이블 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		setSize(250,250);
		setLocation(100,100);
		setVisible(true);
		Thread th = new Thread(this);
		th.start();
	}
	@Override //Runnable을 상속받아서 오버라이딩함
	public void run() {//실행
		Container c = getContentPane();
		while(true) {
			try {
				Thread.sleep(10);//10ms초 간격으로 떨림
			}
			catch(InterruptedException e) {return;}
		
		int x = (int)(Math.random()*5);
		int y = (int)(Math.random()*5);
		c.setLocation(x,y);//x,y축 (5,5)에서 랜덤으로 떨림
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx2();
	}
}



