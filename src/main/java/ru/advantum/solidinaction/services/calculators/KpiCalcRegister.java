package ru.advantum.solidinaction.services.calculators;

import org.springframework.beans.factory.annotation.Autowired;
import ru.advantum.solidinaction.services.KpiCalculation;

public interface KpiCalcRegister {
    void register(KpiCalculation service);
}
