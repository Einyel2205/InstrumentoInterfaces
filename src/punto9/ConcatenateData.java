package punto9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ConcatenateData extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JButton btnConcatena;
	private JLabel etiTexto;

	

	/**
	 * Create the frame.
	 */
	public ConcatenateData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 344);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		initComponents();
	}

	private void initComponents() {
		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(41, 37, 175, 55);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setBounds(274, 37, 175, 55);
		contentPane.add(txtPalabra2);
		txtPalabra2.setColumns(10);
		
		etiTexto = new JLabel("");
		etiTexto.setBounds(159, 128, 163, 55);
		contentPane.add(etiTexto);
		
		btnConcatena = new JButton("Concatenar");
		btnConcatena.setBounds(174, 249, 132, 47);
		btnConcatena.addActionListener(this);
		contentPane.add(btnConcatena);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnConcatena) {
			etiTexto.setText(txtPalabra1.getText()+txtPalabra2.getText());
		}
		
	}
}
