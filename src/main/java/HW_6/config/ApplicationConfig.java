package HW_6.config;

import HW_6.helper.CreateAnimalServiceBeanPostProcessor;
import HW_6.repository.AnimalRepository;
import HW_6.repository.AnimalRepositoryImpl;
import HW_6.service.CreateAnimalService;
import HW_6.service.impl.CreateAnimalServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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
