import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PlayerButton extends JButton implements ActionListener {
    private String name;
    public PlayerButton(String name){
        this.name = name;
        addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        GameBoard.getCurrentBox().setName(name);
    }
}
