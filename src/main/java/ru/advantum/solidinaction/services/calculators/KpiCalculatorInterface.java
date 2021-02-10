package ru.advantum.solidinaction.services.calculators;

import org.springframework.beans.factory.annotation.Autowired;
import ru.advantum.solidinaction.services.KpiCalculation;
import ru.advantum.solidinaction.services.KpiCalculationImpl;

import java.math.BigDecimal;
import java.util.AbstractMap;

public interface KpiCalculatorInterface {
    AbstractMap.SimpleEntry<String, BigDecimal> calculate();
    String getName();
}
