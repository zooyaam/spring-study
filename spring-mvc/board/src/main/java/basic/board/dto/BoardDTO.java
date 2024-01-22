package basic.board.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    private Long id;
    private String writer;
    private String password;
    private String title;
    private String content;
    private int hits;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}
