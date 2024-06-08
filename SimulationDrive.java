import java.util.Random;
import java.util.ArrayList;

// Main class to drive the simulation
public class SimulationDriver {

    private static Student[] students;
    private static Question question;
    private static Random random = new Random();

    public static void main(String[] args) {

        students = generateStudents();

        int type = random.nextInt(2);
        if (type == 0) {
            question = new MultipleChoiceQuestion();
            generateMCAnswers();
        } else {
            question = new SingleChoiceQuestion();
            generateSCAnswers();
        }

        VotingService vote = new VotingService(students, question);
    }

    private static Student[] generateStudents() {
        int numStudents = 30;
        Student[] students = new Student[numStudents];
        ArrayList<Integer> studentIDs = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            int ID = random.nextInt(8999) + 1000;
            while (studentIDs.contains(ID))
                ID = random.nextInt(8999) + 1000;

            studentIDs.add(ID);
            students[i] = new Student();
            students[i].setID(ID);
        }
        return students;
    }

    private static void generateMCAnswers() {
        String[] answers = {"A", "B", "C", "D"};
        question.setQuestion("Sample Question #1: Choose A, B, C or D");
        int choice = random.nextInt(4);
        question.setAnswer(answers[choice]);

        for (Student student : students) {
            choice = random.nextInt(4);
            student.setAnswer(answers[choice]);
        }
    }

    private static void generateSCAnswers() {
        question.setQuestion("Sample Question #2: Choose True or False");
        question.setAnswer("True");

        for (Student student : students) {
            int choice = random.nextInt(2);
            student.setAnswer(choice == 0 ? "True" : "False");
        }
    }
}
