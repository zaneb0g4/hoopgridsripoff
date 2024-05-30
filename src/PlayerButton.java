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

    public boolean playedForTeamRow(Box b, Player p){
        for (int i = 0; i < p.getTeams().length; i++) {
           if(b.getTeamRow().equals(p.getTeams()[i].idToName(p.getTeams()[i].getId()))){
               System.out.println(b.getTeamRow());
               System.out.println(p.getTeams()[i].idToName(p.getTeams()[i].getId()));
               System.out.println("");
               return true;
           }
        }
        return false;
    }

    public boolean playedForTeamCol(Box b, Player p){
        for (int i = 0; i < p.getTeams().length; i++) {
            if(b.getTeamCol().equals(p.getTeams()[i].idToName(p.getTeams()[i].getId()))){
                System.out.println(b.getTeamCol());
                System.out.println(p.getTeams()[i].idToName(p.getTeams()[i].getId()));
                return true;
            }
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(playedForTeamCol(GameBoard.getCurrentBox(), player) && playedForTeamRow(GameBoard.getCurrentBox(), player)){
            GameBoard.getCurrentBox().setName(player.getName());
        }
//        System.out.println(GameBoard.getCurrentBox().getTeamCol());
//        System.out.println(GameBoard.getCurrentBox().getTeamRow());
//        GameBoard.getCurrentBox().setName(player.getName());
//        System.out.println(Arrays.toString(player.getTeams()));
//        System.out.println(player.getTeams()[0].getId());
//        System.out.println("name set to " + player.getName());
    }
}
