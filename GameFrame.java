import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GamePanel panel;
	
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.pink);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}