package Opgave4;

public class Main {
    void main() {
        Team homeTeam = new Team("Golden Eagles");
        Team awayTeam = new Team("Silver Wolves");

        homeTeam.addPlayer(new Player("Michael", 92));
        homeTeam.addPlayer(new Player("Emily", 73));
        homeTeam.addPlayer(new Player("David", 84));
        homeTeam.addPlayer(new Player("Sarah", 65));

        awayTeam.addPlayer(new Player("John", 79));
        awayTeam.addPlayer(new Player("Jessica", 68));
        awayTeam.addPlayer(new Player("Daniel", 90));
        awayTeam.addPlayer(new Player("Laura", 81));

        homeTeam.printTeam();
        awayTeam.printTeam();

        homeTeam.compete(awayTeam);
    }
}
