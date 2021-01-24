package ru.advantum.solidinaction.services;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.advantum.solidinaction.services.routing.AlphabetOfTaste;

import java.util.HashMap;
import java.util.Map;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class RoutingService {

    AlphabetOfTaste alphabetOfTaste;

    public Map<String, String> doRoute(){

        return alphabetOfTaste.doRoute();
    }
}
