import com.google.gson.*;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class GameBoard {
    public static final String GET_URL = "https://api.sports-reference.com/v1/bbr/players?search=";
    private static final String USER_AGENT = "Mozilla/5.0";

    String[] allTeams = new String[]{"Atlanta Hawks", "Boston Celtics", "Brooklyn Nets", "Charlotte Hornets",
            "Chicago Bulls", "Cleveland Cavaliers", "Dallas Mavericks", "Denver Nuggets", "Detroit Pistons",
            "Golden State Warriors", "Houston Rockets", "Indiana Pacers", "Los Angeles Clippers", "Los Angeles Lakers",
            "Memphis Grizzlies", "Miami Heat", "Milwaukee Bucks", "Minnesota Timberwolves", "New Orleans Pelicans",
            "New York Knicks", "Oklahoma City Thunder", "Orlando Magic", "Philadelphia 76ers", "Phoenix Suns",
            "Portland Trail Blazers", "Sacramento Kings", "San Antonio Spurs", "Toronto Raptors", "Utah Jazz",
            "Washington Wizards"};

    JFrame frame;

    public GameBoard() throws IOException {
        frame = new JFrame("Hoop Grids by ZB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        Search sidePanel = new Search();
        frame.add(sidePanel, BorderLayout.EAST);
        JPanel board = new JPanel();
        board.setLayout(new BoxLayout(board, BoxLayout.Y_AXIS));
        frame.add(board);

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

        //setting up grid side of the board
        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel row3 = new JPanel();
        JPanel row4 = new JPanel();
        board.add(row1);
        board.add(row2);
        board.add(row3);
        board.add(row4);

        JPanel filler = new JPanel();
        filler.setPreferredSize(new Dimension(100, 100));
        Header header1 = new Header(team1);
        Header header2 = new Header(team2);
        Header header3 = new Header(team3);
        row1.add(filler);
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
        frame.setSize(600, 500);
        frame.setVisible(true);
    }


    static List sendGET(String str) throws IOException {
        URL obj = new URL(GET_URL + str);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();

            Gson gson = builder.create();
            List<Player> players = gson.fromJson(response.toString(), Players.class).players;
            System.out.println(players.size());
            System.out.println(players.get(0).getName());
            return players;

        } else {
            System.out.println("GET request did not work.");
        }
        return null;
    }
    private static class Players {
        private final List<Player> players;

        private Players(List<Player> players) {
            this.players = players;
        }
    }
    public static void main(String[] args) throws IOException {
        GameBoard x = new GameBoard();
    }
}