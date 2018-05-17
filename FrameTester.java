import java.awt.*;
import java.awt.event.*;

public class FrameTester extends Frame{
	
	public FrameTester(){
		setSize(500, 500);
		setSize("My Second Frame");
		addWindowListener(new WindowAdapter(){
			
			}
	    });




		setVisible(true);
    }
	public class MyAdpater implements WindowListener{
		public void windowDeactivated(WindowEvent we){
		}
		public void windowActivated(WindowEvent we){
		}
		public void windowDeiconified(WindowEvent we){
		}
		public void windowIconified(WindowEvent we){
		}
		public void windowClosing(WindowEvent we){
		}
		public void windowClosed(WindowEvent we){
			System.exit(0);
		}
		public void windowOpened(WindowEvent we){
		}

		
		public class MyPanel extends Panel implements ActionListener{
			TextField tf;
			TextArea ta;
			
			public MyPanel(){
				tf = new TextField();
				ta = new TextArea();
				setlayout(new BorderLayout());
				add(tf, BorderLayout.NORTH);
				add(ta, BorderLayout.CENTER);
		FrameTester ft = new FrameTester();
	}
	
}	