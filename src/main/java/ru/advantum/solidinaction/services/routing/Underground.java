package ru.advantum.solidinaction.services.routing;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Underground implements RouteCalculator{
    @Override
    public Map<String, String> doRoute(){
        Map<String, String> result = new HashMap<>();
        /***
         * НЕКАЯ СЛОЖНАЯ ЛОГИКА
         */
        result.put("result", "Маршрут дла компании Underground рассчитан");
        return result;
    }
}