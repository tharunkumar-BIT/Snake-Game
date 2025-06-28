import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GameFrame(){
		
		this.add(new GamePanel());
		this.setTitle("Snake"); // title of the game
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits the game on closing the window
		this.setResizable(false); // can't resize the window
		this.pack(); //automatically size the frame based on the contained components.
		this.setVisible(true); // makes frame visible
		this.setLocationRelativeTo(null); // makes frame display in center of the screen
	}
}
