import java.awt.*;
import java.awt.event.*;

public class test extends Frame{
	MyPanel panel;

	public test(){
		setSize(500, 500);
		setTitle("My First Frame");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		panel = new MyPanel();
		add(panel, BorderLayout.CENTER);
		setVisible(true);
	}
	public class MyPanel extends Panel implements ActionListener{
		Button button;
		int x = 50;
		int ballWidth = 100;
		int panelWidth;
	
		public MyPanel(){
			setLayout(new BorderLayout());
			button = new Button("Click Me");
			add(button, BorderLayout.NORTH);
			button.addActionListener(this);
		}

		public void actionPerformed(ActionEvent ae){
			x += 4;
		    X -= 4;
			panelWidth = getSize().width;
			if(x + ballWidth > panelWidth){
				x -= 4;
			}else{
				if(x + ballWidth < panelWidth)
				x += -4;
			}
			repaint();
			
		}
	
		public void paint(Graphics g){
			g.drawOval(x, 50, ballWidth, 100);
		}

	}
	public static void main(String[] args){
		FrameTemplate ft = new FrameTemplate();
	}
}