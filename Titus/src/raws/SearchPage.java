package raws;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class SearchPage {

	private JFrame frmTorchYourFile;
	private JTextField textField;
	private JLabel lblSearchResultsAre;
	private JTextField textField_1;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchPage window = new SearchPage();
					window.frmTorchYourFile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTorchYourFile = new JFrame();
		frmTorchYourFile.getContentPane().setForeground(Color.DARK_GRAY);
		frmTorchYourFile.getContentPane().setBackground(SystemColor.info);
		frmTorchYourFile.getContentPane().setLayout(null);
		
		JLabel lblTIT = new JLabel("Titus Search");
		lblTIT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTIT.setForeground(new Color(0, 0, 51));
		lblTIT.setFont(new Font("Bitstream Vera Sans Mono", Font.PLAIN, 15));
		lblTIT.setBounds(-5, 30, 139, 38);
		frmTorchYourFile.getContentPane().add(lblTIT);
		
		textField = new JTextField();
		textField.setFont(new Font("Bitstream Vera Sans Mono", Font.PLAIN, 15));
		textField.setForeground(new Color(32,32,32));
		textField.setBackground(new Color(255, 255, 240));
		textField.setBounds(141, 35, 474, 30);
		frmTorchYourFile.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(new Color(0, 0, 0));
		btnSearch.setBackground(new Color(240, 230, 140));
		btnSearch.setFont(new Font("Bitstream Vera Sans Mono", Font.PLAIN, 12));
		btnSearch.setBounds(624, 35, 114, 30);
		frmTorchYourFile.getContentPane().add(btnSearch);
		
		lblSearchResultsAre = new JLabel("Search results are");
		lblSearchResultsAre.setForeground(new Color(0, 0, 51));
		lblSearchResultsAre.setFont(new Font("Bitstream Vera Sans Mono", Font.PLAIN, 13));
		lblSearchResultsAre.setBounds(28, 79, 321, 33);
		frmTorchYourFile.getContentPane().add(lblSearchResultsAre);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBackground(new Color(248, 248, 255));
		textField_1.setEditable(false);
		textField_1.setBounds(28, 111, 710, 426);
		frmTorchYourFile.getContentPane().add(textField_1);
		textField_1.setColumns(100);
		
		scrollPane = new JScrollPane();
		scrollPane.setForeground(new Color(127, 255, 0));
		scrollPane.setBounds(718, 111, 20, 426);
		frmTorchYourFile.getContentPane().add(scrollPane);
		frmTorchYourFile.setResizable(false);
		frmTorchYourFile.setTitle("Titus");
		frmTorchYourFile.setIconImage(Toolkit.getDefaultToolkit().getImage(SearchPage.class.getResource("/icons/lens_256.png")));
		frmTorchYourFile.setBounds(100, 100, 770, 610);
		frmTorchYourFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
