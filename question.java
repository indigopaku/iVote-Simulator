package iVoteSimulator;

import java.util.ArrayList;

public interface Question {
    public String getQuestion(); 
    public void setQuestion(String question);
    public void setAnswer(ArrayList<String> answer);
    public ArrayList<String> getAnswer();
    public boolean isMultiChoice();
}
