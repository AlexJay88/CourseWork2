package skyproCourseWorkTwo.CourseWorkOctober;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService{
    private final Set<Question>questions=new HashSet<>(Set.of());
    Random random = new Random();

    @Override
    public Question add(String question, String answer) {
        Question q=new Question(question,answer);
        return add(q);

    }


    @Override
    public Question add(Question question) {
       if (checkIfContains(question))
           throw new QuestionAlreadyAddedException("Этот вопрос уже был добавлен");
       else
           questions.add(question);
       return question;
    }

    @Override
    public Question remove(Question question) {
        if (!checkIfContains(question))
        throw new QuestionNotFoundException("Этот вопрос не найден");
        else
            questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        if(questions.isEmpty())
            throw new QuestionsNoHaveBeenAdded("Вопросы не были добавлены");
        return Set.copyOf(questions);
    }

    @Override
    public Question getRandomQuestion() {
        int randomNumber=random.nextInt(questions.size());
        List<Question>list=new ArrayList<>(questions);
        return list.get(randomNumber);
    }
     private boolean checkIfContains(Question question){
        return questions.contains(question);
     }
    }



