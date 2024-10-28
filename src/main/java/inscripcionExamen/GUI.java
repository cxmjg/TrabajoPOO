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

public class GUI {

	private JFrame frame;
	private JTextField valorUsuario;
	private JPasswordField valorPassword;
	private final JToolBar barraSuperior = new JToolBar();
	private JTextField valorFechaInicioMesa;
	private JTextField valorFechaFinMesa;
	private JTextField valorFechaInicioInscripcion;
	private JTextField valorFechaFinInscripcion;
	private JTable table;

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
		frame.getContentPane().add(panelLogin, "name_5315632412400");
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
		
		JPanel panelApp = new JPanel();
		frame.getContentPane().add(panelApp, "name_5315642071372");
		panelApp.setLayout(new BoxLayout(panelApp, BoxLayout.X_AXIS));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setAlignmentX(Component.CENTER_ALIGNMENT);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panelApp.add(splitPane);
		
		JButton btnMesas = new JButton("Mesas");
		splitPane.setLeftComponent(barraSuperior);
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
		
		JPanel panelContenidoAdministrador = new JPanel();
		splitPane.setRightComponent(panelContenidoAdministrador);
		panelContenidoAdministrador.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("821px"),},
			new RowSpec[] {
				RowSpec.decode("fill:468px"),}));
		
		JLayeredPane layeredPane = new JLayeredPane();
		panelContenidoAdministrador.add(layeredPane, "1, 1, fill, fill");
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		layeredPane.add(panel, "name_247005257390500");
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("fill:default:grow"),}));
		
		JSplitPane splitPane_1 = new JSplitPane();
		panel.add(splitPane_1, "1, 2, left, top");
		
		JPanel panelMesasAcciones_1 = new JPanel();
		splitPane_1.setLeftComponent(panelMesasAcciones_1);
		panelMesasAcciones_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panelMesas = new JPanel();
		layeredPane.setLayer(panelMesas, 0);
		layeredPane.add(panelMesas, "name_247005265931500");
		panelMesas.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				RowSpec.decode("fill:default:grow"),}));
		
		JSplitPane panelMesasContenido = new JSplitPane();
		panelMesas.add(panelMesasContenido, "1, 1, fill, fill");
		
		JPanel panelMesasAcciones = new JPanel();
		panelMesasContenido.setLeftComponent(panelMesasAcciones);
		panelMesasAcciones.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panelMesasAcciones.add(splitPane_2);
		
		JPanel panelMesasOpciones = new JPanel();
		splitPane_2.setLeftComponent(panelMesasOpciones);
		panelMesasOpciones.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("228px:grow"),},
			new RowSpec[] {
				RowSpec.decode("fill:default"),
				RowSpec.decode("fill:30px"),
				RowSpec.decode("fill:30px"),}));
		
		JButton btnNuevaMesa = new JButton("Nueva Mesa");
		btnNuevaMesa.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelMesasOpciones.add(btnNuevaMesa, "1, 1, fill, center");
		
		JButton btnEditarMesa = new JButton("Editar Mesa");
		btnEditarMesa.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelMesasOpciones.add(btnEditarMesa, "1, 2, fill, center");
		
		JButton btnEliminarMesa = new JButton("Eliminar Mesa");
		btnEliminarMesa.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelMesasOpciones.add(btnEliminarMesa, "1, 3, fill, top");
		
		JPanel panelMesasFormulario = new JPanel();
		splitPane_2.setRightComponent(panelMesasFormulario);
		FormLayout fl_panelMesasFormulario = new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("max(2dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("center:default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("50dlu:grow"),
				ColumnSpec.decode("50dlu"),
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				RowSpec.decode("20dlu"),
				RowSpec.decode("20dlu"),
				RowSpec.decode("20dlu"),
				RowSpec.decode("20dlu"),
				RowSpec.decode("20dlu"),
				RowSpec.decode("20dlu"),
				RowSpec.decode("20dlu"),});
		fl_panelMesasFormulario.setColumnGroup(new int[] {2});
		panelMesasFormulario.setLayout(fl_panelMesasFormulario);
		
		JLabel labelFechaInicioMesa = new JLabel("Fecha Inicio Mesa");
		labelFechaInicioMesa.setHorizontalAlignment(SwingConstants.CENTER);
		panelMesasFormulario.add(labelFechaInicioMesa, "3, 2, center, default");
		
		valorFechaInicioMesa = new JTextField();
		panelMesasFormulario.add(valorFechaInicioMesa, "5, 2, 2, 1, fill, default");
		valorFechaInicioMesa.setColumns(10);
		
		JLabel labelFechaFinMesa = new JLabel("Fecha Fin Mesa");
		labelFechaFinMesa.setHorizontalAlignment(SwingConstants.CENTER);
		panelMesasFormulario.add(labelFechaFinMesa, "3, 3, center, default");
		
		valorFechaFinMesa = new JTextField();
		panelMesasFormulario.add(valorFechaFinMesa, "5, 3, 2, 1, fill, default");
		valorFechaFinMesa.setColumns(10);
		
		JLabel labelFechaInicioInscripcion = new JLabel("Fecha Inicio Inscripcion");
		labelFechaInicioInscripcion.setHorizontalAlignment(SwingConstants.CENTER);
		panelMesasFormulario.add(labelFechaInicioInscripcion, "3, 4, center, default");
		
		valorFechaInicioInscripcion = new JTextField();
		panelMesasFormulario.add(valorFechaInicioInscripcion, "5, 4, 2, 1, fill, default");
		valorFechaInicioInscripcion.setColumns(10);
		
		JLabel labelFechaFinInscripcion = new JLabel("Fecha Fin Inscripcion");
		labelFechaFinInscripcion.setHorizontalAlignment(SwingConstants.CENTER);
		panelMesasFormulario.add(labelFechaFinInscripcion, "3, 5, center, default");
		
		valorFechaFinInscripcion = new JTextField();
		panelMesasFormulario.add(valorFechaFinInscripcion, "5, 5, 2, 1, fill, default");
		valorFechaFinInscripcion.setColumns(10);
		
		JButton btnCancelarMesa = new JButton("Cancelar");
		panelMesasFormulario.add(btnCancelarMesa, "5, 7");
		
		JButton btnGuardarMesa = new JButton("Guardar");
		panelMesasFormulario.add(btnGuardarMesa, "6, 7");
		
		JPanel panelMesasTabla = new JPanel();
		panelMesasContenido.setRightComponent(panelMesasTabla);
		panelMesasTabla.setLayout(new MigLayout("", "[1px]", "[1px]"));
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		panelMesasTabla.add(table, "cell 0 0,alignx left,aligny top");
	}
}
