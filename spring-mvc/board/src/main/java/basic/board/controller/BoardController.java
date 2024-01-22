package basic.board.controller;

import basic.board.dto.BoardDTO;
import basic.board.entity.Board;
import basic.board.service.BoardService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/save")
    public String saveForm() {
        return "/board/save";
    }

    @PostMapping("/save")
    public String save(BoardDTO boardDTO) {
        boardService.save(boardDTO);
        return "index";
    }

    @GetMapping("/list")
    public String findAll(Model model) {
        List<BoardDTO> boards = boardService.findAll();
        model.addAttribute("boards", boards);
        return "/board/list";
    }
}
