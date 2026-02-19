package Opgave4;

public class Player {
    String name;
    int skillLevel;

    Player(String name, int skillLevel) {
        this.name = name;
        this.skillLevel = skillLevel;
    }

    public String toString() {
        return name + " (skill: " + skillLevel + ")";
    }
}
