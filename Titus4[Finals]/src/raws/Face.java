package raws;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JProgressBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import java.awt.Scrollbar;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.border.EmptyBorder;

public class Face {

	public static String textArea = null;
	private JFrame frmTorchYourFile;
	private JTextField textField;
	private JLabel lblSearchResultsAre;
	static JTextField txtScanningResult;
	public static boolean cmplt = false;
	private JTextArea txtrAsdfasdf;
	private JScrollPane scrollPane;
	
	public void close(){
		
		frmTorchYourFile.dispose();
	}
	
	public void runUI(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Face window = new Face();
					window.frmTorchYourFile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	
	public Face() {
		initialize();
	}
	private void initialize() {
		frmTorchYourFile = new JFrame();
		frmTorchYourFile.setResizable(false);
		frmTorchYourFile.getContentPane().setForeground(Color.DARK_GRAY);
		frmTorchYourFile.getContentPane().setBackground(new Color(36,37,41));
		frmTorchYourFile.getContentPane().setLayout(null);
	
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setFont(new Font("Helvetica Light", Font.PLAIN, 15));
		textField.setForeground(new Color(32,32,32));
		textField.setBackground(Color.WHITE);
		textField.setBounds(29, 44, 587, 30);
		frmTorchYourFile.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		txtrAsdfasdf = new JTextArea(10,20);
		txtrAsdfasdf.setEditable(false);
		txtrAsdfasdf.setForeground(new Color(127,135,138));
		txtrAsdfasdf.setBackground(new Color(46,47,52));
		txtrAsdfasdf.setLayout(new BoxLayout(txtrAsdfasdf, BoxLayout.X_AXIS));
		txtrAsdfasdf.setBounds(29, 87, 710, 442);
	
		
		
		scrollPane = new JScrollPane(txtrAsdfasdf,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBorder(null);
		
		frmTorchYourFile.getContentPane().add(scrollPane);
		scrollPane.setBounds(29, 87, 710, 442);
		
		
		JButton btnSearch = new JButton("TITUS");
		btnSearch.setRolloverEnabled(false);
		btnSearch.setRequestFocusEnabled(false);
		btnSearch.setFocusTraversalKeysEnabled(false);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ss = textField.getText();
				if(ss.equals(null) || (ss.equals(""))){
					return;
				}
				else{
					boolean directory_found = false;
					txtrAsdfasdf.selectAll();
					txtrAsdfasdf.replaceSelection("");
					String sss = ss.trim();
			        BufferedReader br = null;
			        try {
						br = new BufferedReader(new InputStreamReader(new FileInputStream("directories.txt")));
						String line;
			            while ((line = br.readLine()) != null ){
			                if (line.contains(sss)){
			                	directory_found = true;
			                	txtrAsdfasdf.append(line + "\n");
			                	
			                }
			            }
			            if(directory_found == false){
			            	txtrAsdfasdf.append("No results found. Try rescan option if no directory is found & wait until it completes rescaning.");
			            }
			            
			        
			        } catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
			        finally{
			            try{
			                if (br != null)
			                    br.close();
			            }
			            catch (Exception e){
			                System.err.println("Exception while closing bufferedreader " + e.toString());
			            }
			        }
					
					
				}
			}
		});
		btnSearch.setFocusPainted(false);
		btnSearch.setDefaultCapable(false);
		btnSearch.setBorderPainted(false);
		btnSearch.setBorder(null);
		btnSearch.setForeground(new Color(0, 0, 0));
		btnSearch.setBackground(new Color(240, 230, 140));
		btnSearch.setFont(new Font("Montserrat Semi Bold", Font.PLAIN, 14));
		btnSearch.setBounds(624, 35, 114, 30);
		frmTorchYourFile.getContentPane().add(btnSearch);
		
		lblSearchResultsAre = new JLabel("Search results are");
		btnSearch.setBorder(null);
		btnSearch.setForeground(new Color(46,47,52));
		btnSearch.setBackground(Color.WHITE);
		btnSearch.setFont(new Font("Montserrat Semi Bold", Font.PLAIN, 14));
		btnSearch.setBounds(625, 44, 114, 30);
		frmTorchYourFile.getContentPane().add(btnSearch);
		
		txtScanningResult = new JTextField();
		txtScanningResult.setForeground(Color.WHITE);
		txtScanningResult.setBorder(null);
		txtScanningResult.setOpaque(false);
		txtScanningResult.setRequestFocusEnabled(false);
		txtScanningResult.setEditable(false);
		txtScanningResult.setBounds(29, 540, 114, 22);
		frmTorchYourFile.getContentPane().add(txtScanningResult);
		txtScanningResult.setColumns(10);
		
		
		//frmTorchYourFile.getContentPane().add(txtrAsdfasdf);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(null);
		menuBar.setBackground(new Color(36,37,41));
		menuBar.setBounds(0, 0, 792, 21);
		frmTorchYourFile.getContentPane().add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setAlignmentX(1.5f);
		mnOptions.setForeground(Color.WHITE);
		mnOptions.setBorder(null);
		mnOptions.setBackground(Color.WHITE);
		menuBar.add(mnOptions);
		
		JMenuItem mntmRefresh = new JMenuItem("Rescan");
		mntmRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					File f = fileLists.file_directory;
					fileLists.btn_refresh = true;
					fileLists.file_exist = false;
					
					if(f.exists() == true){
						f.delete();
						try {
							Mother.callDir();
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					txtScanningResult.setText("Rescan Complete");;
				
			}
		});
			
		
		mntmRefresh.setBackground(Color.DARK_GRAY);
		mntmRefresh.setPreferredSize(new Dimension(85, 22));
		mntmRefresh.setOpaque(true);
		mntmRefresh.setForeground(Color.WHITE);
		mntmRefresh.setFocusTraversalKeysEnabled(false);
		mntmRefresh.setContentAreaFilled(false);
		mntmRefresh.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmRefresh.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		mntmRefresh.setBorder(new EmptyBorder(0, 0, 0, 0));
		mnOptions.add(mntmRefresh);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setForeground(Color.WHITE);
		mnHelp.setBorder(null);
		mnHelp.setBackground(Color.WHITE);
		mnHelp.setAlignmentX(1.5f);
		menuBar.add(mnHelp);
		
		JMenuItem mntmManual = new JMenuItem("Manual");
		mntmManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Help.Mui();
				
			}
		});
		mntmManual.setPreferredSize(new Dimension(85, 22));
		mntmManual.setOpaque(true);
		mntmManual.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmManual.setHorizontalAlignment(SwingConstants.CENTER);
		mntmManual.setForeground(Color.WHITE);
		mntmManual.setFocusTraversalKeysEnabled(false);
		mntmManual.setContentAreaFilled(false);
		mntmManual.setBorder(new EmptyBorder(0, 0, 0, 0));
		mntmManual.setBackground(Color.DARK_GRAY);
		mnHelp.add(mntmManual);
		frmTorchYourFile.setResizable(false);
		frmTorchYourFile.setTitle("Titus");
		frmTorchYourFile.setIconImage(Toolkit.getDefaultToolkit().getImage(Face.class.getResource("/icons/Group 1.png")));
		frmTorchYourFile.setBounds(100, 100, 777, 610);
		frmTorchYourFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
}
