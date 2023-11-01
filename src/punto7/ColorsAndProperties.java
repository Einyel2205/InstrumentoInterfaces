package punto7;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorsAndProperties extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiTexto;
	private JButton btnAzul, btnRojo, btnVerde, btnFondoAzul, btnFondoRojo, btnFondoVerde, btnTransparente, btnOpaca;

	

	/**
	 * Create the frame.
	 */
	public ColorsAndProperties() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 440);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		initComponents();
	}

	private void initComponents() {

		etiTexto = new JLabel("Hola Mundo");
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiTexto.setBounds(298, 29, 131, 37);
		contentPane.add(etiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAzul.setBounds(41, 181, 131, 45);
		btnAzul.addActionListener(this);
		contentPane.add(btnAzul);
		
		
		btnRojo = new JButton("Rojo");
		btnRojo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRojo.setBounds(208, 181, 131, 45);
		btnRojo.addActionListener(this);
		contentPane.add(btnRojo);
		
		
		btnVerde = new JButton("Verde");
		btnVerde.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVerde.setBounds(368, 179, 137, 48);
		btnVerde.addActionListener(this);
		contentPane.add(btnVerde);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFondoAzul.setBounds(543, 181, 131, 45);
		btnFondoAzul.addActionListener(this);
		contentPane.add(btnFondoAzul);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFondoRojo.setBounds(41, 280, 131, 45);
		btnFondoRojo.addActionListener(this);
		contentPane.add(btnFondoRojo);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFondoVerde.setBounds(208, 280, 131, 45);
		btnFondoVerde.addActionListener(this);
		contentPane.add(btnFondoVerde);
		
		btnTransparente = new JButton("Trasnparente");
		btnTransparente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTransparente.setBounds(368, 282, 137, 45);
		btnTransparente.addActionListener(this);
		contentPane.add(btnTransparente);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOpaca.setBounds(543, 282, 131, 45);
		btnOpaca.addActionListener(this);
		contentPane.add(btnOpaca);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAzul) {
			
			etiTexto.setForeground(Color.BLUE);
			
		}else if(e.getSource()==btnRojo) {
			
			etiTexto.setForeground(Color.RED);
			
		}else if(e.getSource()==btnVerde) {
			
			etiTexto.setForeground(Color.GREEN);
			
		}else if(e.getSource()==btnFondoAzul) {
			
			etiTexto.setOpaque(true);
			etiTexto.setBackground(Color.BLUE);
			
		}else if(e.getSource()==btnFondoRojo) {
			
			etiTexto.setOpaque(true);
			etiTexto.setBackground(Color.RED);
			
		}else if(e.getSource()==btnFondoVerde) {
			
			etiTexto.setOpaque(true);
			etiTexto.setBackground(Color.GREEN);
			
		}else if(e.getSource()==btnTransparente) {
			contentPane.repaint();
			etiTexto.setOpaque(false);
		
		}else if(e.getSource()==btnOpaca) {
			contentPane.repaint();
			etiTexto.setOpaque(true);
			
		}
		
	}
}



















