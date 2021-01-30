package ru.advantum.solidinaction.services.calculators;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Kpi01ForAlphabetOfTaste implements KpiCalculatorInterface{
    @Override
    public void calculate() {
      log.info("рассчитываем Kpi01 для {}", getClass().getSimpleName());
    }

    @Override
    public String getRetailer() {
        return "testyalphabet";
    }
}
