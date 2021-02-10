package ru.advantum.solidinaction.services.kpi.calculation;

import java.math.BigDecimal;
import java.util.AbstractMap;

public interface KpiCalculator {
    AbstractMap.SimpleEntry<String, BigDecimal> calculate();
}
