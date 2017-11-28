import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class LabelEx1 extends JFrame {
	
        JFrame f = this;
        JPanel p = new JPanel();
        runnable thread;
        Thread th;
        LabelEx1()
        {
                this.setTitle("진동하는 프레임 만들기");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thread = new runnable();
                th = new Thread(thread);
                this.setLocation(100, 100);
                this.add(p);
                this.setVisible(true);
                this.setSize(300, 300);
                th.start();

        }

        class runnable implements Runnable
        {
                public void run()
                {
                        while(true)
                        {
                                try
                                {
                                        f.setLocation(90, 100);
                                        Thread.sleep(1);
                                        f.setLocation(100, 100);

                                }
                                catch(InterruptedException e){return;}
                        }
                }
        }

		public static void main(String[] args)
        {
                new LabelEx1();
        }
}





