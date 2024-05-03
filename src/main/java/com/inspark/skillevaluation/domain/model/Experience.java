package com.inspark.skillevaluation.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Experience {
    private String title;
    private String company;
    private String type;
    private String location;
    private String locationType;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isActive;
    private String industry;
    private String description;
    private List<String> skills = new ArrayList<>();

    public Experience() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", locationType='" + locationType + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", isActive=" + isActive +
                ", industry='" + industry + '\'' +
                ", description='" + description + '\'' +
                ", skills=" + skills +
                '}';
    }
}
