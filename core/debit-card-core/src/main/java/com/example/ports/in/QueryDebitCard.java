package com.example.ports.in;

import com.example.domain.Card;

import java.util.List;

public interface QueryDebitCard {

    List<Card> getCards(final String id);
}
