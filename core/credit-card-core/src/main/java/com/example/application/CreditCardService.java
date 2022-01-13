package com.example.application;

import com.example.domain.Card;
import com.example.ports.in.QueryCreditCard;
import com.example.ports.out.GetCards;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
record CreditCardService(@Qualifier("GetCreditCardInfra") GetCards getCards) implements QueryCreditCard {

    @Override
    public List<Card> getCards(String id) {
        return getCards.getCards(id);
    }
}
