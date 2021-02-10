package ru.advantum.solidinaction.services.kpi.calculation;

import io.vavr.Tuple2;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.Random;

@Component
public class Kpi03Calculator implements KpiCalculator {
    @Override
    public AbstractMap.SimpleEntry<String, BigDecimal> calculate() {
        return new AbstractMap.SimpleEntry<>("kpi03", BigDecimal.valueOf(new Random().nextDouble()));
    }
}
