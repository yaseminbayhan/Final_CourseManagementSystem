import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class menubar extends JFrame 
{
	final String columnNames[] = { "" };
	private JPanel c_year_p;
	private JPanel c_semester_p;
	private JPanel c_course_p;
	private JPanel c_exam_p;
	private JPanel c_student_p;
	private JPanel m_year_p;
	private JPanel m_semester_p;
	private JPanel m_course_p;
	private JPanel m_exam_p;
	private JPanel d_year_p;
	private JPanel d_semester_p;
	private JPanel d_course_p;
	private JPanel d_exam_p;
	private JPanel d_student_p;
    
    public menubar()
    {
        initUI();
        createMenuBar();
        //JOptionPane.showMessageDialog(null, "Opening Main Page");
    }
    
    public void initUI() 
    {

        createMenuBar();

        setTitle("COURSE MANAGEMENT SYSTEM");
        setSize(1600, 1250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    public void createMenuBar()
    {   
    	/////////////////CREATE//////////////////////////////////////////
    	
    	JFrame frame = new JFrame();
    	JFrame c_year_f = new JFrame("YEAR");
	    c_year_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    c_year_f.setSize(1600, 1250);
	    c_year_p = new JPanel();
	    c_year_p.setSize(new Dimension(1,1));
		setContentPane(c_year_p);
		c_year_p.setLayout(null);
		
		JLabel c_year_l = new JLabel("Enter the new year:");
		c_year_l.setBounds(100,110,200,40);
		c_year_p.add(c_year_l);
		
		JTextField textyear = new JTextField();
	    textyear.setBounds(400,120,200,20);
	    c_year_p.add(textyear);
	    
	    JButton saveyear = new JButton("SAVE");
	    saveyear.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				
			///////////////////////////SAVE METHODU///////////////////	
			}
		});
	    saveyear.setBounds(400,160,200,20);
		c_year_p.add( saveyear);
		c_year_f.add(c_year_p);
		
		JButton back0 = new JButton("BACK");
		back0.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);
				
			}
		});
		back0.setBounds(1250,20,70,30);
		c_year_p.add(back0);
		c_year_f.add(c_year_p);
		
				
		
	    JFrame c_semester_f = new JFrame("SEMESTER");
	    c_semester_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    c_semester_f.setSize(1600, 1250);
		c_semester_p = new JPanel();
		c_semester_p.setSize(new Dimension(1,1));
		setContentPane(c_semester_p);
		c_semester_p.setLayout(null);
		
		JLabel c_semester_l = new JLabel("Enter the new semester:");
		c_semester_l.setBounds(100,110,200,40);
		c_semester_p.add(c_semester_l);
		
		JTextField textsemester = new JTextField();
		textsemester.setBounds(400,120,200,20);
	    c_semester_p.add(textsemester);
	    
	    JButton savesemester = new JButton("SAVE");
	    savesemester.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				
			///////////////////////////SAVE METHODU///////////////////	
			}
		});
	    savesemester.setBounds(400,160,200,20);
		c_semester_p.add(savesemester);
		c_semester_f.add(c_semester_p);
		
		JButton back1 = new JButton("BACK");
		back1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
					menubar m = new menubar();
					m.setVisible(true);			
				}
		});
		back1.setBounds(1250,20,70,30);
		c_semester_p.add(back1);
		c_semester_f.add(c_semester_p);
		
		
		
		JFrame c_course_f = new JFrame("COURSE");
		c_course_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c_course_f.setSize(1600, 1250);
		c_course_p = new JPanel();
		c_course_p.setSize(new Dimension(1,1));
		setContentPane(c_course_p);
		c_course_p.setLayout(null);
		
		JLabel c_course_l = new JLabel("Enter the new course:");
		c_course_l.setBounds(100,110,200,40);
		c_course_p.add(c_course_l);
		
		JTextField textcourse = new JTextField();
	    textcourse.setBounds(400,130,200,20);
	    c_course_p.add(textcourse);
	    
	    JLabel c_section_l = new JLabel("Enter the new section:");
		c_section_l.setBounds(100,150,200,40);
		c_course_p.add(c_section_l);
		
		JTextField textsection = new JTextField();
	    textsection.setBounds(400,170,200,20);
	    c_course_p.add(textsection);
	    
	    JButton savecourse = new JButton("SAVE");
	    savecourse.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				
			///////////////////////////SAVE METHODU///////////////////	
			}
		});
	    savecourse.setBounds(400,210,200,20);
		c_course_p.add( savecourse);
		c_course_f.add(c_course_p);
		
		
		JButton back2 = new JButton("BACK");
		back2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);			
			}
		});
		back2.setBounds(1250,20,70,30);
		c_course_p.add(back2);
		c_course_f.add(c_course_p);
		
		
		
		JFrame c_exam_f = new JFrame("EXAM");
		c_exam_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c_exam_f.setSize(1600, 1250);
		c_exam_p = new JPanel();
		c_exam_p.setSize(new Dimension(1,1));
		setContentPane(c_exam_p);
		c_exam_p.setLayout(null);
		
		JLabel c_exam_l = new JLabel("Enter the new midterm 1:");
		c_exam_l.setBounds(100,110,200,40);
		c_exam_p.add(c_exam_l);
		JTextField mid1 = new JTextField();
		mid1.setBounds(400,130,200,20);
	    c_exam_p.add(mid1);
	    JLabel c_exam_l1 = new JLabel("Enter the new midterm 2:");
		c_exam_l1.setBounds(100,150,200,40);
		c_exam_p.add(c_exam_l1);
		JTextField mid2 = new JTextField();
		mid2.setBounds(400,170,200,20);
	    c_exam_p.add(mid2);
	    JLabel c_exam_l2 = new JLabel("Enter the new final:");
		c_exam_l2.setBounds(100,200,200,40);
		c_exam_p.add(c_exam_l2);
		JTextField mid3 = new JTextField();
		mid3.setBounds(400,220,200,20);
	    c_exam_p.add(mid3);
	    
	    JButton saveexam = new JButton("SAVE");
	    saveexam.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				
			///////////////////////////SAVE METHODU///////////////////	
			}
		});
	    saveexam.setBounds(400,250,200,20);
		c_exam_p.add( saveexam);
		c_exam_f.add(c_exam_p);
		
		JButton back3 = new JButton("BACK");
		back3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);
			}
		});
		back3.setBounds(1250,20,70,30);
		c_exam_p.add(back3);
		c_exam_f.add(c_exam_p);
		
		
		
		JFrame c_student_f = new JFrame("STUDENT");
		c_student_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c_student_f.setSize(1600, 1250);
		c_student_p = new JPanel();
		c_student_p.setSize(new Dimension(1,1));
		setContentPane(c_student_p);
		c_student_p.setLayout(null);
		
		JButton enter = new JButton("Add students to the courses");
		 enter.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				
				/////////////////////////////////STUDENT EKLEME METHODU
				
				}
		});
		 enter.setBounds(400,120,350,20);
		c_student_p.add( enter);
		c_student_f.add(c_student_p);
		
		JButton back4 = new JButton("BACK");
		back4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);
				
				}
		});
		back4.setBounds(1250,20,70,30);
		c_student_p.add(back4);
		c_student_f.add(c_student_p);
		
		
		
		/////////////////////////////////MANAGE////////////////////////////////////////////////////////////////////////////////////////////
		JFrame m_year_f = new JFrame("YEAR");
		m_year_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m_year_f.setSize(1600, 1250);
		m_year_p = new JPanel();
		m_year_p.setSize(new Dimension(1,1));
		setContentPane(m_year_p);
		m_year_p.setLayout(null);
		
		JLabel m_year_l = new JLabel("Delete the selected year :");
		m_year_l.setBounds(100,110,350,40);
		m_year_p.add(m_year_l);
		
		DefaultTableModel modelyeardd = new DefaultTableModel(columnNames,0);
		JTable tableyeardd = new JTable(modelyeardd);
		tableyeardd.setBounds(400,150,800,400);		
		JScrollPane scrollPaned = new JScrollPane(tableyeardd);
		scrollPaned.setBounds(400,150,800,400);
		m_year_p.add(scrollPaned);
	    
	    JButton msaveyear = new JButton("DELETE");
	    saveyear.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
			
				
				DefaultTableModel modelyeardd = (DefaultTableModel) tableyeardd.getModel();
				try {
				int SelectedRowIndex = tableyeardd.getSelectedRow();
				modelyeardd.removeRow(SelectedRowIndex);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				
				
				
			///////////////////////////////DELETE METHOD///////////////////////
			}
		});
	    msaveyear.setBounds(100,160,200,20);
		m_year_p.add( msaveyear);
		m_year_f.add(m_year_p);
	
		JButton back5 = new JButton("BACK");
		back5.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);
				
			}
		});
		back5.setBounds(1250,20,70,30);
		m_year_p.add(back5);
		m_year_f.add(m_year_p);
		
		
		
		JFrame m_semester_f = new JFrame("SEMESTER");
		m_semester_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m_semester_f.setSize(1600, 1250);
	    m_semester_p = new JPanel();
	    m_semester_p.setSize(new Dimension(1,1));
		setContentPane(m_semester_p);
		m_semester_p.setLayout(null);
		
		DefaultTableModel modelsemesterdd = new DefaultTableModel(columnNames,0);
		JTable tablesemesterdd = new JTable(modelsemesterdd);
		tablesemesterdd.setBounds(400,150,800,400);		
		JScrollPane scrollPaneds = new JScrollPane(tablesemesterdd);
		scrollPaneds.setBounds(400,150,800,400);
		m_semester_p.add(scrollPaneds);
		
		JLabel m_semester_l = new JLabel("Delete the semester selected semester:");
		m_semester_l.setBounds(100,110,350,40);
		m_semester_p.add(m_semester_l);
		
		JButton mdsemester = new JButton("DISPLAY");
	    mdsemester.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				DefaultTableModel modelsemesterdd = (DefaultTableModel) tableyeardd.getModel();
				try {
				int SelectedRowIndex = tablesemesterdd.getSelectedRow();
				modelsemesterdd.removeRow(SelectedRowIndex);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				
		    //////////////DISPLAY METHOD///////////////////
				
				
				
			}
		});
	    mdsemester.setBounds(400,160,200,20);
	    m_semester_p.add( mdsemester);
		m_semester_f.add(m_semester_p);
	    
	    JButton msavesemester = new JButton("DELETE");
	    msavesemester.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				
			///////////////////////////////DELETE METHOD///////////////////////
			}
		});
	    msavesemester.setBounds(100,160,200,20);
	    m_semester_p.add( msavesemester);
		m_semester_f.add(m_semester_p);
		
		JButton back6 = new JButton("BACK");
		back6.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);
				
			}
		});
		back6.setBounds(1250,20,70,30);
		m_semester_p.add(back6);
		m_semester_f.add(m_semester_p);
	    
		
		
	    JFrame m_course_f = new JFrame("COURSE");
	    m_course_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    m_course_f.setSize(1600, 1250);
	    m_course_p = new JPanel();
	    m_course_p.setSize(new Dimension(1,1));
		setContentPane(m_course_p);
		m_course_p.setLayout(null);
		
		DefaultTableModel modelcoursedd = new DefaultTableModel(columnNames,0);
		JTable tablecoursedd = new JTable(modelcoursedd);
		tablecoursedd.setBounds(400,150,800,400);		
		JScrollPane scrollPanedsc = new JScrollPane(tablecoursedd);
		scrollPanedsc.setBounds(400,150,800,400);
		m_course_p.add(scrollPanedsc);
		
		JLabel m_course_l = new JLabel("Delete the course that prevýous saved course:");
		m_course_l.setBounds(100,110,350,40);
		m_course_p.add(m_course_l);
		
		JLabel m_section_l = new JLabel("Enter the new section:");
		m_course_l.setBounds(100,130,200,40);
		m_course_p.add(m_section_l);
		
		JTextField textsection1 = new JTextField();
	    textsection1.setBounds(400,150,200,20);
	    m_course_p.add(textsection1);
		
	    
	    JButton msavecourse = new JButton("DELETE");
	    msavecourse.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				DefaultTableModel modelcoursedd = (DefaultTableModel) tablecoursedd.getModel();
				try {
				int SelectedRowIndex = tablesemesterdd.getSelectedRow();
				modelcoursedd.removeRow(SelectedRowIndex);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				
				
				
			////////////////////////////////DELETE METHOD///////////////////////
			}
		});
	    msavecourse.setBounds(100,190,200,20);
	    m_course_p.add( msavecourse);
		m_course_f.add(m_course_p);
		
		JButton back7 = new JButton("BACK");
		back7.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);
				
			}
		});
		back7.setBounds(1250,20,70,30);
		m_course_p.add(back7);
		m_course_f.add(m_course_p);
	    
		
		
	    JFrame m_exam_f = new JFrame("EXAM");
	    m_exam_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    m_exam_f.setSize(1600, 1250);
	    m_exam_p = new JPanel();
	    m_exam_p.setSize(new Dimension(1,1));
		setContentPane(m_exam_p);
		m_exam_p.setLayout(null);
		
		JLabel m_exam_l = new JLabel("Delete the exam that prevýous saved exam:");
		m_exam_l.setBounds(100,110,350,40);
		m_exam_p.add(m_exam_l);
		
		
		DefaultTableModel modelexamdd = new DefaultTableModel(columnNames,0);
		JTable tableexamdd = new JTable(modelexamdd);
		tableexamdd.setBounds(400,150,800,400);		
		JScrollPane scrollPanede = new JScrollPane(tableexamdd);
		scrollPanede.setBounds(400,150,800,400);
		m_exam_p.add(scrollPanede);
	    
	    JButton msaveexam = new JButton("DELETE");
	    msaveexam.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				DefaultTableModel modelexamdd = (DefaultTableModel) tableexamdd.getModel();
				try {
				int SelectedRowIndex = tableexamdd.getSelectedRow();
				modelexamdd.removeRow(SelectedRowIndex);
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				
			///////////////////////////DELETE METHOD///////////////////////
			}
		});
	    msaveexam.setBounds(100,160,200,20);
	    m_exam_p.add( msaveexam);
		m_exam_f.add(m_exam_p);
		
		JButton back8 = new JButton("BACK");
		back8.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);	
			}
		});
		back8.setBounds(1250,20,70,30);
		m_exam_p.add(back8);
		m_exam_f.add(m_exam_p);
		
		
		
	    /////////////////////////////////DISPLAY///////////////////////////////
	    JFrame d_year_f = new JFrame("YEAR");
	    d_year_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    d_year_f.setSize(1600, 1250);
	    d_year_p = new JPanel();
	    d_year_p.setSize(new Dimension(1,1));
		setContentPane(d_year_p);
		d_year_p.setLayout(null);
		
		
		
		JLabel d_year_l = new JLabel("Enter to display the year");
		d_year_l.setBounds(100,110,200,40);
		d_year_p.add(d_year_l);
		
		JButton display1 = new JButton("DISPLAY");
		display1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
			
			DefaultTableModel modelyear = new DefaultTableModel(columnNames,0);
			JTable tableyear = new JTable(modelyear);
			tableyear.setBounds(70, 150, 1200, 400);		
			JScrollPane scrollPane = new JScrollPane(tableyear);
			scrollPane.setBounds(70, 150, 1200, 400);
			d_year_p.add(scrollPane);
			display1.setVisible(false);
			d_year_l.setVisible(false);
				
				
				///////////////////////DISPLAY METHOD//////////////
			
			}
			});
		display1.setBounds(100,150,200,40);
		d_year_p.add(display1);
		d_year_f.add(d_year_p);
		
		JButton back9 = new JButton("BACK");
		back9.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);
				
			}
		});
		back9.setBounds(1250,20,70,30);
		d_year_p.add(back9);
		d_year_f.add(d_year_p);
	    
		
		
	    JFrame d_semester_f = new JFrame("SEMESTER");
	    d_semester_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    d_semester_f.setSize(1600, 1250);
		d_semester_p = new JPanel();
		d_semester_p.setSize(new Dimension(1,1));
		setContentPane(d_semester_p);
		d_semester_p.setLayout(null);
		
		JLabel d_semester_l = new JLabel("Enter to display the semester");
		d_semester_l.setBounds(100,110,200,40);
		d_semester_p.add(d_semester_l);
		
		JButton display2 = new JButton("DISPLAY");
		display2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				
				DefaultTableModel modelsemester = new DefaultTableModel(columnNames,0);
				JTable tablesemester = new JTable(modelsemester);
				tablesemester.setBounds(70, 150, 1200, 400);		
				JScrollPane scrollPane = new JScrollPane(tablesemester);
				scrollPane.setBounds(70, 150, 1200, 400);
				d_semester_p.add(scrollPane);
				display2.setVisible(false);
				d_semester_l.setVisible(false);
				
				
				
				
				
				
				
				///////////////////////DISPLAY METHOD//////////////
			}
		});
		display2.setBounds(100,150,200,40);
		d_semester_p.add(display2);
		d_semester_f.add(d_semester_p);
			
			JButton back10 = new JButton("BACK");
			back10.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent arg0) {
					menubar m = new menubar();
					m.setVisible(true);
					
				}
			});
			back10.setBounds(1250,20,70,30);
			d_semester_p.add(back10);
			d_semester_f.add(d_semester_p);
		
			
		
		JFrame d_course_f = new JFrame("COURSE");
		d_course_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d_course_f.setSize(1600, 1250);
		d_course_p = new JPanel();
		d_course_p.setSize(new Dimension(1,1));
		setContentPane(d_course_p);
		d_course_p.setLayout(null);
		
		JLabel d_course_l = new JLabel("Enter to display the course");
		d_course_l.setBounds(100,110,200,40);
		d_course_p.add(d_course_l);
		
		JButton display3 = new JButton("DISPLAY");
		display3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				DefaultTableModel modelcourse = new DefaultTableModel(columnNames,0);
				JTable tablecourse = new JTable(modelcourse);
				tablecourse.setBounds(70, 150, 1200, 400);		
				JScrollPane scrollPane = new JScrollPane(tablecourse);
				scrollPane.setBounds(70, 150, 1200, 400);
				d_course_p.add(scrollPane);
				display3.setVisible(false);
				d_course_l.setVisible(false);
				
				
				
				
				
				
				///////////////////////DISPLAY METHOD//////////////
			}
		});
		display3.setBounds(100,200,200,40);
		d_course_p.add(display3);
		d_course_f.add(d_course_p);
			
		JButton back11 = new JButton("BACK");
		back11.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);
					
			}
		});
		back11.setBounds(1250,20,70,30);
		d_course_p.add(back11);
		d_course_f.add(d_course_p);
		
		
		
		JFrame d_exam_f = new JFrame("EXAM");
		d_exam_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d_exam_f.setSize(1600, 1250);
		d_exam_p = new JPanel();
		d_exam_p.setSize(new Dimension(1,1));
		setContentPane(d_exam_p);
		d_exam_p.setLayout(null);
		
		JLabel d_exam_l = new JLabel("Enter to display the exams");
		d_exam_l.setBounds(100,110,200,40);
		d_exam_p.add(d_exam_l);
		
		JButton display4 = new JButton("DISPLAY");
		display4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				DefaultTableModel modelexam = new DefaultTableModel(columnNames,0);
				JTable tableexam = new JTable(modelexam);
				tableexam.setBounds(70, 150, 1200, 400);		
				JScrollPane scrollPane = new JScrollPane(tableexam);
				scrollPane.setBounds(70, 150, 1200, 400);
				d_exam_p.add(scrollPane);
				display4.setVisible(false);
				d_exam_l.setVisible(false);
				
				
				
				
				///////////////////////DISPLAY METHOD///////////////
			}
		});
		display4.setBounds(100,150,200,40);
		d_exam_p.add(display4);
		d_exam_f.add(d_exam_p);
			
		JButton back12 = new JButton("BACK");
		back12.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);
					
			}
		});
		back12.setBounds(1250,20,70,30);
		d_exam_p.add(back12);
		d_exam_f.add(d_exam_p);
		
		
		
		JFrame d_student_f = new JFrame("STUDENT");
		d_student_f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d_student_f.setSize(1600, 1250);
		d_student_p = new JPanel();
		d_student_p.setSize(new Dimension(1,1));
		setContentPane(d_student_p);
		d_student_p.setLayout(null);
		
		JLabel d_student_l = new JLabel("Enter to display the students");
		d_student_l.setBounds(100,110,250,40);
		d_student_p.add(d_student_l);
		
		JButton display5 = new JButton("DISPLAY");
		display5.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				DefaultTableModel modelstudent = new DefaultTableModel(columnNames,0);
				JTable tablestudent = new JTable(modelstudent);
				tablestudent.setBounds(70, 150, 1200, 400);		
				JScrollPane scrollPane = new JScrollPane(tablestudent);
				scrollPane.setBounds(70, 150, 1200, 400);
				d_student_p.add(scrollPane);
				display5.setVisible(false);
				d_student_l.setVisible(false);
				
				
				
				
				
				///////////////////////DISPLAY METHOD//////////////////
			}
		});
		display5.setBounds(100,150,200,40);
		d_student_p.add(display5);
		d_student_f.add(d_student_p);
			
		JButton back13 = new JButton("BACK");
		back13.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				menubar m = new menubar();
				m.setVisible(true);
					
			}
		});
		back13.setBounds(1250,20,70,30);
		d_student_p.add(back13);
		d_student_f.add(d_student_p);
	    
	    
 	
        JMenuBar menubar = new JMenuBar();
 
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
       
        
       
        
///////////////////////////////////////////CREATE MENU////////////
        JMenu create = new JMenu("Create"); 
        JMenuItem year = new JMenuItem("Year");
        year.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(true); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
    		}
    	});
        create.add(year);
        
        
        
        JMenuItem semester = new JMenuItem("Semester");
        semester.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(true);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
    		}
    	});
        create.add(semester);
        create.addSeparator();

        
        
        JMenuItem course = new JMenuItem("Course");
        course.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(true);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
    		}
    	});
        create.add(course);
        
        
        
        JMenuItem exam = new JMenuItem("Exam");
        exam.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(true);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
    		}
    	});
        create.add(exam);
        
 
        
        JMenuItem student = new JMenuItem("Student");
        student.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(true);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
    		}
    	});
        create.add(student);
        
        
        
 ////////////////////////////////////////MANAGE MENU////////////////////   
        JMenu manage = new JMenu("Manage");
        
        JMenuItem year1 = new JMenuItem("Year");
        year1.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(true);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
    		}
    	});
        manage.add(year1);
        
        
        
        JMenuItem semester1 = new JMenuItem("Semester");
        semester1.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(true);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
    		}
    	});
        manage.add(semester1);
        manage.addSeparator();

        
        
        JMenuItem course1 = new JMenuItem("Course");
        course1.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(true);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
    		}
    	});
        manage.add(course1);
        
        
        
        JMenuItem exam1 = new JMenuItem("Exam");
        exam1.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(true);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
    			    		
    		}
    	});
        manage.add(exam1);
        
        
        
        ////////////////////////////////////DISPLAY MENU///////////
        JMenu display = new JMenu("Display");
        JMenuItem year2 = new JMenuItem("Year");
        year2.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(true);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
    			
    		}
    	});
        display.add(year2);
        
        
        
        JMenuItem semester2 = new JMenuItem("Semester");
        semester2.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(true);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
   		}
    	});
        display.add(semester2);
        display.addSeparator();
        
        
        
        JMenuItem course2 = new JMenuItem("Course");
        course2.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(true);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(false);
    		}
    	});
        display.add(course2);
        
        
        
        JMenuItem exam2 = new JMenuItem("Exam");
        exam2.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(true);
    			d_student_f.setVisible(false);
    		}
    	});
        display.add(exam2);
        
        
        
        JMenuItem student1 = new JMenuItem("Student");
        student1.addActionListener(new ActionListener()
        {
    		public void actionPerformed(ActionEvent e) 
    		{
    			c_year_f.setVisible(false); 
    			c_semester_f.setVisible(false);
    			c_course_f.setVisible(false);
    			c_exam_f.setVisible(false);
    			c_student_f.setVisible(false);
    			m_year_f.setVisible(false);
    			m_semester_f.setVisible(false);
    			m_course_f.setVisible(false);
    			m_exam_f.setVisible(false);
    			d_year_f.setVisible(false);
    			d_semester_f.setVisible(false);
    			d_course_f.setVisible(false);
    			d_exam_f.setVisible(false);
    			d_student_f.setVisible(true);
    		}
    	});
        display.add(student1);
        

        //////////////////////////////////////////////////EXIT
        JMenuItem exitMi = new JMenuItem("Exit");
        exitMi.setToolTipText("Exit application");
        exitMi.addActionListener((ActionEvent event) -> 
        {
            System.exit(0);
        });

        
        fileMenu.add(create);
        fileMenu.add(manage);
        fileMenu.add(display);
        fileMenu.addSeparator();
        fileMenu.add(exitMi);
        setJMenuBar(menubar);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            menubar ex = new menubar();
            ex.setVisible(true);
        });
    }
}