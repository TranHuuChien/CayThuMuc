package SwingBasic;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;

class SimpleFrame extends JFrame{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	public SimpleFrame() {
		// TODO Auto-generated constructor stub
		//setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
		/*Toolkit kToolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kToolkit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		setSize(screenWidth/2, screenHeight/2);
		setLocationByPlatform(true);*/
	}
	
	public void CreateKhung()
	{
		Toolkit kToolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kToolkit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth/2, screenHeight/2);
		setLocationByPlatform(true);
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawString("Not a Hello, World program",100,100);
	}
	
	public void CayThuMuc()
	{
		
	}
}
public class GraphicSwing {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			SimpleFrame frame = new SimpleFrame();
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
