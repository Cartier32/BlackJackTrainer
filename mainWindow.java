import javax.swing.*;
import java.awt.*;


public class mainWindow {
    private JFrame mainWin;
    public mainWindow(){
        createMW();
    }

    private void createMW(){
        mainWin = new JFrame("Blackjack Trainer by Carter Hollman");  //Main frame
        mainWin.pack();
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.setLocationRelativeTo(null);
        mainWin.setSize(500,700);
        mainWin.setResizable(false);

        JPanel innerWin = new JPanel();    //Bottom panel with buttons "train" and "Play"
        innerWin.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 50));
        innerWin.setPreferredSize(new Dimension(250,250));
        innerWin.setBackground(Color.lightGray);
        innerWin.add(new Button("Train"));
        innerWin.add(new Button("Play"));

        mainWin.add(innerWin,BorderLayout.SOUTH);


        JPanel innerWin1 = new JPanel();   //Main panel that contains intro
        innerWin1.setBackground(Color.lightGray);
        mainWin.add(innerWin1,BorderLayout.CENTER);
        
    }

    public void show(){
        mainWin.setVisible(true);
    }

}
