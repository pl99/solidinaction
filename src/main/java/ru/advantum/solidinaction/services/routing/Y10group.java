package ru.advantum.solidinaction.services.routing;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component("Y10")
public class Y10group implements RouteCalculator{
    @Override
    public Map<String, String> doRoute(){
        Map<String, String> result = new HashMap<>();
        /***
         * НЕКАЯ СЛОЖНАЯ ЛОГИКА
         */
        result.put("result", "Маршрут дла группы компаний Y10 рассчитан");
        return result;
    }
}
