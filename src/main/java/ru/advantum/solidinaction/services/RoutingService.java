package ru.advantum.solidinaction.services;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import ru.advantum.solidinaction.services.routing.AlphabetOfTaste;
import ru.advantum.solidinaction.services.routing.Y10group;

import java.util.HashMap;
import java.util.Map;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class RoutingService {

    AlphabetOfTaste alphabetOfTaste;
    Y10group y10group;

    public Map<String, String> doRoute(String retailer) {
        Map<String, String> route;
        switch (retailer) {
            case "testyalphabet":
                route = alphabetOfTaste.doRoute();
                break;
            case "y10":
                route = y10group.doRoute();
                break;
            default:
                throw new IllegalArgumentException("Unknown retailer!");

        }
        return route;
    }
}
