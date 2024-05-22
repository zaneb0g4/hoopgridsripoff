import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Box extends JPanel implements MouseListener {
    public Box(){
        setPreferredSize(new Dimension(100, 100));
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, 99, 99);
    }

    public static void main(String[] args) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if(getBackground() == Color.BLUE){
           setBackground(Color.lightGray);
       }else{
           setBackground(Color.BLUE);
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
