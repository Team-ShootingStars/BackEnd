package shootingstar.typing.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import shootingstar.typing.entity.CodeLanguage;
import shootingstar.typing.repository.dto.FindBoardContentByLangDto;
import shootingstar.typing.repository.dto.QBoardContentDto;

import java.util.List;

import static shootingstar.typing.entity.QText.*;

public class BoardRepositoyCustomImpl implements BoardRepositoyCustom{
    private final JPAQueryFactory queryFactory;
    public BoardRepositoyCustomImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    List<FindBoardContentByLangDto> findBoardContentByLang(CodeLanguage lang) {
        return queryFactory
                .select(new QBoardContentDto(
                    text.id,
                    text.title))
                .from(text)
                .where(langEq(lang))
                .fetch();
    }


    private BooleanExpression langEq(CodeLanguage language) {
        return language != null ? text.lang.eq(language) : null;
    }
}
