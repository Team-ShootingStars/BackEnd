package shootingstar.typing.repository.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.*;

@Data
public class FindBoardContentByLangDto {

    private Long id;
    private String title;

    @QueryProjection
    public FindBoardContentByLangDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}