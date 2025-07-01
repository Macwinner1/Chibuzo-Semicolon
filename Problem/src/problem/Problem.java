package Problem;

public class Problem {
    String  name;
    ProblemType problemType;
    boolean status;
    public Problem(String name, ProblemType problemType) {
        this.name = name;
        this.ProblemType = problemType;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
       return status;
    }
}
