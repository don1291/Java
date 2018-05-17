import java.awt.*;
import java.awt.event.*;

public class TextFrame extends Frame{
	public TextFrame(){
		setSize(500, 500);
		setTitle("Text Frame");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		add(new TextPanel(), BorderLayout.CENTER);		
		setVisible(true);
	}
	public static void main(String[] args){
		new TextFrame();
	}
}
class TextPanel extends Panel implements ActionListener, TextListener{
	TextField tf;
	TextArea ta1, ta2;
	Panel centerPanel;

	public TextPanel(){
		tf = new TextField();
		ta1 = new TextArea();
		ta2 = new TextArea();
		centerPanel = new Panel();
		centerPanel.setLayout(new GridLayout(0,1));
		centerPanel.add(ta1);
		centerPanel.add(ta2);
		setLayout(new BorderLayout());
		add(tf, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);

		tf.addActionListener(this);
		tf.addTextListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		String temp = tf.getText();
		String temp2 = ta1.getText();
		String result = temp + '\n' + temp2;
		ta1.setText(result);
		String result2 = temp2 + temp;
		ta2.setText(result2);
		tf.setText("");
	}
	public void textValueChanged(TextEvent te){
		//String temp = tf.getText();
		//ta2.setText(temp);
	}
}