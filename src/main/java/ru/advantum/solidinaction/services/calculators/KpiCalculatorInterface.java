package ru.advantum.solidinaction.services.calculators;

import org.springframework.beans.factory.annotation.Autowired;
import ru.advantum.solidinaction.services.KpiCalculation;
import ru.advantum.solidinaction.services.KpiCalculationImpl;

public interface KpiCalculatorInterface {
    void calculate();
    String getRetailer();

    @Autowired
    default void register(KpiCalculation service){
        service.register(getRetailer(), this);
    }
}
