import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;


public class ButtonListener implements ActionListener {

	private DefaultListModel<String> liste;
	private JTextField alan;
	public ButtonListener(JTextField a, DefaultListModel<String> l) {
		super();
		alan = a; 
		liste = l;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(alan.getText().isEmpty()) return;
		liste.addElement(alan.getText());
		MyDBConnection.getInstance().insertText(alan.getText());
		alan.setText(null);
	}

}
