package ru.advantum.solidinaction.services.kpi.calculation;

import io.vavr.Tuple2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class KpiCalculationSpringService {

    private final List<KpiCalculator> calculators;

    @Autowired
    public KpiCalculationSpringService(List<KpiCalculator> calculators) {
        this.calculators = Collections.unmodifiableList(calculators);
    }

    public Map<String, BigDecimal> calculateKpi() {
        Map<String, BigDecimal> result = new TreeMap<>();
        for (KpiCalculator it : calculators) {
            Tuple2<String, BigDecimal> kpi = it.calculate();
            result.put(kpi._1, kpi._2());
        }
        return result;
    }
}
