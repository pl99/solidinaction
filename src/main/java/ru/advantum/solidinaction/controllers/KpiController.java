package ru.advantum.solidinaction.controllers;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.advantum.solidinaction.services.KpiCalculationImpl;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("kpi-calculations")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class KpiController {
    KpiCalculationImpl service;

    @PostMapping("{retailer}")
    public Map<String, BigDecimal> calculateKpi(@PathVariable String retailer){
        return service.calculateKpi(retailer);
    }
}
