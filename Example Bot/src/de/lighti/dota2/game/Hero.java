package de.lighti.dota2.game;

public class Hero extends BaseNPC {
    private int gold;

    private final String type = "Hero";

    public int getGold() {
        return gold;
    }

    public String getType() {
        return type;
    }

    public void setGold( int gold ) {
        this.gold = gold;
    }

}
