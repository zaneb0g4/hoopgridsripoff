public class Player {
    private String name;
    private Team[] teams;
    private Headshot headshot;

    public Player (String name, Team[] teams, Headshot headshot){
        this.name = name;
        this.teams = teams;
        this.headshot = headshot;
    }

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Headshot getHeadshot() {
        return headshot;
    }

    public Team[] getTeams() {
        return teams;
    }
}
