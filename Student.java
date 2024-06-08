package iVoteSimulator;

public class Student {
    private int uniqueID;
    private String answer;

    public Student(int uniqueID) {
        this.uniqueID = uniqueID;
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
