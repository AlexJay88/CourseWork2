package skyproCourseWorkTwo.CourseWorkOctober;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaQuestionServiceTest {
    private QuestionService out = new JavaQuestionService();
    private final List<Question> list = new ArrayList() {

        {
            add(new Question("Какое самое быстрое наземное животное?", "Гепард"));

            add(new Question("Сколько планет в нашей Солнечной системе?", "Восемь"));


        }
    };

    @Test
    public void shouldCorrectlyAdd() {
        Question expected = list.get(1);
        Question actual = out.add(list.get(1));
        Assertions.assertEquals(expected, actual);
        assertTrue(out.getAll().contains(expected));

    }

    @Test
    public void shouldCorrectlyRemove() {
        out.add(list.get(0));
        out.add(list.get(1));
        Question expected = list.get(0);
        Question actual = out.remove(list.get(0));
        Assertions.assertEquals(expected, actual);
        assertFalse(out.getAll().contains(expected));

    }

    @Test
    public void shouldReturnAllQuestions() {
        Set<Question> expected = new HashSet<>(Set.of(list.get(0), list.get(1)));
        out.add(list.get(0));
        out.add(list.get(1));
        Set<Question> actual = (Set<Question>) out.getAll();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRandomQuestion() {
        out.add(list.get(0));
        out.add(list.get(1));
        boolean actual = list.contains(out.getRandomQuestion());
        assertTrue(actual);
        Question expected = list.get(0);
        assertTrue(out.getAll().contains(expected));


    }
}







