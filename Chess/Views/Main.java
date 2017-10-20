package Chess.Views;

import Chess.Controllers.Route;
import Chess.Models.Board;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    protected JButton[][] buttons;
    private ActionListener[][] buttonsActions;

    public Main(){
        JFrame f=new JFrame();
        this.buttons = new JButton[Board.n][Board.n];
        for(int i = 0; i < Board.n; i++) {
            for(int j = 0; j < Board.n; j++) {
                this.buttons[i][j] = new JButton();
                this.buttons[i][j].setBounds(i*50 + 100,j*50 + 100,50, 50);
                if((i+j) % 2 == 0) {
                    this.buttons[i][j].setBackground(new Color(255, 206, 158));
                }
                else {
                    this.buttons[i][j].setBackground(new Color(209, 139, 71));
                }


                f.add(this.buttons[i][j]);
            }
        }
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void changeBoard(Board board){
        for(int i = 0; i < Board.n; i++) {
            for(int j = 0; j < Board.n ; j++) {
                final int x = i;
                final int y = j;
                this.buttons[i][j].removeActionListener(buttonsActions[i][j]);
                this.buttonsActions[i][j] = (new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {
                        if(e.getActionCommand() == "click") {
                            Route.cellClick(board, x, y);
                        }
                    }
                });
                this.buttons[i][j].addActionListener(this.buttonsActions[i][j]);
            }
        }
    }
}
