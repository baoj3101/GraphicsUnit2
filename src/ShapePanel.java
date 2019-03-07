import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel {

    public ShapePanel() {
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public void update(Graphics window) {
        paint(window);
    }

    /*
	 *All of your test code should be placed in paint.
     */
    public void paint(Graphics window) {
        window.setColor(Color.WHITE);
        window.fillRect(0, 0, getWidth(), getHeight());
        window.setColor(Color.BLUE);
        window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
        window.setFont(new Font("TAHOMA", Font.BOLD, 18));
        window.drawString("CREATE YOUR OWN SHAPE!", 40, 40);

        //make a Shape
        Shape s1 = new Shape(50, 50, 100, 100, Color.GREEN, 30, 30);
        Shape s2 = new Shape(505, 305, 200, 200, Color.YELLOW, 30, 30);
        Shape s3 = new Shape(160, 350, 150, 100, Color.ORANGE, 30, 30);
        Shape s4 = new Shape(420, 100, 180, 180, Color.CYAN, 30, 30);
        
        s1.draw(window);
        s2.draw(window);
        s3.draw(window);
        s4.draw(window);
    }
}
