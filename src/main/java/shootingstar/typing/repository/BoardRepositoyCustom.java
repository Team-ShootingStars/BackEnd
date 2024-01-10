package shootingstar.typing.repository;

import shootingstar.typing.entity.CodeLanguage;
import shootingstar.typing.repository.dto.FindBoardContentByLangDto;

import java.util.List;

public abstract class BoardRepositoyCustom {
    List<FindBoardContentByLangDto> findBoardContentByLangDtos (CodeLanguage lang);

}
