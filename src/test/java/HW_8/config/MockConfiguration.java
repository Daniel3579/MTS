package HW_8.config;

import HW_8.animal.impl.Shark;
import HW_8.service.impl.CreateAnimalServiceImpl;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import HW_8.animal.Animal;

import java.time.LocalDate;

@Profile("test")
@TestConfiguration
public class MockConfiguration {
    @Bean
    @Primary
    public CreateAnimalServiceImpl createAnimalServiceMock() {
        CreateAnimalServiceImpl impl = Mockito.mock(CreateAnimalServiceImpl.class);
        Animal[] animals = {
                new Shark("S", 0.1, LocalDate.of(2020, 1, 8)),
                new Shark("S", 0.1, LocalDate.of(2020, 1, 8))};
        Mockito.when(impl.createUniqueAnimals()).thenReturn(animals);
        return impl;
    }
}
