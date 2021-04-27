package com.miscreants.games.bridge.model;

import lombok.Data;

@Data
public class Card {
    private final Suit suit;
    private final Rank rank;
    private Integer value;
}
