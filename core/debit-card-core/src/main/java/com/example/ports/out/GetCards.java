package com.example.ports.out;

import com.example.domain.Card;

import java.util.List;

public interface GetCards {

    List<Card> getCards(String id);

}
