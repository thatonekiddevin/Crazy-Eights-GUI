import java.awt.EventQueue;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class GameDriver {
	
	private String cardText1 = "Heart Five";
	private String cardText2 = "Spade Six";
	private String cardText3 = "Diamond Seven";
	private String cardText4 = "Club Ace";
	private String[] Hand = {"Club Queen", "Heart Ace", "Heart Seven", "Spade King", "Diamond Jack"};
	private int i = 0;
	private String HandString;
	private char suitTest = 'H';
	private String[] FileName = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king",};
	private JLabel cardImages;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameDriver window = new GameDriver();
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
	public GameDriver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		for (int i = 0; i < 10; i++) {
			JLabel deckImage = new JLabel("");
			deckImage.setIcon(new ImageIcon(".\\resources\\CardBack.jpg"));
			deckImage.setBounds(200, (300 + i*5), 113, 158);
		}
		
		for (int i = 0; i < 13; i++) {
			if (suitTest == 'H') {
				cardImages = new JLabel("");
				cardImages.setIcon(new ImageIcon(".\\Cards\\" + FileName[i] + "_of_hearts.png"));
				cardImages.setBounds((679 - i * 15), 618, 79, 116);
				frame.getContentPane().add(cardImages);
			}
			if (suitTest == 'S') {
				cardImages = new JLabel("");
				cardImages.setIcon(new ImageIcon(".\\Cards\\" + FileName[i] + "_of_spades.png"));
				cardImages.setBounds((679 - i * 15), 618, 79, 116);
				frame.getContentPane().add(cardImages);
			}
		}
		
		JButton btnChangeSuits = new JButton("CHANGE SUITS");
		btnChangeSuits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				suitTest = 'S';
			}
		});
		btnChangeSuits.setBounds(320, 441, 142, 23);
		frame.getContentPane().add(btnChangeSuits);
		
		
		
		JLabel TableBG = new JLabel("");
		TableBG.setIcon(new ImageIcon(".\\resources\\Table.png"));
		TableBG.setBounds(0, 0, 784, 761);
		frame.getContentPane().add(TableBG);
		
		

		
	}
}