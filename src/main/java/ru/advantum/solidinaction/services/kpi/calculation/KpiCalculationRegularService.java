package ru.advantum.solidinaction.services.kpi.calculation;


import io.vavr.Tuple2;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class KpiCalculationRegularService {

    Kpi01Calculator kpi01Calculator;
    Kpi02Calculator kpi02Calculator;
    Kpi03Calculator kpi03Calculator;
    public Map<String, BigDecimal> calculateKpi(){
        Map<String, BigDecimal> result = new HashMap<>();

        Tuple2<String, BigDecimal> kpi01 = kpi01Calculator.calculate();
        result.put(kpi01._1(), kpi01._2());
        Tuple2<String, BigDecimal> kpi02 = kpi02Calculator.calculate();
        result.put(kpi02._1(), kpi02._2());
        Tuple2<String, BigDecimal> kpi03 = kpi03Calculator.calculate();
        result.put(kpi03._1(), kpi03._2());
        return result;
    }
}
