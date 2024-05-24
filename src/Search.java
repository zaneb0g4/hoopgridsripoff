import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class Search extends JPanel{
    private final JTextField field1;
    private String textFieldValue;

    public Search() throws IOException {
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
                    Player player1 = null;
                    try {
                        player1 = (Player) Objects.requireNonNull(GameBoard.sendGET(currentSearch)).get(0);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    Player player2 = null;
                    try {
                        player2 = (Player) Objects.requireNonNull(GameBoard.sendGET(currentSearch)).get(1);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    Player player3 = null;
                    try {
                        player3 = (Player) Objects.requireNonNull(GameBoard.sendGET(currentSearch)).get(2);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    System.out.println(player1);
                    System.out.println(player2);
                    System.out.println(player3);
                }
            }

        });
    }


    public static void main(String[] args) {
    }
}
