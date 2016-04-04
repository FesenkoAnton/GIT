package GIT;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Hello extends GraphicsProgram {

	public void run() {
		this.setSize(300,200);
		GLabel label = new GLabel("Hello");
		label.setFont("Times New Roman-36");
		add(label, 70, 70);

	}
}
