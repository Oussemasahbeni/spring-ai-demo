package com.inspark.skillevaluation.dto.response;

import com.inspark.skillevaluation.domain.model.Quiz;

import java.util.List;

public record OutputDto(
        List<Quiz> questions
) {
}
