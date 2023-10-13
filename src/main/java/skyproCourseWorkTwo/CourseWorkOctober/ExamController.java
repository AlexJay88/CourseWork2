package skyproCourseWorkTwo.CourseWorkOctober;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping()
public class ExamController {
    private final ExaminerService examinerService;
     public ExamController(ExaminerService examinerService){
         this.examinerService=examinerService;
     }
     @GetMapping(value = "/get/{amount}")
     @ResponseBody
     public Collection<Question>randomQuestions(@PathVariable("amount")Integer amount){
         return examinerService.getQuestions(amount);
     }
}


