package com.example.infra.out;

import com.example.domain.Card;
import com.example.ports.out.GetCards;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("GetCreditCardInfra")
public class GetCreditCardInfra implements GetCards {
    @Override
    public List<Card> getCards(String id) {
        return List.of();
    }
}
