package ru.advantum.solidinaction.services.kpi.calculation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

@Service
public class KpiCalculationSpringService {

    private final Map<String, KpiCalculator> calculators;

    @Autowired
    public KpiCalculationSpringService(Map<String, KpiCalculator> calculators) {
        this.calculators = Collections.unmodifiableMap(calculators);
    }


    public Map<String, BigDecimal> calculateKpi() {
        Map<String, BigDecimal> result = new TreeMap<>();
        calculators.forEach((key, value) -> result.put(key, value.calculate()));
        return result;
    }
}
