package org.jnit.recursions;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class TowersOfHanoi extends Applet {

	private static final long serialVersionUID = 1L;
	Label prompt1, prompt2;
	TextField input1;
	TextArea output1;
	int n;

	public void init() {
		prompt1 = new Label("Enter number of disks");
		input1 = new TextField(5);
		prompt2 = new Label("The solution is");
		output1 = new TextArea(10, 35);
		output1.setEditable(false);
		add(prompt1);
		add(input1);
		add(prompt2);
		add(output1);
	}

	public boolean action(Event e, Object o) {
		n = Integer.parseInt(input1.getText());
		showStatus("Calculating");
		towers(n, 'A', 'B', 'C');
		output1.append("\n\n");
		showStatus("Done.");
		return true;
	}

	void towers(int n, char fromPeg, char toPeg, char auxPeg) {
		if (n == 1) {
			output1.append("\nmove disk 1 from peg" + fromPeg + "to peg" + toPeg);
			return;
		}
		towers(n-1, fromPeg, auxPeg, toPeg);
		output1.append("\n move disk"+ n + "fromPeg"+fromPeg+"toPeg"+toPeg);
		towers(n-1, auxPeg, toPeg, fromPeg);
		
	}

}
