package ru.advantum.solidinaction.values;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Getter
public enum VehicleBodyType implements TranslatableEnum {
    REF("РЕФ"),
    ISO("ИЗО"),
    MULTI("МУЛЬТИРЕФ"),
    AWNING("ТЕНТ");

    String translation;
}