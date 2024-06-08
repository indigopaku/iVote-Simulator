// Student class with unique ID and submission answer
public class Student {
    private int uniqueID;
    private String answer;

    public Student() {
        this.uniqueID = 1;
        this.answer = "N/A";
    }

    public void setID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getID() {
        return uniqueID;
    }

    public String getAnswer() {
        return answer;
    }
}
