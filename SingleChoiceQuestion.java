package iVoteSimulator;

public class SingleChoiceQuestion implements Question {

    private String question;
    private String answer;

    @Override
    public String getQuestionType() {
        return question;
    }

    @Override
    public String getAnswerType() {
        return answer;
    }

    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean multipleChoice() {
        return false;
    }
}
