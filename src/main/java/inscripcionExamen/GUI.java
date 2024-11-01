package inscripcionExamen;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


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
import javax.swing.JSplitPane;
import java.awt.Component;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.Box;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.Sizes;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class GUI {

	private JFrame frame;
	private JTextField valorUsuario;
	private JPasswordField valorPassword;
	private JTabbedPane tabbedPane;
	private JTable table;
	private JPanel panelEdicionMesa = new JPanel();
	private DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	private JFormattedTextField valorFechaInicioMesa = new JFormattedTextField(dateFormat);
	private JFormattedTextField valorFechaFinMesa = new JFormattedTextField(dateFormat);
	private JFormattedTextField valorFechaInicioInscripcionMesa = new JFormattedTextField(dateFormat);
	private JFormattedTextField valorFechaFinInscripcionMesa = new JFormattedTextField(dateFormat);

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
		frame.setBounds(100, 100, 839, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelLogin = new JPanel();
		frame.getContentPane().add(panelLogin, "name_71123270518800");
		GridBagLayout gbl_panelLogin = new GridBagLayout();
		gbl_panelLogin.columnWidths = new int[]{768, 0};
		gbl_panelLogin.rowHeights = new int[]{505, 0};
		gbl_panelLogin.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelLogin.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelLogin.setLayout(gbl_panelLogin);
		
		JPanel frameLogin = new JPanel();
		frameLogin.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gbl_frameLogin = new GridBagLayout();
		gbl_frameLogin.columnWidths = new int[] {30, 30, 150, 150, 30, 30};
		gbl_frameLogin.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_frameLogin.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
				((CardLayout)frame.getContentPane().getLayout()).next(frame.getContentPane());;				
			}
		});
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.anchor = GridBagConstraints.EAST;
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 3;
		gbc_btnLogin.gridy = 7;
		frameLogin.add(btnLogin, gbc_btnLogin);
		GridBagConstraints gbc_frameLogin = new GridBagConstraints();
		gbc_frameLogin.gridx = 0;
		gbc_frameLogin.gridy = 0;
		panelLogin.add(frameLogin, gbc_frameLogin);
		
		JButton btnRecuperarPassword = new JButton("Recuperar Password");
		btnRecuperarPassword.setForeground(new Color(26, 95, 180));
		btnRecuperarPassword.setBackground(new Color(246, 245, 244));
		GridBagConstraints gbc_btnRecuperarPassword = new GridBagConstraints();
		gbc_btnRecuperarPassword.gridwidth = 2;
		gbc_btnRecuperarPassword.insets = new Insets(0, 0, 5, 5);
		gbc_btnRecuperarPassword.gridx = 2;
		gbc_btnRecuperarPassword.gridy = 9;
		frameLogin.add(btnRecuperarPassword, gbc_btnRecuperarPassword);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "name_71123281914100");
		
		JPanel panelMesas = new JPanel();
		tabbedPane.addTab("Mesas", null, panelMesas, null);
		panelMesas.setLayout(new BoxLayout(panelMesas, BoxLayout.X_AXIS));
		
		JSplitPane splitPane = new JSplitPane();
		panelMesas.add(splitPane);
		
		JSplitPane panelAccionesMesa = new JSplitPane();
		panelAccionesMesa.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setLeftComponent(panelAccionesMesa);
		
		JPanel panelOpcionesMesa = new JPanel();
		panelAccionesMesa.setLeftComponent(panelOpcionesMesa);
		panelOpcionesMesa.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				RowSpec.decode("10dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JButton btnNuevaMesa = new JButton("Nueva Mesa");
		btnNuevaMesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visibilidadPanelModificacionMesa(true);
			}
		});
		panelOpcionesMesa.add(btnNuevaMesa, "2, 2");
		
		JButton btnModificarMesa = new JButton("Modificar Mesa");
		panelOpcionesMesa.add(btnModificarMesa, "2, 4");
		
		JButton btnEliminarMesa = new JButton("Eliminar Mesa");
		panelOpcionesMesa.add(btnEliminarMesa, "2, 6");
		
		JPanel panelEdicionMesaMaster = new JPanel();
		panelAccionesMesa.setRightComponent(panelEdicionMesaMaster);
		panelEdicionMesaMaster.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("250px"),},
			new RowSpec[] {
				RowSpec.decode("top:353px"),}));
		
		
		panelEdicionMesaMaster.add(panelEdicionMesa, "1, 1, center, top");

		panelEdicionMesa.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("60dlu:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("60dlu"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel labelFechaInicioMesa = new JLabel("Fecha Inicio de Mesa");
		labelFechaInicioMesa.setHorizontalAlignment(SwingConstants.CENTER);
		panelEdicionMesa.add(labelFechaInicioMesa, "2, 4, 3, 1");
		

		
		valorFechaInicioMesa.setToolTipText("Ej: 23-10-2024");
		panelEdicionMesa.add(valorFechaInicioMesa, "2, 6, 3, 1, fill, default");
		
		JLabel labelFechaFinMesa = new JLabel("Fecha Fin de Mesa");
		labelFechaFinMesa.setHorizontalAlignment(SwingConstants.CENTER);
		panelEdicionMesa.add(labelFechaFinMesa, "2, 10, 3, 1, center, default");
		
		
		valorFechaFinMesa.setToolTipText("Ej: 23-10-2024");
		panelEdicionMesa.add(valorFechaFinMesa, "2, 12, 3, 1, fill, default");
		
		JLabel labelFechaInicioInscripcionMesa = new JLabel("Fecha Inicio de Inscripcion");
		labelFechaInicioInscripcionMesa.setHorizontalAlignment(SwingConstants.CENTER);
		panelEdicionMesa.add(labelFechaInicioInscripcionMesa, "2, 16, 3, 1");
		
		
		valorFechaInicioInscripcionMesa.setToolTipText("Ej: 23-10-2024");
		panelEdicionMesa.add(valorFechaInicioInscripcionMesa, "2, 18, 3, 1, fill, default");
		
		JLabel labelFechaFinInscripcionMesa = new JLabel("Fecha Fin de Inscripcion");
		labelFechaFinInscripcionMesa.setHorizontalAlignment(SwingConstants.CENTER);
		panelEdicionMesa.add(labelFechaFinInscripcionMesa, "2, 22, 3, 1");
		
		
		panelEdicionMesa.add(valorFechaFinInscripcionMesa, "2, 24, 3, 1, fill, default");
		
		JButton btnCancelarMesa = new JButton("Cancelar");
		btnCancelarMesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelarEdicionMesa();
			}
		});
		panelEdicionMesa.add(btnCancelarMesa, "2, 28");
		
		JButton btnGuardarMesa = new JButton("Guardar");
		panelEdicionMesa.add(btnGuardarMesa, "4, 28");
		
		this.visibilidadPanelModificacionMesa(false);
		
		
		
		table = new JTable();
		splitPane.setRightComponent(table);
		
		JPanel panelExamenes = new JPanel();
		tabbedPane.addTab("Examenes", null, panelExamenes, null);
		
		JButton btnNewButton = new JButton("New button");
		panelExamenes.add(btnNewButton);
		
		JPanel panelMaterias = new JPanel();
		tabbedPane.addTab("Materias", null, panelMaterias, null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		panelMaterias.add(chckbxNewCheckBox);
		
		JPanel panelUsuarios = new JPanel();
		tabbedPane.addTab("Usuarios", null, panelUsuarios, null);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		panelUsuarios.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuOpciones = new JMenu("Opciones");
		menuOpciones.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(menuOpciones);
		
		JMenuItem menuItemSalir = new JMenuItem("Salir");
		menuOpciones.add(menuItemSalir);
		
		JSeparator separator = new JSeparator();
		menuOpciones.add(separator);
		
		JMenuItem menuItemAcerca = new JMenuItem("Acerca");
		menuOpciones.add(menuItemAcerca);
	}
	
	public void visibilidadPanelModificacionMesa(Boolean visible) {
		panelEdicionMesa.setVisible(visible);
	}
	
	public void eliminarTab(String nombreTab) {
		this.tabbedPane.removeTabAt(tabbedPane.indexOfTab(nombreTab));
	}
	
	public void cancelarEdicionMesa() {
		this.valorFechaInicioMesa.setText(null);
		this.valorFechaFinMesa.setText(null);
		this.valorFechaInicioInscripcionMesa.setText(null);
		this.valorFechaFinInscripcionMesa.setText(null);
		visibilidadPanelModificacionMesa(false);
	}
	
	public void editarMesa(String fechaInicioMesa, String fechaFinMesa, String fechaInicioInscripcion, String fechaFinInscripcion) {
		this.valorFechaInicioMesa.setValue(fechaInicioMesa);
		this.valorFechaFinMesa.setValue(fechaFinMesa);
		this.valorFechaInicioInscripcionMesa.setValue(fechaInicioInscripcion);
		this.valorFechaFinInscripcionMesa.setValue(fechaFinInscripcion);
		visibilidadPanelModificacionMesa(true);
	}
}
