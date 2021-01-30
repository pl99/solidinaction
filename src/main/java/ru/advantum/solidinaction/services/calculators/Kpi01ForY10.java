package ru.advantum.solidinaction.services.calculators;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.AbstractMap;

@Component
@Slf4j
public class Kpi01ForY10 extends KpiForY10{
    @Override
    public AbstractMap.SimpleEntry<String, BigDecimal> calculate() {
      log.info("рассчитываем Kpi01 для {}", getClass().getSimpleName());
        return
                new AbstractMap.SimpleEntry<>("Kpi01", BigDecimal.valueOf(Math.random()));
    }
}
