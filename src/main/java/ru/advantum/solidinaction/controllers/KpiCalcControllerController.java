package ru.advantum.solidinaction.controllers;
/**
 * Kotin
 * 2021-02-07
 **/

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.advantum.solidinaction.services.kpi.calculation.KpiCalculationRegularService;
import ru.advantum.solidinaction.services.kpi.calculation.KpiCalculationSpringService;

import java.math.BigDecimal;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@RestController
@RequestMapping("kpi-calculations")
public class KpiCalcControllerController {
    KpiCalculationRegularService regularService;
    KpiCalculationSpringService springService;

    @PostMapping()
    public Map<String, BigDecimal> calculateKpi(){
        return springService.calculateKpi();
    }
}
