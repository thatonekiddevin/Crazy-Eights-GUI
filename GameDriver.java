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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 467, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea playCardText = new JTextArea();
		playCardText.setForeground(Color.RED);
		playCardText.setBounds(168, 205, 109, 22);
		frame.getContentPane().add(playCardText);
		
		JButton btnPlayCard = new JButton("Play Card");
		btnPlayCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (i == 0) {
					playCardText.setText(cardText1);
					playCardText.setForeground(Color.RED);
					i++;
					System.out.println(i);
				}
				else if (i == 1) {
					playCardText.setText(cardText2);
					playCardText.setForeground(Color.BLACK);
					i++;
				}
				else if (i == 2) {
					playCardText.setText(cardText3);
					playCardText.setForeground(Color.BLUE);
					i++;
				}
				else if (i == 3) {
					playCardText.setText(cardText4);
					playCardText.setForeground(Color.GREEN);
					i = 0;
				}
			}
		});
		btnPlayCard.setBounds(177, 352, 89, 23);
		frame.getContentPane().add(btnPlayCard);
		
		for (int i = 0; i < 10; i++) {
			JLabel deckImage = new JLabel("");
			deckImage.setIcon(new ImageIcon("C:\\Users\\Devin\\Pictures\\ShitAlaynaSaved\\card back orange.png"));
			deckImage.setBounds((48 + (i * 5)), 130, 113, 162);
			frame.getContentPane().add(deckImage);
		}
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Devin\\workspace\\GUI\\src\\felt.png"));
		lblNewLabel.setBounds(0, 0, 451, 492);
		frame.getContentPane().add(lblNewLabel);
	}
}
