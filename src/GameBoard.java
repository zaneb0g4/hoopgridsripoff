import javax.swing.*;

public class GameBoard {
    String[] allTeams = new String[]{"Atlanta Hawks", "Boston Celtics", "Brooklyn Nets", "Charlotte Hornets",
            "Chicago Bulls", "Cleveland Cavaliers", "Dallas Mavericks", "Denver Nuggets", "Detroit Pistons",
            "Golden State Warriors", "Houston Rockets", "Indiana Pacers", "Los Angeles Clippers", "Los Angeles Lakers",
            "Memphis Grizzlies", "Miami Heat", "Milwaukee Bucks", "Minnesota Timberwolves", "New Orleans Pelicans",
            "New York Knicks", "Oklahoma City Thunder", "Orlando Magic", "Philadelphia 76ers", "Phoenix Suns",
            "Portland Trail Blazers", "Sacramento Kings", "San Antonio Spurs", "Toronto Raptors", "Utah Jazz",
            "Washington Wizards"};

    JFrame frame;

    public GameBoard() {
        frame = new JFrame("Hoop Grids by ZB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
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

        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel row3 = new JPanel();
        JPanel row4 = new JPanel();
        frame.add(row1);
        frame.add(row2);
        frame.add(row3);
        frame.add(row4);

        Header header1 = new Header(team1);
        Header header2 = new Header(team2);
        Header header3 = new Header(team3);
        row1.add(header1);
        row1.add(header2);
        row1.add(header3);

        Header header4 = new Header(team4);
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        row2.add(header4);
        row2.add(box1);
        row2.add(box2);
        row2.add(box3);

        Header header5 = new Header(team5);
        Box box4 = new Box();
        Box box5 = new Box();
        Box box6 = new Box();
        row3.add(header5);
        row3.add(box4);
        row3.add(box5);
        row3.add(box6);

        Header header6 = new Header(team6);
        Box box7 = new Box();
        Box box8 = new Box();
        Box box9 = new Box();
        row4.add(header6);
        row4.add(box7);
        row4.add(box8);
        row4.add(box9);

        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        GameBoard x = new GameBoard();
    }
}