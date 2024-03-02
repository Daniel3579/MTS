package ru.mts.fintech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.mts.fintech.helper.CreateAnimalServiceBeanPostProcessor;
import ru.mts.fintech.repository.AnimalRepository;
import ru.mts.fintech.repository.AnimalRepositoryImpl;
import ru.mts.fintech.service.CreateAnimalService;
import ru.mts.fintech.service.impl.CreateAnimalServiceImpl;

@Configuration
public class ApplicationConfig {
    @Bean
    @Scope("prototype")
    public CreateAnimalService createAnimalService() {
        return new CreateAnimalServiceImpl();
    }

    @Bean
    public AnimalRepository animalRepository() {
        return new AnimalRepositoryImpl();
    }

    @Bean
    public static CreateAnimalServiceBeanPostProcessor createAnimalServiceBeanPostProcessor() {
        return new CreateAnimalServiceBeanPostProcessor();
    }
}
