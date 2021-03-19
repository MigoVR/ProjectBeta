package src;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class myGUI {

	public myGUI() {
		
		//Initialize Window 	
		JFrame frame = new JFrame("Script Tracker");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//Menu
		JMenuBar menu = new JMenuBar();
		menu.setVisible(true);
		frame.setJMenuBar(menu); // add menu to the frame
		
		
		//Create Save 
		Button save = new Button("Save");
		save.setSize(50, 20);
		menu.add(save); // add button to menu 
		//[todo] add functionality to button 
		
		
		//Create Panel for our TextFields
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 2));
		frame.add(panel);
		
		//Create 4 Text Fields that will store our prompts & options 
		JTextField prev, curr, left, right;
		JLabel pL, cL, lL, rL;
		
		prev = new JTextField(16);
		pL = new JLabel("Previous Prompt", JLabel.LEFT);
		pL.setLabelFor(prev);
		
		cL = new JLabel("Current Prompt");
		curr = new JTextField(16);
		cL.setLabelFor(prev);
		
		lL = new JLabel("Left Path");
		left = new JTextField(16);
		lL.setLabelFor(prev);
		
		rL = new JLabel("Right Path");
		right = new JTextField(16);
		rL.setLabelFor(prev);
		
		panel.add(prev, JPanel.RIGHT_ALIGNMENT);
		panel.add(curr);
		panel.add(left);
		panel.add(right);
	
		
		frame.pack();
		
	}
	
	
	
	public static void main(String[] args) {
		myGUI gui = new myGUI();
	}

}
