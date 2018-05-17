import java.awt.*;
import java.awt.event.*;

public class FrameTemplate extends Frame{
	MyPanel panel;

	public FrameTemplate(){
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
		Button button2;
		int x = 50;
		int ballWidth = 100;
		int panelWidth;
		int hv = 4;
		int ballHeight = 100;
		int panelHeight;
		
	
		public MyPanel(){
			setLayout(new BorderLayout());
			button = new Button("Click Me");
			add(button, BorderLayout.NORTH);
			button.addActionListener(this);
			button2 = new Button("Click Me, Too");
			add(button, BorderLayout.SOUTH);
			button.addActionListener(this);
		}

		public void actionPerformed(ActionEvent ae){
			Button temp = (Button)ae.getSouce();
			panelWidth = getSize().width;
			if(temp == button){
				if(x + ballWidth > panelWidth){
					x -= hv;
					hv = -hv;
				}else{
					x += hv;
					}
					if(x < 0){
						x -= hv;
						hv = -hv;
					}else{
						x += hv;
					}else{
						x 
						
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