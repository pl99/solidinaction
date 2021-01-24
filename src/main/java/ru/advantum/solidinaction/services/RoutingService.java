package ru.advantum.solidinaction.services;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import ru.advantum.solidinaction.services.routing.AlphabetOfTaste;
import ru.advantum.solidinaction.services.routing.RouteCalculator;
import ru.advantum.solidinaction.services.routing.Y10group;

import java.util.HashMap;
import java.util.Map;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class RoutingService {

    Map<String, RouteCalculator> calculatorMap;

    public Map<String, String> doRoute(String retailer) {
        RouteCalculator routeCalculator = calculatorMap.get(retailer);
        if(null == routeCalculator) {
            throw new IllegalArgumentException("Unknown retailer!");
        }
        return routeCalculator.doRoute();
    }
}
