package com.example.infra.in;

import com.example.domain.Card;
import com.example.ports.in.QueryCreditCard;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/credit-card")
record CreditCardController(QueryCreditCard queryCreditCard) {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Card>> getCards(final String id) {
        return ResponseEntity.ok(queryCreditCard.getCards(id));
    }

}
