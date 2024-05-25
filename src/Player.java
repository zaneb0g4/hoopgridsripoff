public class Player {
    private String name;
    private Team[] teams;
    private String headshot;

    public Player (String name, Team[] teams, String headshot){
        this.name = name;
        this.teams = teams;
        this.headshot = headshot;
    }

    public String getName(){
        return this.name;
    }

    public String getHeadshot() {
        return headshot;
    }
}
