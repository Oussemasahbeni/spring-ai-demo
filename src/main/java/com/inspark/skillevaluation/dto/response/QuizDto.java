package com.inspark.skillevaluation.dto.response;

import com.inspark.skillevaluation.domain.model.Answer;

import java.util.List;

public record QuizDto(
        String question,
        List<Answer> options,
        String answer,
        String time
) {
}
