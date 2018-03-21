
package com.mycompany.app.model;

import java.util.*;

import com.mycompany.app.GameLogger;
import com.mycompany.app.model.Card;

public class GameStateQuestEnd extends GameState{
	public GameStateQuestEnd (GameState state,int currentPlayer){
		this.model = state.model;
		changeState(this,currentPlayer);
		model.state = GameStates.QUEST_END;
	}

	public void next(){
		model.log.gameStateAction(model.state,"Applying Quest Logic","");

		//apply story logic
		model.board.applyStoryCardLogic(model.questSponsor.current());

		//changeState(GameStates.END_TURN,questSponsor.current());
		model.gameState = new GameStateEndTurn(this,model.questSponsor.current());
		//this.state = GameStates.END_TURN;
	}
	public void decision(int player,boolean participate){
	}
	public boolean play(int id, List<Card> hand){
		return false;
	}
	public boolean quest(int player, TwoDimensionalArrayList<Card> quest){
		return false;
	}
	public void newGame(int numHumans,int ai_type1,int ai_type2,String[] humanNames){
	}
}
