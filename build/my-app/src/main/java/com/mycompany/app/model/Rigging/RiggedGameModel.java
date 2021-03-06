package com.mycompany.app.model.Rigging;

import com.mycompany.app.model.GameBoard;
import com.mycompany.app.model.AdventureCardFactory;
import com.mycompany.app.model.CardLoader;
import com.mycompany.app.model.AbstractAI;
import com.mycompany.app.model.HumanPlayer;
import com.mycompany.app.model.Strategy1AI;

import java.util.ArrayList;
import java.util.List;

public class RiggedGameModel{
		
	public static GameBoard rig1(){
		AdventureCardFactory F = new AdventureCardFactory();
		List<HumanPlayer> humans = new ArrayList<>();
		GameBoard b = new GameBoard();

		HumanPlayer p1 = new HumanPlayer("Player 1", "Shield Blue.png");
		p1.hand.add(F.createCard(AdventureCardFactory.Types.SAXONS));
		p1.hand.add(F.createCard(AdventureCardFactory.Types.BOAR));
		p1.hand.add(F.createCard(AdventureCardFactory.Types.DAGGER));
		p1.hand.add(F.createCard(AdventureCardFactory.Types.SWORD));
		p1.hand.add(F.createCard(AdventureCardFactory.Types.TEST_OF_THE_QUESTING_BEAST));
		p1.hand.add(F.createCard(AdventureCardFactory.Types.SIR_GALAHAD));
		p1.hand.add(F.createCard(AdventureCardFactory.Types.SIR_LANCELOT));
		p1.hand.add(F.createCard(AdventureCardFactory.Types.QUEEN_ISEULT));

		HumanPlayer p2 = new HumanPlayer("Player 2", "Shield Green.png");
		p2.hand.add(F.createCard(AdventureCardFactory.Types.DAGGER));
		p2.hand.add(F.createCard(AdventureCardFactory.Types.ROBBER_KNIGHT));
		p2.hand.add(F.createCard(AdventureCardFactory.Types.THIEVES));
		p2.hand.add(F.createCard(AdventureCardFactory.Types.TEST_OF_MORGAN_LE_FAY));
		p2.hand.add(F.createCard(AdventureCardFactory.Types.KING_ARTHUR));
		p2.hand.add(F.createCard(AdventureCardFactory.Types.SIR_TRISTAN));
		p2.hand.add(F.createCard(AdventureCardFactory.Types.MERLIN));

		HumanPlayer p3 = new HumanPlayer("Player 3", "Shield Red.png");
		p3.hand.add(F.createCard(AdventureCardFactory.Types.HORSE));
		p3.hand.add(F.createCard(AdventureCardFactory.Types.EXCALIBUR));
		p3.hand.add(F.createCard(AdventureCardFactory.Types.AMOUR));
		p3.hand.add(F.createCard(AdventureCardFactory.Types.KING_PELLINORE));
		p3.hand.add(F.createCard(AdventureCardFactory.Types.SIR_GAWAIN));

		HumanPlayer p4 = new HumanPlayer("Player 4", "Shield Purple.png");
		p4.hand.add(F.createCard(AdventureCardFactory.Types.BATTLE_AX));
		p4.hand.add(F.createCard(AdventureCardFactory.Types.LANCE));
		p4.hand.add(F.createCard(AdventureCardFactory.Types.THIEVES));
		p4.hand.add(F.createCard(AdventureCardFactory.Types.SIR_PERCIVAL));
		p4.hand.add(F.createCard(AdventureCardFactory.Types.QUEEN_GUINEVERE));

		humans.add(p1);
		humans.add(p2);
		humans.add(p3);
		humans.add(p4);

		b.initRig(new ArrayList<AbstractAI>(),humans,
				CardLoader.loadAdventureCards(), CardLoader.rigGame1(),true,false,true);
		return b;
	}

	public static GameBoard rig2(){
		AdventureCardFactory F = new AdventureCardFactory();
		List<HumanPlayer> humans = new ArrayList<>();
		GameBoard b = new GameBoard();

		HumanPlayer p1 = new HumanPlayer("Player 1", "Shield Blue.png");
		p1.hand.add(F.createCard(AdventureCardFactory.Types.SAXONS));
		p1.hand.add(F.createCard(AdventureCardFactory.Types.BOAR));
		p1.hand.add(F.createCard(AdventureCardFactory.Types.DAGGER));
		p1.hand.add(F.createCard(AdventureCardFactory.Types.SWORD));

		HumanPlayer p2 = new HumanPlayer("Player 2", "Shield Green.png");
		p2.hand.add(F.createCard(AdventureCardFactory.Types.DAGGER));
		p2.hand.add(F.createCard(AdventureCardFactory.Types.TEST_OF_VALOR));
		p2.hand.add(F.createCard(AdventureCardFactory.Types.ROBBER_KNIGHT));
		p2.hand.add(F.createCard(AdventureCardFactory.Types.EVIL_KNIGHT));
		p2.hand.add(F.createCard(AdventureCardFactory.Types.DRAGON));

		HumanPlayer p3 = new HumanPlayer("Player 3", "Shield Red.png");
		p3.hand.add(F.createCard(AdventureCardFactory.Types.HORSE));
		p3.hand.add(F.createCard(AdventureCardFactory.Types.EXCALIBUR));
		p3.hand.add(F.createCard(AdventureCardFactory.Types.AMOUR));

		HumanPlayer p4 = new HumanPlayer("Player 4", "Shield Purple.png");
		p4.hand.add(F.createCard(AdventureCardFactory.Types.BATTLE_AX));
		p4.hand.add(F.createCard(AdventureCardFactory.Types.LANCE));
		p4.hand.add(F.createCard(AdventureCardFactory.Types.THIEVES));

		humans.add(p1);
		humans.add(p2);
		humans.add(p3);
		humans.add(p4);

		b.initRig(new ArrayList<AbstractAI>(),humans,
				CardLoader.loadAdventureCards(), CardLoader.rigGame2(),true,false,true);
		return b;
	}

	public static GameBoard rig3(){
		AdventureCardFactory F = new AdventureCardFactory();
		List<HumanPlayer> humans = new ArrayList<>();
		GameBoard b = new GameBoard();
		List<AbstractAI> strategy1AI = new ArrayList();
		strategy1AI.add(new Strategy1AI("Strategy1AI","Shield Purple.png" ));


		HumanPlayer p1 = new HumanPlayer("Player 1", "Shield Blue.png");
		p1.inPlay.add(F.createCard(AdventureCardFactory.Types.MERLIN));
		p1.inPlay.add(F.createCard(AdventureCardFactory.Types.SIR_TRISTAN));

		HumanPlayer p2 = new HumanPlayer("Player 2", "Shield Green.png");
		p2.inPlay.add(F.createCard(AdventureCardFactory.Types.QUEEN_ISEULT));

		HumanPlayer p3 = new HumanPlayer("Player 3", "Shield Red.png");

		//HumanPlayer p4 = new HumanPlayer("Player 4", "Shield Purple.png");

		humans.add(p1);
		//humans.add(p2);
		//humans.add(p3);

		b.initRig(strategy1AI,humans,
				CardLoader.loadAdventureCards(), CardLoader.loadStoryCards(),true,true,true);
		return b;
	}
}
