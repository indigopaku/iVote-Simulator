package iVoteSimulator;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class VotingService {

    private Student[] students;
    private Question question;
    private Map<String, Integer> answerCounts;

    public VotingService(Student[] students, Question question) {
        this.students = students;
        this.question = question;
        this.answerCounts = new HashMap<>();
        countAnswers();
        displayStats();
    }

    private void countAnswers() {
        for (Student student : students) {
            String answer = student.getAnswer();
            answerCounts.put(answer, answerCounts.getOrDefault(answer, 0) + 1);
        }
    }

    public void displayStats() {
        System.out.println("Voting Service");
        System.out.println("-----------------");
        System.out.println(question.getQuestionType());
        System.out.println(students.length + " students voted\n");

        System.out.println("Results");
        System.out.println("-----------------");

        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        int totalVotes = students.length;

        for (String option : question.getAnswerType().split(",")) {
            int count = answerCounts.getOrDefault(option, 0);
            double percentage = (double) count / totalVotes;
            System.out.println(option + ": " + count + "    " + percentFormat.format(percentage));
        }

        System.out.println("Correct answer is " + question.getAnswerType());
    }
}
