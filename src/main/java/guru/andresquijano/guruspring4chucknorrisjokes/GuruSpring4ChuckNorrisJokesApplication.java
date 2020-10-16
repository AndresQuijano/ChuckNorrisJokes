package guru.andresquijano.guruspring4chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class GuruSpring4ChuckNorrisJokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuruSpring4ChuckNorrisJokesApplication.class, args);
    }

}
