package punto3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardEvents extends JFrame implements ActionListener, KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	private JLabel etiTexto;
	private JButton btnVaciar;

	public KeyboardEvents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		initComponents();
	}

	private void initComponents() {
		txtTexto = new JTextField();
		txtTexto.setBounds(46, 22, 245, 83);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		txtTexto.addKeyListener(this);
		
		etiTexto = new JLabel("");
		etiTexto.setBounds(389, 22, 245, 83);
		contentPane.add(etiTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVaciar.setBounds(262, 166, 130, 44);
		contentPane.add(btnVaciar);
		btnVaciar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnVaciar) {
			txtTexto.setText("");
			etiTexto.setText("");
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			etiTexto.setText(txtTexto.getText());
			txtTexto.setText("");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
