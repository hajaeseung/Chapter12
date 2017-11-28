import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class BubbleEx extends JFrame {
	public BubbleEx() {
		super("버블게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Bubble g = new Bubble();
		setContentPane(g);
		setSize(300,300);
		setVisible(true);
	}

	class Bubble extends JPanel {
		public Bubble() {
			setLayout(null);//위치 지정 안함
			addMouseListener(new MouseAdapter() {//마우스로 누르면 이미지 생성
				public void mousePressed(MouseEvent e) {
					BubbleThread bubble = new BubbleThread(e.getX(), e.getY());
					bubble.start();//시작
				}
			});
		}
		class BubbleThread extends Thread {
			JLabel bubble;
			public BubbleThread(int x, int y) {
				ImageIcon img = new ImageIcon("image.jpg");//이미지 파일 불러오기
				bubble = new JLabel(img);
				bubble.setSize(img.getIconWidth(), img.getIconWidth());//이미지 크기 그대로
				bubble.setLocation(x,y);
				add(bubble);
				repaint();
			}
			public void run() {
				while(true) {
					int x = bubble.getX();
					int y = bubble.getY()-5;//-5픽셀씩 이동
					if(y < 0) {//0을 벗어나면 삭제
						remove(bubble);
						repaint();
						return;
					}
					bubble.setLocation(x,y);
					repaint();
					try {
						sleep(200);
					}
					catch(InterruptedException e) {}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BubbleEx();
	}
}


