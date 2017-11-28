import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class LabelEx2 extends JFrame implements Runnable{
	private JLabel la = new JLabel("���� ���̺�");
	LabelEx2() {
		super("�����ϴ� ���̺� �����");
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
	@Override //Runnable�� ��ӹ޾Ƽ� �������̵���
	public void run() {//����
		Container c = getContentPane();
		while(true) {
			try {
				Thread.sleep(10);//10ms�� �������� ����
			}
			catch(InterruptedException e) {return;}
		
		int x = (int)(Math.random()*5);
		int y = (int)(Math.random()*5);
		c.setLocation(x,y);//x,y�� (5,5)���� �������� ����
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx2();
	}
}



