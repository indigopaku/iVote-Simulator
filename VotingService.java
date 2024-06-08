import java.text.NumberFormat;

// Get scores and display the results
public class VotingService {

    private Student[] students;
    private Question question;
    private int A = 0, B = 0, C = 0, D = 0, r = 0, w = 0;

    // VotingService constructor with student & question objects
    public VotingService(Student[] students, Question question) {
        this.students = students;
        this.question = question;
        counter(); // count answers
        displayStats(); // display results
    }

    public void counter() {
        if (question.multipleChoice()) {
            for (Student student : students) {
                String answer = student.getAnswer();
                if (answer.equals("A"))
                    A++;
                else if (answer.equals("B"))
                    B++;
                else if (answer.equals("C"))
                    C++;
                else if (answer.equals("D"))
                    D++;
            }
        } else {
            for (Student student : students) {
                String answer = student.getAnswer();
                if (answer.equals("True"))
                    r++;
                else if (answer.equals("False"))
                    w++;
            }
        }
    }

    public void displayStats() {
        System.out.println("Voting Service");
        System.out.println("-----------------");
        System.out.println(question.setQuestionType());
        System.out.println(students.length + " students voted\n");

        System.out.println("Results");
        System.out.println("-----------------");

        double percentage;
        NumberFormat percentFormat = NumberFormat.getPercentInstance();

        if (question.multipleChoice()) {
            percentage = ((double) A / students.length);
            System.out.println("A: " + A + "    " + percentFormat.format(percentage));
            percentage = ((double) B / students.length);
            System.out.println("B: " + B + "    " + percentFormat.format(percentage));
            percentage = ((double) C / students.length);
            System.out.println("C: " + C + "    " + percentFormat.format(percentage));
            percentage = ((double) D / students.length);
            System.out.println("D: " + D + "    " + percentFormat.format(percentage) + "\n");
        } else {
            percentage = ((double) r / students.length);
            System.out.println("1. True: " + r + "    " + percentFormat.format(percentage));
            percentage = ((double) w / students.length);
            System.out.println("2. False: " + w + "    " + percentFormat.format(percentage) + "\n");
        }

        System.out.println("Correct answer is " + question.setAnswerType());
    }
}
