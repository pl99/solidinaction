package ru.advantum.solidinaction.services.routing;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Dixie implements RouteCalculator {
    @Override
    public Map<String, String> doRoute() {
        Map<String, String> res = new HashMap<>();
        res.put("result", "маршрут для Дикси");
        return res;
    }
}
