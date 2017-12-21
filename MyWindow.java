import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.tree.DefaultMutableTreeNode;

public class MyWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3285619235236995244L;
	
	private JSplitPane split;
	private JList<String> liste;
	private DefaultListModel<String> listModel;
	private JTextField alan;
	private JButton dugme;
	private JButton listdugme;
	private JScrollPane sol;
	private JScrollPane sag;
	private JPanel sagPanel;
	
	public MyWindow() {
		super("My Application");
		listModel = new DefaultListModel<>();
		
		// restore from database... 
		ArrayList<String> l = MyDBConnection.getInstance().getList();
		for(String s : l) listModel.addElement(s);
		
		liste = new JList<>(listModel);
		sagPanel = new JPanel();
		sagPanel.setLayout(new FlowLayout());
		alan = new JTextField(20);
		dugme = new JButton("Add to List");
		dugme.addActionListener(new ButtonListener(alan, listModel));
		
		listdugme = new JButton("Loop from DB");
		listdugme.addActionListener(new DBLister());
		
		sagPanel.add(alan); sagPanel.add(dugme); sagPanel.add(listdugme);
		sol = new JScrollPane(liste);
		sag = new JScrollPane(sagPanel);
		split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sol, sag);
		add(split);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
