import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        String[] allTeams = new String[]{"Atlanta Hawks","Boston Celtics","Brooklyn Nets","Charlotte Hornets",
                "Chicago Bulls","Cleveland Cavaliers","Dallas Mavericks","Denver Nuggets","Detroit Pistons",
                "Golden State Warriors","Houston Rockets","Indiana Pacers","Los Angeles Clippers","Los Angeles Lakers",
                "Memphis Grizzlies","Miami Heat","Milwaukee Bucks","Minnesota Timberwolves","New Orleans Pelicans",
                "New York Knicks","Oklahoma City Thunder","Orlando Magic","Philadelphia 76ers","Phoenix Suns",
                "Portland Trail Blazers","Sacramento Kings","San Antonio Spurs","Toronto Raptors","Utah Jazz",
                "Washington Wizards"};

        JFrame frame = new JFrame("Hoop Grids By ZB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        JPanel teamRow = new JPanel();
        frame.add(teamRow);

        teamRow.setLayout(new BoxLayout(teamRow, BoxLayout.X_AXIS));
        String team1 = allTeams[(int)(Math.random()*30)];
        String team2 = allTeams[(int)(Math.random()*30)];
        String team3 = allTeams[(int)(Math.random()*30)];
        while(team1.equals(team2) || team1.equals(team3) || team2.equals(team3)){
            team1 = allTeams[(int)(Math.random()*30)];
            team2 = allTeams[(int)(Math.random()*30)];
            team3 = allTeams[(int)(Math.random()*30)];
        }
        JLabel teamName1 = new JLabel(team1 + "      ");
        JLabel teamName2 = new JLabel(team2 + "      ");
        JLabel teamName3 = new JLabel(team3);
        teamRow.add(teamName1);
        teamRow.add(teamName2);
        teamRow.add(teamName3);

        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}