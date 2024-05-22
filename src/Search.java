import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search extends JPanel{
    private JTextField field1;
    private String textFieldValue;
    private Player player1;
    private Player player2;
    private Player player3;

    public Search(){
        setPreferredSize(new Dimension(150, 500));
        setBackground(Color.GRAY);
        JLabel label1 = new JLabel("Type player name here:");
        add(label1);
        field1 = new JTextField(10);
        add(field1);
        field1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldValue = field1.getText();
            }
        });
        while(!textFieldValue.isEmpty()){
            String currentSearch = GameBoard.GET_URL + textFieldValue;
        }
    }


    public static void main(String[] args) {
    }
}
