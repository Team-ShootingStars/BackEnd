package shootingstar.typing.repository.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.*;
import shootingstar.typing.entity.Text;

@Data
public class BoardContentDto {

    private Long id;
    private String title;

    @QueryProjection
    public BoardContentDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}