package basic.board.service;

import basic.board.dto.BoardDTO;
import basic.board.entity.Board;
import basic.board.repository.BoardRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    public Board save(final BoardDTO boardDTO) {
        boardRepository.save(Board.from(boardDTO));
        return null;
    }

    @Override
    public Board findById(Long id) {
        return null;
    }

    @Override
    public List<Board> findAll() {
        return null;
    }

    @Override
    public Board update() {
        return null;
    }

    @Override
    public void delete() {

    }
}
