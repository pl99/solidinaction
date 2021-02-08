package ru.advantum.solidinaction.services.kpi.calculation;

import io.vavr.Tuple2;

import java.math.BigDecimal;

public interface KpiCalculator {

    Tuple2<String, BigDecimal> calculate();
}
