package skyproCourseWorkTwo.CourseWorkOctober;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService){
        this.questionService=questionService;
    }
    @GetMapping()
      public Collection<Question>getQuestions(){
        return  questionService.getAll();

      }
      @GetMapping(value = "/add")
      public  Question addQuestion(@RequestParam("question")String question,@RequestParam("answer")String answer){
          return questionService.add(question,answer);
      }
    @GetMapping(value = "/remove")
    public  Question removeQuestion(@RequestParam("question")String question,@RequestParam("answer")String answer){
        return questionService.remove(new Question(question,answer));


}}




