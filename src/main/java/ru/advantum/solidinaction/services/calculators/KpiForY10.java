package ru.advantum.solidinaction.services.calculators;

import org.springframework.beans.factory.annotation.Autowired;
import ru.advantum.solidinaction.services.KpiCalculation;

public interface  KpiForY10 extends KpiCalcRegister{
    default String getRetailer() {
        return "y10";
    }

    @Override
    @Autowired
    default void register(KpiCalculation service){
        service.register(getRetailer(), (KpiCalculatorInterface) this);
    }


}
