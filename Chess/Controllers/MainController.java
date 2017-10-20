package Chess.Controllers;

import Chess.Models.Board;
import Chess.Models.Pieces.King;
import Chess.Views.Main;

public class MainController {
    public void main() {
        Board nowBoard = new Board();
        for(int i = 0; i < nowBoard.n; i++) {
            nowBoard.pieces[0][i] = new King();
        }
        Main view = new Main();

        view.changeBoard(nowBoard);
    }
}
