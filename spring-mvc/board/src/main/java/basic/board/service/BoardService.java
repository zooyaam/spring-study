package basic.board.service;

import basic.board.entity.Board;
import java.util.List;

public interface BoardService {
    Board save();
    Board findById(Long id);
    List<Board> findAll();
    Board update();
    void delete();
}
