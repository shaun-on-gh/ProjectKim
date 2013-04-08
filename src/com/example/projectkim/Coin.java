package com.example.projectkim;

import java.util.Random;

//import com.badlogic.androidgames.framework.GameObject;
import com.example.framework.DynamicGameObject;

public class Coin extends DynamicGameObject {
    public static final float COIN_WIDTH = 0.5f;
    public static final float COIN_HEIGHT = 0.8f;
    public static final int COIN_SCORE = 10;

    float stateTime;
    Random rand = new Random();

    public Coin(float x, float y) {
        super(x, y, COIN_WIDTH, COIN_HEIGHT);
        //stateTime = rand.nextFloat() * 2;
        stateTime = 0;
    }
    
    public void update(float deltaTime) {
        stateTime += deltaTime;
        float randTest = rand.nextFloat();
        position.add(position.x , -(position.y * deltaTime * randTest * 2.0f));
    }
}
