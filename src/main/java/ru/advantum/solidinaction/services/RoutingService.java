package ru.advantum.solidinaction.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.advantum.solidinaction.services.routing.RouteCalculator;

import java.util.Map;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RoutingService {

    Map<String, RouteCalculator> calculatorMap;

    @Autowired
    public RoutingService(Map<String, RouteCalculator> calculatorMap) {
        this.calculatorMap = calculatorMap;
    }

    public Map<String, String> doRoute(String retailer) {
        RouteCalculator routeCalculator = calculatorMap.get(retailer);
        if(null == routeCalculator) {
            throw new IllegalArgumentException("Unknown retailer!");
        }
        return routeCalculator.doRoute();
    }
}
