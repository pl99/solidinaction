package ru.advantum.solidinaction.services.calculators;

import org.springframework.beans.factory.annotation.Autowired;
import ru.advantum.solidinaction.services.KpiCalculationService;

public interface KpiForAlphabetOfTaste extends KpiCalcRegister{
    default String getRetailer() {
        return "testyalphabet";
    }

    @Override
    @Autowired
    default void register(KpiCalculationService service){
        service.register(getRetailer(), (KpiCalculatorInterface) this);
    }


}
