package com.groupeisi.evaluation.mapper;

import com.groupeisi.evaluation.dto.CoursDto;
import com.groupeisi.evaluation.entities.CoursEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CoursMapper {
    private CoursMapper() {
    }

    public static CoursEntity toCoursEntity(CoursDto coursDto) {

        CoursEntity coursEntity = new CoursEntity();

        coursEntity.setId(coursDto.getId());
        coursEntity.setMatiere(coursDto.getMatiere());
        coursEntity.setProf(coursDto.getProf());
        coursEntity.setClasse(coursDto.getClasse());

        return coursEntity;
    }

    public static CoursDto toCoursDto(CoursEntity coursEntity) {

        CoursDto coursDto = new CoursDto();

        coursDto.setId(coursEntity.getId());
        coursDto.setMatiere(coursEntity.getMatiere());
        coursDto.setProf(coursEntity.getProf());
        coursDto.setClasse(coursEntity.getClasse());


        return coursDto;
    }

    public static List<CoursDto> toListCoursDto(List<CoursEntity> productEntities) {
        return productEntities.stream()
                .map(CoursMapper::toCoursDto)
                .collect(Collectors.toList());
    }
}
