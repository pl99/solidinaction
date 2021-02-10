package ru.advantum.solidinaction.services.kpi.calculation;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class KpiCalculationRegularService {

    Kpi01Calculator kpi01Calculator;
    Kpi02Calculator kpi02Calculator;
    Kpi03Calculator kpi03Calculator;

    @Autowired
    public KpiCalculationRegularService(Kpi01Calculator kpi01Calculator, Kpi02Calculator kpi02Calculator, Kpi03Calculator kpi03Calculator) {
        this.kpi01Calculator = kpi01Calculator;
        this.kpi02Calculator = kpi02Calculator;
        this.kpi03Calculator = kpi03Calculator;
    }

    public Map<String, BigDecimal> calculateKpi() {
        Map<String, BigDecimal> result = new HashMap<>();

        AbstractMap.SimpleEntry<String, BigDecimal> kpi01 = kpi01Calculator.calculate();
        result.put(kpi01.getKey(), kpi01.getValue());
        AbstractMap.SimpleEntry<String, BigDecimal> kpi02 = kpi02Calculator.calculate();
        result.put(kpi02.getKey(), kpi02.getValue());
        AbstractMap.SimpleEntry<String, BigDecimal> kpi03 = kpi03Calculator.calculate();
        result.put(kpi03.getKey(), kpi03.getValue());
        return result;
    }
}
