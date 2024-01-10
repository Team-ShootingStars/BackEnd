package shootingstar.typing.repository.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * shootingstar.typing.repository.dto.QBoardContentDto is a Querydsl Projection type for BoardContentDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QBoardContentDto extends ConstructorExpression<BoardContentDto> {

    private static final long serialVersionUID = -1646561353L;

    public QBoardContentDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> title) {
        super(BoardContentDto.class, new Class<?>[]{long.class, String.class}, id, title);
    }

}

