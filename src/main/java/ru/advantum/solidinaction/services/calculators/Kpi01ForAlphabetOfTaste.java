package ru.advantum.solidinaction.services.calculators;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.AbstractMap;

@Component
@Slf4j
public class Kpi01ForAlphabetOfTaste  implements KpiCalculatorInterface, KpiForAlphabetOfTaste{
    @Override
    public AbstractMap.SimpleEntry<String, BigDecimal> calculate() {
      log.info("рассчитываем Kpi01 для {}", getClass().getSimpleName());
        return
                new AbstractMap.SimpleEntry<>("Kpi01", BigDecimal.valueOf(Math.random()));
    }

    @Override
    public String getName() {
        return "Kpi01";
    }
}
