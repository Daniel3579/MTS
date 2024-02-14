package HW_6.Class;

import HW_6.Enum.AnimalType;
import HW_6.Interface.CreateAnimalService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CreateAnimalServiceBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof CreateAnimalService) {
            // Animal type initialization
            AnimalType[] types = AnimalType.values();
            ((CreateAnimalService) bean).setAnimalType();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
