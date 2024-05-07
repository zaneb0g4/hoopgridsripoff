import javax.swing.*;
import java.awt.*;

public class GameBoard {
    String[] allTeams = new String[]{"Atlanta Hawks","Boston Celtics","Brooklyn Nets","Charlotte Hornets",
            "Chicago Bulls","Cleveland Cavaliers","Dallas Mavericks","Denver Nuggets","Detroit Pistons",
            "Golden State Warriors","Houston Rockets","Indiana Pacers","Los Angeles Clippers","Los Angeles Lakers",
            "Memphis Grizzlies","Miami Heat","Milwaukee Bucks","Minnesota Timberwolves","New Orleans Pelicans",
            "New York Knicks","Oklahoma City Thunder","Orlando Magic","Philadelphia 76ers","Phoenix Suns",
            "Portland Trail Blazers","Sacramento Kings","San Antonio Spurs","Toronto Raptors","Utah Jazz",
            "Washington Wizards"};

    JFrame frame;

    DrawingPanel dpanel;

    public GameBoard() {
        frame = new JFrame("Hoop Grids by ZB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dpanel = new DrawingPanel();
        frame.add(dpanel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GameBoard x = new GameBoard();
    }

    class DrawingPanel extends JPanel{

        public DrawingPanel() {
            setBackground(Color.WHITE);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(500, 500);
        }

        protected void paintComponent(Graphics g){
            String team1 = allTeams[(int)(Math.random()*30)];
            String team2 = allTeams[(int)(Math.random()*30)];
            String team3 = allTeams[(int)(Math.random()*30)];
            String team4 = allTeams[(int)(Math.random()*30)];
            String team5 = allTeams[(int)(Math.random()*30)];
            String team6 = allTeams[(int)(Math.random()*30)];
            while(team1.equals(team2) || team1.equals(team3) || team1.equals(team4) || team1.equals(team5) ||
            team1.equals(team6) || team2.equals(team3) || team2.equals(team4) || team2.equals(team5) ||
            team2.equals(team6) || team3.equals(team4) || team3.equals(team5) || team3.equals(team6) ||
            team4.equals(team5) || team4.equals(team6) || team5.equals(team6)){
                team1 = allTeams[(int)(Math.random()*30)];
                team2 = allTeams[(int)(Math.random()*30)];
                team3 = allTeams[(int)(Math.random()*30)];
                team4 = allTeams[(int)(Math.random()*30)];
                team5 = allTeams[(int)(Math.random()*30)];
                team6 = allTeams[(int)(Math.random()*30)];
            }

            super.paintComponent(g);

            g.setColor(Color.PINK);
            g.fillOval(100, 10, 100, 80);
            g.fillOval(225, 10, 100, 80);
            g.fillOval(350, 10, 100, 80);
            g.fillOval(10, 100, 80, 100);
            g.fillOval(10, 225, 80, 100);
            g.fillOval(10, 350, 80, 100);

            g.setColor(Color.BLACK);

            g.drawString(team1, 105, 50);
            g.drawString(team2, 230, 50);
            g.drawString(team3, 355, 50);

            g.drawString(team4, 15, 150);
            g.drawString(team5, 15, 275);
            g.drawString(team6, 15, 400);

            g.drawRect(100, 100, 100, 100);
            g.drawRect(225, 100, 100, 100);
            g.drawRect(350, 100, 100, 100);

            g.drawRect(100, 225, 100, 100);
            g.drawRect(225, 225, 100, 100);
            g.drawRect(350, 225, 100, 100);

            g.drawRect(100, 350, 100, 100);
            g.drawRect(225, 350, 100, 100);
            g.drawRect(350, 350, 100, 100);

        }
    }
}
