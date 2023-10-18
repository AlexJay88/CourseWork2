package skyproCourseWorkTwo.CourseWorkOctober;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class QuestionNotFoundException extends RuntimeException {
    public QuestionNotFoundException(String message) {
        super("вопрос не найден");
    }
}

