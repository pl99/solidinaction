package ru.advantum.solidinaction.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RoutingService {

    public Map<String, String> doRoute(){
        Map<String, String> result = new HashMap<>();
        /***
         * НЕКАЯ СЛОЖНАЯ ЛОГИКА
         */
        result.put("result", "Маршрут рассчитан");
        return result;
    }
}
