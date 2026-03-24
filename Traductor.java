import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Traductor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traductor frame = new Traductor();
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
	public Traductor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTraductor = new JLabel("Traductor ");
		lblTraductor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTraductor.setBounds(156, 24, 100, 19);
		contentPane.add(lblTraductor);
		
		JLabel lblEspaol = new JLabel("Español");
		lblEspaol.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEspaol.setBounds(32, 64, 100, 19);
		contentPane.add(lblEspaol);
		
		textField = new JTextField();
		textField.setBounds(104, 64, 136, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbTraducción = new JLabel("Traducción");
		lbTraducción.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbTraducción.setBounds(32, 113, 100, 19);
		contentPane.add(lbTraducción);

	}
}
