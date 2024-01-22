package basic.board.entity;

import basic.board.dto.BoardDTO;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private Long id;
    private String writer;
    private String password;
    private String title;
    private String content;
    private int hits;

    public static Board from(final BoardDTO boardDTO) {
        Long id = -1L;
        String writer = boardDTO.getWriter();
        String password  = boardDTO.getPassword();
        String title = boardDTO.getTitle();
        String content = boardDTO.getContent();
        int hits = boardDTO.getHits();
        return new Board(id, writer, password, title, content, hits);
    }

    public void setId(final Long id) {
        this.id = id;
    }
}
