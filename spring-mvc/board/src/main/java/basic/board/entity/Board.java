package basic.board.entity;

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
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}
