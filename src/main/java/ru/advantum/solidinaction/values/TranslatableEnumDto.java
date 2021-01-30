package ru.advantum.solidinaction.values;


import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TranslatableEnumDto {
    String value;
    String translation;

}
