package com.groupeisi.evaluation.service;

import com.groupeisi.evaluation.dto.CoursDto;

import java.util.List;
import java.util.Optional;

public interface ICoursService {
    Optional<List<CoursDto>> findAll();

    boolean save(CoursDto productDto);

    boolean update(CoursDto productDto);
}
