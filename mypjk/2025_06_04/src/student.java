public class student {
    private String name;
    private int score;

    public student() {
    }

    @Override
    public String toString() {
        return  name+"(" +score+ "分)";
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
