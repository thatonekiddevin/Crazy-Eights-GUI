/**
 * @author Devin
 * @version 1.0
 */
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
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;


public class GameDriver {
	
	private JLabel flippedUpCard;
	private String Hand = "Club Queen | Heart Ace | Heart Seven | Spade King | Diamond Jack";
	private char suitTest = 'H';
	private JLabel cardImages;

	private JFrame frame;
	private JTextField userInputField;

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
		frame.setBounds(100, 100, 800, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea player1Hand = new JTextArea();
		player1Hand.setLineWrap(true);
		player1Hand.setBounds(196, 365, 438, 94);
		frame.getContentPane().add(player1Hand);
		
		JButton btnPlayCard = new JButton("Play Card");
		btnPlayCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// This method invokes the action the user is playing a card.
				// It takes the input from a textfield and will be used by the game.
				
				//Put code here that is checking the user input to make sure it is valid.
				
				// These if else blocks check the card and create a faced up card to display in the GUI
				// It uses the getSuitChar designator and the getValueName as a string methods.
				if (Card.getSuitChar == 'D') {
					flippedUpCard.setIcon(new ImageIcon(".\\Cards\\" + Card.getValueName + "_of_diamonds.png"));
				}
				else if (Card.getSuitChar == 'H') {
					flippedUpCard.setIcon(new ImageIcon(".\\Cards\\" + Card.getValueName + "_of_hearts.png"));
				}
				else if (Card.getSuitChar == 'S') {
					flippedUpCard.setIcon(new ImageIcon(".\\Cards\\" + Card.getValueName + "_of_spades.png"));
				}
				else {
					flippedUpCard.setIcon(new ImageIcon(".\\Cards\\" + Card.getValueName + "_of_clubs.png"));
				}
				
				if (player1HandBool) { // <- This checks if its players 1 turn.
						player1Hand.setText(Hand); //Sets player1Hand to a method from game that returns the
				// hand as a String. (ex: "Heart Five Spade Ace etc...")
				} else {
					player2Hand.setText(Hand); //Sets player2Hand to a method from game that returns the
					// hand as a String. (ex: "Heart Five Spade Ace etc...")
				}
				userInputField.getText(); //<- This pulls input from the user in the form "Heart Five" or "Diamond Queen"
				//add code here for what program does with user input.
			}
		});
		btnPlayCard.setBounds(462, 278, 108, 23);
		frame.getContentPane().add(btnPlayCard);
		
		JButton btnNewButton = new JButton("Draw Card");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Draws a card when button is pressed because they have no cards to play.
				//Remove this button if you plan on just drawing for the user knowing they have no cards to play.
			}
		});
		btnNewButton.setBounds(462, 312, 108, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// This method starts the game.
				// Put code for starting game here.
			}
		});
		btnStartGame.setBounds(655, 278, 119, 23);
		frame.getContentPane().add(btnStartGame);
		
		userInputField = new JTextField();
		userInputField.setBounds(462, 247, 89, 20);
		frame.getContentPane().add(userInputField);
		userInputField.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(196, 43, 438, 94);
		frame.getContentPane().add(textArea_1);
		

		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(".\\Resources\\CardBack.jpg"));
		label.setBounds(225, 185, 82, 116);
		frame.getContentPane().add(label);
		
		flippedUpCard = new JLabel("");
		flippedUpCard.setIcon(new ImageIcon(".\\Resources\\CardBack.jpg"));
		flippedUpCard.setBounds(334, 185, 80, 116);
		frame.getContentPane().add(flippedUpCard);
		
		JLabel lblPlayACard = new JLabel("Type a Card in:");
		lblPlayACard.setForeground(Color.WHITE);
		lblPlayACard.setBounds(462, 201, 89, 14);
		frame.getContentPane().add(lblPlayACard);
		
		JLabel lblExHeartFive = new JLabel("Ex: Heart Five");
		lblExHeartFive.setForeground(Color.WHITE);
		lblExHeartFive.setBounds(462, 222, 76, 14);
		frame.getContentPane().add(lblExHeartFive);
		
		JLabel TableBG = new JLabel("");
		TableBG.setIcon(new ImageIcon(".\\resources\\Table.png"));
		TableBG.setBounds(0, -17, 784, 761);
		frame.getContentPane().add(TableBG);
		
		

		
	}
}