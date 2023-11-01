package punto8;

import java.awt.Color;
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
import java.awt.Font;

public class StudentsNotes extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSeguntoTrimestre;
	private JTextField txtTercerTrimestre;
	private JButton btnCalcular;
	private JLabel etiResultado, etiNotaFinal;

	

	/**
	 * Create the frame.
	 */
	public StudentsNotes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 421);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		initComponents();
		
	}

	private void initComponents() {
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(39, 48, 139, 50);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSeguntoTrimestre = new JTextField();
		txtSeguntoTrimestre.setBounds(253, 48, 139, 50);
		contentPane.add(txtSeguntoTrimestre);
		txtSeguntoTrimestre.setColumns(10);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setBounds(471, 48, 139, 50);
		contentPane.add(txtTercerTrimestre);
		txtTercerTrimestre.setColumns(10);
		
		etiNotaFinal = new JLabel("");
		etiNotaFinal.setBounds(61, 172, 227, 44);
		contentPane.add(etiNotaFinal);
		
		etiResultado = new JLabel("");
		etiResultado.setBounds(61, 230, 227, 44);
		contentPane.add(etiResultado);
		
		JLabel lblNewLabel = new JLabel("Nota 1");
		lblNewLabel.setBounds(39, 28, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 2");
		lblNewLabel_1.setBounds(253, 28, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 3");
		lblNewLabel_2.setBounds(471, 28, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		btnCalcular = new JButton("Calcular\r\n");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalcular.setBounds(253, 312, 133, 44);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnCalcular) {
			calcular();
		}
		
	}
	
	


	public void calcular() {
		double nota1=Double.parseDouble(txtPrimerTrimestre.getText());
		double nota2=Double.parseDouble(txtSeguntoTrimestre.getText());
		double nota3=Double.parseDouble(txtTercerTrimestre.getText());
		double promedio=(nota1+nota2+nota3)/3;
		if (promedio<5) {
			etiNotaFinal.setForeground(Color.RED);
			etiResultado.setForeground(Color.RED);
			etiNotaFinal.setText("Nota Final: "+promedio);
			etiResultado.setText("SUPENSO");
			
		} else if(promedio>=5){
			etiNotaFinal.setForeground(Color.BLACK);
			etiResultado.setForeground(Color.BLACK);
			etiNotaFinal.setText("Nota Final: "+promedio);
			etiResultado.setText("APROBADO");
		}
	}
}


















