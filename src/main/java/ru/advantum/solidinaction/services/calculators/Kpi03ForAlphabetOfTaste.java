package ru.advantum.solidinaction.services.calculators;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Kpi03ForAlphabetOfTaste implements KpiCalculatorInterface{
    @Override
    public void calculate() {
      log.info("рассчитываем Kpi03 для {}", getClass().getSimpleName());
    }

    @Override
    public String getRetailer() {
        return "testyalphabet";
    }

}
