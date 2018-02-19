package com.mycompany.app.controller;

import com.mycompany.app.model.GameModel;
import com.mycompany.app.model.GameObserver;
import com.mycompany.app.view.GameView;

public class GameController implements GameObserver{

	private final GameModel model;
	private final GameView view;

	public GameController(GameModel model){
		this.model = model;
		this.model.registerObserver(this);
		this.view = new GameView(this);
	}

	public void update(){

	}

}


