import java.awt.*;
import java.awt.event.*;


class DrawPanel extends Panel implements MouseListener, MouseMotionListener{
	protected int lastX=0, lastY=0;
	
	public DrawPanel(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
public void mouseEntered(MouseEvent event){
	record(event.getX(), event.getY());
	}
public void mouseExited(MouseEvent event){
	}
public void mousePressed(MouseEvent event){
	record(event.getX(), event.getY());
	}
public void mouseReleased(MouseEvent event){
	}
public void mouseClicked(MouseEvent event){
	}
public void mouseDragged(MouseEvent event){
		int y = event.getY();
		int x = event.getX();
		getGraphic().drawLine(lastX, lastY,x y);
		record(x,y);
	}
public class MouseFrame extends Frame{
	public MouseFrame(){
		setSize(500, 500);
		setTitle("Mouse Stuff");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});

		add( new MousePanel(), BorderLayout.CENTER);
		setVisible(true);

	}		


	public static void main(String[] args){
		new MouseFrame();
	}
}

class MousePanel extends Panel implements MouseListener, MouseMotionListener{
	TextArea ta;
	
	public MousePanel(){
		setLayout(new BorderLayout());
		ta = new TextArea();
		add(ta, BorderLayout.CENTER);
		ta.addMouseListener(this);
		ta.addMouseMotionListener(this);
	}

	public void mouseEntered(MouseEvent me){
		ta.append("Entered: " + me.getX() + "," + me.getY() + "\n");
	}
	public void mouseExited(MouseEvent me){
		ta.append("Exited: " + me.getX() + "," + me.getY() + "\n");
	}
	public void mousePressed(MouseEvent me){
		ta.append("Pressed: " + me.getX() + "," + me.getY() + "\n");
	}
	public void mouseReleased(MouseEvent me){
		ta.append("Released: " + me.getX() + "," + me.getY() + "\n");
	}
	public void mouseClicked(MouseEvent me){
		ta.append("Clicked: " + me.getX() + "," + me.getY() + "\n");
	}
	public void mouseDragged(MouseEvent me){
		ta.append("Dragged: " + me.getX() + "," + me.getY() + "\n");
	}
	public void mouseMoved(MouseEvent me){
		ta.append("Moved: " + me.getX() + "," + me.getY() + "\n");
	}
}