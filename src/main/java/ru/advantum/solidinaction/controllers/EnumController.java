package ru.advantum.solidinaction.controllers;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.advantum.solidinaction.values.EnumStorage;
import ru.advantum.solidinaction.values.TranslatableEnum;
import ru.advantum.solidinaction.values.TranslatableEnumDto;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("enums")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Slf4j
public class EnumController {

    EnumStorage storage;



    @GetMapping
    public Map<String, List<TranslatableEnumDto>> getEnums(){
        return storage.getEnumMap();
    }
}
