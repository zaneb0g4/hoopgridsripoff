import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Box extends JPanel implements MouseListener {
    private String name;
    private JLabel nameLabel;

    GameBoard gameBoard;

    String teamRow;
    String teamCol;


    public Box(GameBoard gameBoard, String teamRow, String teamCol){
        setPreferredSize(new Dimension(200, 200));
        setBackground(Color.lightGray);
        nameLabel = new JLabel();
        add(nameLabel);
        addMouseListener(this);
        this.gameBoard = gameBoard;
        this.teamRow = teamRow;
        this.teamCol = teamCol;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, 199, 199);
    }

    public void setName(String name){
        this.name = name;
        nameLabel.setText(name);
    }

    public String getName(){
        return name;
    }

    public String getTeamRow(){
        return teamRow;
    }

    public String getTeamCol(){
        return teamCol;
    }

    public static void main(String[] args) {

    }

    @Override
    public void mouseClicked(MouseEvent e){
       if(getBackground() == Color.CYAN){
           setBackground(Color.lightGray);
       }else{
           this.gameBoard.deselectAllBoxes();
           setBackground(Color.CYAN);
           GameBoard.setCurrentBox(this);
       }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
