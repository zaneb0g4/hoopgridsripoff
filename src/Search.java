import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Search extends JPanel{
    private final JTextField field1;
    private String textFieldValue;
    PlayerButton name1, name2, name3, name4, name5, name6, name7, name8, name9, name10;

    public Search() {
        setPreferredSize(new Dimension(300, 1000));
        setBackground(Color.GRAY);
        JLabel label1 = new JLabel("Type player name here:");
        add(label1);
        field1 = new JTextField(20);
        add(field1);
        field1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("remove");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                textFieldValue = field1.getText();
                System.out.println(textFieldValue);
                if(!textFieldValue.isEmpty()){
                    String currentSearch = GameBoard.GET_URL + textFieldValue;
                    List<Player> players = GameBoard.sendGET(currentSearch);
                    name1.setText(players.get(0).getName());
                    name1.setPlayer(players.get(0));
                    name2.setText(players.get(1).getName());
                    name2.setPlayer(players.get(1));
                    name3.setText(players.get(2).getName());
                    name3.setPlayer(players.get(2));
                    name4.setText(players.get(3).getName());
                    name4.setPlayer(players.get(3));
                    name5.setText(players.get(4).getName());
                    name5.setPlayer(players.get(4));
                    name6.setText(players.get(5).getName());
                    name6.setPlayer(players.get(5));
                    name7.setText(players.get(6).getName());
                    name7.setPlayer(players.get(6));
                    name8.setText(players.get(7).getName());
                    name8.setPlayer(players.get(7));
                    name9.setText(players.get(8).getName());
                    name9.setPlayer(players.get(8));
                    name10.setText(players.get(9).getName());
                    name10.setPlayer(players.get(9));
                }
            }
        });
        name1 = new PlayerButton("");
        name2 = new PlayerButton("");
        name3 = new PlayerButton("");
        name4 = new PlayerButton("");
        name5 = new PlayerButton("");
        name6 = new PlayerButton("");
        name7 = new PlayerButton("");
        name8 = new PlayerButton("");
        name9 = new PlayerButton("");
        name10 = new PlayerButton("");
        add(name1);
        add(name2);
        add(name3);
        add(name4);
        add(name5);
        add(name6);
        add(name7);
        add(name8);
        add(name9);
        add(name10);
    }

    public static void main(String[] args) {
    }
}
