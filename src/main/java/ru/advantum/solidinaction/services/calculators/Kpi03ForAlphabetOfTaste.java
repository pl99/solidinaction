package ru.advantum.solidinaction.services.calculators;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.AbstractMap;

@Component
@Slf4j
public class Kpi03ForAlphabetOfTaste extends KpiForAlphabetOfTaste {
    @Override
    public AbstractMap.SimpleEntry<String, BigDecimal> calculate() {
        log.info("рассчитываем Kpi03 для {}", getClass().getSimpleName());
        return
                new AbstractMap.SimpleEntry<>("Kpi03", BigDecimal.valueOf(Math.random()));
    }
}
