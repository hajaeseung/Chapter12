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
				public void run() {//실행
					try {
						while(true) {
							repaint();
							Thread.sleep(400);//400ms초 간격으로
						}
					}catch(InterruptedException e) {
							return;
						}
					}
					
				}).start();//스레드 시작
	}
	
	public void paintComponent(Graphics g) {
		Random r = new Random();
		//int x = ((int)(Math.random()*contentPane.getWidth()));
		//int y = ((int)(Math.random()*contentPane.getHeight()));
		int x = r.nextInt(getWidth()-50);//랜덤 x 좌표
		int y = r.nextInt(getHeight()-50);//랜덤 y 좌표
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawOval(x, y, 50, 50);//지름이 50인 원
		
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
	//마우스를 건드리면 움직이게 하려했으나 포기함

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomCircle();
	}
}

