import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class PlayerButton extends JButton implements ActionListener {
    private String name;
    private Player player;
    public PlayerButton(String name){
        this.name = name;
        addActionListener(this);
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }

//    public boolean playedForTeamRow(Box b, Player p){
//        for (int i = 0; i < p.getTeams().length; i++) {
//           if(b.getTeamRow().equals(p.getTeams()[i])){
//               return true;
//           }
//        }
//        return false;
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
        GameBoard.getCurrentBox().setName(name);
        System.out.println(Arrays.toString(player.getTeams()));
        System.out.println("name set to " + name);
    }
}
