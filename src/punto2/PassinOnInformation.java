package punto2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PassinOnInformation extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	private JLabel etiTexto1, etiTexto2;
	private JButton btnTraspasa1, btnTraspasa2;

	
	public PassinOnInformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 284);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		initComponents();
	}

	private void initComponents() {
		txtTexto = new JTextField();
		txtTexto.setBounds(35, 32, 160, 34);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setBounds(417, 32, 150, 34);
		contentPane.add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setBounds(417, 101, 150, 34);
		contentPane.add(etiTexto2);
		
		btnTraspasa1 = new JButton("Traspasa1");
		btnTraspasa1.setBounds(35, 107, 120, 34);
		contentPane.add(btnTraspasa1);
		btnTraspasa1.addActionListener(this);
		
		btnTraspasa2 = new JButton("Traspasa2");
		btnTraspasa2.setBounds(35, 169, 120, 34);
		contentPane.add(btnTraspasa2);
		btnTraspasa2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnTraspasa1) {
			etiTexto2.setText("");
			etiTexto1.setText(txtTexto.getText());
		} else if (e.getSource()==btnTraspasa2) {
			etiTexto1.setText("");
			etiTexto2.setText(txtTexto.getText());
		}
	}
}
