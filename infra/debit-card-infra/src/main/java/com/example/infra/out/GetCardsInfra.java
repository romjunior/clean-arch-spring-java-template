package com.example.infra;

import com.example.domain.Card;
import com.example.ports.out.GetCards;

import java.util.List;

public class GetCardsInfra implements GetCards {
    @Override
    public List<Card> getCards(String id) {
        return List.of(new Card("John", "12312"), new Card("Mary", "123231"));
    }
}
