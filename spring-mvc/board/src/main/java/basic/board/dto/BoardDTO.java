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
    private String writer;
    private String password;
    private String title;
    private String content;
    private int hits;

    @Override
    public String toString() {
        return "BoardDTO{" +
                ", writer='" + writer + '\'' +
                ", password='" + password + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", hits=" + hits +
                '}';
    }
}
