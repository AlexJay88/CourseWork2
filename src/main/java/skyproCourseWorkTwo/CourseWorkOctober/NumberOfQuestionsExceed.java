package skyproCourseWorkTwo.CourseWorkOctober;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NumberOfQuestionsExceed extends RuntimeException{
    public NumberOfQuestionsExceed(String message){
        super("Превышено количество вопросов");
    }
}


