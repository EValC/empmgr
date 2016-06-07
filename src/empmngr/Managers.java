package empmngr;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Managers extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	JLabel Name;
	JTextField jtfName;
	JLabel Title;
	JTextField jtfTitle;
	JLabel Age;
	JTextField jtfAge;
	JLabel YearsofExperience;
	JTextField jtfYearsofExperience;
	JLabel HighestDegreeEarned;
	JTextField jtfHighestDegreeEarned;
	JLabel Salary;
	JTextField jtfSalary;
	JLabel PromotionBonus;
	JTextField jtfPromotionBonus;
	private JTextField textField_7;
	private JTextField textField_8;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Managers frame = new Managers();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Managers() 
	{
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
		 	setTitle("Managers Pop-Up");
		 	getContentPane().add (new JLabel("Name"));
		    JTextField textField = new JTextField(15);
		    textField.getText();
		    getContentPane().add (textField);
		    getContentPane().add (new JLabel("Title"));
		    JTextField textField_1 = new JTextField(15);
		    textField_1.getText();
		    getContentPane().add (textField_1);
		    getContentPane().add (new JLabel("Age"));
		    JTextField textField_2 = new JTextField(2);
		    textField_2.addKeyListener(new KeyAdapter() {
		    	@Override
		    	public void keyPressed(KeyEvent evt) {
		    		int key=evt.getKeyCode();
		    		if((key>=evt.VK_0)&&(key<=evt.VK_9)||(key>=evt.VK_NUMPAD0)&&(key<=evt.VK_NUMPAD9)||(key==evt.VK_BACK_SPACE)){
		    			textField_2.setEditable(true);
		    			textField_2.setBackground(Color.white);
		    			
		    		}
		    		else {
		    			textField_2.setEditable(false);
		    			textField_2.setBackground(Color.red);
		    		}
		    	}
		    });
		    textField_2.getText();
		    getContentPane().add (textField_2);
		    getContentPane().add (new JLabel("YearsofExperience"));
		    JTextField textField_3 = new JTextField(3);
		    textField_3.addKeyListener(new KeyAdapter() {
		    	@Override
		    	public void keyPressed(KeyEvent evt1) {
		    		int key=evt1.getKeyCode();
		    		if((key>=evt1.VK_0)&&(key<=evt1.VK_9)||(key>=evt1.VK_NUMPAD0)&&(key<=evt1.VK_NUMPAD9)||(key==evt1.VK_BACK_SPACE)){
		    			
		    			textField_3.setEditable(true);
		    			textField_3.setBackground(Color.white);
		    		}
		    		else {
		    			
		    			textField_3.setEditable(false);
		    			
		    			textField_3.setBackground(Color.red);
		    			
		    		}
		    	}
		    });
		    textField_3.getText();
		    getContentPane().add (textField_3);
		    getContentPane().add (new JLabel("HighestDegressEarned"));
		    JTextField textField_4 = new JTextField(15);
		    textField_4.getText();
		    getContentPane().add (textField_4);
		    getContentPane().add (new JLabel("Salary"));
		    JTextField textField_5 = new JTextField(15);
		    textField_5.addKeyListener(new KeyAdapter() {
		    	@Override
		    	public void keyPressed(KeyEvent e) {
		    		int key=e.getKeyCode();
		    		if((key>=e.VK_0)&&(key<=e.VK_9)||(key>=e.VK_NUMPAD0)&&(key<=e.VK_NUMPAD9)||(key==e.VK_BACK_SPACE)){
		    			
		    			textField_5.setEditable(true);
		    			textField_5.setBackground(Color.white);
		    		}
		    		else {
		    			
		    			textField_5.setEditable(false);
		    			textField_5.setBackground(Color.red);
		    			
		    		}
		    	}
		    });
		    textField_5.getText();
		    getContentPane().add (textField_5);
		    getContentPane().add (new JLabel("PromotionBonus"));
		    JTextField textField_6 = new JTextField(15);
		    textField_6.getText();
		    textField_6.addKeyListener(new KeyAdapter() {
		    	@Override
		    	public void keyPressed(KeyEvent evt2) {
		    		int key=evt2.getKeyCode();
		    		if((key>=evt2.VK_0)&&(key<=evt2.VK_9)||(key>=evt2.VK_NUMPAD0)&&(key<=evt2.VK_NUMPAD9)||(key==evt2.VK_BACK_SPACE)){
		    			
		    			textField_6.setEditable(true);
		    			textField_6.setBackground(Color.white);
		    		}
		    		else {
		    			textField_6.setEditable(false);
		    			textField_6.setBackground(Color.red);
		    		}
		    	}
		    });
		    getContentPane().add (textField_6);
		    
		    JButton btnCalculate = new JButton("Calculate");
		    btnCalculate.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent arg0) {
		    		Double r=0.01;
			    	String s1=textField_5.getText();
			    	Double a1=Double.parseDouble(s1);
			    	String s2=textField_8.getText();
			    	int a2=Integer.parseInt(s2);
			    	String s3=textField_6.getText();
			    	Double a3=Double.parseDouble(s3);
			    	a1 = a1 + (a2* r * a1)+ a3;
			    	String z=Double.toString(a1);
			    	textField_7.setText(z);
		    	}
		    });
		    
		    JLabel lblPercentage = new JLabel("PercentageIncrease");
		    contentPane.add(lblPercentage);
		    
		    textField_8 = new JTextField();
		    textField_8.addKeyListener(new KeyAdapter() {
		    	@Override
		    	public void keyPressed(KeyEvent e) {
		    		int key=e.getKeyCode();
		    		if((key>=e.VK_0)&&(key<=e.VK_9)||(key>=e.VK_NUMPAD0)&&(key<=e.VK_NUMPAD9)||(key==e.VK_BACK_SPACE)){
		    			
		    			textField_8.setEditable(true);
		    			textField_8.setBackground(Color.white);
		    		}
		    		else {
		    			
		    			textField_8.setEditable(false);
		    			textField_8.setBackground(Color.red);
		    			
		    		}
		    	}
		    });
		    textField_8.getText();
		    contentPane.add(textField_8);
		    textField_8.setColumns(10);
		    contentPane.add(btnCalculate);
		    
		    textField_7 = new JTextField();
		    contentPane.add(textField_7);
		    textField_7.setColumns(10);
		    label = new JLabel("");
		    contentPane.add(label);
	}

}
