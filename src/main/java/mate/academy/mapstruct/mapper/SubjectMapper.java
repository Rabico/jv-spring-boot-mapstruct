package mate.academy.mapstruct.mapper;

import mate.academy.mapstruct.dto.subject.CreateSubjectRequestDto;
import mate.academy.mapstruct.dto.subject.SubjectDto;
import mate.academy.mapstruct.model.Group;
import mate.academy.mapstruct.model.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Named;

import java.util.Optional;

@Mapper
public interface SubjectMapper {
    SubjectDto toDto(Subject subject);

    Subject toModel(CreateSubjectRequestDto requestDto);

    @Named("subjectById")
    default Subject subjectById(Long id) {
        return Optional.ofNullable(id)
                .map(Subject::new)
                .orElse(null);
    }
}
