import java.awt.*;
import java.awt.event.*;

public class ItemFrame extends Frame{

	public ItemFrame(){
		setSize(700, 500);
		setTitle("Item Frame");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		add(new ItemPanel(), BorderLayout.CENTER);	
		setVisible(true);
	}

	public static void main(String[] args){
		new ItemFrame();
	}
}

class ItemPanel extends Panel implements ActionListener, ItemListener {
    TextArea output;
    List spanish, italian; 
    String newline;

    public ItemPanel() {
	setLayout(new BorderLayout());
	newline = System.getProperty("line.separator");

        //Build first list, which allows multiple selections.
        spanish = new List(4, true); //prefer 4 items visible
        spanish.add("uno");
        spanish.add("dos");
        spanish.add("tres");
        spanish.add("cuatro");
        spanish.add("cinco");
        spanish.add("seis");
        spanish.add("siete");
	spanish.addActionListener(this);
	spanish.addItemListener(this);

        //Build second list, which allows one selection at a time.
        italian = new List(); //Defaults to none visible, only one selectable
        italian.add("uno");
        italian.add("due");
        italian.add("tre");
        italian.add("quattro");
        italian.add("cinque");
        italian.add("sei");
        italian.add("sette");
	italian.addActionListener(this);
	italian.addItemListener(this);
        
		output = new TextArea(10, 40);
		Font font = new Font("Times New Roman", Font.BOLD, 22);
		output.setFont(font);
	    spanish.setFont(font);
		italian.setFont(font);
        output.setEditable(false);
	    
        add(output, BorderLayout.CENTER);
        add(spanish, BorderLayout.EAST);
        add(italian, BorderLayout.WEST);
    }

    public void actionPerformed(ActionEvent e) {
	List list = (List)(e.getSource());
        String language = (list == spanish) ? "Spanish" : "Italian";
        output.append("Action event occurred on \""
                          + list.getSelectedItem()  + "\" in "
                          + language + "." + newline);
    }

    public void itemStateChanged(ItemEvent e) {
	List list = (List)(e.getItemSelectable());
        String language = (list == spanish) ? "Spanish" : "Italian";
	int index = ((Integer)(e.getItem())).intValue();
	if (e.getStateChange() == ItemEvent.SELECTED) {
		output.append("Select event occurred on item #"
                          + index + " (\""
                          + list.getItem(index) + "\") in "
                          + language + "." + newline);
	} else { //the item was deselected
            	output.append("Deselect event occurred on item #"
                          + index + " (\""
                          + list.getItem(index) + "\") in "
                          + language + "." + newline);
        }
    }
}