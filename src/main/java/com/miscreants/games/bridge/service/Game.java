package com.miscreants.games.bridge.service;

import com.miscreants.games.bridge.model.Card;
import com.miscreants.games.bridge.model.Player;
import com.miscreants.games.bridge.model.Suit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Game {
    private List<Round> rounds = new ArrayList<>();
    private Map<Player, GameHand> hands;
    private Suit trump;
    private Card fiftyPointCard;
    private Player bidder;
    private Card friendCard;
    private Player friend;
    private Player currentPlayer;


    public Game(List<Player> players) {

    }
}
