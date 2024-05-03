package com.inspark.skillevaluation.dto.mapper;

import com.inspark.skillevaluation.domain.model.Quiz;
import com.inspark.skillevaluation.dto.response.QuizDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class QuizMapper {
    public abstract QuizDto toDto(Quiz quiz);
}
