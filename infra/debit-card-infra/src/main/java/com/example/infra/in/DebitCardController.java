package com.example.infra.in;

import com.example.domain.Card;
import com.example.ports.in.QueryDebitCard;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/debit-card")
record DebitCardController(QueryDebitCard queryDebitCard) {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Card>> getDebitCards(@RequestParam("id") final String id) {
        return ResponseEntity.ok(queryDebitCard.getCards(id));
    }

}
