//program qe imiton lojen PacMan me levizzjen e gojes
import javax.swing.*;
import java.awt.*;

public class JDemoFill extends JFrame {
    private int a = 20;
    private int b =320;
    private boolean c = true;

    public JDemoFill() {
        setTitle("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 250);
        setLayout(new BorderLayout());
        JPanel p = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.YELLOW);
                g.fillArc(60, 20, 100, 100, a, b);
            }

            public Dimension getPreferredSize() {
                return new Dimension(250, 150);
            }
        };
        JLabel label = new JLabel("PACMAN", SwingConstants.CENTER);
        add(p, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
        Timer t = new Timer(100, e -> {
            if (c) {
                a += 2;
                b -= 4;
                if (b <= 230) {
                    c = false;
                }
            } else {
                a -= 2;
                b += 4;
                if (b >= 320) {
                    c = true;
                }
            }
            p.repaint();
        });

        t.start();
        setVisible(true);
    }
    public static void main(String[] args) {
        new JDemoFill();
    }
}
