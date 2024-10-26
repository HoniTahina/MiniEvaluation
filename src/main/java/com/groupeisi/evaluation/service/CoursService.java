package com.groupeisi.evaluation.service;

import com.groupeisi.evaluation.dao.CoursDao;
import com.groupeisi.evaluation.dao.ICoursDao;
import com.groupeisi.evaluation.dto.CoursDto;
import com.groupeisi.evaluation.entities.CoursEntity;
import com.groupeisi.evaluation.mapper.CoursMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class CoursService implements ICoursService {
    private static final Logger logger = LoggerFactory.getLogger(CoursService.class);

    private ICoursDao coursDao = new CoursDao();


    @Override
    public Optional<List<CoursDto>> findAll() {
        List<CoursEntity> productEntities = coursDao.list(new CoursEntity());
        List<CoursDto> coursDtos = CoursMapper.toListCoursDto(productEntities);
        return Optional.of(coursDtos);
    }

    @Override
    public boolean save(CoursDto coursDto) {
        CoursEntity coursEntity = CoursMapper.toCoursEntity(coursDto);
        return coursDao.save(coursEntity);
    }


    @Override
    public boolean update(CoursDto coursDto) {
        logger.info("PurchasesService - Tentative de modification d'un produit : {}", coursDto);
        CoursEntity coursEntity = CoursMapper.toCoursEntity(coursDto);
        return coursDao.update(coursEntity);
    }
}
