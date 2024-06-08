package iVoteSimulator;

public interface Question {
    String getQuestionType();
    String getAnswerType();
    boolean multipleChoice();
    void setQuestion(String question);
    void setAnswer(String answer);
}
