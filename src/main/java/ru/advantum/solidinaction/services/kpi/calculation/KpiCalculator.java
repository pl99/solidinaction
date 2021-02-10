package ru.advantum.solidinaction.services.kpi.calculation;

import io.vavr.Tuple2;

import java.math.BigDecimal;
import java.util.AbstractMap;

public interface KpiCalculator {

    AbstractMap.SimpleEntry<String, BigDecimal> calculate();
}
