package main.java.com.puzzlepirates.YPPPP;

public class YPPPP {

	public static void main(String[] args) {
		YPPPPView view = new YPPPPView();
		new YPPPPController(view); 
		view.setVisible(true);
	}
}
