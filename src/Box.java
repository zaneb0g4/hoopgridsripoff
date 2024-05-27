import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Box extends JPanel implements MouseListener {
    private String name;
    private JLabel nameLabel;
    public Box(){
        setPreferredSize(new Dimension(100, 100));
        setBackground(Color.lightGray);
        nameLabel = new JLabel();
        add(nameLabel);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, 99, 99);
    }

    public void setName(String name){
        this.name = name;
        nameLabel.setText(name);
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if(getBackground() == Color.BLUE){
           setBackground(Color.lightGray);
       }else{
           setBackground(Color.BLUE);
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
