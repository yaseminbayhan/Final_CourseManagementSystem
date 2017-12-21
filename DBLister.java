import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DBLister implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		MyDBConnection.getInstance().loopText();
	}

}
