package com.example.infra.out;

import com.example.domain.Card;
import com.example.ports.out.GetCards;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("GetCardsInfra")
class GetCardsInfra implements GetCards {
    @Override
    public List<Card> getCards(String id) {
        return List.of(new Card("John", "12312"), new Card("Mary", "123231"));
    }
}
