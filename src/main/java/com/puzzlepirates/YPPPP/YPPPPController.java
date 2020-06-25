package main.java.com.puzzlepirates.YPPPP;

import main.java.com.puzzlepirates.YPPPP.model.YPPPPModel;

public class YPPPPController {
	
	public YPPPPController(YPPPPView view) {
		YPPPPModel model = new YPPPPModel(view);
		view.setModel(model);
		view.Update();
	}
}
