package aluczynska.quiz.frontend;

import lombok.Data;

@Data
public class GameOptions {
    private int numberOfQuestions = 1;
    private Difficulty difficulty;
    private int categoryId;
}