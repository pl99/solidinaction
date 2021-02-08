package ru.advantum.solidinaction.services.kpi.calculation;

import io.vavr.Tuple2;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Random;

@Component
public class Kpi01Calculator implements KpiCalculator {
    @Override
    public Tuple2<String, BigDecimal> calculate() {
        return new Tuple2<>("kpi01", BigDecimal.valueOf(new Random().nextDouble()));
    }
}
