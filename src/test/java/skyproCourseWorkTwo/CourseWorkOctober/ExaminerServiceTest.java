package skyproCourseWorkTwo.CourseWorkOctober;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.BDDMockito.given;


@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {
    @Mock
    private JavaQuestionService questionServiceMock;
    @InjectMocks
    private ExaminerServiceImpl examinerService;
    private final List<Question> list = new ArrayList<>() {{
        add(new Question("Какое самое быстрое наземное животное?", "Гепард"));
        add(new Question("Сколько планет в нашей Солнечной системе?", "Восемь"));
    }};

    @Test
    public void shouldReturnQuestions() {

        given(questionServiceMock.getRandomQuestion()).willReturn(list.get(0));
        given(questionServiceMock.getAll()).willReturn(list);
        Collection<Question> expected = new HashSet<>(Set.of(list.get(0)));
        Collection<Question> actual = new HashSet<>(examinerService.getQuestions(1));
        Assertions.assertEquals(expected, actual);
    }

}