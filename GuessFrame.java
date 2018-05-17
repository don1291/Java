import java.awt.*;
import java.awt.event.*;

public class GuessFrame extends Frame{
	int low = 0;
	int high = 100;
	
	public GuessFrame(){
		this(1,100);
		
	}

	public GuessFrame(int min, int max){
		setSize(500, 100);
		setTitle("Guessing Game");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		add(new GuessPanel(), BorderLayout.CENTER);
		setVisible(true);
	}
	
	public static void main(String[] args){
	    
		if(args.length == 2){
			new GuessFrame(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		}else{
			new GuessFrame();
		}
	}
}
class GuessPanel extends Panel implements ActionListener{
	Label label;
	TextField tf;
	int guess;
	int secret;
	int low;
	int high;
	int lowest;
	int highest;
	boolean firstHigh, firstLow;
	

	public GuessPanel(){
		
		setLayout(new GridLayout(0,1));
		label = new Label();
		tf = new TextField();
		label.setText("Enter a number between 1-100: ");
		tf.addActionListener(this);
		add(label);
		add(tf);
	}
	public void actionPerformed(ActionEvent ae){
		
		/*if(){
		secret = (int)(Math.random()*100+1);
		System.out.println(secret);
		}else{
		int guess = Integer.parseInt(tf.getText());
		String temp = tf.setText("");
		if(guess>secret){
			temp =  "Too high!";
			if(firstHigh){
				highest = guess;
				firstHigh = false;
			}else if(guess>=highest){
				System.out.println("You were already told " + highest + " is too high!");
			}else{
				highest = guess;
			}
		}else if(guess<secret){
			temp = "Too low!";
			if(firstLow){
				lowest = guess;
				firstLow = false;
			}else if( guess <= lowest){
				System.out.println("You were already told " + lowest + "  is too low!");
			}else{
				lowest = guess;
			}
		}*/
		
		label.setText(String.valueOf(guess));
		
		
	}
}