package ru.advantum.solidinaction.services;

import ru.advantum.solidinaction.services.calculators.KpiCalculatorInterface;

import java.math.BigDecimal;
import java.util.Map;

public interface KpiCalculation {
    Map<String, BigDecimal> calculateKpi(String retailer);

    void register(String retailer, KpiCalculatorInterface calculator);
}
