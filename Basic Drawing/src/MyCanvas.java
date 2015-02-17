import java.awt.*;

import javax.swing.*;

public class MyCanvas extends Canvas 
    {
    private static final long	serialVersionUID	= 1L;

    public static void main(String[] args) 
    		{
	        MyCanvas canvas = new MyCanvas();
	        JFrame frame = new JFrame();
	        frame.setSize(500,500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas);
	        frame.setVisible(true);
    		}

    public void paint(Graphics graphics) 
    		{
	        graphics.setColor(new Color(0,0,0));
	        graphics.fillOval(0, 0, 500, 500);
	        graphics.setColor(new Color(0,0,255));
	        graphics.fillRect(100, 100, 100, 100);
	        graphics.fillRect(300, 100, 100, 100);
	        graphics.setColor(Color.red);
	        graphics.fillOval(150, 300, 200, 100);   
    		}
    }
