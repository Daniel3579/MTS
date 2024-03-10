package ru.mts.config;

import ru.mts.service.CreateAnimalService;
import ru.mts.service.impl.CreateAnimalServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.mts.factory.AnimalFactory;

@Configuration
public class SpringConfig {
    @Bean
    public static CreateAnimalBeanPostProcessor addPostProcessorImpl() {
        return new CreateAnimalBeanPostProcessor();
    }

    @Bean()
    @Scope("prototype")
    public CreateAnimalService createAnimalService(AnimalFactory animalFactory) {
        return new CreateAnimalServiceImpl(animalFactory);
    }
}
