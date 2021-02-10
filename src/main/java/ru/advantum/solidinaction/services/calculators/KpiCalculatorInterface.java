package ru.advantum.solidinaction.services.calculators;

import java.math.BigDecimal;
import java.util.AbstractMap;

public interface KpiCalculatorInterface {
    AbstractMap.SimpleEntry<String, BigDecimal> calculate();
    String getName();
}
