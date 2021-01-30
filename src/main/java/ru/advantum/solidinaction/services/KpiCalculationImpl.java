package ru.advantum.solidinaction.services;


import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.advantum.solidinaction.services.calculators.KpiCalculatorInterface;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Slf4j
public class KpiCalculationImpl implements KpiCalculation {

    Map<String, List<KpiCalculatorInterface>> calculators = new HashMap<>();

    @Override
    public void register(String retailer, KpiCalculatorInterface calculator) {
        List<KpiCalculatorInterface> kpiCalculatorInterfaces = calculators
                .computeIfAbsent(retailer, kpiCalcs -> new ArrayList<>());
        kpiCalculatorInterfaces.add(calculator);
        calculators.forEach((key, value) -> log.info("{} -> {}", key, value.size()));
    }

    @Override
    public Map<String, BigDecimal> calculateKpi(String retailer) {
        List<KpiCalculatorInterface> calculatorInterfaces = calculators.get(retailer);
        if (null == calculatorInterfaces) {
            throw new IllegalArgumentException("Ни одного калькулятора для " + retailer + " не реализовано!");
        }
        calculatorInterfaces.forEach(KpiCalculatorInterface::calculate);
        Map<String, BigDecimal> kpiMap = new HashMap<>();
        kpiMap.put("", BigDecimal.ONE);
        return kpiMap;
    }
}
