package empmngr;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainExecutable extends JFrame 
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private ButtonGroup bg= new ButtonGroup();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					MainExecutable frame = new MainExecutable();
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
	public MainExecutable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		 setTitle("Select Pop-Up");
		JRadioButton rdbtnEmployee = new JRadioButton("employee");
		buttonGroup.add(rdbtnEmployee);
		contentPane.add(rdbtnEmployee, BorderLayout.NORTH);
		
		JRadioButton rdbtnManager = new JRadioButton("Manager");
		rdbtnManager.setToolTipText("");
		rdbtnManager.setVerticalAlignment(SwingConstants.TOP);
		buttonGroup.add(rdbtnManager);
		contentPane.add(rdbtnManager, BorderLayout.CENTER);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setFont(new Font("TimesNewRoman", Font.BOLD | Font.ITALIC, 15));
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnEmployee.isSelected())
			       {
			         Employees e = new Employees();
			         e.setVisible(true);
			       }

			       else if (rdbtnManager.isSelected())
			       {
			        Managers m = new Managers();
			        m.setVisible(true);
			       }
			}
		});
		btnSelect.setBackground(Color.white);
		contentPane.add(btnSelect, BorderLayout.SOUTH);
	
	}

}
