package HW_6;

import HW_6.dto.Animal;
import HW_6.repository.AnimalRepository;
import HW_6.repository.AnimalRepositoryImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("HW_6")
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        AnimalRepository animalRepository = context.getBean(AnimalRepositoryImpl.class);

        System.out.println("--> Вывод всех бинов, которые находятся в контексте ");
        for (Object o : context.getBeanDefinitionNames())
            if (!o.toString().contains("org."))
                System.out.println(o);

        System.out.println("\n--> Животные, которые родились в високосный год: ");
        for (String animal : animalRepository.findLeapYearNames()) {
            System.out.println(animal);
        }

        System.out.println("\n--> Животные, которые старше определенного возраста: ");
        for (Animal animal : animalRepository.findOlderAnimal(30)) {
            System.out.println(animal);
        }

        System.out.println("\n--> Дубликаты животных: ");
        animalRepository.printDuplicate();

        context.close();
    }
}