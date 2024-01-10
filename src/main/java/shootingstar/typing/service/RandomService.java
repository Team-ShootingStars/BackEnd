package shootingstar.typing.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shootingstar.typing.entity.CodeLanguage;
import shootingstar.typing.repository.TextRepository;
import shootingstar.typing.repository.dto.FindAllTextsByLangDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RandomService {
    private final TextRepository textRepository;
    public long getLangdomCount(CodeLanguage lang){
        //lang이 값은 값을 디비에서 뽑아서 리스트 저장
        List<FindAllTextsByLangDto> MathchingId = textRepository.findAllByLang(lang);
        //총 크기에서 랜덤 값 구하기
        int random = (int) ((Math.random())*MathchingId.size());
        long id = MathchingId.get(random).getId();
        return id;
    }
}