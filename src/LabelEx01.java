import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class LabelEx01 extends JFrame implements Runnable{
	LabelEx01() {
		super("�����ϴ� ������ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLocation(200,200);
		setVisible(true);
		Thread th = new Thread(this);
		th.start();
	}
	@Override //Runnable�� ��ӹ޾Ƽ� �������̵���
	public void run() {//����
		while(true) {
			try {
				Thread.sleep(10);//10ms�� �������� ����
			}
			catch(InterruptedException e) {return;}
		
		int x = (int)(Math.random()*5);
		int y = (int)(Math.random()*5);
		setLocation(x,y);//x,y�� (5,5)���� �������� ����
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx01();
	}

}
