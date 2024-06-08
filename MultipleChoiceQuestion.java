// MultipleChoiceQuestion class implementing Question interface
public class MultipleChoiceQuestion implements Question {

    private String question;
    private String answer;


    public String setQuestionType() {
        return question;
    }


    public String setAnswerType() {
        return answer;
    } 


    public void setQuestion(String question) {
        this.question = question;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    } 

    public boolean multipleChoice() {
        return true;
    } 
}
