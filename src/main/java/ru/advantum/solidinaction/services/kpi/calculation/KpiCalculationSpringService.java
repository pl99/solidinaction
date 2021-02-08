package ru.advantum.solidinaction.services.kpi.calculation;

import io.vavr.Tuple2;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class KpiCalculationSpringService {

    List<KpiCalculator> calculators;

    public Map<String, BigDecimal> calculateKpi() {
        Map<String, BigDecimal> result = new TreeMap<>();
        for (KpiCalculator it : calculators) {
            Tuple2<String, BigDecimal> kpi = it.calculate();
            result.put(kpi._1, kpi._2());
        }
        return result;
    }
}
