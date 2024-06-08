package iVoteSimulator;

import java.util.ArrayList;
// Question interface 
interface Question {
    String setQuestionType(); // Define whether multiple-choice or single-choice question
    String setAnswerType();   // Define answer
    boolean multipleChoice(); // Define whether multiple choice
    void setQuestion(String question); // Sets a question
    void setAnswer(String answer); // Sets an answer
}
