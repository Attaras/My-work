import java.awt.Graphics.;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Button;
import java.awt.event.;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.*;

public class Oil_Pipeline_Diameter_Calculator_Desktop_App {
	private JFrame frmTaras;

	private final JButton button = new JButton("New button");

	private JTextField QG, QO, GM, TP, P, ROO, MG, Z, MW, K, NLL, H, API, T, textField_1, NEW_IDS, textField,
			textField_2, textField_3, textField_5, textField_4, textField_6, textField_7, textField_8, textField_9,
			textField_10;
	private JTextArea txtrSpecificGravitygm, txtrOilSpecificGravityroo, txtrOperatingPressure,
			txtrOperatingTemperaturetp, txtrMolecularWeight, txtrGasCompressibilty, txtrGasViscosity, txtrShellHeight,
			txtrNormalLiquidLevel, txtrKFactor, txtrRetentionTimet, txtrOilDensityapi, textArea_13;

	private JMenuItem mntmSaveOutputs;
	private JMenu mnLoadOutputs;
	private JPanel panel_1, panel_2;
	private JLabel lblNewLabel_1, lblRg, lblRo, lblVa, lblQga, lblAgm, lblIds, lblL, lblLv, lblW;


	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmTaras.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public void GUI() {
		initialize();

	}


	public void initialize() {

		frmTaras = new JFrame();
		frmTaras.setBackground(new Color(25, 25, 112));
		frmTaras.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frmTaras.setTitle("Adequacy Check");
		frmTaras.setBounds(400, 400, 926, 670);
		frmTaras.setResizable(false);
		frmTaras.setLocation(500, 200);

		frmTaras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTaras.getContentPane().setLayout(null);

		GM = new JTextField();
		GM.setColumns(10);
		GM.setBounds(271, 158, 116, 22);
		frmTaras.getContentPane().add(GM);

		QO = new JTextField();
		QO.setColumns(10);
		QO.setBounds(271, 123, 116, 22);
		frmTaras.getContentPane().add(QO);

		QG = new JTextField();
		QG.setBounds(271, 88, 116, 22);
		frmTaras.getContentPane().add(QG);
		QG.setColumns(10);
		frmTaras.addWindowFocusListener(new WindowAdapter() {
			public void windowGainedFocus(WindowEvent e) {
				QG.requestFocusInWindow();
			}
		});

		TP = new JTextField();
		TP.setColumns(10);
		TP.setBounds(271, 263, 116, 22);
		frmTaras.getContentPane().add(TP);

		P = new JTextField();
		P.setColumns(10);
		P.setBounds(271, 228, 116, 22);
		frmTaras.getContentPane().add(P);

		ROO = new JTextField();
		ROO.setColumns(10);
		ROO.setBounds(271, 193, 116, 22);
		frmTaras.getContentPane().add(ROO);

		MG = new JTextField();
		MG.setColumns(10);
		MG.setBounds(271, 368, 116, 22);
		frmTaras.getContentPane().add(MG);

		Z = new JTextField();
		Z.setColumns(10);
		Z.setBounds(271, 333, 116, 22);
		frmTaras.getContentPane().add(Z);

		MW = new JTextField();
		MW.setColumns(10);
		MW.setBounds(271, 298, 116, 22);
		frmTaras.getContentPane().add(MW);

		K = new JTextField();
		K.setColumns(10);
		K.setBounds(271, 473, 116, 22);
		frmTaras.getContentPane().add(K);

		NLL = new JTextField();
		NLL.setColumns(10);
		NLL.setBounds(271, 438, 116, 22);
		frmTaras.getContentPane().add(NLL);

		H = new JTextField();
		H.setColumns(10);
		H.setBounds(271, 403, 116, 22);
		frmTaras.getContentPane().add(H);

		API = new JTextField();
		API.setColumns(10);
		API.setBounds(271, 543, 116, 22);
		frmTaras.getContentPane().add(API);

		T = new JTextField();
		T.setColumns(10);
		T.setBounds(271, 508, 116, 22);
		frmTaras.getContentPane().add(T);

		JTextArea textField0 = new JTextArea();
		textField0.setText("Gas Rate");
		textField0.setOpaque(false);
		textField0.setEditable(false);
		textField0.setBounds(34, 88, 204, 22);
		frmTaras.getContentPane().add(textField0);

		JTextArea txtrOilRate = new JTextArea();
		txtrOilRate.setText("Oil Rate");
		txtrOilRate.setEditable(false);
		txtrOilRate.setOpaque(false);
		txtrOilRate.setBounds(34, 123, 204, 22);
		frmTaras.getContentPane().add(txtrOilRate);

		txtrSpecificGravitygm = new JTextArea();
		txtrSpecificGravitygm.setText("Gas Specific Gravity (GM)");
		txtrSpecificGravitygm.setOpaque(false);
		txtrSpecificGravitygm.setEditable(false);
		txtrSpecificGravitygm.setBounds(34, 158, 204, 22);
		frmTaras.getContentPane().add(txtrSpecificGravitygm);

		txtrOilSpecificGravityroo = new JTextArea();
		txtrOilSpecificGravityroo.setText("Oil Specific Gravity (ROO)");
		txtrOilSpecificGravityroo.setEditable(false);
		txtrOilSpecificGravityroo.setBounds(34, 193, 212, 22);
		frmTaras.getContentPane().add(txtrOilSpecificGravityroo);

		txtrOperatingPressure = new JTextArea();
		txtrOperatingPressure.setText("Operating Pressure");
		txtrOperatingPressure.setEditable(false);

		txtrOperatingPressure.setBounds(34, 228, 204, 22);
		frmTaras.getContentPane().add(txtrOperatingPressure);

		txtrOperatingTemperaturetp = new JTextArea();
		txtrOperatingTemperaturetp.setText("Operating Temperature (TP)");
		txtrOperatingTemperaturetp.setEditable(false);

		txtrOperatingTemperaturetp.setBounds(34, 263, 212, 22);
		frmTaras.getContentPane().add(txtrOperatingTemperaturetp);

		txtrMolecularWeight = new JTextArea();
		txtrMolecularWeight.setText("Molecular Weight");
		txtrMolecularWeight.setEditable(false);

		txtrMolecularWeight.setBounds(34, 298, 204, 22);
		frmTaras.getContentPane().add(txtrMolecularWeight);

		txtrGasCompressibilty = new JTextArea();
		txtrGasCompressibilty.setText("Gas Compressibilty");
		txtrGasCompressibilty.setEditable(false);

		txtrGasCompressibilty.setBounds(34, 333, 204, 22);
		frmTaras.getContentPane().add(txtrGasCompressibilty);

		txtrGasViscosity = new JTextArea();
		txtrGasViscosity.setText("Gas Viscosity");
		txtrGasViscosity.setEditable(false);

		txtrGasViscosity.setBounds(34, 368, 204, 22);
		frmTaras.getContentPane().add(txtrGasViscosity);

		txtrShellHeight = new JTextArea();
		txtrShellHeight.setText("Shell Height");
		txtrShellHeight.setEditable(false);

		txtrShellHeight.setBounds(34, 403, 204, 22);
		frmTaras.getContentPane().add(txtrShellHeight);

		txtrNormalLiquidLevel = new JTextArea();
		txtrNormalLiquidLevel.setText("Normal Liquid Level");
		txtrNormalLiquidLevel.setEditable(false);

		txtrNormalLiquidLevel.setBounds(34, 438, 204, 22);
		frmTaras.getContentPane().add(txtrNormalLiquidLevel);

		txtrKFactor = new JTextArea();
		txtrKFactor.setText("K Factor");
		txtrKFactor.setEditable(false);

		txtrKFactor.setBounds(34, 473, 204, 22);
		frmTaras.getContentPane().add(txtrKFactor);

		txtrRetentionTimet = new JTextArea();
		txtrRetentionTimet.setText("Retention Time (t)");
		txtrRetentionTimet.setEditable(false);

		txtrRetentionTimet.setBounds(34, 508, 204, 22);
		frmTaras.getContentPane().add(txtrRetentionTimet);

		txtrOilDensityapi = new JTextArea();
		txtrOilDensityapi.setText("Oil Density (API)");
		txtrOilDensityapi.setEditable(false);

		txtrOilDensityapi.setBounds(34, 543, 204, 22);
		frmTaras.getContentPane().add(txtrOilDensityapi);
		txtrOilSpecificGravityroo.setOpaque(false);
		txtrOperatingPressure.setOpaque(false);
		txtrOperatingTemperaturetp.setOpaque(false);
		txtrMolecularWeight.setOpaque(false);
		txtrGasCompressibilty.setOpaque(false);
		txtrGasViscosity.setOpaque(false);
		txtrShellHeight.setOpaque(false);
		txtrNormalLiquidLevel.setOpaque(false);
		txtrKFactor.setOpaque(false);
		txtrRetentionTimet.setOpaque(false);
		txtrOilDensityapi.setOpaque(false);

		Button button_1 = new Button("Calculate");
		button_1.setBounds(293, 588, 79, 24);
		frmTaras.getContentPane().add(button_1);

		textArea_13 = new JTextArea();
		textArea_13.setBounds(537, 635, -68, 22);
		frmTaras.getContentPane().add(textArea_13);

		textField_1 = new JTextField();
		textField_1.setBounds(742, 88, 155, 22);
		textField_1.setEditable(false);
		frmTaras.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JList list = new JList();
		list.setBounds(682, 532, -116, -91);
		frmTaras.getContentPane().add(list);

		NEW_IDS = new JTextField();
		NEW_IDS.setBounds(630, 126, 116, 22);
		frmTaras.getContentPane().add(NEW_IDS);
		NEW_IDS.setColumns(10);

		Button button_2 = new Button("Insert");
		button_2.setBounds(802, 123, 79, 24);
		frmTaras.getContentPane().add(button_2);

		JList list_1 = new JList();
		list_1.setBounds(831, 370, 1, 1);
		frmTaras.getContentPane().add(list_1);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(UIManager.getColor("CheckBox.foreground"));
		menuBar.setBounds(0, 0, 920, 32);
		frmTaras.getContentPane().add(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		mnFile.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnFile);

		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QG.setText("");
				QO.setText("");
				GM.setText("");
				ROO.setText("");
				P.setText("");
				textField_1.setText("");
				NEW_IDS.setText("");
				MW.setText("");
				Z.setText("");
				MG.setText("");
				H.setText("");
				NLL.setText("");
				TP.setText("");
				K.setText("");
				T.setText("");
				API.setText("");
			}
		});
		mntmNew.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnFile.add(mntmNew);

		JMenuItem mntmSaveCurrentInputs = new JMenuItem("Save Current Inputs");
		mntmSaveCurrentInputs.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnFile.add(mntmSaveCurrentInputs);

		JMenu mnLoadInputs = new JMenu("Load Inputs");
		mnLoadInputs.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnFile.add(mnLoadInputs);

		mntmSaveOutputs = new JMenuItem("Save Current Outputs");
		mntmSaveOutputs.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnFile.add(mntmSaveOutputs);

		mnLoadOutputs = new JMenu("Load Outputs");
		mnLoadOutputs.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnFile.add(mnLoadOutputs);

		JMenu mnNewMenu = new JMenu("Help");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewMenu);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				help hlp = new help();
				hlp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				hlp.setSize(450, 190);
				hlp.setVisible(true);
				hlp.setResizable(false);
				hlp.setLocation(750, 400);

			}
		});
		mntmAbout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmAbout);

		JLabel lblNewLabel = new JLabel("Minimum Internal Diameter of Separator = ");
		lblNewLabel.setBounds(454, 91, 259, 16);
		frmTaras.getContentPane().add(lblNewLabel);

		JLabel lblInsertNewDiameter = new JLabel("Insert New Diameter");
		lblInsertNewDiameter.setBounds(454, 126, 132, 16);
		frmTaras.getContentPane().add(lblInsertNewDiameter);

		lblNewLabel_1 = new JLabel("Operating Temperature:");
		lblNewLabel_1.setBounds(454, 336, 143, 16);
		frmTaras.getContentPane().add(lblNewLabel_1);

		lblRg = new JLabel("RG:");
		lblRg.setBounds(454, 406, 56, 16);
		frmTaras.getContentPane().add(lblRg);

		lblRo = new JLabel("RO:");
		lblRo.setBounds(454, 476, 56, 16);
		frmTaras.getContentPane().add(lblRo);

		lblVa = new JLabel("VA:");
		lblVa.setBounds(454, 546, 56, 16);
		frmTaras.getContentPane().add(lblVa);

		lblQga = new JLabel("QGA");
		lblQga.setBounds(615, 336, 56, 16);
		frmTaras.getContentPane().add(lblQga);

		lblAgm = new JLabel("AGM");
		lblAgm.setBounds(615, 406, 56, 16);
		frmTaras.getContentPane().add(lblAgm);

		lblIds = new JLabel("IDS");
		lblIds.setBounds(615, 476, 56, 16);
		frmTaras.getContentPane().add(lblIds);

		lblL = new JLabel("L");
		lblL.setBounds(776, 336, 56, 16);
		frmTaras.getContentPane().add(lblL);

		lblLv = new JLabel("LV");
		lblLv.setBounds(776, 406, 56, 16);
		frmTaras.getContentPane().add(lblLv);

		lblW = new JLabel("W");
		lblW.setBounds(776, 476, 56, 16);
		frmTaras.getContentPane().add(lblW);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(454, 368, 79, 22);
		frmTaras.getContentPane().add(textField);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(454, 438, 116, 22);
		frmTaras.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(454, 508, 116, 22);
		frmTaras.getContentPane().add(textField_3);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(454, 579, 116, 22);
		frmTaras.getContentPane().add(textField_5);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(615, 368, 116, 22);
		frmTaras.getContentPane().add(textField_4);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(615, 438, 116, 22);
		frmTaras.getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(615, 508, 116, 22);
		frmTaras.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(776, 368, 116, 22);
		frmTaras.getContentPane().add(textField_8);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(776, 438, 116, 22);
		frmTaras.getContentPane().add(textField_9);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(776, 508, 116, 22);
		frmTaras.getContentPane().add(textField_10);

		panel_2 = new JPanel();
		panel_2.setBounds(436, 298, 472, 324);
		panel_2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Output Panel"),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));

		frmTaras.getContentPane().add(panel_2);

		panel_1 = new JPanel();
		panel_1.setBounds(436, 57, 472, 228);
		panel_1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Diameter"),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		frmTaras.getContentPane().add(panel_1);

		JPanel panel = new JPanel();
		panel.setBounds(10, 57, 414, 565);
		frmTaras.getContentPane().add(panel);
		panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Inputs"),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));

		thehandler handler = new thehandler();
		thehandler2 handler2 = new thehandler2();
		button_1.addActionListener(handler);
		button_2.addActionListener(handler2);

	}

	private class thehandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {

			final double RW = 62.4;
			// TP
			double tp = Double.parseDouble(TP.getText());
			double TP = (tp + 273.15) * 9 / 5;
			// RG
			double gm = Double.parseDouble(GM.getText());
			double p = Double.parseDouble(P.getText());
			double z = Double.parseDouble(Z.getText());
			double RG = (2.7 * gm * p) / (TP * z);
			// RO
			double roo = Double.parseDouble(ROO.getText());
			double RO = RW * roo;
			// VA
			double k = Double.parseDouble(K.getText());
			double VA = k * (Math.sqrt((RO - RG) / RG));
			// QGA
			double qg = Double.parseDouble(QG.getText());
			double mw = Double.parseDouble(MW.getText());
			double QGA = (qg * mw) / (379.5 * 86400 * RG);
			// AGM
			// if vertical work with the below equation,
			double AGM = QGA / VA;

			// IDS
			double IDS = Math.sqrt((AGM * 144) / (0.7854));


			DecimalFormat numberformat = new DecimalFormat("#.00000");
			textField_1.setText(String.valueOf(numberformat.format(IDS)));

			textField.setText(String.valueOf(numberformat.format(TP)));
			textField_2.setText(String.valueOf(numberformat.format(RG)));
			textField_3.setText(String.valueOf(numberformat.format(RO)));
			textField_4.setText(String.valueOf(numberformat.format(VA)));
			textField_5.setText(String.valueOf(numberformat.format(QGA)));
			textField_6.setText(String.valueOf(numberformat.format(AGM)));
			textField_7.setText(String.valueOf(numberformat.format(IDS)));

		}

	}

	private class thehandler2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			double new_ids = Double.parseDouble(NEW_IDS.getText());
			double nll = Double.parseDouble(NLL.getText());
			double h = Double.parseDouble(H.getText());
			double t = Double.parseDouble(T.getText());

			// if vertical below equation
			double L = nll * h / 100;

			double LV = new_ids * new_ids * 0.785 * L / (144 * 5.615);

			double W = 1440 * LV / t;

			DecimalFormat numberformat2 = new DecimalFormat("#.00000");

			textField_8.setText(String.valueOf(numberformat2.format(L)));
			textField_9.setText(String.valueOf(numberformat2.format(LV)));
			textField_10.setText(String.valueOf(numberformat2.format(W)));

		}
	}

	public class help extends JFrame {
		public help() {

			super("About The App");
			getContentPane().setFont(new Font("Tahoma", Font.BOLD, 16));
			getContentPane().setLayout(null);

			JLabel lblTa = new JLabel("Adequacy Check    v1.0");
			lblTa.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblTa.setBounds(91, 36, 203, 16);
			getContentPane().add(lblTa);

			JLabel lblNewLabel = new JLabel("32 Bit");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel.setBounds(306, 36, 56, 16);
			getContentPane().add(lblNewLabel);

			JLabel label = new JLabel("<mohammedkhmh@gmail.com>");
			label.setFont(new Font("Tahoma", Font.PLAIN, 15));
			label.setBounds(117, 65, 224, 26);
			getContentPane().add(label);

			JLabel lblHelpIsAvailable = new JLabel("-Help is available in the form of tooltips");
			lblHelpIsAvailable.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblHelpIsAvailable.setBounds(98, 109, 260, 16);
			getContentPane().add(lblHelpIsAvailable);

			JPanel panel3 = new JPanel();
			panel3.setBounds(12, 13, 434, 159);
			getContentPane().add(panel3);
		}
	}