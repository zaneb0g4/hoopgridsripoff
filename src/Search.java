import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Search extends JPanel{
    private final JTextField field1;
    private String textFieldValue;
    Player player1;
    Player player2;
    Player player3;
    JLabel name1;
    JLabel name2;
    JLabel name3;

    public Search() {
        setPreferredSize(new Dimension(150, 500));
        setBackground(Color.GRAY);
        JLabel label1 = new JLabel("Type player name here:");
        add(label1);
        field1 = new JTextField(10);
        add(field1);
        field1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textFieldValue = field1.getText();
                if(!textFieldValue.isEmpty()){
                    String currentSearch = GameBoard.GET_URL + textFieldValue;
                    List<Player> players = GameBoard.sendGET(currentSearch);
                    name1.setText(players.get(0).getName());
                    name2.setText(players.get(1).getName());
                    name3.setText(players.get(2).getName());
                }
            }
        });
        name1 = new JLabel("");
        name2 = new JLabel("");
        name3 = new JLabel("");
        add(name1);
        add(name2);
        add(name3);
    }

    public static void main(String[] args) {
    }
}
