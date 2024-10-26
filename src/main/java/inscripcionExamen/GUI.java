package inscripcionExamen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPasswordField;

public class GUI {

	private JFrame frame;
	private JTextField valorUsuario;
	private JPasswordField valorPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 466, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel frameLogin = new JPanel();
		frameLogin.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(frameLogin, BorderLayout.CENTER);
		GridBagLayout gbl_frameLogin = new GridBagLayout();
		gbl_frameLogin.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_frameLogin.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_frameLogin.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_frameLogin.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frameLogin.setLayout(gbl_frameLogin);
		
		JLabel labelLogin = new JLabel("Login");
		labelLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_labelLogin = new GridBagConstraints();
		gbc_labelLogin.gridwidth = 2;
		gbc_labelLogin.insets = new Insets(0, 0, 5, 5);
		gbc_labelLogin.gridx = 4;
		gbc_labelLogin.gridy = 1;
		frameLogin.add(labelLogin, gbc_labelLogin);
		
		valorUsuario = new JTextField();
		valorUsuario.setToolTipText("Usuario");
		GridBagConstraints gbc_valorUsuario = new GridBagConstraints();
		gbc_valorUsuario.gridwidth = 2;
		gbc_valorUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_valorUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_valorUsuario.gridx = 4;
		gbc_valorUsuario.gridy = 3;
		frameLogin.add(valorUsuario, gbc_valorUsuario);
		valorUsuario.setColumns(10);
		
		valorPassword = new JPasswordField();
		GridBagConstraints gbc_valorPassword = new GridBagConstraints();
		gbc_valorPassword.gridwidth = 2;
		gbc_valorPassword.insets = new Insets(0, 0, 5, 5);
		gbc_valorPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_valorPassword.gridx = 4;
		gbc_valorPassword.gridy = 5;
		frameLogin.add(valorPassword, gbc_valorPassword);
		
		JButton btnOlvidePasswd = new JButton("Olvide Password");
		GridBagConstraints gbc_btnOlvidePasswd = new GridBagConstraints();
		gbc_btnOlvidePasswd.insets = new Insets(0, 0, 0, 5);
		gbc_btnOlvidePasswd.gridx = 4;
		gbc_btnOlvidePasswd.gridy = 7;
		frameLogin.add(btnOlvidePasswd, gbc_btnOlvidePasswd);
		
		JButton btnLogin = new JButton("Iniciar Sesion");
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogin.gridx = 5;
		gbc_btnLogin.gridy = 7;
		frameLogin.add(btnLogin, gbc_btnLogin);
	}

}
