import javax.swing.*;
import java.awt.*;

public class Header extends JPanel {

    public Header(){
        setPreferredSize(new Dimension(100, 100));
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillOval(0,0,99,99);
    }

    public static void main(String[] args) {
        String[] allTeams = new String[]{"Atlanta Hawks", "Boston Celtics", "Brooklyn Nets", "Charlotte Hornets",
                "Chicago Bulls", "Cleveland Cavaliers", "Dallas Mavericks", "Denver Nuggets", "Detroit Pistons",
                "Golden State Warriors", "Houston Rockets", "Indiana Pacers", "Los Angeles Clippers", "Los Angeles Lakers",
                "Memphis Grizzlies", "Miami Heat", "Milwaukee Bucks", "Minnesota Timberwolves", "New Orleans Pelicans",
                "New York Knicks", "Oklahoma City Thunder", "Orlando Magic", "Philadelphia 76ers", "Phoenix Suns",
                "Portland Trail Blazers", "Sacramento Kings", "San Antonio Spurs", "Toronto Raptors", "Utah Jazz",
                "Washington Wizards"};

        String team1 = allTeams[(int) (Math.random() * 30)];
        String team2 = allTeams[(int) (Math.random() * 30)];
        String team3 = allTeams[(int) (Math.random() * 30)];
        String team4 = allTeams[(int) (Math.random() * 30)];
        String team5 = allTeams[(int) (Math.random() * 30)];
        String team6 = allTeams[(int) (Math.random() * 30)];
        while (team1.equals(team2) || team1.equals(team3) || team1.equals(team4) || team1.equals(team5) ||
                team1.equals(team6) || team2.equals(team3) || team2.equals(team4) || team2.equals(team5) ||
                team2.equals(team6) || team3.equals(team4) || team3.equals(team5) || team3.equals(team6) ||
                team4.equals(team5) || team4.equals(team6) || team5.equals(team6)) {
            team1 = allTeams[(int) (Math.random() * 30)];
            team2 = allTeams[(int) (Math.random() * 30)];
            team3 = allTeams[(int) (Math.random() * 30)];
            team4 = allTeams[(int) (Math.random() * 30)];
            team5 = allTeams[(int) (Math.random() * 30)];
            team6 = allTeams[(int) (Math.random() * 30)];
        }
    }
}
