package chess.Boards;

import chess.GameStates.Figures.Figure;

public class DefaultBoard implements BoardInterface{

    public Figure[][] board = {};

    public DefaultBoard(){}

    @Override
    public Figure getFigure(int poss) {
        return null;
    }

    @Override
    public Figure MoveFigure(int from, int to) {
        return null;
    }
}
