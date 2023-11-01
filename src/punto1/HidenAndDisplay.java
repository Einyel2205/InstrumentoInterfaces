package punto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class HidenAndDisplay extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnHideName, btnHideCity, btnViewName, btnViewCity;
	private JLabel lblName, lblCity;

	
	public HidenAndDisplay() {
		
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		initComponents();
		
	}

	
	private void initComponents() {
		setBounds(100, 100, 611, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(136, 228, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblName = new JLabel("Name Tag");
		lblName.setBackground(new Color(0, 0, 255));
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(119, 64, 140, 33);
		contentPane.add(lblName);
		
		lblCity = new JLabel("City label");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCity.setBounds(355, 64, 140, 33);
		contentPane.add(lblCity);
		
		btnHideName = new JButton("Hide Name");
		btnHideName.setForeground(new Color(0, 0, 0));
		btnHideName.setBackground(new Color(255, 128, 128));
		btnHideName.setBounds(119, 251, 106, 33);
		contentPane.add(btnHideName);
		btnHideName.addActionListener(this);
		
		btnHideCity = new JButton("Hide City\r\n");
		btnHideCity.setBackground(new Color(255, 128, 128));
		btnHideCity.setBounds(355, 251, 106, 33);
		contentPane.add(btnHideCity);
		btnHideCity.addActionListener(this);
		
		btnViewName = new JButton("View Name");
		btnViewName.setBackground(new Color(128, 255, 0));
		btnViewName.setBounds(119, 328, 106, 33);
		contentPane.add(btnViewName);
		btnViewName.addActionListener(this);
		
		btnViewCity = new JButton("View City");
		btnViewCity.setBackground(new Color(128, 255, 0));
		btnViewCity.setBounds(355, 328, 106, 33);
		contentPane.add(btnViewCity);
		btnViewCity.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnHideName) {
            lblName.setVisible(false);
        } else if (e.getSource() == btnViewName) {
            lblName.setVisible(true);
        } else if (e.getSource() == btnHideCity) {
            lblCity.setVisible(false);
        } else if (e.getSource() == btnViewCity) {
            lblCity.setVisible(true);
        }
	}

	
}
