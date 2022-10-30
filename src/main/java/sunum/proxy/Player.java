package sunum.proxy;

public class Player implements PlayerInt{

    String name;
    String gender;
    int score;

    public Player(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
