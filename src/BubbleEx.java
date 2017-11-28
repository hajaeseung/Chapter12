import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class BubbleEx extends JFrame {
	public BubbleEx() {
		super("�������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Bubble g = new Bubble();
		setContentPane(g);
		setSize(300,300);
		setVisible(true);
	}

	class Bubble extends JPanel {
		public Bubble() {
			setLayout(null);//��ġ ���� ����
			addMouseListener(new MouseAdapter() {//���콺�� ������ �̹��� ����
				public void mousePressed(MouseEvent e) {
					BubbleThread bubble = new BubbleThread(e.getX(), e.getY());
					bubble.start();//����
				}
			});
		}
		class BubbleThread extends Thread {
			JLabel bubble;
			public BubbleThread(int x, int y) {
				ImageIcon img = new ImageIcon("image.jpg");//�̹��� ���� �ҷ�����
				bubble = new JLabel(img);
				bubble.setSize(img.getIconWidth(), img.getIconWidth());//�̹��� ũ�� �״��
				bubble.setLocation(x,y);
				add(bubble);
				repaint();
			}
			public void run() {
				while(true) {
					int x = bubble.getX();
					int y = bubble.getY()+5;//-5�ȼ��� �̵�
					if(y < 0) {//0�� ����� ����
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


