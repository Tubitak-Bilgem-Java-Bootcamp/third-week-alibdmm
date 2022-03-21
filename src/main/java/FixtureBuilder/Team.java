package FixtureBuilder;

public class Team {
    private String teamName;
    private int Id;

    public Team(String teamName, int id) {
        this.teamName = teamName;
        Id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
