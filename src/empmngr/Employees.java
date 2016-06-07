package empmngr;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Double;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Employees extends JFrame 
{

	private JPanel contentPane;
	private JLabel label;
	JLabel Name;
	JTextField jtfName;
	JLabel Title;
	JTextField jtfTitle;
	JLabel Age;
	JTextField jtfAge;
	JLabel Salary;
	JTextField jtfSalary;
	JLabel PercentageIncrease;
	JTextField jtfPercentageIncrease;
	protected JTextComponent txt_result;
	private JTextField textField_4;
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
					Employees frame = new Employees();
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
	public Employees() 
	{
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
		 	setTitle("Employees Pop-Up");
		 	getContentPane().add (new JLabel("Name"));
		    JTextField textField = new JTextField(15);
		    textField.getText();
		    getContentPane().add (textField);
		    getContentPane().add (new JLabel("Title"));
		    JTextField txtResourceAnalyst = new JTextField(15);
		    txtResourceAnalyst.getText();
		    getContentPane().add (txtResourceAnalyst);
		    getContentPane().add (new JLabel("Age"));
		    JTextField textField_1 = new JTextField(2);
		    textField_1.addKeyListener(new KeyAdapter() {
		    	@Override
		    	public void keyPressed(KeyEvent e) {
		    		int key=e.getKeyCode();
		    		if((key>=e.VK_0)&&(key<=e.VK_9)||(key>=e.VK_NUMPAD0)&&(key<=e.VK_NUMPAD9)||(key==e.VK_BACK_SPACE)){
		    			
		    			textField_1.setEditable(true);
		    			textField_1.setBackground(Color.white);
		    		}
		    		else {
		    			
		    			textField_1.setEditable(false);
		    			textField_1.setBackground(Color.red);
		    			
		    		}
		    	}
		    });
		    textField_1.getText();
		    getContentPane().add (textField_1);
		    getContentPane().add (new JLabel("Salary"));
		    JTextField textField_2 = new JTextField(15);
		    textField_2.addKeyListener(new KeyAdapter() {
		    	@Override
		    	public void keyPressed(KeyEvent e) {
		    		int key=e.getKeyCode();
		    		if((key>=e.VK_0)&&(key<=e.VK_9)||(key>=e.VK_NUMPAD0)&&(key<=e.VK_NUMPAD9)||(key==e.VK_BACK_SPACE)){
		    			
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
		    getContentPane().add (new JLabel("PercentageIncrease"));
		    JTextField textField_3 = new JTextField(15);
		    textField_3.addKeyListener(new KeyAdapter() {
		    	@Override
		    	public void keyPressed(KeyEvent e) {
		    		int key=e.getKeyCode();
		    		if((key>=e.VK_0)&&(key<=e.VK_9)||(key>=e.VK_NUMPAD0)&&(key<=e.VK_NUMPAD9)||(key==e.VK_BACK_SPACE)){
		    			
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
		    JButton btnCalculate = new JButton("Calculate");
		    btnCalculate.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent arg0) {
		    	Double r=0.01;
		    	String s1=textField_2.getText();
		    	Double a1=Double.parseDouble(s1);
		    	String s2=textField_3.getText();
		    	int a2=Integer.parseInt(s2);
		    	a1 = a1 + (a2* r * a1);
		    	String z=Double.toString(a1);
		    	textField_4.setText(z);
		    	}
		    });
		    contentPane.add(btnCalculate);
		    
		    textField_4 = new JTextField();
		    contentPane.add(textField_4);
		    textField_4.setColumns(10);
		    label = new JLabel("");
		    contentPane.add(label);
	}

}
