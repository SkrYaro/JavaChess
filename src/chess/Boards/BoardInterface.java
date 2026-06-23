package chess.Boards;

import chess.GameStates.Figures.Figure;

public interface BoardInterface {

    public Figure getFigure(int poss);

    public Figure MoveFigure(int from ,int to);

}
