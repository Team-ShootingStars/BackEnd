package shootingstar.typing.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shootingstar.typing.entity.CodeLanguage;
import shootingstar.typing.repository.dto.BoardResponseDto;
import shootingstar.typing.service.BoardService;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/api/{lang}/list")
    public ResponseEntity<BoardResponseDto> getContentsList(@PathVariable("lang") CodeLanguage lang){
        String boardText = boardService.getContentText(lang);
        return ResponseEntity.ok().body(boardText);
    }
}