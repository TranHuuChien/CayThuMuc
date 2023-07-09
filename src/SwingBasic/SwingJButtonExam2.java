package SwingBasic;

import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SwingJButtonExam2 {

	 private JFrame mainFrame;
	    private JLabel headerLabel;
	    private JLabel statusLabel;
	    private JPanel controlPanel;
	 
	    public SwingJButtonExam2() {
	        prepareGUI();
	    	headerLabel = new JLabel();
	    	controlPanel = new JPanel();
	   
	    }
	 
	    public static void main(String[] args) {
	        SwingJButtonExam2 swingJButtonExam2 = new SwingJButtonExam2();
	        swingJButtonExam2.showButtonDemo();
	    }
	 
	    private void prepareGUI() {
	        mainFrame = new JFrame("Vi du Java Swing - JButton");
	        mainFrame.setSize(400, 300);
	        mainFrame.setLayout(new GridLayout(3, 1));
//	        mainFrame.addWindowListener(new WindowAdapter() {
//	            public void windowClosing(WindowEvent windowEvent) {
//	                System.exit(0);
//	            }
//	        });
	        headerLabel = new JLabel("", JLabel.CENTER);
	        statusLabel = new JLabel("", JLabel.CENTER);
	        statusLabel.setSize(350, 100);
	        controlPanel = new JPanel();
	        controlPanel.setLayout(new FlowLayout());
	        mainFrame.add(headerLabel);
	        mainFrame.add(controlPanel);
	        mainFrame.add(statusLabel);
	        mainFrame.setVisible(true);
	    }
	 
	    private void showButtonDemo() {
	        headerLabel.setText("Control in action: Button");
	        JButton okButton = new JButton("OK");
	        JButton javaButton = new JButton("Submit");
	        JButton cancelButton = new JButton("Cancel");
	        cancelButton.setHorizontalTextPosition(SwingConstants.LEFT);
	        okButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent e) {
	                statusLabel.setText("Ok Button clicked.");
	            }
	        });
	        javaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent e) {
	                statusLabel.setText("Submit Button clicked.");
	            }
	        });
	        cancelButton.addActionListener(new ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent e) {
	                statusLabel.setText("Cancel Button clicked.");
	            }
	        });
	        controlPanel.add(okButton);
	        controlPanel.add(javaButton);
	        controlPanel.add(cancelButton);
	        mainFrame.setVisible(true);
	    }
}
