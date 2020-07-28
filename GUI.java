import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI{
/*
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.*/
    static GUIGame game;

public GUI() {
    game = new GUIGame(this);
}

private static void createAndShowGUI() {
    // Create and set up the window.
    JFrame frame = new JFrame("Basic Tic Tac Toe");
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton buttons[] = new JButton[9];

    for (int i = 0; i < buttons.length; i++) {
        JButton btn = new JButton("CLICK ME");
        buttons[i] = btn;
        btn.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    game.placeMark(1,1);
                   // game.gameRules(btn);
                }
            });
       /* buttons[i].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println("DFDFDF");

                btn.setText(Character.toString(game.getCurrentPlayerMarker()));
                            }
             });*/

            frame.getContentPane().add(btn);
        }   

        buttons[1].setSize(200,200);
        buttons[1].setLocation(300,100);

        buttons[2].setSize(200,200);
        buttons[2].setLocation(500,100);

        buttons[3].setSize(200,200);
        buttons[3].setLocation(700,100);

        buttons[4].setSize(200,200);
        buttons[4].setLocation(300,300);

        buttons[5].setSize(200,200);
        buttons[5].setLocation(500,300);

        buttons[6].setSize(200,200);
        buttons[6].setLocation(700,300);

        buttons[7].setSize(200,200);
        buttons[7].setLocation(300,500);

        buttons[8].setSize(200,200);
        buttons[8].setLocation(500,500);
        buttons[0].setSize(200,200);
        buttons[0].setLocation(700,500);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    private void button1ActionPerformed(java.awt.event.ActionEvent evt){
        game.getCurrentPlayerMarker();
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}