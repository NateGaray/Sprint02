import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel implements ActionListener {
    JButton button;
    JLabel label;
    public static void main(String[] args) {


        ImageIcon icon = new ImageIcon("/Users/enroll/IdeaProjects/Sprint02/src/Warring Nations.jpeg");
        Border border = BorderFactory.createLineBorder(Color.ORANGE, 3);

        JButton button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(e -> System.out.println("Start Game"));
        button.setText("Start Game");
        button.setFocusable(true);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);

        JLabel label = new JLabel();//new instance of Jlabel with text of label
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text TOP,CENTER,RIGHT or LEFT of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text TOP,CENTER,BOTTOM of imageicon
        label.setForeground(new Color(168, 83, 50));//set color of font
        label.setFont(new Font("SansSerif", Font.PLAIN, 50));//set font of text
        label.setIconTextGap(-25); //set gap of text to image
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of text+icon within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of text+icon within label
        label.setBounds(100, 100, 250, 250);//set x and y posiotn with frame as well as dimensions


        JFrame frame = new JFrame();

        frame.setTitle("Warring Nations Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false); //prevent frame from being resized
        frame.setSize(500, 500);//sets x-dimension and y-dimension of frame
//        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true); //make frame visible
        label.setVisible(true);
        ImageIcon icon1 = new ImageIcon("/Users/enroll/IdeaProjects/Sprint02/src/Warring Nations.jpeg");
        frame.setIconImage(icon1.getImage());
        frame.getContentPane().setBackground(new Color(235, 155, 52));
        frame.pack();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Start Game");
            button.setEnabled(true);
            label.setVisible(true);
        }
    }
}
