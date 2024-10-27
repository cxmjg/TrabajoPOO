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
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class GUI {

	private JFrame frame;
	private JTextField valorUsuario;
	private JPasswordField valorPassword;
	private final JToolBar barraSuperior = new JToolBar();

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
		frame.setVisible(true);
		frame.setBounds(100, 100, 922, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelLogin = new JPanel();
		frame.getContentPane().add(panelLogin, "name_5315632412400");
		panelLogin.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel frameLogin = new JPanel();
		frameLogin.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gbl_frameLogin = new GridBagLayout();
		gbl_frameLogin.columnWidths = new int[]{0, 0, 150, 150, 0, 0, 0};
		gbl_frameLogin.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_frameLogin.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_frameLogin.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frameLogin.setLayout(gbl_frameLogin);
		
		JLabel labelLogin = new JLabel("Login");
		labelLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_labelLogin = new GridBagConstraints();
		gbc_labelLogin.gridwidth = 2;
		gbc_labelLogin.insets = new Insets(0, 0, 5, 5);
		gbc_labelLogin.gridx = 2;
		gbc_labelLogin.gridy = 1;
		frameLogin.add(labelLogin, gbc_labelLogin);
		
		valorUsuario = new JTextField();
		valorUsuario.setToolTipText("Usuario");
		GridBagConstraints gbc_valorUsuario = new GridBagConstraints();
		gbc_valorUsuario.gridwidth = 2;
		gbc_valorUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_valorUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_valorUsuario.gridx = 2;
		gbc_valorUsuario.gridy = 3;
		frameLogin.add(valorUsuario, gbc_valorUsuario);
		valorUsuario.setColumns(10);
		
		valorPassword = new JPasswordField();
		GridBagConstraints gbc_valorPassword = new GridBagConstraints();
		gbc_valorPassword.gridwidth = 2;
		gbc_valorPassword.insets = new Insets(0, 0, 5, 5);
		gbc_valorPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_valorPassword.gridx = 2;
		gbc_valorPassword.gridy = 5;
		frameLogin.add(valorPassword, gbc_valorPassword);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		GridBagConstraints gbc_btnRegistrarse = new GridBagConstraints();
		gbc_btnRegistrarse.anchor = GridBagConstraints.WEST;
		gbc_btnRegistrarse.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegistrarse.gridx = 2;
		gbc_btnRegistrarse.gridy = 7;
		frameLogin.add(btnRegistrarse, gbc_btnRegistrarse);
		
		JButton btnLogin = new JButton("Iniciar Sesion");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLogin.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.anchor = GridBagConstraints.EAST;
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 3;
		gbc_btnLogin.gridy = 7;
		frameLogin.add(btnLogin, gbc_btnLogin);
		panelLogin.add(frameLogin);
		
		JButton btnRecuperarPassword = new JButton("Recuperar Password");
		btnRecuperarPassword.setForeground(new Color(26, 95, 180));
		btnRecuperarPassword.setBackground(new Color(246, 245, 244));
		GridBagConstraints gbc_btnRecuperarPassword = new GridBagConstraints();
		gbc_btnRecuperarPassword.gridwidth = 2;
		gbc_btnRecuperarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_btnRecuperarPassword.gridx = 2;
		gbc_btnRecuperarPassword.gridy = 9;
		frameLogin.add(btnRecuperarPassword, gbc_btnRecuperarPassword);
		
		JPanel panelApp = new JPanel();
		frame.getContentPane().add(panelApp, "name_5315642071372");
		panelApp.setLayout(new BoxLayout(panelApp, BoxLayout.X_AXIS));
		barraSuperior.setFloatable(false);
		panelApp.add(barraSuperior);
		
		JButton btnMesas = new JButton("Mesas");
		barraSuperior.add(btnMesas);
		btnMesas.setMargin(new Insets(2, 40, 2, 40));
		btnMesas.setSize(new Dimension(100, 50));
		btnMesas.setForeground(new Color(61, 56, 70));
		btnMesas.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JButton btnExamenes = new JButton("Examenes");
		barraSuperior.add(btnExamenes);
		btnExamenes.setMargin(new Insets(2, 40, 2, 40));
		btnExamenes.setSize(new Dimension(100, 50));
		btnExamenes.setForeground(new Color(61, 56, 70));
		btnExamenes.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JButton btnMaterias = new JButton("Materias");
		barraSuperior.add(btnMaterias);
		btnMaterias.setMargin(new Insets(2, 40, 2, 40));
		btnMaterias.setSize(new Dimension(100, 50));
		btnMaterias.setForeground(new Color(61, 56, 70));
		btnMaterias.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JButton btnUsuarios = new JButton("Usuarios");
		barraSuperior.add(btnUsuarios);
		btnUsuarios.setMargin(new Insets(2, 40, 2, 40));
		btnUsuarios.setSize(new Dimension(100, 50));
		btnUsuarios.setForeground(new Color(61, 56, 70));
		btnUsuarios.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JButton btnSalir = new JButton("Salir");
		barraSuperior.add(btnSalir);
		btnSalir.setMargin(new Insets(2, 40, 2, 40));
		btnSalir.setSize(new Dimension(100, 50));
		btnSalir.setForeground(new Color(61, 56, 70));
		btnSalir.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JPanel panel = new JPanel();
		panelApp.add(panel);
	}

}
