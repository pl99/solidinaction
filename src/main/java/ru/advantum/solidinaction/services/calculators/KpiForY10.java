package ru.advantum.solidinaction.services.calculators;

import org.springframework.beans.factory.annotation.Autowired;
import ru.advantum.solidinaction.services.KpiCalculationService;

public interface  KpiForY10 extends KpiCalcRegister{
    default String getRetailer() {
        return "y10";
    }

    @Override
    @Autowired
    default void register(KpiCalculationService service){
        service.register(getRetailer(), (KpiCalculatorInterface) this);
    }


}
