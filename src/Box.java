import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Box extends JPanel implements MouseListener {
    private JTextField textField;
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
        if (textField == null) {
            textField = new JTextField();
            textField.setBounds(10, 10, 80, 20);
            add(textField);
            repaint();
        }
        else {
            remove(textField);
            textField = null;
            repaint();
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
