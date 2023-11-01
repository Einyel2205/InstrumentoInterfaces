package punto_10;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EventsAndAssignment extends JFrame implements ActionListener, MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero;
	private JLabel etiUno, etiDos, etiTres, etiCuatro, etiCinco, etiSeis, etiSiete, etiOcho, etiNueve, etiCero;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventsAndAssignment frame = new EventsAndAssignment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EventsAndAssignment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		initComponents();
		
	}
	
	private void initComponents() {
		etiUno = new JLabel("1");
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setBounds(49, 35, 83, 34);
		etiUno.addMouseListener(this);
		contentPane.add(etiUno);
		
		etiDos = new JLabel("2");
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setBounds(142, 35, 83, 34);
		etiDos.addMouseListener(this);
		contentPane.add(etiDos);
		
		etiTres = new JLabel("3");
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setBounds(235, 35, 83, 34);
		etiTres.addMouseListener(this);
		contentPane.add(etiTres);
		
		etiCuatro = new JLabel("4");
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setBounds(328, 35, 83, 34);
		etiCuatro.addMouseListener(this);
		contentPane.add(etiCuatro);
		
		etiCinco = new JLabel("5");
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setBounds(421, 35, 83, 34);
		etiCinco.addMouseListener(this);
		contentPane.add(etiCinco);
		
		etiSeis = new JLabel("6");
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setBounds(49, 94, 83, 34);
		etiSeis.addMouseListener(this);
		contentPane.add(etiSeis);
		
		etiSiete = new JLabel("7");
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setBounds(142, 95, 83, 33);
		etiSiete.addMouseListener(this);
		contentPane.add(etiSiete);
		
		etiOcho = new JLabel("8");
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setBounds(235, 94, 83, 34);
		etiOcho.addMouseListener(this);
		contentPane.add(etiOcho);
		
		etiNueve = new JLabel("9");
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setBounds(328, 94, 83, 34);
		etiNueve.addMouseListener(this);
		contentPane.add(etiNueve);
		
		etiCero = new JLabel("0");
		etiCero.setHorizontalAlignment(SwingConstants.CENTER);
		etiCero.setBounds(421, 94, 83, 34);
		etiCero.addMouseListener(this);
		contentPane.add(etiCero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(44, 176, 260, 43);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(215, 281, 132, 43);
		btnBorrar.addActionListener(this);
		contentPane.add(btnBorrar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnBorrar) {
			txtNumero.setText("");
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

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == etiUno) {
            txtNumero.setText(txtNumero.getText() + etiUno.getText());
        } else if (e.getSource() == etiDos) {
            txtNumero.setText(txtNumero.getText() + etiDos.getText());
        } else if (e.getSource() == etiTres) {
            txtNumero.setText(txtNumero.getText() + etiTres.getText());
        } else if (e.getSource() == etiCuatro) {
            txtNumero.setText(txtNumero.getText() + etiCuatro.getText());
        } else if (e.getSource() == etiCinco) {
            txtNumero.setText(txtNumero.getText() + etiCinco.getText());
        } else if (e.getSource() == etiSeis) {
            txtNumero.setText(txtNumero.getText() + etiSeis.getText());
        } else if (e.getSource() == etiSiete) {
            txtNumero.setText(txtNumero.getText() + etiSiete.getText());
        } else if (e.getSource() == etiOcho) {
            txtNumero.setText(txtNumero.getText() + etiOcho.getText());
        } else if (e.getSource() == etiNueve) {
            txtNumero.setText(txtNumero.getText() + etiNueve.getText());
        } else if (e.getSource() == etiCero) {
            txtNumero.setText(txtNumero.getText() + etiCero.getText());
        }
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
