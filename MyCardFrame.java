import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyCardFrame extends Frame{
	LoginPanel lp;
	ChatPanel cp;
	
	public MyCardFrame(){
		setLayout(new CardLayout());
		setTitle("New Chat");
		setSize(500,500);
		lp = new LoginPanel(this);
		cp = new ChatPanel();
		cp.setLayout(new GridLayout(1,2));
		add(lp, "login");
		add(cp, "chat");
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	
		setVisible(true);
	}
	
	public static void main(String[] args){
	
		MyCardFrame mcf = new MyCardFrame();
	}
}

//class LoginPanel extends Panel implements ActionListener{
	//TextField tf;
	//MyCardFrame mcf;
	//Label nickname;
	//Button connect;
	
	//public LoginPanel(MyCardFrame mcf){
		//this.mcf = mcf;
		//nickname = new Label("Nickname: ");
		//tf = new TextField(20);
		//connect = new Button("Connect");
		//tf.addActionListener(this);
		//connect.addActionListener(this);
		//add(nickname);
		//add(tf);		
		//add(connect);
	//}		
	//public void actionPerformed(ActionEvent ae){
		//mcf.cp.setUserName(tf.getText()); //call setUserName of chatpanel which is a member of mycardframe
		//CardLayout cl = (CardLayout)(mcf.getLayout());
		//cl.next(mcf);
		//tf.setText("");

	//}


//}

//class ChatPanel extends Panel{
	//Label label1,label2;
	//String userName;
	//public ChatPanel(){
		//label1 = new Label("Chat Panel: ");
		//label2 = new Label("Name will go here");
		//add(label1);
		//add(label2);
	//}
	//public void setUserName(String userName){
		//this.userName = userName;
		//label2.setText(getUserName());
	//}
	//public String getUserName(){
		//return userName;
	//}
//}

class LoginPanel extends JPanel implements ActionListener{
	TextField tf;
	MyCardFrame mcf;
	JLabel nickname;
	Button connect;
	
	public LoginPanel(MyCardFrame mcf){
		this.mcf = mcf;
		nickname = new JLabel("Nickname: ");
		tf = new TextField(20);
		connect = new Button("Connect");
		tf.addActionListener(this);
		connect.addActionListener(this);
		add(nickname);
		add(tf);		
		add(connect);
	}		
	public void actionPerformed(ActionEvent ae){
		mcf.cp.setUserName(tf.getText()); //call setUserName of chatpanel which is a member of mycardframe
		CardLayout cl = (CardLayout)(mcf.getLayout());
		//cl.next(mcf);
		mcf.add(up);
		tf.setText("");

	}


}

class ChatPanel extends JPanel{
	JLabel name,users;
	String userName;
	UserPanel up;
	
	public ChatPanel(){
		users = new JLabel("Users");
		name = new JLabel("Name will go here");
		//add(users);
		//add(name);
		//mcf.add(cp.up);
	}
	public void setUserName(String userName){
		this.userName = userName;
		name.setText(getUserName());
	}
	public String getUserName(){
		return userName;
	}
	
	class UserPanel extends JPanel implements ActionListener{
		List  lst;
		TextField addtf, removetf;

		public UserPanel(){
			setLayout(new BorderLayout());
			lst = new List(4, false);
			lst.add("Mercury");
			lst.add("Venus");
			lst.add("Earth");
		
			add(lst, BorderLayout.WEST);
		
			addtf = new TextField();
			addtf.addActionListener(this);
			add(addtf, BorderLayout.SOUTH);
		
			removetf = new TextField();
			removetf.addActionListener(this);
			add(removetf, BorderLayout.NORTH);
		
		
		}
		public void actionPerformed(ActionEvent ae){
			if(ae.getSource() == addtf){
				String temp = addtf.getText();
				lst.add(temp);
				addtf.setText("");
			}else if(ae.getSource() == removetf){
				String temp = removetf.getText();
				lst.remove(temp);
				removetf.setText("");
			}
		}
	}
}


