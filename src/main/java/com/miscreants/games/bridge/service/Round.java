package com.miscreants.games.bridge.service;

import com.miscreants.games.bridge.model.Card;
import com.miscreants.games.bridge.model.Player;
import com.miscreants.games.bridge.model.Suit;

import java.util.List;
import java.util.Map;

public class Round {
    private Game game;
    private List<Play> plays;
    private Player winner;
    private Boolean completed;

    public Map<Player, Integer> getScores(Card fiftyPointCard, Suit trump) {
        return null;
    }

    public boolean isCompleted() {
        return completed;
    }
}
