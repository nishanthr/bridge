package com.miscreants.games.bridge.service;

import ch.qos.logback.classic.pattern.LineSeparatorConverter;
import com.miscreants.games.bridge.model.Card;
import com.miscreants.games.bridge.model.Player;

import java.util.List;
import java.util.Set;

public class GameHand {
    private Player player;
    private Game game;
    private Set<Card> originalCards;
    private Set<Card> currentCards;
    private List<Round> roundsWon;
    private Integer score;
}
