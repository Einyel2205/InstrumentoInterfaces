package punto5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.MouseEvent;

import java.awt.SystemColor;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import java.awt.Font;

public class MouseEvents extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiPal1, etiPal2, etiPal3, etiPal4, etiOcultar;


	/**
	 * Create the frame.
	 */
	public MouseEvents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 209);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		initComponents();
	}
	

	private void initComponents() {
		etiPal1 = new JLabel("Ilusión\r\n");
		etiPal1.setBounds(52, 39, 101, 36);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel("Venganza");
		etiPal2.setBounds(211, 39, 101, 36);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("Odio");
		etiPal3.setBounds(383, 39, 101, 36);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("Amor");
		etiPal4.setBounds(550, 39, 101, 36);
		contentPane.add(etiPal4);
		
		etiOcultar = new JLabel("Ocultar");
		etiOcultar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiOcultar.setBounds(300, 107, 116, 42);
		contentPane.add(etiOcultar);
		etiOcultar.addMouseListener(this);
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		if (e.getSource()==etiOcultar) {
			etiPal1.setVisible(false);
			etiPal2.setVisible(false);
			etiPal3.setVisible(false);
			etiPal4.setVisible(false);
		}
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		if (e.getSource()==etiOcultar) {
			etiPal1.setVisible(true);
			etiPal2.setVisible(true);
			etiPal3.setVisible(true);
			etiPal4.setVisible(true);
		}
		
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
