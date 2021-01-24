package ru.advantum.solidinaction.controllers;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.advantum.solidinaction.services.RoutingService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("routing")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class RoutingController {

    RoutingService service;

    @PostMapping("{retailer}")
    public ResponseEntity<Map<String, String>> doRouting(@PathVariable String retailer) {
        try {
            return new ResponseEntity<>(service.doRoute(retailer), HttpStatus.OK);

        }catch (IllegalArgumentException e){
            Map<String, String> error = new HashMap<>();
            error.put("result", e.getMessage());
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
