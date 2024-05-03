package com.inspark.skillevaluation.dto.response;

import com.inspark.skillevaluation.domain.model.Education;
import com.inspark.skillevaluation.domain.model.Experience;
import com.inspark.skillevaluation.domain.model.Project;

import java.util.List;

public record RequestBodyDto(
        List<Education> educations,
        List<Experience> experiences,
        List<Project> projects
) {
}
