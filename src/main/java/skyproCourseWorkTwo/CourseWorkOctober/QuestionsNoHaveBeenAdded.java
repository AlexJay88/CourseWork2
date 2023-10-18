package skyproCourseWorkTwo.CourseWorkOctober;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class QuestionsNoHaveBeenAdded extends RuntimeException {
    public QuestionsNoHaveBeenAdded(String message) {
        super("Вопросы не были добавлены");
    }
}


