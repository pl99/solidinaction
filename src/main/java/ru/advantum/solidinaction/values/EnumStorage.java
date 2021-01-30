package ru.advantum.solidinaction.values;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class EnumStorage {
    private Map<String, List<TranslatableEnumDto>> enumMap = new HashMap<>();


    @SneakyThrows
    @PostConstruct
    @SuppressWarnings("unchecked")
    public void scanAndFill() {
        ClassPathScanningCandidateComponentProvider scanner =
                new ClassPathScanningCandidateComponentProvider(false);
        scanner.addIncludeFilter(new AssignableTypeFilter(TranslatableEnum.class));
//        scanner.addIncludeFilter(new AnnotationTypeFilter(TranslatableEnumAnnotation.class));
        for (BeanDefinition beanDefinition : scanner
                .findCandidateComponents(ru.advantum.solidinaction.values.TranslatableEnum.class.getPackageName())) {
            Class<?> aClass = Class.forName(beanDefinition.getBeanClassName());
            List<TranslatableEnum> enumConstants = (List<TranslatableEnum>) Arrays.asList(aClass.getEnumConstants());
            List<TranslatableEnumDto> dtos = new ArrayList<>();
            for (TranslatableEnum it : enumConstants) {
                log.info("{}", it);
                dtos.add(TranslatableEnumDto.builder()
                        .value(it.toString())
                        .translation(it.getTranslation())
                        .build());
            }
            enumMap.put(aClass.getSimpleName(), dtos);
        }
        log.info("{}", enumMap);
    }

    public Map<String, List<TranslatableEnumDto>> getEnumMap() {
        return enumMap;
    }
}
