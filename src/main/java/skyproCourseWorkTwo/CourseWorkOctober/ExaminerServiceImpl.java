package skyproCourseWorkTwo.CourseWorkOctober;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService{
     Random random;
    private final QuestionService questionService;

    public  ExaminerServiceImpl(QuestionService questionService){
        this.questionService=questionService;
    }
    @Override
   public Collection<Question>getQuestions(int amount){

        if (questionService.getAll().size()<amount){
            throw new NumberOfQuestionsExceed("Превышено количество вопросов");
        }
        Set<Question>listQuestions=new HashSet<>(Set.of());

        while (listQuestions.size()<amount){
          Question q =questionService.getRandomQuestion();
          listQuestions.add(q);
        }
        return listQuestions;



}}

