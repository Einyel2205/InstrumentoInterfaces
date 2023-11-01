package punto6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class EventsAndPositioning extends JFrame implements ActionListener, MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiNombre;
	private JButton btnEsquina, btnCentro, btnAgrandar, btnAchicar;
	private boolean tamaño=false;

	
	/**
	 * Create the frame.
	 */
	public EventsAndPositioning() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 382);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		initComponents();

	}
	
	private void initComponents() {
		etiNombre = new JLabel("Angel Velez");
        etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
        etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
        etiNombre.setBounds(314, 29, 101, 38);
        etiNombre.setOpaque(true); 
        etiNombre.setBackground(Color.BLACK);
        etiNombre.setForeground(Color.white);
        contentPane.add(etiNombre);
        
        btnEsquina = new JButton("Esquina");
        btnEsquina.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnEsquina.setBounds(44, 263, 111, 40);
        btnEsquina.addActionListener(this);
        btnEsquina.addMouseListener(this);
        contentPane.add(btnEsquina);

        btnCentro = new JButton("Centro");
        btnCentro.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnCentro.setBounds(218, 263, 111, 40);
        btnCentro.addActionListener(this);
        btnCentro.addMouseListener(this);
        contentPane.add(btnCentro);

        btnAgrandar = new JButton("Agrandar\r\n");
        btnAgrandar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnAgrandar.setBounds(395, 263, 111, 40);
        btnAgrandar.addActionListener(this);
        btnAgrandar.addMouseListener(this);
        contentPane.add(btnAgrandar);

        btnAchicar = new JButton("Achicar");
        btnAchicar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnAchicar.setBounds(570, 263, 111, 40);
        btnAchicar.addActionListener(this);
        btnAchicar.addMouseListener(this);
        contentPane.add(btnAchicar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnEsquina) {
			
			etiNombre.setLocation(600, 29);
			
		}else if(e.getSource()==btnCentro) {
			
			if (tamaño) {
				int centroX=(contentPane.getWidth() - etiNombre.getWidth()) / 2;
				int centroY=(contentPane.getHeight() - etiNombre.getHeight()) / 2;
				etiNombre.setLocation(centroX, centroY);
			} else {
				etiNombre.setLocation(314, 100);
			}
			
		}else if(e.getSource()==btnAgrandar) {
			
			tamaño=true;
			etiNombre.setSize(150, 70);
			etiNombre.setLocation(284, 29);
			
			
		}else if (e.getSource()==btnAchicar) {
			
			etiNombre.setSize(101, 38);
			etiNombre.setLocation(314, 29);
			
		}
		
		
	}

	

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(140, 70);
		}else if(e.getSource()==btnCentro) {
			btnCentro.setSize(140, 70);
		}else if(e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(140, 70);
		}else if(e.getSource()==btnAchicar) {
			btnAchicar.setSize(140, 70);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(111, 40);
		}else if(e.getSource()==btnCentro) {
			btnCentro.setSize(111, 40);
		}else if(e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(111, 40);
		}else if(e.getSource()==btnAchicar) {
			btnAchicar.setSize(111, 40);
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
