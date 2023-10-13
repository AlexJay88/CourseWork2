package skyproCourseWorkTwo.CourseWorkOctober;

public class QuestionNotFoundException extends RuntimeException{
    public QuestionNotFoundException(String message){
        super("вопрос не найден");
    }
}
