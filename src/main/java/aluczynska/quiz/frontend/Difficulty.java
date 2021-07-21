package aluczynska.quiz.frontend;

import lombok.Data;

public enum Difficulty {
    EASY,
    MEDIUM,
    HARD;

    @Data
    public class GameOptions {
        private int numberOfQuestions = 5;
        private Difficulty difficulty;
    }
}