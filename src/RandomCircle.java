import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class RandomCircle extends JFrame {
	private Container contentPane;
	class MyPanel extends JPanel {
		public MyPanel() {
			new Thread(new Runnable() {
				public void run() {//����
					try {
						while(true) {
							repaint();
							Thread.sleep(400);//400ms�� ��������
						}
					}catch(InterruptedException e) {
							return;
						}
					}
					
				}).start();//������ ����
	}
	
	public void paintComponent(Graphics g) {
		Random r = new Random();
		//int x = ((int)(Math.random()*contentPane.getWidth()));
		//int y = ((int)(Math.random()*contentPane.getHeight()));
		int x = r.nextInt(getWidth()-50);//���� x ��ǥ
		int y = r.nextInt(getHeight()-50);//���� y ��ǥ
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawOval(x, y, 50, 50);//������ 50�� ��
		
	}
}
	public RandomCircle() {
		setTitle("Circle Make");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Container c = getContentPane();
		//c.addMouseListener(new MyMouseAdapter());
		final MyPanel panel = new MyPanel();
		panel.setFocusable(true);
		setContentPane(panel);
		setSize(250,250);
		setVisible(true);
		
	}

	/*class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
		}
		
	}*/
	//���콺�� �ǵ帮�� �����̰� �Ϸ������� ������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomCircle();
	}
}

