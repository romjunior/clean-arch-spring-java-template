package com.example.ports.in;

import com.example.domain.Card;

import java.util.List;

public interface QueryCreditCard {

    List<Card> getCards(final String id);
}
