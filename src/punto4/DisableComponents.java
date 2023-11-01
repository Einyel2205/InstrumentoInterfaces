package punto4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class DisableComponents extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JButton btnAceptar, btnActivar, btnDesactivar;
	private JLabel txtFrase, lblNombre, lblCiudad;
	

	public DisableComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		getContentPane().setBackground(SystemColor.activeCaption);
		getContentPane().setLayout(null);
		
		
		initComponents();
	}

	private void initComponents() {
		txtNombre = new JTextField();
		txtNombre.setBounds(29, 41, 166, 43);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(29, 127, 166, 43);
		getContentPane().add(txtCiudad);
		txtCiudad.setColumns(10);
		
		txtFrase = new JLabel("");
		txtFrase.setBounds(296, 86, 262, 50);
		getContentPane().add(txtFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(43, 223, 120, 36);
		getContentPane().add(btnAceptar);
		btnAceptar.addActionListener(this);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBounds(233, 223, 120, 36);
		getContentPane().add(btnActivar);
		btnActivar.addActionListener(this);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(427, 223, 120, 36);
		getContentPane().add(btnDesactivar);
		btnDesactivar.addActionListener(this);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(37, 16, 49, 14);
		getContentPane().add(lblNombre);
		
		lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(39, 102, 49, 14);
		getContentPane().add(lblNombre);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAceptar) {
			
			txtFrase.setText("Usted se llama "+txtNombre.getText()+" y vive en "+txtCiudad.getText());
			txtNombre.setText("");
			txtCiudad.setText("");
			
		} else if (e.getSource()==btnDesactivar) {
			
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
			
		} else if(e.getSource()==btnActivar){
			
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}

		
		
	}
}







