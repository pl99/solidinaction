package ru.advantum.solidinaction.services.kpi.calculation;

import io.vavr.Tuple2;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Random;

@Component("Kpi03")
public class Kpi03Calculator implements KpiCalculator {
    @Override
    public BigDecimal calculate() {
        return BigDecimal.valueOf(new Random().nextDouble());
    }
}