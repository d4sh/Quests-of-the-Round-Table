
package com.mycompany.app.model;

import java.util.*;

import com.mycompany.app.GameLogger;
import com.mycompany.app.model.Card;

public class GameStateBeginTournament extends GameState{
	public GameStateBeginTournament(GameState state,int currentPlayer){
		this.model = state.model;
		changeState(this,currentPlayer);
		model.state = GameStates.TOURNAMENT_HANDLER;
	}

	public void next(){
		model.log.gameStateAction(model.state,"Begin Tournament","");

		// start a cycle which loops through participants
		model.participants = new Cycle<Integer>(model.players,model.players.indexOf(model.storyTurn.current()));

		//this.state = GameStates.PARTICIPATE_TOURNAMENT;
		//model.GameState = new GameState(GameStates.PARTICIPATE_TOURNAMENT,participants.current());
		model.gameState = new GameStateParticipateTournament(this,model.participants.current());
	}
	public void decision(int playerId,boolean choice){

	}
	public boolean play(int playerId, List<Card> cards){
		return false;
	}
	public boolean quest(int playerId, TwoDimensionalArrayList<Card> quest){
		return false;

	}
	public void newGame(int numHumans,int ai_type1,int ai_type2,String[] humanNames){
	}
}
