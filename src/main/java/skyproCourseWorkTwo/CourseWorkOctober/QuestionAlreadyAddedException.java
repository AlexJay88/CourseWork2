package skyproCourseWorkTwo.CourseWorkOctober;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class QuestionAlreadyAddedException extends RuntimeException {
    public QuestionAlreadyAddedException(String message) {
        super("Этот вопрос уже был добавлен");
    }
}



