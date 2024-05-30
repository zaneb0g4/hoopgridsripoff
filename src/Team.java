public class Team {
    private String id;
    public Team(String id){
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public String idToName(String id){
        if(id.equals("ATL")){
            return "Atlanta Hawks";
        }
        if(id.equals("BOS")){
            return "Boston Celtics";
        }
        if(id.equals("BKN")){
            return "Brooklyn Nets";
        }
        if(id.equals("CHA")){
            return "Charlotte Hornets";
        }
        if(id.equals("CHI")){
            return "Chicago Bulls";
        }
        if(id.equals("CLE")){
            return "Cleveland Cavaliers";
        }
        if(id.equals("DAL")){
            return "Dallas Mavericks";
        }
        if(id.equals("DEN")){
            return "Denver Nuggets";
        }
        if(id.equals("DET")){
            return "Detroit Pistons";
        }
        if(id.equals("GSW")){
            return "Golden State Warriors";
        }
        if(id.equals("HOU")){
            return "Houston Rockets";
        }
        if(id.equals("IND")){
            return "Indiana Pacers";
        }
        if(id.equals("LAC")){
            return "Los Angeles Clippers";
        }
        if(id.equals("LAL")){
            return "Los Angeles Lakers";
        }
        if(id.equals("MEM")){
            return "Memphis Grizzlies";
        }
        if(id.equals("MIA")){
            return "Miami Heat";
        }
        if(id.equals("MIL")){
            return "Milwaukee Bucks";
        }
        if(id.equals("MIN")){
            return "Minnesota Timberwolves";
        }
        if(id.equals("NOH")){
            return "New Orleans Pelicans";
        }
        if(id.equals("NYK")){
            return "New York Knicks";
        }
        if(id.equals("OKC")){
            return "Oklahoma City Thunder";
        }
        if(id.equals("ORL")){
            return "Orlando Magic";
        }
        if(id.equals("PHI")){
            return "Philadelphia 76ers";
        }
        if(id.equals("PHO")){
            return "Phoenix Suns";
        }
        if(id.equals("POR")){
            return "Portland Trail Blazers";
        }
        if(id.equals("SAC")){
            return "Sacramento Kings";
        }
        if(id.equals("SAS")){
            return "San Antonio Spurs";
        }
        if(id.equals("TOR")){
            return "Toronto Raptors";
        }
        if(id.equals("UTA")){
            return "Utah Jazz";
        }
        if(id.equals("WAS")){
            return "Washington Wizards";
        }
        return null;
    }
}
