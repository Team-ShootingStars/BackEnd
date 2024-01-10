package shootingstar.typing.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shootingstar.typing.entity.CodeLanguage;
import shootingstar.typing.repository.BoardRepository;
import shootingstar.typing.repository.dto.FindBoardContentByLangDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    private String convertJson(Object object) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }

    public String getContentText(CodeLanguage lang) throws JsonProcessingException {
        List<FindBoardContentByLangDto> texts = boardRepository.findBoardContentByLang(lang);
        return convertJson(texts);
    }
}