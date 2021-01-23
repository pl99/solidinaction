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

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("routing")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class RoutingController {


    @PostMapping("")
    public ResponseEntity<Map<String, String>> doRouting() {
            Map<String, String> ok = new HashMap<>();
            ok.put("result", "Ok");
            return new ResponseEntity<>(ok, HttpStatus.OK);
    }
}
