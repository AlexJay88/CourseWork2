package skyproCourseWorkTwo.CourseWorkOctober;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CourseWorkOctoberApplication {

@GetMapping
	public static void main(String[] args) {
	SpringApplication.run(CourseWorkOctoberApplication.class, args);
}



}
