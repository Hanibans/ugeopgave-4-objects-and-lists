package Opgave4;

import java.util.ArrayList;

public class Team {
    String teamName;
    ArrayList<Player> players;

    Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    void addPlayer(Player p) {
        players.add(p);
        System.out.println(p.name + " is added to " + teamName);
    }

    double getAverageSkill() {
        if (players.size() == 0) {
            return 0;
        }

        int totalSkill = 0;
        for (Player p : players) {
            totalSkill = totalSkill + p.skillLevel;
        }
        return (double)totalSkill / players.size();
    }

    void printTeam() {
        System.out.println("\n=== " + teamName + " ===");
        System.out.println("Players:");
        for (Player p : players) {
            System.out.println("- " + p);
        }
        System.out.println("The average skill: " + getAverageSkill());
    }

    void compete(Team opponent) {
        System.out.println("\n=== " + teamName + " vs " + opponent.teamName + " ===");
        double mySkill = getAverageSkill();
        double opponentSkill = opponent.getAverageSkill();

        System.out.println(teamName + " skill: " + mySkill);
        System.out.println(opponent.teamName + " skill: " + opponentSkill);

        if (mySkill > opponentSkill) {
            System.out.println("Winner: " + teamName);
        } else if (opponentSkill > mySkill) {
            System.out.println("Winner: " + opponent.teamName);
        } else {
            System.out.println("Tied");
        }
    }
}
