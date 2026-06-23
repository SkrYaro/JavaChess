package chess.Boards.Fabric;

import chess.Boards.BoardInterface;
import chess.Boards.CustomBoard;
import chess.Boards.DefaultBoard;
import chess.Boards.SmallBoard;

import java.util.Map;
import java.util.function.Supplier;

public class BoardTyper {
    private static final Map<String, Supplier<BoardInterface>> registry = Map.of(
        "default", DefaultBoard::new,
        "changing", CustomBoard::new,
        "small", SmallBoard::new
    );
    public static BoardInterface create(String type){
        Supplier<BoardInterface> supplier = registry.get(type);
        return supplier.get();
    }
}
