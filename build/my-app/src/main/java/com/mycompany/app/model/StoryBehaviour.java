package com.mycompany.app.model;

import com.mycompany.app.model.GameBoard;

import java.util.ArrayList;

public class StoryBehaviour {

    protected int numShields; //On a Quest = number of stages, On a Tournament = number of bonus shields
    protected ArrayList<Integer> specified;

    public StoryBehaviour(int numShields){
        this.numShields = numShields;
    };

    public int getNumShields(){
        return this.numShields;
    }

    public void applyBehaviour(GameBoard b, int player){};

}



